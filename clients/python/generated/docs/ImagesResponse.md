# ImagesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | **int** |  | 
**data** | [**List[Image]**](Image.md) |  | 

## Example

```python
from openapiopenai.models.images_response import ImagesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ImagesResponse from a JSON string
images_response_instance = ImagesResponse.from_json(json)
# print the JSON string representation of the object
print(ImagesResponse.to_json())

# convert the object into a dict
images_response_dict = images_response_instance.to_dict()
# create an instance of ImagesResponse from a dict
images_response_form_dict = images_response.from_dict(images_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


