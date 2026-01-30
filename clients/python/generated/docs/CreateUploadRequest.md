# CreateUploadRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **str** | The name of the file to upload.  | 
**purpose** | **str** | The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  | 
**bytes** | **int** | The number of bytes in the file you are uploading.  | 
**mime_type** | **str** | The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  | 

## Example

```python
from openapiopenai.models.create_upload_request import CreateUploadRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateUploadRequest from a JSON string
create_upload_request_instance = CreateUploadRequest.from_json(json)
# print the JSON string representation of the object
print(CreateUploadRequest.to_json())

# convert the object into a dict
create_upload_request_dict = create_upload_request_instance.to_dict()
# create an instance of CreateUploadRequest from a dict
create_upload_request_from_dict = CreateUploadRequest.from_dict(create_upload_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


