

# CreateChatCompletionFunctionResponseChoicesInner

The class is defined in **[CreateChatCompletionFunctionResponseChoicesInner.java](../../src/main/java/org/openapitools/model/CreateChatCompletionFunctionResponseChoicesInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function.  | 
**index** | `Integer` | The index of the choice in the list of choices. | 
**message** | [`ChatCompletionResponseMessage`](ChatCompletionResponseMessage.md) |  | 

## FinishReasonEnum

Name | Value
---- | -----
STOP | `"stop"`
LENGTH | `"length"`
FUNCTION_CALL | `"function_call"`
CONTENT_FILTER | `"content_filter"`




