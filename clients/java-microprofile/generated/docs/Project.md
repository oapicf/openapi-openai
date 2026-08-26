

# Project

Represents an individual project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;organization.project&#x60; |  |
|**name** | **String** | The name of the project. This appears in reporting. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) of when the project was created. |  |
|**archivedAt** | **Integer** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | &#x60;active&#x60; or &#x60;archived&#x60; |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORGANIZATION_PROJECT | &quot;organization.project&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| ARCHIVED | &quot;archived&quot; |



