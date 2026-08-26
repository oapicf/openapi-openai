# OpenAiFile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The file identifier, which can be referenced in the API endpoints. | 
**bytes** | **i32** | The size of the file, in bytes. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the file was created. | 
**filename** | **String** | The name of the file. | 
**object** | **Object** | The object type, which is always `file`. (enum: file) | 
**purpose** | **Purpose** | The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`. (enum: assistants, assistants_output, batch, batch_output, fine-tune, fine-tune-results, vision) | 
**status** | **Status** | Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. (enum: uploaded, processed, error) | 
**status_details** | Option<**String**> | Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


