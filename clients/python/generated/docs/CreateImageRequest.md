# CreateImageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prompt** | **str** | A text description of the desired image(s). The maximum length is 1000 characters. | 
**n** | **int** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
**size** | **str** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to '1024x1024']
**response_format** | **str** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to 'url']
**user** | **str** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

## Example

```python
from openapiopenai.models.create_image_request import CreateImageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateImageRequest from a JSON string
create_image_request_instance = CreateImageRequest.from_json(json)
# print the JSON string representation of the object
print(CreateImageRequest.to_json())

# convert the object into a dict
create_image_request_dict = create_image_request_instance.to_dict()
# create an instance of CreateImageRequest from a dict
create_image_request_form_dict = create_image_request.from_dict(create_image_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


