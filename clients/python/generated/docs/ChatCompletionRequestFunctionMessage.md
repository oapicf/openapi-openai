# ChatCompletionRequestFunctionMessage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the messages author, in this case &#x60;function&#x60;. | 
**content** | **str** | The contents of the function message. | 
**name** | **str** | The name of the function to call. | 

## Example

```python
from openapiopenai.models.chat_completion_request_function_message import ChatCompletionRequestFunctionMessage

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestFunctionMessage from a JSON string
chat_completion_request_function_message_instance = ChatCompletionRequestFunctionMessage.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestFunctionMessage.to_json())

# convert the object into a dict
chat_completion_request_function_message_dict = chat_completion_request_function_message_instance.to_dict()
# create an instance of ChatCompletionRequestFunctionMessage from a dict
chat_completion_request_function_message_from_dict = ChatCompletionRequestFunctionMessage.from_dict(chat_completion_request_function_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


