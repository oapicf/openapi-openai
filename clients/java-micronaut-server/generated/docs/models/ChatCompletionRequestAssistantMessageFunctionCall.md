

# ChatCompletionRequestAssistantMessageFunctionCall

Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.

The class is defined in **[ChatCompletionRequestAssistantMessageFunctionCall.java](../../src/main/java/org/openapitools/model/ChatCompletionRequestAssistantMessageFunctionCall.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | `String` | The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function. | 
**name** | `String` | The name of the function to call. | 




