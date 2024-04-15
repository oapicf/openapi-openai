
# Table `ChatCompletionRequestMessage`
(mapped from: ChatCompletionRequestMessage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**content** | content | text NOT NULL |  | **kotlin.String** | The contents of the function message. | 
**role** | role | text NOT NULL |  | [**role**](#Role) | The role of the messages author, in this case &#x60;function&#x60;. | 
**name** | name | text NOT NULL |  | **kotlin.String** | The name of the function to call. | 
**toolCallId** | tool_call_id | text NOT NULL |  | **kotlin.String** | Tool call that this message is responding to. | 
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatCompletionMessageToolCall&gt;**](ChatCompletionMessageToolCall.md) | The tool calls generated by the model, such as function calls. |  [optional]
**functionCall** | function_call | long |  | [**ChatCompletionRequestAssistantMessageFunctionCall**](ChatCompletionRequestAssistantMessageFunctionCall.md) |  |  [optional] [foreignkey]






# **Table `ChatCompletionRequestMessageChatCompletionMessageToolCall`**
(mapped from: ChatCompletionRequestMessageChatCompletionMessageToolCall)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatCompletionRequestMessage | chatCompletionRequestMessage | long | | kotlin.Long | Primary Key | *one*
chatCompletionMessageToolCall | chatCompletionMessageToolCall | long | | kotlin.Long | Foreign Key | *many*



