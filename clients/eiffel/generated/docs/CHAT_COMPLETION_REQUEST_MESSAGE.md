# CHAT_COMPLETION_REQUEST_MESSAGE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**STRING_32**](STRING_32.md) | The role of the messages author. One of &#x60;system&#x60;, &#x60;user&#x60;, &#x60;assistant&#x60;, or &#x60;function&#x60;. | [default to null]
**content** | [**STRING_32**](STRING_32.md) | The contents of the message. &#x60;content&#x60; is required for all messages except assistant messages with function calls. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name of the author of this message. &#x60;name&#x60; is required if role is &#x60;function&#x60;, and it should be the name of the function whose response is in the &#x60;content&#x60;. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. | [optional] [default to null]
**function_call** | [**CHAT_COMPLETION_REQUEST_MESSAGE_FUNCTION_CALL**](ChatCompletionRequestMessage_function_call.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


