

# User

Represents an individual `user` within an organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;organization.user&#x60; | 
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**name** | **String** | The name of the user | 
**email** | **String** | The email address of the user | 
**role** | [**Role**](#Role) | `owner&#x60; or &#x60;reader` | 
**addedAt** | **Int** | The Unix timestamp (in seconds) of when the user was added. | 


## Enum: `Object`
Allowed values: [organization.user]



## Enum: Role
Allowed values: [owner, reader]




