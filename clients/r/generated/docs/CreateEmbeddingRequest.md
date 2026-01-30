# openapi::CreateEmbeddingRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequest_input.md) |  | 
**model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequest_model.md) |  | 
**encoding_format** | **character** | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). | [optional] [default to &quot;float&quot;] [Enum: [float, base64]] 
**dimensions** | **integer** | The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  | [optional] [Min: 1] 
**user** | **character** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] 


