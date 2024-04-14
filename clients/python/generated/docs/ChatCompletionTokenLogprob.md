# ChatCompletionTokenLogprob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **str** | The token. | 
**logprob** | **float** | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. | 
**bytes** | **List[int]** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. | 
**top_logprobs** | [**List[ChatCompletionTokenLogprobTopLogprobsInner]**](ChatCompletionTokenLogprobTopLogprobsInner.md) | List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested &#x60;top_logprobs&#x60; returned. | 

## Example

```python
from openapiopenai.models.chat_completion_token_logprob import ChatCompletionTokenLogprob

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionTokenLogprob from a JSON string
chat_completion_token_logprob_instance = ChatCompletionTokenLogprob.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionTokenLogprob.to_json())

# convert the object into a dict
chat_completion_token_logprob_dict = chat_completion_token_logprob_instance.to_dict()
# create an instance of ChatCompletionTokenLogprob from a dict
chat_completion_token_logprob_form_dict = chat_completion_token_logprob.from_dict(chat_completion_token_logprob_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


