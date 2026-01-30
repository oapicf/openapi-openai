# Upload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The Upload unique identifier, which can be referenced in API endpoints. | [default to null]
**createdAt** | **Int!** | The Unix timestamp (in seconds) for when the Upload was created. | [default to null]
**filename** | **String!** | The name of the file to be uploaded. | [default to null]
**bytes** | **Int!** | The intended number of bytes to be uploaded. | [default to null]
**purpose** | **String!** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | [default to null]
**status** | **String!** | The status of the Upload. | [default to null]
**expiresAt** | **Int!** | The Unix timestamp (in seconds) for when the Upload was created. | [default to null]
**object** | **String!** | The object type, which is always \&quot;upload\&quot;. | [optional] [default to null]
**file** | [***OpenAiFile**](OpenAIFile.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


