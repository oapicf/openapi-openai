# OAIChatCompletionRequestMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **NSString*** | The contents of the function message. | 
**role** | **NSString*** | The role of the messages author, in this case &#x60;function&#x60;. | 
**name** | **NSString*** | The name of the function to call. | 
**toolCalls** | [**NSArray&lt;OAIChatCompletionMessageToolCall&gt;***](OAIChatCompletionMessageToolCall.md) | The tool calls generated by the model, such as function calls. | [optional] 
**functionCall** | [**OAIChatCompletionRequestAssistantMessageFunctionCall***](OAIChatCompletionRequestAssistantMessageFunctionCall.md) |  | [optional] 
**toolCallId** | **NSString*** | Tool call that this message is responding to. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

