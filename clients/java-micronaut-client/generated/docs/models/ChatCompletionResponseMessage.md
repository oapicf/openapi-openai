

# ChatCompletionResponseMessage

The class is defined in **[ChatCompletionResponseMessage.java](../../src/main/java/org/openapitools/model/ChatCompletionResponseMessage.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | The role of the author of this message. | 
**content** | `String` | The contents of the message. |  [optional property]
**functionCall** | [`ChatCompletionRequestMessageFunctionCall`](ChatCompletionRequestMessageFunctionCall.md) |  |  [optional property]

## RoleEnum

Name | Value
---- | -----
SYSTEM | `"system"`
USER | `"user"`
ASSISTANT | `"assistant"`
FUNCTION | `"function"`




