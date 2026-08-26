

# ProjectUser

Represents an individual user in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;organization.project.user&#x60; | 
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**name** | **String** | The name of the user | 
**email** | **String** | The email address of the user | 
**role** | [**Role**](#Role) | `owner&#x60; or &#x60;member` | 
**addedAt** | **Int** | The Unix timestamp (in seconds) of when the project was added. | 


## Enum: `Object`
Allowed values: [organization.project.user]



## Enum: Role
Allowed values: [owner, member]




