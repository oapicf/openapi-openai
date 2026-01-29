# Embedding

Represents an embedding vector returned by embedding endpoint. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the embedding in the list of embeddings. | [default to undefined]
**embedding** | **Array&lt;number&gt;** | The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  | [default to undefined]
**object** | **string** | The object type, which is always \&quot;embedding\&quot;. | [default to undefined]

## Example

```typescript
import { Embedding } from './api';

const instance: Embedding = {
    index,
    embedding,
    object,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
