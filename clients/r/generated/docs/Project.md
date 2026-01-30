# openapi::Project

Represents an individual project.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints | 
**object** | **character** | The object type, which is always &#x60;organization.project&#x60; | [Enum: [organization.project]] 
**name** | **character** | The name of the project. This appears in reporting. | 
**created_at** | **integer** | The Unix timestamp (in seconds) of when the project was created. | 
**archived_at** | **integer** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. | [optional] 
**status** | **character** | &#x60;active&#x60; or &#x60;archived&#x60; | [Enum: [active, archived]] 


