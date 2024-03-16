# ChatCompletionRequestMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **String** | The role of the messages author. One of `system`, `user`, `assistant`, or `function`. | 
**content** | Option<**String**> | The contents of the message. `content` is required for all messages except assistant messages with function calls. | [optional]
**name** | Option<**String**> | The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. | [optional]
**function_call** | Option<[**models::ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessage_function_call.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


