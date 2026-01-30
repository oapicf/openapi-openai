# openapi::ProjectApiKey

Represents an individual API key in a project.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always &#x60;organization.project.api_key&#x60; | [Enum: [organization.project.api_key]] 
**redacted_value** | **character** | The redacted value of the API key | 
**name** | **character** | The name of the API key | 
**created_at** | **integer** | The Unix timestamp (in seconds) of when the API key was created | 
**id** | **character** | The identifier, which can be referenced in API endpoints | 
**owner** | [**ProjectApiKeyOwner**](ProjectApiKey_owner.md) |  | 


