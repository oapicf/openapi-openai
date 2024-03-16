
# Table `CreateChatCompletionResponse`
(mapped from: CreateChatCompletionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**created** | created | int NOT NULL |  | **kotlin.Int** |  | 
**model** | model | text NOT NULL |  | **kotlin.String** |  | 
**choices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateChatCompletionResponseChoicesInner&gt;**](CreateChatCompletionResponseChoicesInner.md) |  | 
**usage** | usage | long |  | [**CreateCompletionResponseUsage**](CreateCompletionResponseUsage.md) |  |  [optional] [foreignkey]






# **Table `CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner`**
(mapped from: CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createChatCompletionResponse | createChatCompletionResponse | long | | kotlin.Long | Primary Key | *one*
createChatCompletionResponseChoicesInner | createChatCompletionResponseChoicesInner | long | | kotlin.Long | Foreign Key | *many*




