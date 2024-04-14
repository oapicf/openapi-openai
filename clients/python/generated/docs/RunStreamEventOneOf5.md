# RunStreamEventOneOf5

Occurs when a [run](/docs/api-reference/runs/object) fails.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of5 import RunStreamEventOneOf5

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf5 from a JSON string
run_stream_event_one_of5_instance = RunStreamEventOneOf5.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf5.to_json())

# convert the object into a dict
run_stream_event_one_of5_dict = run_stream_event_one_of5_instance.to_dict()
# create an instance of RunStreamEventOneOf5 from a dict
run_stream_event_one_of5_form_dict = run_stream_event_one_of5.from_dict(run_stream_event_one_of5_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


