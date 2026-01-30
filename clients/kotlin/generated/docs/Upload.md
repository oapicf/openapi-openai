
# Upload

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The Upload unique identifier, which can be referenced in API endpoints. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the Upload was created. |  |
| **filename** | **kotlin.String** | The name of the file to be uploaded. |  |
| **bytes** | **kotlin.Int** | The intended number of bytes to be uploaded. |  |
| **purpose** | **kotlin.String** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. |  |
| **status** | [**inline**](#Status) | The status of the Upload. |  |
| **expiresAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the Upload was created. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always \&quot;upload\&quot;. |  [optional] |
| **file** | [**OpenAIFile**](OpenAIFile.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | pending, completed, cancelled, expired |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | upload |



