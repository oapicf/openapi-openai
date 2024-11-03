# ModifyRunRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] 

## Example

```python
from openapiopenai.models.modify_run_request import ModifyRunRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModifyRunRequest from a JSON string
modify_run_request_instance = ModifyRunRequest.from_json(json)
# print the JSON string representation of the object
print(ModifyRunRequest.to_json())

# convert the object into a dict
modify_run_request_dict = modify_run_request_instance.to_dict()
# create an instance of ModifyRunRequest from a dict
modify_run_request_from_dict = ModifyRunRequest.from_dict(modify_run_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


