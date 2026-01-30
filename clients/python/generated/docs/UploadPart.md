# UploadPart

The upload Part represents a chunk of bytes we can add to an Upload object. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The upload Part unique identifier, which can be referenced in API endpoints. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the Part was created. | 
**upload_id** | **str** | The ID of the Upload object that this Part was added to. | 
**object** | **str** | The object type, which is always &#x60;upload.part&#x60;. | 

## Example

```python
from openapiopenai.models.upload_part import UploadPart

# TODO update the JSON string below
json = "{}"
# create an instance of UploadPart from a JSON string
upload_part_instance = UploadPart.from_json(json)
# print the JSON string representation of the object
print(UploadPart.to_json())

# convert the object into a dict
upload_part_dict = upload_part_instance.to_dict()
# create an instance of UploadPart from a dict
upload_part_from_dict = UploadPart.from_dict(upload_part_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


