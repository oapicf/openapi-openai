

# Project

Represents an individual project.

The class is defined in **[Project.java](../../src/main/java/org/openapitools/model/Project.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The identifier, which can be referenced in API endpoints | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;organization.project&#x60; | 
**name** | `String` | The name of the project. This appears in reporting. | 
**createdAt** | `Integer` | The Unix timestamp (in seconds) of when the project was created. | 
**archivedAt** | `Integer` | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. |  [optional property]
**status** | [**StatusEnum**](#StatusEnum) | &#x60;active&#x60; or &#x60;archived&#x60; | 


## ObjectEnum

Name | Value
---- | -----
ORGANIZATION_PROJECT | `"organization.project"`




## StatusEnum

Name | Value
---- | -----
ACTIVE | `"active"`
ARCHIVED | `"archived"`


