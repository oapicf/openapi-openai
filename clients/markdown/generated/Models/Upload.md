# Upload
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The Upload unique identifier, which can be referenced in API endpoints. | [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the Upload was created. | [default to null] |
| **filename** | **String** | The name of the file to be uploaded. | [default to null] |
| **bytes** | **Integer** | The intended number of bytes to be uploaded. | [default to null] |
| **purpose** | **String** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | [default to null] |
| **status** | **String** | The status of the Upload. | [default to null] |
| **expires\_at** | **Integer** | The Unix timestamp (in seconds) for when the Upload was created. | [default to null] |
| **object** | **String** | The object type, which is always \&quot;upload\&quot;. | [optional] [default to null] |
| **file** | [**OpenAIFile**](OpenAIFile.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

