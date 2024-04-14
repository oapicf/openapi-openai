# RunStreamEventOneOf4

Occurs when a [run](/docs/api-reference/runs/object) is completed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of4 import RunStreamEventOneOf4

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf4 from a JSON string
run_stream_event_one_of4_instance = RunStreamEventOneOf4.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf4.to_json())

# convert the object into a dict
run_stream_event_one_of4_dict = run_stream_event_one_of4_instance.to_dict()
# create an instance of RunStreamEventOneOf4 from a dict
run_stream_event_one_of4_form_dict = run_stream_event_one_of4.from_dict(run_stream_event_one_of4_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


