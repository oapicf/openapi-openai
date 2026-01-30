# CreateBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input_file_id** | **String** | The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  | 
**endpoint** | **String** | The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. | 
**completion_window** | **String** | The time frame within which the batch should be processed. Currently only `24h` is supported. | 
**metadata** | Option<**std::collections::HashMap<String, String>**> | Optional custom metadata for the batch. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


