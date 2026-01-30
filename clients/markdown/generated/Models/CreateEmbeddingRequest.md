# CreateEmbeddingRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **input** | [**CreateEmbeddingRequest_input**](CreateEmbeddingRequest_input.md) |  | [default to null] |
| **model** | [**CreateEmbeddingRequest_model**](CreateEmbeddingRequest_model.md) |  | [default to null] |
| **encoding\_format** | **String** | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). | [optional] [default to float] |
| **dimensions** | **Integer** | The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  | [optional] [default to null] |
| **user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

