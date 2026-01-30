# RunStreamEventOneOf6

Occurs when a [run](/docs/api-reference/runs/object) fails.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of6 import RunStreamEventOneOf6

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf6 from a JSON string
run_stream_event_one_of6_instance = RunStreamEventOneOf6.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf6.to_json())

# convert the object into a dict
run_stream_event_one_of6_dict = run_stream_event_one_of6_instance.to_dict()
# create an instance of RunStreamEventOneOf6 from a dict
run_stream_event_one_of6_from_dict = RunStreamEventOneOf6.from_dict(run_stream_event_one_of6_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


