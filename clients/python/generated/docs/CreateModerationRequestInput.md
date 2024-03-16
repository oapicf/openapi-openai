# CreateModerationRequestInput

The input text to classify

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.create_moderation_request_input import CreateModerationRequestInput

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationRequestInput from a JSON string
create_moderation_request_input_instance = CreateModerationRequestInput.from_json(json)
# print the JSON string representation of the object
print(CreateModerationRequestInput.to_json())

# convert the object into a dict
create_moderation_request_input_dict = create_moderation_request_input_instance.to_dict()
# create an instance of CreateModerationRequestInput from a dict
create_moderation_request_input_form_dict = create_moderation_request_input.from_dict(create_moderation_request_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


