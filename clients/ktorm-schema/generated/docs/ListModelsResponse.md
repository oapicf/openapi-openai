
# Table `ListModelsResponse`
(mapped from: ListModelsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**object** | object | text NOT NULL |  | [**object**](#Object) |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Model&gt;**](Model.md) |  | 



# **Table `ListModelsResponseModel`**
(mapped from: ListModelsResponseModel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
listModelsResponse | listModelsResponse | long | | kotlin.Long | Primary Key | *one*
model | model | long | | kotlin.Long | Foreign Key | *many*



