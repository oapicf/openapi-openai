# OAIUpload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The Upload unique identifier, which can be referenced in API endpoints. | 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | **NSString*** | The name of the file to be uploaded. | 
**bytes** | **NSNumber*** | The intended number of bytes to be uploaded. | 
**purpose** | **NSString*** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | **NSString*** | The status of the Upload. | 
**expiresAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the Upload was created. | 
**object** | **NSString*** | The object type, which is always \&quot;upload\&quot;. | [optional] 
**file** | [**OAIOpenAIFile***](OAIOpenAIFile.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


