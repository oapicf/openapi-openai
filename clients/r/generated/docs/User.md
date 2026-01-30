# openapi::User

Represents an individual `user` within an organization.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always &#x60;organization.user&#x60; | [Enum: [organization.user]] 
**id** | **character** | The identifier, which can be referenced in API endpoints | 
**name** | **character** | The name of the user | 
**email** | **character** | The email address of the user | 
**role** | **character** | &#x60;owner&#x60; or &#x60;reader&#x60; | [Enum: [owner, reader]] 
**added_at** | **integer** | The Unix timestamp (in seconds) of when the user was added. | 


