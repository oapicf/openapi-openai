# CreateEmbeddingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [***models::CreateEmbeddingRequestInput**](CreateEmbeddingRequest_input.md) |  | 
**model** | [***models::CreateEmbeddingRequestModel**](CreateEmbeddingRequest_model.md) |  | 
**encoding_format** | [***models::CreateEmbeddingRequestEncodingFormat**](CreateEmbeddingRequest_encoding_format.md) |  | [optional] [default to None]
**dimensions** | **u32** | The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  | [optional] [default to None]
**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


