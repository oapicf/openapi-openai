# CreateEmbeddingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**models::CreateEmbeddingRequestInput**](CreateEmbeddingRequest_input.md) |  | 
**model** | [**models::CreateEmbeddingRequestModel**](CreateEmbeddingRequest_model.md) |  | 
**encoding_format** | Option<**String**> | The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). | [optional][default to Float]
**dimensions** | Option<**i32**> | The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  | [optional]
**user** | Option<**String**> | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


