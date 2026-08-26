# CreateEmbeddingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  | 
**model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  | 
**encodingFormat** | **String** | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). | [optional] [default to .float]
**dimensions** | **Int** | The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  | [optional] 
**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


