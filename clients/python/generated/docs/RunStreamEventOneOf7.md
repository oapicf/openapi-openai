# RunStreamEventOneOf7

Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of7 import RunStreamEventOneOf7

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf7 from a JSON string
run_stream_event_one_of7_instance = RunStreamEventOneOf7.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf7.to_json())

# convert the object into a dict
run_stream_event_one_of7_dict = run_stream_event_one_of7_instance.to_dict()
# create an instance of RunStreamEventOneOf7 from a dict
run_stream_event_one_of7_from_dict = RunStreamEventOneOf7.from_dict(run_stream_event_one_of7_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


