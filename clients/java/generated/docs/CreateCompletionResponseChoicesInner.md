

# CreateCompletionResponseChoicesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  |  |
|**index** | **Integer** |  |  |
|**logprobs** | [**CreateCompletionResponseChoicesInnerLogprobs**](CreateCompletionResponseChoicesInnerLogprobs.md) |  |  |
|**text** | **String** |  |  |



## Enum: FinishReasonEnum

| Name | Value |
|---- | -----|
| STOP | &quot;stop&quot; |
| LENGTH | &quot;length&quot; |
| CONTENT_FILTER | &quot;content_filter&quot; |



