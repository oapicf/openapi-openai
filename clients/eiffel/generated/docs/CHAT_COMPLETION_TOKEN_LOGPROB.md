# CHAT_COMPLETION_TOKEN_LOGPROB

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | [**STRING_32**](STRING_32.md) | The token. | [default to null]
**logprob** | **REAL_32** | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. | [default to null]
**bytes** | **LIST [INTEGER_32]** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. | [default to null]
**top_logprobs** | [**LIST [CHAT_COMPLETION_TOKEN_LOGPROB_TOP_LOGPROBS_INNER]**](ChatCompletionTokenLogprob_top_logprobs_inner.md) | List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


