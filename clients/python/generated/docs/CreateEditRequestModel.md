# CreateEditRequestModel

ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_edit_request_model import CreateEditRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateEditRequestModel from a JSON string
create_edit_request_model_instance = CreateEditRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateEditRequestModel.to_json())

# convert the object into a dict
create_edit_request_model_dict = create_edit_request_model_instance.to_dict()
# create an instance of CreateEditRequestModel from a dict
create_edit_request_model_form_dict = create_edit_request_model.from_dict(create_edit_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


