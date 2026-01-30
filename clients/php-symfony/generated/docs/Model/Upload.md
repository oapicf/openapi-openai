# Upload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The Upload unique identifier, which can be referenced in API endpoints. | 
**createdAt** | **int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | **string** | The name of the file to be uploaded. | 
**bytes** | **int** | The intended number of bytes to be uploaded. | 
**purpose** | **string** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | **string** | The status of the Upload. | 
**expiresAt** | **int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**object** | **string** | The object type, which is always \&quot;upload\&quot;. | [optional] 
**file** | [**OpenAPI\Server\Model\OpenAIFile**](OpenAIFile.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


