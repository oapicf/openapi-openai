# CreateModerationRequestInputOneOfInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;image_url&#x60;. | 
**image_url** | [**CreateModerationRequestInputOneOfInnerOneOfImageUrl**](CreateModerationRequestInputOneOfInnerOneOfImageUrl.md) |  | 
**text** | **str** | A string of text to classify. | 

## Example

```python
from openapiopenai.models.create_moderation_request_input_one_of_inner import CreateModerationRequestInputOneOfInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationRequestInputOneOfInner from a JSON string
create_moderation_request_input_one_of_inner_instance = CreateModerationRequestInputOneOfInner.from_json(json)
# print the JSON string representation of the object
print(CreateModerationRequestInputOneOfInner.to_json())

# convert the object into a dict
create_moderation_request_input_one_of_inner_dict = create_moderation_request_input_one_of_inner_instance.to_dict()
# create an instance of CreateModerationRequestInputOneOfInner from a dict
create_moderation_request_input_one_of_inner_from_dict = CreateModerationRequestInputOneOfInner.from_dict(create_moderation_request_input_one_of_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


