create index IX_5720E6C9 on ContentTargeting_CampaignTAReport_CampaignTrackingAction (campaignId);
create index IX_268FED54 on ContentTargeting_CampaignTAReport_CampaignTrackingAction (campaignId, modifiedDate);
create index IX_C65E6152 on ContentTargeting_CampaignTAReport_CampaignTrackingAction (campaignId, userSegmentId, plid, elementId, eventType);
create index IX_C4B66357 on ContentTargeting_CampaignTAReport_CampaignTrackingAction (campaignId, userSegmentId, referrerClassName, referrerClassPK, elementId, eventType);