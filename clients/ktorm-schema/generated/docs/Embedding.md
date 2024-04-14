
# Table `Embedding`
(mapped from: Embedding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the embedding in the list of embeddings. | 
**embedding** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always \&quot;embedding\&quot;. | 



# **Table `EmbeddingEmbedding`**
(mapped from: EmbeddingEmbedding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
embedding | embedding | long | | kotlin.Long | Primary Key | *one*
embedding | embedding | decimal | | java.math.BigDecimal | Foreign Key | *many*




