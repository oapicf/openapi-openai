# CreateChatCompletionRequestModel

ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_chat_completion_request_model import CreateChatCompletionRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionRequestModel from a JSON string
create_chat_completion_request_model_instance = CreateChatCompletionRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionRequestModel.to_json())

# convert the object into a dict
create_chat_completion_request_model_dict = create_chat_completion_request_model_instance.to_dict()
# create an instance of CreateChatCompletionRequestModel from a dict
create_chat_completion_request_model_form_dict = create_chat_completion_request_model.from_dict(create_chat_completion_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


