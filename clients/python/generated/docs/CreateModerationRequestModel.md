# CreateModerationRequestModel

The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_moderation_request_model import CreateModerationRequestModel

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationRequestModel from a JSON string
create_moderation_request_model_instance = CreateModerationRequestModel.from_json(json)
# print the JSON string representation of the object
print(CreateModerationRequestModel.to_json())

# convert the object into a dict
create_moderation_request_model_dict = create_moderation_request_model_instance.to_dict()
# create an instance of CreateModerationRequestModel from a dict
create_moderation_request_model_from_dict = CreateModerationRequestModel.from_dict(create_moderation_request_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


