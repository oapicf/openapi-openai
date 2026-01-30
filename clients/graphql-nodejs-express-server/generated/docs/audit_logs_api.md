# audit_logs_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListAuditLogs**](audit_logs_api.md#ListAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


<a name="ListAuditLogs"></a>
# **ListAuditLogs**
> ListAuditLogsResponse ListAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)

List user actions and configuration changes within this organization.
