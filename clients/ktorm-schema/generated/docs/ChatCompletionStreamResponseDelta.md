
# Table `ChatCompletionStreamResponseDelta`
(mapped from: ChatCompletionStreamResponseDelta)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**role** | role | text |  | [**role**](#Role) | The role of the author of this message. |  [optional]
**content** | content | text |  | **kotlin.String** | The contents of the chunk message. |  [optional]
**functionCall** | function_call | long |  | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  |  [optional] [foreignkey]





