

# AuditLogActorApiKey

The API Key used to perform the audit logged action.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The tracking id of the API key. |  [optional]
**`type`** | [**`Type`**](#`Type`) | The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;. |  [optional]
**user** | [**AuditLogActorUser**](AuditLogActorUser.md) |  |  [optional]
**serviceAccount** | [**AuditLogActorServiceAccount**](AuditLogActorServiceAccount.md) |  |  [optional]


## Enum: `Type`
Allowed values: [user, service_account]




