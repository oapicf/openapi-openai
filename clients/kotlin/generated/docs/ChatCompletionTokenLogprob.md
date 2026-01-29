
# ChatCompletionTokenLogprob

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **token** | **kotlin.String** | The token. |  |
| **logprob** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. |  |
| **bytes** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. |  |
| **topLogprobs** | [**kotlin.collections.List&lt;ChatCompletionTokenLogprobTopLogprobsInner&gt;**](ChatCompletionTokenLogprobTopLogprobsInner.md) | List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned. |  |



