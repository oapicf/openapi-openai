
# Table `ChatCompletionResponseMessage`
(mapped from: ChatCompletionResponseMessage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**content** | content | text NOT NULL |  | **kotlin.String** | The contents of the message. | 
**role** | role | text NOT NULL |  | [**role**](#Role) | The role of the author of this message. | 
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatCompletionMessageToolCall&gt;**](ChatCompletionMessageToolCall.md) | The tool calls generated by the model, such as function calls. |  [optional]
**functionCall** | function_call | long |  | [**ChatCompletionRequestAssistantMessageFunctionCall**](ChatCompletionRequestAssistantMessageFunctionCall.md) |  |  [optional] [foreignkey]




# **Table `ChatCompletionResponseMessageChatCompletionMessageToolCall`**
(mapped from: ChatCompletionResponseMessageChatCompletionMessageToolCall)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatCompletionResponseMessage | chatCompletionResponseMessage | long | | kotlin.Long | Primary Key | *one*
chatCompletionMessageToolCall | chatCompletionMessageToolCall | long | | kotlin.Long | Foreign Key | *many*



