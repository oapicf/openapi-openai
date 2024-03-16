

# ChatCompletionStreamResponseDelta

The class is defined in **[ChatCompletionStreamResponseDelta.java](../../src/main/java/org/openapitools/model/ChatCompletionStreamResponseDelta.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | The role of the author of this message. |  [optional property]
**content** | `String` | The contents of the chunk message. |  [optional property]
**functionCall** | [`ChatCompletionRequestMessageFunctionCall`](ChatCompletionRequestMessageFunctionCall.md) |  |  [optional property]

## RoleEnum

Name | Value
---- | -----
SYSTEM | `"system"`
USER | `"user"`
ASSISTANT | `"assistant"`
FUNCTION | `"function"`




