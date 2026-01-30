# UPLOAD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The Upload unique identifier, which can be referenced in API endpoints. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the Upload was created. | [default to null]
**filename** | [**STRING_32**](STRING_32.md) | The name of the file to be uploaded. | [default to null]
**bytes** | **INTEGER_32** | The intended number of bytes to be uploaded. | [default to null]
**purpose** | [**STRING_32**](STRING_32.md) | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The status of the Upload. | [default to null]
**expires_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the Upload was created. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always \&quot;upload\&quot;. | [optional] [default to null]
**file** | [**OPEN_AI_FILE**](OpenAIFile.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


