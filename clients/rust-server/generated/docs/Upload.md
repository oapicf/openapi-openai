# Upload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Upload unique identifier, which can be referenced in API endpoints. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | **String** | The name of the file to be uploaded. | 
**bytes** | **i32** | The intended number of bytes to be uploaded. | 
**purpose** | **String** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | [***models::UploadStatus**](Upload_status.md) |  | 
**expires_at** | **i32** | The Unix timestamp (in seconds) for when the Upload was created. | 
**object** | [***models::UploadObject**](Upload_object.md) |  | [optional] [default to None]
**file** | [***models::OpenAiFile**](OpenAIFile.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


