
# Table `CreateModerationResponse`
(mapped from: CreateModerationResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The unique identifier for the moderation request. | 
**model** | model | text NOT NULL |  | **kotlin.String** | The model used to generate the moderation results. | 
**results** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateModerationResponseResultsInner&gt;**](CreateModerationResponseResultsInner.md) | A list of moderation objects. | 




# **Table `CreateModerationResponseCreateModerationResponseResultsInner`**
(mapped from: CreateModerationResponseCreateModerationResponseResultsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createModerationResponse | createModerationResponse | long | | kotlin.Long | Primary Key | *one*
createModerationResponseResultsInner | createModerationResponseResultsInner | long | | kotlin.Long | Foreign Key | *many*



