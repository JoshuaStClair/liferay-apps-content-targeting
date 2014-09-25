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

package com.liferay.content.targeting.report.campaign.tracking.action.service.base;

import com.liferay.content.targeting.report.campaign.tracking.action.model.CampaignTrackingActionTotal;
import com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalLocalService;
import com.liferay.content.targeting.report.campaign.tracking.action.service.persistence.CampaignTrackingActionFinder;
import com.liferay.content.targeting.report.campaign.tracking.action.service.persistence.CampaignTrackingActionPersistence;
import com.liferay.content.targeting.report.campaign.tracking.action.service.persistence.CampaignTrackingActionTotalFinder;
import com.liferay.content.targeting.report.campaign.tracking.action.service.persistence.CampaignTrackingActionTotalPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the campaign tracking action total local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.content.targeting.report.campaign.tracking.action.service.impl.CampaignTrackingActionTotalLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.content.targeting.report.campaign.tracking.action.service.impl.CampaignTrackingActionTotalLocalServiceImpl
 * @see com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalLocalServiceUtil
 * @generated
 */
public abstract class CampaignTrackingActionTotalLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements CampaignTrackingActionTotalLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalLocalServiceUtil} to access the campaign tracking action total local service.
	 */

	/**
	 * Adds the campaign tracking action total to the database. Also notifies the appropriate model listeners.
	 *
	 * @param campaignTrackingActionTotal the campaign tracking action total
	 * @return the campaign tracking action total that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CampaignTrackingActionTotal addCampaignTrackingActionTotal(
		CampaignTrackingActionTotal campaignTrackingActionTotal)
		throws SystemException {
		campaignTrackingActionTotal.setNew(true);

		return campaignTrackingActionTotalPersistence.update(campaignTrackingActionTotal);
	}

	/**
	 * Creates a new campaign tracking action total with the primary key. Does not add the campaign tracking action total to the database.
	 *
	 * @param campaignTrackingActionId the primary key for the new campaign tracking action total
	 * @return the new campaign tracking action total
	 */
	@Override
	public CampaignTrackingActionTotal createCampaignTrackingActionTotal(
		long campaignTrackingActionId) {
		return campaignTrackingActionTotalPersistence.create(campaignTrackingActionId);
	}

	/**
	 * Deletes the campaign tracking action total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param campaignTrackingActionId the primary key of the campaign tracking action total
	 * @return the campaign tracking action total that was removed
	 * @throws PortalException if a campaign tracking action total with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CampaignTrackingActionTotal deleteCampaignTrackingActionTotal(
		long campaignTrackingActionId) throws PortalException, SystemException {
		return campaignTrackingActionTotalPersistence.remove(campaignTrackingActionId);
	}

	/**
	 * Deletes the campaign tracking action total from the database. Also notifies the appropriate model listeners.
	 *
	 * @param campaignTrackingActionTotal the campaign tracking action total
	 * @return the campaign tracking action total that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CampaignTrackingActionTotal deleteCampaignTrackingActionTotal(
		CampaignTrackingActionTotal campaignTrackingActionTotal)
		throws SystemException {
		return campaignTrackingActionTotalPersistence.remove(campaignTrackingActionTotal);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(CampaignTrackingActionTotal.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return campaignTrackingActionTotalPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.content.targeting.report.campaign.tracking.action.model.impl.CampaignTrackingActionTotalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return campaignTrackingActionTotalPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.content.targeting.report.campaign.tracking.action.model.impl.CampaignTrackingActionTotalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return campaignTrackingActionTotalPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return campaignTrackingActionTotalPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return campaignTrackingActionTotalPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public CampaignTrackingActionTotal fetchCampaignTrackingActionTotal(
		long campaignTrackingActionId) throws SystemException {
		return campaignTrackingActionTotalPersistence.fetchByPrimaryKey(campaignTrackingActionId);
	}

	/**
	 * Returns the campaign tracking action total with the primary key.
	 *
	 * @param campaignTrackingActionId the primary key of the campaign tracking action total
	 * @return the campaign tracking action total
	 * @throws PortalException if a campaign tracking action total with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CampaignTrackingActionTotal getCampaignTrackingActionTotal(
		long campaignTrackingActionId) throws PortalException, SystemException {
		return campaignTrackingActionTotalPersistence.findByPrimaryKey(campaignTrackingActionId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return campaignTrackingActionTotalPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the campaign tracking action totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.content.targeting.report.campaign.tracking.action.model.impl.CampaignTrackingActionTotalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of campaign tracking action totals
	 * @param end the upper bound of the range of campaign tracking action totals (not inclusive)
	 * @return the range of campaign tracking action totals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CampaignTrackingActionTotal> getCampaignTrackingActionTotals(
		int start, int end) throws SystemException {
		return campaignTrackingActionTotalPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of campaign tracking action totals.
	 *
	 * @return the number of campaign tracking action totals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getCampaignTrackingActionTotalsCount() throws SystemException {
		return campaignTrackingActionTotalPersistence.countAll();
	}

	/**
	 * Updates the campaign tracking action total in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param campaignTrackingActionTotal the campaign tracking action total
	 * @return the campaign tracking action total that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CampaignTrackingActionTotal updateCampaignTrackingActionTotal(
		CampaignTrackingActionTotal campaignTrackingActionTotal)
		throws SystemException {
		return campaignTrackingActionTotalPersistence.update(campaignTrackingActionTotal);
	}

	/**
	 * Returns the campaign tracking action local service.
	 *
	 * @return the campaign tracking action local service
	 */
	public com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionLocalService getCampaignTrackingActionLocalService() {
		return campaignTrackingActionLocalService;
	}

	/**
	 * Sets the campaign tracking action local service.
	 *
	 * @param campaignTrackingActionLocalService the campaign tracking action local service
	 */
	public void setCampaignTrackingActionLocalService(
		com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionLocalService campaignTrackingActionLocalService) {
		this.campaignTrackingActionLocalService = campaignTrackingActionLocalService;
	}

	/**
	 * Returns the campaign tracking action remote service.
	 *
	 * @return the campaign tracking action remote service
	 */
	public com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionService getCampaignTrackingActionService() {
		return campaignTrackingActionService;
	}

	/**
	 * Sets the campaign tracking action remote service.
	 *
	 * @param campaignTrackingActionService the campaign tracking action remote service
	 */
	public void setCampaignTrackingActionService(
		com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionService campaignTrackingActionService) {
		this.campaignTrackingActionService = campaignTrackingActionService;
	}

	/**
	 * Returns the campaign tracking action persistence.
	 *
	 * @return the campaign tracking action persistence
	 */
	public CampaignTrackingActionPersistence getCampaignTrackingActionPersistence() {
		return campaignTrackingActionPersistence;
	}

	/**
	 * Sets the campaign tracking action persistence.
	 *
	 * @param campaignTrackingActionPersistence the campaign tracking action persistence
	 */
	public void setCampaignTrackingActionPersistence(
		CampaignTrackingActionPersistence campaignTrackingActionPersistence) {
		this.campaignTrackingActionPersistence = campaignTrackingActionPersistence;
	}

	/**
	 * Returns the campaign tracking action finder.
	 *
	 * @return the campaign tracking action finder
	 */
	public CampaignTrackingActionFinder getCampaignTrackingActionFinder() {
		return campaignTrackingActionFinder;
	}

	/**
	 * Sets the campaign tracking action finder.
	 *
	 * @param campaignTrackingActionFinder the campaign tracking action finder
	 */
	public void setCampaignTrackingActionFinder(
		CampaignTrackingActionFinder campaignTrackingActionFinder) {
		this.campaignTrackingActionFinder = campaignTrackingActionFinder;
	}

	/**
	 * Returns the campaign tracking action total local service.
	 *
	 * @return the campaign tracking action total local service
	 */
	public com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalLocalService getCampaignTrackingActionTotalLocalService() {
		return campaignTrackingActionTotalLocalService;
	}

	/**
	 * Sets the campaign tracking action total local service.
	 *
	 * @param campaignTrackingActionTotalLocalService the campaign tracking action total local service
	 */
	public void setCampaignTrackingActionTotalLocalService(
		com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalLocalService campaignTrackingActionTotalLocalService) {
		this.campaignTrackingActionTotalLocalService = campaignTrackingActionTotalLocalService;
	}

	/**
	 * Returns the campaign tracking action total remote service.
	 *
	 * @return the campaign tracking action total remote service
	 */
	public com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalService getCampaignTrackingActionTotalService() {
		return campaignTrackingActionTotalService;
	}

	/**
	 * Sets the campaign tracking action total remote service.
	 *
	 * @param campaignTrackingActionTotalService the campaign tracking action total remote service
	 */
	public void setCampaignTrackingActionTotalService(
		com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalService campaignTrackingActionTotalService) {
		this.campaignTrackingActionTotalService = campaignTrackingActionTotalService;
	}

	/**
	 * Returns the campaign tracking action total persistence.
	 *
	 * @return the campaign tracking action total persistence
	 */
	public CampaignTrackingActionTotalPersistence getCampaignTrackingActionTotalPersistence() {
		return campaignTrackingActionTotalPersistence;
	}

	/**
	 * Sets the campaign tracking action total persistence.
	 *
	 * @param campaignTrackingActionTotalPersistence the campaign tracking action total persistence
	 */
	public void setCampaignTrackingActionTotalPersistence(
		CampaignTrackingActionTotalPersistence campaignTrackingActionTotalPersistence) {
		this.campaignTrackingActionTotalPersistence = campaignTrackingActionTotalPersistence;
	}

	/**
	 * Returns the campaign tracking action total finder.
	 *
	 * @return the campaign tracking action total finder
	 */
	public CampaignTrackingActionTotalFinder getCampaignTrackingActionTotalFinder() {
		return campaignTrackingActionTotalFinder;
	}

	/**
	 * Sets the campaign tracking action total finder.
	 *
	 * @param campaignTrackingActionTotalFinder the campaign tracking action total finder
	 */
	public void setCampaignTrackingActionTotalFinder(
		CampaignTrackingActionTotalFinder campaignTrackingActionTotalFinder) {
		this.campaignTrackingActionTotalFinder = campaignTrackingActionTotalFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.liferay.content.targeting.report.campaign.tracking.action.model.CampaignTrackingActionTotal",
			campaignTrackingActionTotalLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.liferay.content.targeting.report.campaign.tracking.action.model.CampaignTrackingActionTotal");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return CampaignTrackingActionTotal.class;
	}

	protected String getModelClassName() {
		return CampaignTrackingActionTotal.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = campaignTrackingActionTotalPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionLocalService.class)
	protected com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionLocalService campaignTrackingActionLocalService;
	@BeanReference(type = com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionService.class)
	protected com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionService campaignTrackingActionService;
	@BeanReference(type = CampaignTrackingActionPersistence.class)
	protected CampaignTrackingActionPersistence campaignTrackingActionPersistence;
	@BeanReference(type = CampaignTrackingActionFinder.class)
	protected CampaignTrackingActionFinder campaignTrackingActionFinder;
	@BeanReference(type = com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalLocalService.class)
	protected com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalLocalService campaignTrackingActionTotalLocalService;
	@BeanReference(type = com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalService.class)
	protected com.liferay.content.targeting.report.campaign.tracking.action.service.CampaignTrackingActionTotalService campaignTrackingActionTotalService;
	@BeanReference(type = CampaignTrackingActionTotalPersistence.class)
	protected CampaignTrackingActionTotalPersistence campaignTrackingActionTotalPersistence;
	@BeanReference(type = CampaignTrackingActionTotalFinder.class)
	protected CampaignTrackingActionTotalFinder campaignTrackingActionTotalFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private CampaignTrackingActionTotalLocalServiceClpInvoker _clpInvoker = new CampaignTrackingActionTotalLocalServiceClpInvoker();
}