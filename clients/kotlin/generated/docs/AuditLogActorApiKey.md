
# AuditLogActorApiKey

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The tracking id of the API key. |  [optional] |
| **type** | [**inline**](#Type) | The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. |  [optional] |
| **user** | [**AuditLogActorUser**](AuditLogActorUser.md) |  |  [optional] |
| **serviceAccount** | [**AuditLogActorServiceAccount**](AuditLogActorServiceAccount.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | user, service_account |



