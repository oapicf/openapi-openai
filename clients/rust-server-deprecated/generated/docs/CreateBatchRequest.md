# CreateBatchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input_file_id** | **String** | The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  | 
**endpoint** | [***models::CreateBatchRequestEndpoint**](createBatch_request_endpoint.md) |  | 
**completion_window** | [***models::CreateBatchRequestCompletionWindow**](createBatch_request_completion_window.md) |  | 
**metadata** | **swagger::Nullable<std::collections::HashMap<String, String>>** | Optional custom metadata for the batch. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


