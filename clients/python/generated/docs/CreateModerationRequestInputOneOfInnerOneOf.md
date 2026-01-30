# CreateModerationRequestInputOneOfInnerOneOf

An object describing an image to classify.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;image_url&#x60;. | 
**image_url** | [**CreateModerationRequestInputOneOfInnerOneOfImageUrl**](CreateModerationRequestInputOneOfInnerOneOfImageUrl.md) |  | 

## Example

```python
from openapiopenai.models.create_moderation_request_input_one_of_inner_one_of import CreateModerationRequestInputOneOfInnerOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationRequestInputOneOfInnerOneOf from a JSON string
create_moderation_request_input_one_of_inner_one_of_instance = CreateModerationRequestInputOneOfInnerOneOf.from_json(json)
# print the JSON string representation of the object
print(CreateModerationRequestInputOneOfInnerOneOf.to_json())

# convert the object into a dict
create_moderation_request_input_one_of_inner_one_of_dict = create_moderation_request_input_one_of_inner_one_of_instance.to_dict()
# create an instance of CreateModerationRequestInputOneOfInnerOneOf from a dict
create_moderation_request_input_one_of_inner_one_of_from_dict = CreateModerationRequestInputOneOfInnerOneOf.from_dict(create_moderation_request_input_one_of_inner_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


