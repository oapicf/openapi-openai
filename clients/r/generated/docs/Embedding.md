# openapi::Embedding

Represents an embedding vector returned by embedding endpoint. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the embedding in the list of embeddings. | 
**embedding** | **array[numeric]** | The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  | 
**object** | **character** | The object type, which is always \&quot;embedding\&quot;. | [Enum: [embedding]] 


