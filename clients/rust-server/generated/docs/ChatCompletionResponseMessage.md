# ChatCompletionResponseMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **String** | The contents of the message. | 
**tool_calls** | [**Vec<models::ChatCompletionMessageToolCall>**](ChatCompletionMessageToolCall.md) | The tool calls generated by the model, such as function calls. | [optional] [default to None]
**role** | **String** | The role of the author of this message. | 
**function_call** | [***models::ChatCompletionRequestAssistantMessageFunctionCall**](ChatCompletionRequestAssistantMessage_function_call.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

