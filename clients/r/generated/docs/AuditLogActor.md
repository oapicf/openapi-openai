# openapi::AuditLogActor

The actor who performed the audit logged action.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. | [optional] [Enum: [session, api_key]] 
**session** | [**AuditLogActorSession**](.md) |  | [optional] 
**api_key** | [**AuditLogActorApiKey**](.md) |  | [optional] 


