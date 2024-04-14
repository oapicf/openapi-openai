# CreateAssistantFileRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files. | 

## Example

```python
from openapiopenai.models.create_assistant_file_request import CreateAssistantFileRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssistantFileRequest from a JSON string
create_assistant_file_request_instance = CreateAssistantFileRequest.from_json(json)
# print the JSON string representation of the object
print(CreateAssistantFileRequest.to_json())

# convert the object into a dict
create_assistant_file_request_dict = create_assistant_file_request_instance.to_dict()
# create an instance of CreateAssistantFileRequest from a dict
create_assistant_file_request_form_dict = create_assistant_file_request.from_dict(create_assistant_file_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


