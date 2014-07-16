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
import com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingActionModel;
import com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingActionSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CampaignTrackingAction service. Represents a row in the &quot;CampaignTrackingActions_CampaignTrackingAction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingActionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CampaignTrackingActionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CampaignTrackingActionImpl
 * @see com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction
 * @see com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingActionModel
 * @generated
 */
@JSON(strict = true)
public class CampaignTrackingActionModelImpl extends BaseModelImpl<CampaignTrackingAction>
	implements CampaignTrackingActionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a campaign tracking action model instance should use the {@link com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction} interface instead.
	 */
	public static final String TABLE_NAME = "CampaignTrackingActions_CampaignTrackingAction";
	public static final Object[][] TABLE_COLUMNS = {
			{ "campaignTrackingActionId", Types.BIGINT },
			{ "campaignId", Types.BIGINT },
			{ "userSegmentId", Types.BIGINT },
			{ "alias_", Types.VARCHAR },
			{ "plid", Types.BIGINT },
			{ "elementId", Types.VARCHAR },
			{ "eventType", Types.VARCHAR },
			{ "count", Types.INTEGER },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table CampaignTrackingActions_CampaignTrackingAction (campaignTrackingActionId LONG not null primary key,campaignId LONG,userSegmentId LONG,alias_ VARCHAR(75) null,plid LONG,elementId VARCHAR(75) null,eventType VARCHAR(75) null,count INTEGER,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table CampaignTrackingActions_CampaignTrackingAction";
	public static final String ORDER_BY_JPQL = " ORDER BY campaignTrackingAction.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY CampaignTrackingActions_CampaignTrackingAction.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction"),
			true);
	public static long CAMPAIGNID_COLUMN_BITMASK = 1L;
	public static long ELEMENTID_COLUMN_BITMASK = 2L;
	public static long EVENTTYPE_COLUMN_BITMASK = 4L;
	public static long MODIFIEDDATE_COLUMN_BITMASK = 8L;
	public static long PLID_COLUMN_BITMASK = 16L;
	public static long USERSEGMENTID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CampaignTrackingAction toModel(
		CampaignTrackingActionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CampaignTrackingAction model = new CampaignTrackingActionImpl();

		model.setCampaignTrackingActionId(soapModel.getCampaignTrackingActionId());
		model.setCampaignId(soapModel.getCampaignId());
		model.setUserSegmentId(soapModel.getUserSegmentId());
		model.setAlias(soapModel.getAlias());
		model.setPlid(soapModel.getPlid());
		model.setElementId(soapModel.getElementId());
		model.setEventType(soapModel.getEventType());
		model.setCount(soapModel.getCount());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CampaignTrackingAction> toModels(
		CampaignTrackingActionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CampaignTrackingAction> models = new ArrayList<CampaignTrackingAction>(soapModels.length);

		for (CampaignTrackingActionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction"));

	public CampaignTrackingActionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _campaignTrackingActionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCampaignTrackingActionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _campaignTrackingActionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CampaignTrackingAction.class;
	}

	@Override
	public String getModelClassName() {
		return CampaignTrackingAction.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("campaignTrackingActionId", getCampaignTrackingActionId());
		attributes.put("campaignId", getCampaignId());
		attributes.put("userSegmentId", getUserSegmentId());
		attributes.put("alias", getAlias());
		attributes.put("plid", getPlid());
		attributes.put("elementId", getElementId());
		attributes.put("eventType", getEventType());
		attributes.put("count", getCount());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long campaignTrackingActionId = (Long)attributes.get(
				"campaignTrackingActionId");

		if (campaignTrackingActionId != null) {
			setCampaignTrackingActionId(campaignTrackingActionId);
		}

		Long campaignId = (Long)attributes.get("campaignId");

		if (campaignId != null) {
			setCampaignId(campaignId);
		}

		Long userSegmentId = (Long)attributes.get("userSegmentId");

		if (userSegmentId != null) {
			setUserSegmentId(userSegmentId);
		}

		String alias = (String)attributes.get("alias");

		if (alias != null) {
			setAlias(alias);
		}

		Long plid = (Long)attributes.get("plid");

		if (plid != null) {
			setPlid(plid);
		}

		String elementId = (String)attributes.get("elementId");

		if (elementId != null) {
			setElementId(elementId);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		Integer count = (Integer)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@JSON
	@Override
	public long getCampaignTrackingActionId() {
		return _campaignTrackingActionId;
	}

	@Override
	public void setCampaignTrackingActionId(long campaignTrackingActionId) {
		_campaignTrackingActionId = campaignTrackingActionId;
	}

	@JSON
	@Override
	public long getCampaignId() {
		return _campaignId;
	}

	@Override
	public void setCampaignId(long campaignId) {
		_columnBitmask |= CAMPAIGNID_COLUMN_BITMASK;

		if (!_setOriginalCampaignId) {
			_setOriginalCampaignId = true;

			_originalCampaignId = _campaignId;
		}

		_campaignId = campaignId;
	}

	public long getOriginalCampaignId() {
		return _originalCampaignId;
	}

	@JSON
	@Override
	public long getUserSegmentId() {
		return _userSegmentId;
	}

	@Override
	public void setUserSegmentId(long userSegmentId) {
		_columnBitmask |= USERSEGMENTID_COLUMN_BITMASK;

		if (!_setOriginalUserSegmentId) {
			_setOriginalUserSegmentId = true;

			_originalUserSegmentId = _userSegmentId;
		}

		_userSegmentId = userSegmentId;
	}

	public long getOriginalUserSegmentId() {
		return _originalUserSegmentId;
	}

	@JSON
	@Override
	public String getAlias() {
		if (_alias == null) {
			return StringPool.BLANK;
		}
		else {
			return _alias;
		}
	}

	@Override
	public void setAlias(String alias) {
		_alias = alias;
	}

	@JSON
	@Override
	public long getPlid() {
		return _plid;
	}

	@Override
	public void setPlid(long plid) {
		_columnBitmask |= PLID_COLUMN_BITMASK;

		if (!_setOriginalPlid) {
			_setOriginalPlid = true;

			_originalPlid = _plid;
		}

		_plid = plid;
	}

	public long getOriginalPlid() {
		return _originalPlid;
	}

	@JSON
	@Override
	public String getElementId() {
		if (_elementId == null) {
			return StringPool.BLANK;
		}
		else {
			return _elementId;
		}
	}

	@Override
	public void setElementId(String elementId) {
		_columnBitmask |= ELEMENTID_COLUMN_BITMASK;

		if (_originalElementId == null) {
			_originalElementId = _elementId;
		}

		_elementId = elementId;
	}

	public String getOriginalElementId() {
		return GetterUtil.getString(_originalElementId);
	}

	@JSON
	@Override
	public String getEventType() {
		if (_eventType == null) {
			return StringPool.BLANK;
		}
		else {
			return _eventType;
		}
	}

	@Override
	public void setEventType(String eventType) {
		_columnBitmask |= EVENTTYPE_COLUMN_BITMASK;

		if (_originalEventType == null) {
			_originalEventType = _eventType;
		}

		_eventType = eventType;
	}

	public String getOriginalEventType() {
		return GetterUtil.getString(_originalEventType);
	}

	@JSON
	@Override
	public int getCount() {
		return _count;
	}

	@Override
	public void setCount(int count) {
		_count = count;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_columnBitmask = -1L;

		if (_originalModifiedDate == null) {
			_originalModifiedDate = _modifiedDate;
		}

		_modifiedDate = modifiedDate;
	}

	public Date getOriginalModifiedDate() {
		return _originalModifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CampaignTrackingAction.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CampaignTrackingAction toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CampaignTrackingAction)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CampaignTrackingActionImpl campaignTrackingActionImpl = new CampaignTrackingActionImpl();

		campaignTrackingActionImpl.setCampaignTrackingActionId(getCampaignTrackingActionId());
		campaignTrackingActionImpl.setCampaignId(getCampaignId());
		campaignTrackingActionImpl.setUserSegmentId(getUserSegmentId());
		campaignTrackingActionImpl.setAlias(getAlias());
		campaignTrackingActionImpl.setPlid(getPlid());
		campaignTrackingActionImpl.setElementId(getElementId());
		campaignTrackingActionImpl.setEventType(getEventType());
		campaignTrackingActionImpl.setCount(getCount());
		campaignTrackingActionImpl.setModifiedDate(getModifiedDate());

		campaignTrackingActionImpl.resetOriginalValues();

		return campaignTrackingActionImpl;
	}

	@Override
	public int compareTo(CampaignTrackingAction campaignTrackingAction) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				campaignTrackingAction.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CampaignTrackingAction)) {
			return false;
		}

		CampaignTrackingAction campaignTrackingAction = (CampaignTrackingAction)obj;

		long primaryKey = campaignTrackingAction.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		CampaignTrackingActionModelImpl campaignTrackingActionModelImpl = this;

		campaignTrackingActionModelImpl._originalCampaignId = campaignTrackingActionModelImpl._campaignId;

		campaignTrackingActionModelImpl._setOriginalCampaignId = false;

		campaignTrackingActionModelImpl._originalUserSegmentId = campaignTrackingActionModelImpl._userSegmentId;

		campaignTrackingActionModelImpl._setOriginalUserSegmentId = false;

		campaignTrackingActionModelImpl._originalPlid = campaignTrackingActionModelImpl._plid;

		campaignTrackingActionModelImpl._setOriginalPlid = false;

		campaignTrackingActionModelImpl._originalElementId = campaignTrackingActionModelImpl._elementId;

		campaignTrackingActionModelImpl._originalEventType = campaignTrackingActionModelImpl._eventType;

		campaignTrackingActionModelImpl._originalModifiedDate = campaignTrackingActionModelImpl._modifiedDate;

		campaignTrackingActionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CampaignTrackingAction> toCacheModel() {
		CampaignTrackingActionCacheModel campaignTrackingActionCacheModel = new CampaignTrackingActionCacheModel();

		campaignTrackingActionCacheModel.campaignTrackingActionId = getCampaignTrackingActionId();

		campaignTrackingActionCacheModel.campaignId = getCampaignId();

		campaignTrackingActionCacheModel.userSegmentId = getUserSegmentId();

		campaignTrackingActionCacheModel.alias = getAlias();

		String alias = campaignTrackingActionCacheModel.alias;

		if ((alias != null) && (alias.length() == 0)) {
			campaignTrackingActionCacheModel.alias = null;
		}

		campaignTrackingActionCacheModel.plid = getPlid();

		campaignTrackingActionCacheModel.elementId = getElementId();

		String elementId = campaignTrackingActionCacheModel.elementId;

		if ((elementId != null) && (elementId.length() == 0)) {
			campaignTrackingActionCacheModel.elementId = null;
		}

		campaignTrackingActionCacheModel.eventType = getEventType();

		String eventType = campaignTrackingActionCacheModel.eventType;

		if ((eventType != null) && (eventType.length() == 0)) {
			campaignTrackingActionCacheModel.eventType = null;
		}

		campaignTrackingActionCacheModel.count = getCount();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			campaignTrackingActionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			campaignTrackingActionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return campaignTrackingActionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{campaignTrackingActionId=");
		sb.append(getCampaignTrackingActionId());
		sb.append(", campaignId=");
		sb.append(getCampaignId());
		sb.append(", userSegmentId=");
		sb.append(getUserSegmentId());
		sb.append(", alias=");
		sb.append(getAlias());
		sb.append(", plid=");
		sb.append(getPlid());
		sb.append(", elementId=");
		sb.append(getElementId());
		sb.append(", eventType=");
		sb.append(getEventType());
		sb.append(", count=");
		sb.append(getCount());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.contenttargeting.reports.campaigntrackingaction.model.CampaignTrackingAction");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>campaignTrackingActionId</column-name><column-value><![CDATA[");
		sb.append(getCampaignTrackingActionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>campaignId</column-name><column-value><![CDATA[");
		sb.append(getCampaignId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userSegmentId</column-name><column-value><![CDATA[");
		sb.append(getUserSegmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>alias</column-name><column-value><![CDATA[");
		sb.append(getAlias());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plid</column-name><column-value><![CDATA[");
		sb.append(getPlid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>elementId</column-name><column-value><![CDATA[");
		sb.append(getElementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventType</column-name><column-value><![CDATA[");
		sb.append(getEventType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>count</column-name><column-value><![CDATA[");
		sb.append(getCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = CampaignTrackingAction.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CampaignTrackingAction.class
		};
	private long _campaignTrackingActionId;
	private long _campaignId;
	private long _originalCampaignId;
	private boolean _setOriginalCampaignId;
	private long _userSegmentId;
	private long _originalUserSegmentId;
	private boolean _setOriginalUserSegmentId;
	private String _alias;
	private long _plid;
	private long _originalPlid;
	private boolean _setOriginalPlid;
	private String _elementId;
	private String _originalElementId;
	private String _eventType;
	private String _originalEventType;
	private int _count;
	private Date _modifiedDate;
	private Date _originalModifiedDate;
	private long _columnBitmask;
	private CampaignTrackingAction _escapedModel;
}