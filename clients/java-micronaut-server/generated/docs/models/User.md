

# User

Represents an individual `user` within an organization.

The class is defined in **[User.java](../../src/main/java/org/openapitools/model/User.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;organization.user&#x60; | 
**id** | `String` | The identifier, which can be referenced in API endpoints | 
**name** | `String` | The name of the user | 
**email** | `String` | The email address of the user | 
**role** | [**RoleEnum**](#RoleEnum) | &#x60;owner&#x60; or &#x60;reader&#x60; | 
**addedAt** | `Integer` | The Unix timestamp (in seconds) of when the user was added. | 

## ObjectEnum

Name | Value
---- | -----
ORGANIZATION_USER | `"organization.user"`




## RoleEnum

Name | Value
---- | -----
OWNER | `"owner"`
READER | `"reader"`



