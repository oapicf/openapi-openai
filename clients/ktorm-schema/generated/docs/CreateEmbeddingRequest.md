
# Table `CreateEmbeddingRequest`
(mapped from: CreateEmbeddingRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**input** | input | long NOT NULL |  | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  |  [foreignkey]
**model** | model | long NOT NULL |  | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  |  [foreignkey]
**encodingFormat** | encoding_format | text |  | [**encoding_format**](#EncodingFormat) | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). |  [optional]
**dimensions** | dimensions | int UNSIGNED |  | **kotlin.Int** | The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  |  [optional]
**user** | user | text |  | **kotlin.String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  [optional]







