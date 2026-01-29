

# Embedding

Represents an embedding vector returned by embedding endpoint. 

The class is defined in **[Embedding.java](../../src/main/java/org/openapitools/model/Embedding.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` | The index of the embedding in the list of embeddings. | 
**embedding** | `List&lt;BigDecimal&gt;` | The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always \&quot;embedding\&quot;. | 



## ObjectEnum

Name | Value
---- | -----
EMBEDDING | `"embedding"`


