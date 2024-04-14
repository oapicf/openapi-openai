
# Table `ChatCompletionStreamResponseDelta`
(mapped from: ChatCompletionStreamResponseDelta)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**content** | content | text |  | **kotlin.String** | The contents of the chunk message. |  [optional]
**functionCall** | function_call | long |  | [**ChatCompletionStreamResponseDeltaFunctionCall**](ChatCompletionStreamResponseDeltaFunctionCall.md) |  |  [optional] [foreignkey]
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatCompletionMessageToolCallChunk&gt;**](ChatCompletionMessageToolCallChunk.md) |  |  [optional]
**role** | role | text |  | [**role**](#Role) | The role of the author of this message. |  [optional]




# **Table `ChatCompletionStreamResponseDeltaChatCompletionMessageToolCallChunk`**
(mapped from: ChatCompletionStreamResponseDeltaChatCompletionMessageToolCallChunk)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatCompletionStreamResponseDelta | chatCompletionStreamResponseDelta | long | | kotlin.Long | Primary Key | *one*
chatCompletionMessageToolCallChunk | chatCompletionMessageToolCallChunk | long | | kotlin.Long | Foreign Key | *many*




