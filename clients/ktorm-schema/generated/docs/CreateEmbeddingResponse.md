
# Table `CreateEmbeddingResponse`
(mapped from: CreateEmbeddingResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**model** | model | text NOT NULL |  | **kotlin.String** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateEmbeddingResponseDataInner&gt;**](CreateEmbeddingResponseDataInner.md) |  | 
**usage** | usage | long NOT NULL |  | [**CreateEmbeddingResponseUsage**](CreateEmbeddingResponseUsage.md) |  |  [foreignkey]




# **Table `CreateEmbeddingResponseCreateEmbeddingResponseDataInner`**
(mapped from: CreateEmbeddingResponseCreateEmbeddingResponseDataInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createEmbeddingResponse | createEmbeddingResponse | long | | kotlin.Long | Primary Key | *one*
createEmbeddingResponseDataInner | createEmbeddingResponseDataInner | long | | kotlin.Long | Foreign Key | *many*




