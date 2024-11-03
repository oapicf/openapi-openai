# ChatCompletionTokenLogprobTopLogprobsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **str** | The token. | 
**logprob** | **float** | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. | 
**bytes** | **List[int]** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. | 

## Example

```python
from openapiopenai.models.chat_completion_token_logprob_top_logprobs_inner import ChatCompletionTokenLogprobTopLogprobsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionTokenLogprobTopLogprobsInner from a JSON string
chat_completion_token_logprob_top_logprobs_inner_instance = ChatCompletionTokenLogprobTopLogprobsInner.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionTokenLogprobTopLogprobsInner.to_json())

# convert the object into a dict
chat_completion_token_logprob_top_logprobs_inner_dict = chat_completion_token_logprob_top_logprobs_inner_instance.to_dict()
# create an instance of ChatCompletionTokenLogprobTopLogprobsInner from a dict
chat_completion_token_logprob_top_logprobs_inner_from_dict = ChatCompletionTokenLogprobTopLogprobsInner.from_dict(chat_completion_token_logprob_top_logprobs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


