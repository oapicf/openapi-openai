
# Table `CreateCompletionResponse`
(mapped from: CreateCompletionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**created** | created | int NOT NULL |  | **kotlin.Int** |  | 
**model** | model | text NOT NULL |  | **kotlin.String** |  | 
**choices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateCompletionResponseChoicesInner&gt;**](CreateCompletionResponseChoicesInner.md) |  | 
**usage** | usage | long |  | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  |  [optional] [foreignkey]






# **Table `CreateCompletionResponseCreateCompletionResponseChoicesInner`**
(mapped from: CreateCompletionResponseCreateCompletionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createCompletionResponse | createCompletionResponse | long | | kotlin.Long | Primary Key | *one*
createCompletionResponseChoicesInner | createCompletionResponseChoicesInner | long | | kotlin.Long | Foreign Key | *many*




