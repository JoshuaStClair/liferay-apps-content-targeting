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

package com.liferay.contenttargeting.reports.campaigntrackingaction.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CampaignTrackingAction service. Represents a row in the &quot;CampaignTrackingActions_CampaignTrackingAction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.contenttargeting.reports.campaigntrackingaction.model.impl.CampaignTrackingActionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.contenttargeting.reports.campaigntrackingaction.model.impl.CampaignTrackingActionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignTrackingAction
 * @see com.liferay.contenttargeting.reports.campaigntrackingaction.model.impl.CampaignTrackingActionImpl
 * @see com.liferay.contenttargeting.reports.campaigntrackingaction.model.impl.CampaignTrackingActionModelImpl
 * @generated
 */
public interface CampaignTrackingActionModel extends BaseModel<CampaignTrackingAction> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a campaign tracking action model instance should use the {@link CampaignTrackingAction} interface instead.
	 */

	/**
	 * Returns the primary key of this campaign tracking action.
	 *
	 * @return the primary key of this campaign tracking action
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this campaign tracking action.
	 *
	 * @param primaryKey the primary key of this campaign tracking action
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the campaign tracking action ID of this campaign tracking action.
	 *
	 * @return the campaign tracking action ID of this campaign tracking action
	 */
	public long getCampaignTrackingActionId();

	/**
	 * Sets the campaign tracking action ID of this campaign tracking action.
	 *
	 * @param campaignTrackingActionId the campaign tracking action ID of this campaign tracking action
	 */
	public void setCampaignTrackingActionId(long campaignTrackingActionId);

	/**
	 * Returns the campaign ID of this campaign tracking action.
	 *
	 * @return the campaign ID of this campaign tracking action
	 */
	public long getCampaignId();

	/**
	 * Sets the campaign ID of this campaign tracking action.
	 *
	 * @param campaignId the campaign ID of this campaign tracking action
	 */
	public void setCampaignId(long campaignId);

	/**
	 * Returns the user segment ID of this campaign tracking action.
	 *
	 * @return the user segment ID of this campaign tracking action
	 */
	public long getUserSegmentId();

	/**
	 * Sets the user segment ID of this campaign tracking action.
	 *
	 * @param userSegmentId the user segment ID of this campaign tracking action
	 */
	public void setUserSegmentId(long userSegmentId);

	/**
	 * Returns the alias of this campaign tracking action.
	 *
	 * @return the alias of this campaign tracking action
	 */
	@AutoEscape
	public String getAlias();

	/**
	 * Sets the alias of this campaign tracking action.
	 *
	 * @param alias the alias of this campaign tracking action
	 */
	public void setAlias(String alias);

	/**
	 * Returns the plid of this campaign tracking action.
	 *
	 * @return the plid of this campaign tracking action
	 */
	public long getPlid();

	/**
	 * Sets the plid of this campaign tracking action.
	 *
	 * @param plid the plid of this campaign tracking action
	 */
	public void setPlid(long plid);

	/**
	 * Returns the element ID of this campaign tracking action.
	 *
	 * @return the element ID of this campaign tracking action
	 */
	@AutoEscape
	public String getElementId();

	/**
	 * Sets the element ID of this campaign tracking action.
	 *
	 * @param elementId the element ID of this campaign tracking action
	 */
	public void setElementId(String elementId);

	/**
	 * Returns the event type of this campaign tracking action.
	 *
	 * @return the event type of this campaign tracking action
	 */
	@AutoEscape
	public String getEventType();

	/**
	 * Sets the event type of this campaign tracking action.
	 *
	 * @param eventType the event type of this campaign tracking action
	 */
	public void setEventType(String eventType);

	/**
	 * Returns the count of this campaign tracking action.
	 *
	 * @return the count of this campaign tracking action
	 */
	public int getCount();

	/**
	 * Sets the count of this campaign tracking action.
	 *
	 * @param count the count of this campaign tracking action
	 */
	public void setCount(int count);

	/**
	 * Returns the modified date of this campaign tracking action.
	 *
	 * @return the modified date of this campaign tracking action
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this campaign tracking action.
	 *
	 * @param modifiedDate the modified date of this campaign tracking action
	 */
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CampaignTrackingAction campaignTrackingAction);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CampaignTrackingAction> toCacheModel();

	@Override
	public CampaignTrackingAction toEscapedModel();

	@Override
	public CampaignTrackingAction toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}