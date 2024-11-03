# CreateImageEditRequestModel

The model to use for image generation. Only `dall-e-2` is supported at this time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_image_edit_request_model import CreateImageEditRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateImageEditRequestModel from a JSON string
create_image_edit_request_model_instance = CreateImageEditRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateImageEditRequestModel.to_json())

# convert the object into a dict
create_image_edit_request_model_dict = create_image_edit_request_model_instance.to_dict()
# create an instance of CreateImageEditRequestModel from a dict
create_image_edit_request_model_from_dict = CreateImageEditRequestModel.from_dict(create_image_edit_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


