# RunStreamEventOneOf1

Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of1 import RunStreamEventOneOf1

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf1 from a JSON string
run_stream_event_one_of1_instance = RunStreamEventOneOf1.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf1.to_json())

# convert the object into a dict
run_stream_event_one_of1_dict = run_stream_event_one_of1_instance.to_dict()
# create an instance of RunStreamEventOneOf1 from a dict
run_stream_event_one_of1_form_dict = run_stream_event_one_of1.from_dict(run_stream_event_one_of1_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


