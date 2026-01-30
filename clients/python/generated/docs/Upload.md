# Upload

The Upload object can accept byte chunks in the form of Parts. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The Upload unique identifier, which can be referenced in API endpoints. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**filename** | **str** | The name of the file to be uploaded. | 
**bytes** | **int** | The intended number of bytes to be uploaded. | 
**purpose** | **str** | The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. | 
**status** | **str** | The status of the Upload. | 
**expires_at** | **int** | The Unix timestamp (in seconds) for when the Upload was created. | 
**object** | **str** | The object type, which is always \&quot;upload\&quot;. | [optional] 
**file** | [**OpenAIFile**](OpenAIFile.md) |  | [optional] 

## Example

```python
from openapiopenai.models.upload import Upload

# TODO update the JSON string below
json = "{}"
# create an instance of Upload from a JSON string
upload_instance = Upload.from_json(json)
# print the JSON string representation of the object
print(Upload.to_json())

# convert the object into a dict
upload_dict = upload_instance.to_dict()
# create an instance of Upload from a dict
upload_from_dict = Upload.from_dict(upload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


