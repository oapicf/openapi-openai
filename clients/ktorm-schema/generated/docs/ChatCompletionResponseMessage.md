
# Table `ChatCompletionResponseMessage`
(mapped from: ChatCompletionResponseMessage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**role** | role | text NOT NULL |  | [**role**](#Role) | The role of the author of this message. | 
**content** | content | text |  | **kotlin.String** | The contents of the message. |  [optional]
**functionCall** | function_call | long |  | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  |  [optional] [foreignkey]





