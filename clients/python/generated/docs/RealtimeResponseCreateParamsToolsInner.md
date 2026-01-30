# RealtimeResponseCreateParamsToolsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the tool, i.e. &#x60;function&#x60;. | [optional] 
**name** | **str** | The name of the function. | [optional] 
**description** | **str** | The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  | [optional] 
**parameters** | **object** | Parameters of the function in JSON Schema. | [optional] 

## Example

```python
from openapiopenai.models.realtime_response_create_params_tools_inner import RealtimeResponseCreateParamsToolsInner

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseCreateParamsToolsInner from a JSON string
realtime_response_create_params_tools_inner_instance = RealtimeResponseCreateParamsToolsInner.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseCreateParamsToolsInner.to_json())

# convert the object into a dict
realtime_response_create_params_tools_inner_dict = realtime_response_create_params_tools_inner_instance.to_dict()
# create an instance of RealtimeResponseCreateParamsToolsInner from a dict
realtime_response_create_params_tools_inner_from_dict = RealtimeResponseCreateParamsToolsInner.from_dict(realtime_response_create_params_tools_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


