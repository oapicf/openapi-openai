

# CreateCompletionResponseChoicesInner

The class is defined in **[CreateCompletionResponseChoicesInner.java](../../src/main/java/org/openapitools/model/CreateCompletionResponseChoicesInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | 
**index** | `Integer` |  | 
**logprobs** | [`CreateCompletionResponseChoicesInnerLogprobs`](CreateCompletionResponseChoicesInnerLogprobs.md) |  | 
**text** | `String` |  | 

## FinishReasonEnum

Name | Value
---- | -----
STOP | `"stop"`
LENGTH | `"length"`
CONTENT_FILTER | `"content_filter"`





