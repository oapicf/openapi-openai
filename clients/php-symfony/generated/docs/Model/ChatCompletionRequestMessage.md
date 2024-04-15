# ChatCompletionRequestMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **string** | The contents of the function message. | 
**role** | **string** | The role of the messages author, in this case &#x60;function&#x60;. | 
**name** | **string** | The name of the function to call. | 
**toolCalls** | [**OpenAPI\Server\Model\ChatCompletionMessageToolCall**](ChatCompletionMessageToolCall.md) | The tool calls generated by the model, such as function calls. | [optional] 
**functionCall** | [**OpenAPI\Server\Model\ChatCompletionRequestAssistantMessageFunctionCall**](ChatCompletionRequestAssistantMessageFunctionCall.md) |  | [optional] 
**toolCallId** | **string** | Tool call that this message is responding to. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

