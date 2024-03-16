
# Table `CreateChatCompletionStreamResponse`
(mapped from: CreateChatCompletionStreamResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**object** | object | text NOT NULL |  | **kotlin.String** |  | 
**created** | created | int NOT NULL |  | **kotlin.Int** |  | 
**model** | model | text NOT NULL |  | **kotlin.String** |  | 
**choices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateChatCompletionStreamResponseChoicesInner&gt;**](CreateChatCompletionStreamResponseChoicesInner.md) |  | 






# **Table `CreateChatCompletionStreamResponseCreateChatCompletionStreamResponseChoicesInner`**
(mapped from: CreateChatCompletionStreamResponseCreateChatCompletionStreamResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createChatCompletionStreamResponse | createChatCompletionStreamResponse | long | | kotlin.Long | Primary Key | *one*
createChatCompletionStreamResponseChoicesInner | createChatCompletionStreamResponseChoicesInner | long | | kotlin.Long | Foreign Key | *many*



