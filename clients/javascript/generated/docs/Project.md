# OpenapiOpenai.Project

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints | 
**object** | **String** | The object type, which is always &#x60;organization.project&#x60; | 
**name** | **String** | The name of the project. This appears in reporting. | 
**createdAt** | **Number** | The Unix timestamp (in seconds) of when the project was created. | 
**archivedAt** | **Number** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. | [optional] 
**status** | **String** | &#x60;active&#x60; or &#x60;archived&#x60; | 



## Enum: ObjectEnum


* `organization.project` (value: `"organization.project"`)





## Enum: StatusEnum


* `active` (value: `"active"`)

* `archived` (value: `"archived"`)




