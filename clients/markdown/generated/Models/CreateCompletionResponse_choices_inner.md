# CreateCompletionResponse_choices_inner
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **finish\_reason** | **String** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | [default to null] |
| **index** | **Integer** |  | [default to null] |
| **logprobs** | [**CreateCompletionResponse_choices_inner_logprobs**](CreateCompletionResponse_choices_inner_logprobs.md) |  | [default to null] |
| **text** | **String** |  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

