

# AuditLogActor

The actor who performed the audit logged action.

The class is defined in **[AuditLogActor.java](../../src/main/java/org/openapitools/model/AuditLogActor.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;. |  [optional property]
**session** | `AuditLogActorSession` |  |  [optional property]
**apiKey** | `AuditLogActorApiKey` |  |  [optional property]

## TypeEnum

Name | Value
---- | -----
SESSION | `"session"`
API_KEY | `"api_key"`




