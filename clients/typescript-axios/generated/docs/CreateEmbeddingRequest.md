# CreateEmbeddingRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  | [default to undefined]
**model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  | [default to undefined]
**encoding_format** | **string** | The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/). | [optional] [default to EncodingFormatEnum_Float]
**dimensions** | **number** | The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.  | [optional] [default to undefined]
**user** | **string** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  | [optional] [default to undefined]

## Example

```typescript
import { CreateEmbeddingRequest } from './api';

const instance: CreateEmbeddingRequest = {
    input,
    model,
    encoding_format,
    dimensions,
    user,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
