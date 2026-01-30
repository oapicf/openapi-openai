# RunStreamEventOneOf8

Occurs when a [run](/docs/api-reference/runs/object) is cancelled.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of8 import RunStreamEventOneOf8

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf8 from a JSON string
run_stream_event_one_of8_instance = RunStreamEventOneOf8.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf8.to_json())

# convert the object into a dict
run_stream_event_one_of8_dict = run_stream_event_one_of8_instance.to_dict()
# create an instance of RunStreamEventOneOf8 from a dict
run_stream_event_one_of8_from_dict = RunStreamEventOneOf8.from_dict(run_stream_event_one_of8_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


