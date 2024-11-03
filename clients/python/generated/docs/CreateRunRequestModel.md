# CreateRunRequestModel

The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_run_request_model import CreateRunRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateRunRequestModel from a JSON string
create_run_request_model_instance = CreateRunRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateRunRequestModel.to_json())

# convert the object into a dict
create_run_request_model_dict = create_run_request_model_instance.to_dict()
# create an instance of CreateRunRequestModel from a dict
create_run_request_model_from_dict = CreateRunRequestModel.from_dict(create_run_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


