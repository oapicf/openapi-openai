

# AuditLogActor

The actor who performed the audit logged action.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. |  [optional] |
|**session** | **AuditLogActorSession** |  |  [optional] |
|**apiKey** | **AuditLogActorApiKey** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SESSION | &quot;session&quot; |
| API_KEY | &quot;api_key&quot; |



