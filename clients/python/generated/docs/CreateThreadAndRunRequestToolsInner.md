# CreateThreadAndRunRequestToolsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of tool being defined: &#x60;code_interpreter&#x60; | 
**function** | [**FunctionObject**](FunctionObject.md) |  | 

## Example

```python
from openapiopenai.models.create_thread_and_run_request_tools_inner import CreateThreadAndRunRequestToolsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateThreadAndRunRequestToolsInner from a JSON string
create_thread_and_run_request_tools_inner_instance = CreateThreadAndRunRequestToolsInner.from_json(json)
# print the JSON string representation of the object
print(CreateThreadAndRunRequestToolsInner.to_json())

# convert the object into a dict
create_thread_and_run_request_tools_inner_dict = create_thread_and_run_request_tools_inner_instance.to_dict()
# create an instance of CreateThreadAndRunRequestToolsInner from a dict
create_thread_and_run_request_tools_inner_form_dict = create_thread_and_run_request_tools_inner.from_dict(create_thread_and_run_request_tools_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


