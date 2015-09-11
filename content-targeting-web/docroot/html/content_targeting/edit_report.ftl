<#--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
-->

<#include "../init.ftl" />
<#include "../macros.ftl" />
<#include "../macros_exceptions.ftl" />

<@liferay_ui["header"]
	backURL="${redirect}"
	title='${(report.getName(locale))!"new-report"}'
/>

<@invalidReportsException />

<@portlet["actionURL"] name="updateReportInstance" var="addReportInstanceURL" />

<@aui["form"] action="${addReportInstanceURL}" method="post" name="fm" onSubmit="event.preventDefault(); saveFields();">
	<@aui["input"] name="redirect" type="hidden" value="${redirect}" />

	<#if className == campaignClass.getName()>
		<@aui["input"] name="campaignId" type="hidden" value="${classPK}" />
	<#else>
		<@aui["input"] name="userSegmentId" type="hidden" value="${classPK}" />
	</#if>

	<@aui["input"] name="className" type="hidden" value="${className}" />
	<@aui["input"] name="classPK" type="hidden" value="${classPK}" />
	<@aui["input"] name="reportInstanceId" type="hidden" value="${reportInstanceId}" />
	<@aui["input"] name="reportKey" type="hidden" value="${reportKey}" />
	<@aui["input"] name="saveAndContinue" type="hidden" />

	<@invalidNameException />

	<@aui["model-context"] bean=reportInstance model=reportInstanceClass />

	<@invalidNameException />

	<@aui["input"] name="name" />

	<@aui["input"] name="description" />

	${reportEditHTML}

	<@aui["button-row"]>
		<@aui["button"] type="submit" />

		<@aui["button"] type="button" value="save-and-continue" onClick="saveAndContinue();" />

		<@aui["button"] href="${redirect}" type="cancel" />
	</@>

	<@aui["script"] use="aui-toggler,liferay-ct-form-builder">
		saveAndContinue = function() {
			A.one('#<@portlet["namespace"] />saveAndContinue').val('true');

			submitForm(document.<@portlet["namespace"] />fm);
		};

		saveFields = function() {
			A.one('#<@portlet["namespace"] />saveAndContinue').val('false');

			submitForm(document.<@portlet["namespace"] />fm);
		};
	</@>
</@>