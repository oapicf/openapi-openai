# CREATE_EMBEDDING_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**CREATE_EMBEDDING_REQUEST_INPUT**](CreateEmbeddingRequest_input.md) |  | [default to null]
**model** | [**CREATE_EMBEDDING_REQUEST_MODEL**](CreateEmbeddingRequest_model.md) |  | [default to null]
**encoding_format** | [**STRING_32**](STRING_32.md) | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). | [optional] [default to float]
**dimensions** | **INTEGER_32** | The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  | [optional] [default to null]
**user** | [**STRING_32**](STRING_32.md) | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


