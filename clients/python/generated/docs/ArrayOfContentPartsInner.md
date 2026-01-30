# ArrayOfContentPartsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;image_file&#x60;. | 
**image_file** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 
**image_url** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 
**text** | **str** | Text content to be sent to the model | 

## Example

```python
from openapiopenai.models.array_of_content_parts_inner import ArrayOfContentPartsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ArrayOfContentPartsInner from a JSON string
array_of_content_parts_inner_instance = ArrayOfContentPartsInner.from_json(json)
# print the JSON string representation of the object
print(ArrayOfContentPartsInner.to_json())

# convert the object into a dict
array_of_content_parts_inner_dict = array_of_content_parts_inner_instance.to_dict()
# create an instance of ArrayOfContentPartsInner from a dict
array_of_content_parts_inner_from_dict = ArrayOfContentPartsInner.from_dict(array_of_content_parts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


