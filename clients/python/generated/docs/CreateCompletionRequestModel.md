# CreateCompletionRequestModel

ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_completion_request_model import CreateCompletionRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateCompletionRequestModel from a JSON string
create_completion_request_model_instance = CreateCompletionRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateCompletionRequestModel.to_json())

# convert the object into a dict
create_completion_request_model_dict = create_completion_request_model_instance.to_dict()
# create an instance of CreateCompletionRequestModel from a dict
create_completion_request_model_form_dict = create_completion_request_model.from_dict(create_completion_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


