# RunObjectLastError

The last error associated with this run. Will be `null` if there are no errors.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | One of &#x60;server_error&#x60;, &#x60;rate_limit_exceeded&#x60;, or &#x60;invalid_prompt&#x60;. | 
**message** | **str** | A human-readable description of the error. | 

## Example

```python
from openapiopenai.models.run_object_last_error import RunObjectLastError

# TODO update the JSON string below
json = "{}"
# create an instance of RunObjectLastError from a JSON string
run_object_last_error_instance = RunObjectLastError.from_json(json)
# print the JSON string representation of the object
print(RunObjectLastError.to_json())

# convert the object into a dict
run_object_last_error_dict = run_object_last_error_instance.to_dict()
# create an instance of RunObjectLastError from a dict
run_object_last_error_form_dict = run_object_last_error.from_dict(run_object_last_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


