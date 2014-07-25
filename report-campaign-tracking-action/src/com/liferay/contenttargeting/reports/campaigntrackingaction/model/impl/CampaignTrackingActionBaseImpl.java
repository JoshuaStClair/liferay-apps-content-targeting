/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.contenttargeting.reports.campaigntrackingaction.model.impl;

import com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction;
import com.liferay.contenttargeting.reports.campaigntrackingaction.service.CampaignTrackingActionLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the CampaignTrackingAction service. Represents a row in the &quot;ContentTargeting_CampaignTAReport_CampaignTrackingAction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CampaignTrackingActionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignTrackingActionImpl
 * @see com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction
 * @generated
 */
public abstract class CampaignTrackingActionBaseImpl
	extends CampaignTrackingActionModelImpl implements CampaignTrackingAction {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a campaign tracking action model instance should use the {@link CampaignTrackingAction} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CampaignTrackingActionLocalServiceUtil.addCampaignTrackingAction(this);
		}
		else {
			CampaignTrackingActionLocalServiceUtil.updateCampaignTrackingAction(this);
		}
	}
}