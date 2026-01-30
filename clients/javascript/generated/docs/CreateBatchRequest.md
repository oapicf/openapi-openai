# OpenapiOpenai.CreateBatchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileId** | **String** | The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  | 
**endpoint** | **String** | The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. | 
**completionWindow** | **String** | The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported. | 
**metadata** | **{String: String}** | Optional custom metadata for the batch. | [optional] 



## Enum: EndpointEnum


* `/v1/chat/completions` (value: `"/v1/chat/completions"`)

* `/v1/embeddings` (value: `"/v1/embeddings"`)

* `/v1/completions` (value: `"/v1/completions"`)





## Enum: CompletionWindowEnum


* `24h` (value: `"24h"`)




