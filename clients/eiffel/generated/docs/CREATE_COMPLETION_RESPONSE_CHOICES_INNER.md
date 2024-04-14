# CREATE_COMPLETION_RESPONSE_CHOICES_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_reason** | [**STRING_32**](STRING_32.md) | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | [default to null]
**index** | **INTEGER_32** |  | [default to null]
**logprobs** | [**CREATE_COMPLETION_RESPONSE_CHOICES_INNER_LOGPROBS**](CreateCompletionResponse_choices_inner_logprobs.md) |  | [default to null]
**text** | [**STRING_32**](STRING_32.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


