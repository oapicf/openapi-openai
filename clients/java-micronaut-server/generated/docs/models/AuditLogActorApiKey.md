

# AuditLogActorApiKey

The API Key used to perform the audit logged action.

The class is defined in **[AuditLogActorApiKey.java](../../src/main/java/org/openapitools/model/AuditLogActorApiKey.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The tracking id of the API key. |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. |  [optional property]
**user** | [`AuditLogActorUser`](AuditLogActorUser.md) |  |  [optional property]
**serviceAccount** | [`AuditLogActorServiceAccount`](AuditLogActorServiceAccount.md) |  |  [optional property]


## TypeEnum

Name | Value
---- | -----
USER | `"user"`
SERVICE_ACCOUNT | `"service_account"`




