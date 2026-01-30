# CreateModerationRequestInputOneOfInnerOneOfImageUrl

Contains either an image URL or a data URL for a base64 encoded image.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | Either a URL of the image or the base64 encoded image data. | 

## Example

```python
from openapiopenai.models.create_moderation_request_input_one_of_inner_one_of_image_url import CreateModerationRequestInputOneOfInnerOneOfImageUrl

# TODO update the JSON string below
json = "{}"
# create an instance of CreateModerationRequestInputOneOfInnerOneOfImageUrl from a JSON string
create_moderation_request_input_one_of_inner_one_of_image_url_instance = CreateModerationRequestInputOneOfInnerOneOfImageUrl.from_json(json)
# print the JSON string representation of the object
print(CreateModerationRequestInputOneOfInnerOneOfImageUrl.to_json())

# convert the object into a dict
create_moderation_request_input_one_of_inner_one_of_image_url_dict = create_moderation_request_input_one_of_inner_one_of_image_url_instance.to_dict()
# create an instance of CreateModerationRequestInputOneOfInnerOneOfImageUrl from a dict
create_moderation_request_input_one_of_inner_one_of_image_url_from_dict = CreateModerationRequestInputOneOfInnerOneOfImageUrl.from_dict(create_moderation_request_input_one_of_inner_one_of_image_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


