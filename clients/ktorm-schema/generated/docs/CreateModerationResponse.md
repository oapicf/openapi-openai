
# Table `CreateModerationResponse`
(mapped from: CreateModerationResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**model** | model | text NOT NULL |  | **kotlin.String** |  | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateModerationResponseResultsInner&gt;**](CreateModerationResponseResultsInner.md) |  | 




# **Table `CreateModerationResponseCreateModerationResponseResultsInner`**
(mapped from: CreateModerationResponseCreateModerationResponseResultsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createModerationResponse | createModerationResponse | long | | kotlin.Long | Primary Key | *one*
createModerationResponseResultsInner | createModerationResponseResultsInner | long | | kotlin.Long | Foreign Key | *many*



