

# ProjectServiceAccount

Represents an individual service account in a project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;organization.project.service_account&#x60; | 
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**name** | **String** | The name of the service account | 
**role** | [**Role**](#Role) | `owner&#x60; or &#x60;member` | 
**createdAt** | **Int** | The Unix timestamp (in seconds) of when the service account was created | 


## Enum: `Object`
Allowed values: [organization.project.service_account]



## Enum: Role
Allowed values: [owner, member]




