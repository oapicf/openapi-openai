# CREATE_BATCH_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input_file_id** | [**STRING_32**](STRING_32.md) | The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  | [default to null]
**endpoint** | [**STRING_32**](STRING_32.md) | The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. | [default to null]
**completion_window** | [**STRING_32**](STRING_32.md) | The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported. | [default to null]
**metadata** | [**STRING_TABLE [STRING_32]**](STRING_32.md) | Optional custom metadata for the batch. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


