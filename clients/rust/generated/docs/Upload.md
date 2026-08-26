# Upload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Upload unique identifier, which can be referenced in API endpoints. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | **String** | The name of the file to be uploaded. | 
**bytes** | **i32** | The intended number of bytes to be uploaded. | 
**purpose** | **String** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | **Status** | The status of the Upload. (enum: pending, completed, cancelled, expired) | 
**expires_at** | **i32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**object** | Option<**Object**> | The object type, which is always \"upload\". (enum: upload) | [optional]
**file** | Option<[**models::OpenAiFile**](OpenAIFile.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


