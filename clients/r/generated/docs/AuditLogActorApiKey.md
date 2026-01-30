# openapi::AuditLogActorApiKey

The API Key used to perform the audit logged action.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The tracking id of the API key. | [optional] 
**type** | **character** | The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. | [optional] [Enum: [user, service_account]] 
**user** | [**AuditLogActorUser**](AuditLogActorUser.md) |  | [optional] 
**service_account** | [**AuditLogActorServiceAccount**](AuditLogActorServiceAccount.md) |  | [optional] 


