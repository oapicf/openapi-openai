
# Table `CreateEmbeddingResponse_data_inner`
(mapped from: CreateEmbeddingResponseDataInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** |  | 
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**embedding** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) |  | 




# **Table `CreateEmbeddingResponseDataInnerEmbedding`**
(mapped from: CreateEmbeddingResponseDataInnerEmbedding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createEmbeddingResponseDataInner | createEmbeddingResponseDataInner | long | | kotlin.Long | Primary Key | *one*
embedding | embedding | decimal | | java.math.BigDecimal | Foreign Key | *many*



