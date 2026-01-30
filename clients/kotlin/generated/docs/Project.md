
# Project

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;organization.project&#x60; |  |
| **name** | **kotlin.String** | The name of the project. This appears in reporting. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) of when the project was created. |  |
| **status** | [**inline**](#Status) | &#x60;active&#x60; or &#x60;archived&#x60; |  |
| **archivedAt** | **kotlin.Int** | The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | organization.project |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | active, archived |



