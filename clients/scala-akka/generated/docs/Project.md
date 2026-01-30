

# Project

Represents an individual project.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;organization.project&#x60; | 
**name** | **String** | The name of the project. This appears in reporting. | 
**createdAt** | **Int** | The Unix timestamp (in seconds) of when the project was created. | 
**archivedAt** | **Int** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. |  [optional]
**status** | [**Status**](#Status) | `active&#x60; or &#x60;archived` | 


## Enum: `Object`
Allowed values: [organization.project]



## Enum: Status
Allowed values: [active, archived]




