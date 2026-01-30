# Org.OpenAPITools.Model.Upload
The Upload object can accept byte chunks in the form of Parts. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The Upload unique identifier, which can be referenced in API endpoints. | 
**CreatedAt** | **int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**Filename** | **string** | The name of the file to be uploaded. | 
**Bytes** | **int** | The intended number of bytes to be uploaded. | 
**Purpose** | **string** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**Status** | **string** | The status of the Upload. | 
**ExpiresAt** | **int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**Object** | **string** | The object type, which is always \&quot;upload\&quot;. | [optional] 
**File** | [**OpenAIFile**](OpenAIFile.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

