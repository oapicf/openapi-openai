# create_completion_response_choices_inner_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_reason** | **openai_api_create_completion_response_choices_inner_FINISHREASON_e** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  | 
**index** | **int** |  | 
**logprobs** | [**create_completion_response_choices_inner_logprobs_t**](create_completion_response_choices_inner_logprobs.md) \* |  | 
**text** | **char \*** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


