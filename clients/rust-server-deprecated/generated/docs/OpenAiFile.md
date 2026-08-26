# OpenAiFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The file identifier, which can be referenced in the API endpoints. | 
**bytes** | **i32** | The size of the file, in bytes. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the file was created. | 
**filename** | **String** | The name of the file. | 
**object** | [***models::OpenAiFileObject**](OpenAIFile_object.md) |  | 
**purpose** | [***models::OpenAiFilePurpose**](OpenAIFile_purpose.md) |  | 
**status** | [***models::OpenAiFileStatus**](OpenAIFile_status.md) |  | 
**status_details** | **String** | Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


