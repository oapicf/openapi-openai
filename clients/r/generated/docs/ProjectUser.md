# openapi::ProjectUser

Represents an individual user in a project.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always &#x60;organization.project.user&#x60; | [Enum: [organization.project.user]] 
**id** | **character** | The identifier, which can be referenced in API endpoints | 
**name** | **character** | The name of the user | 
**email** | **character** | The email address of the user | 
**role** | **character** | &#x60;owner&#x60; or &#x60;member&#x60; | [Enum: [owner, member]] 
**added_at** | **integer** | The Unix timestamp (in seconds) of when the project was added. | 


