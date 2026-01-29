# create_chat_completion_response_choices_inner_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_reason** | **openai_api_create_chat_completion_response_choices_inner_FINISHREASON_e** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.  | 
**index** | **int** | The index of the choice in the list of choices. | 
**message** | [**chat_completion_response_message_t**](chat_completion_response_message.md) \* |  | 
**logprobs** | [**create_chat_completion_response_choices_inner_logprobs_t**](create_chat_completion_response_choices_inner_logprobs.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


