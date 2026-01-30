# RunStreamEventOneOf9

Occurs when a [run](/docs/api-reference/runs/object) expires.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of9 import RunStreamEventOneOf9

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf9 from a JSON string
run_stream_event_one_of9_instance = RunStreamEventOneOf9.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf9.to_json())

# convert the object into a dict
run_stream_event_one_of9_dict = run_stream_event_one_of9_instance.to_dict()
# create an instance of RunStreamEventOneOf9 from a dict
run_stream_event_one_of9_from_dict = RunStreamEventOneOf9.from_dict(run_stream_event_one_of9_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


