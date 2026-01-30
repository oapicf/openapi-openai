# openapi::ProjectServiceAccount

Represents an individual service account in a project.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always &#x60;organization.project.service_account&#x60; | [Enum: [organization.project.service_account]] 
**id** | **character** | The identifier, which can be referenced in API endpoints | 
**name** | **character** | The name of the service account | 
**role** | **character** | &#x60;owner&#x60; or &#x60;member&#x60; | [Enum: [owner, member]] 
**created_at** | **integer** | The Unix timestamp (in seconds) of when the service account was created | 


