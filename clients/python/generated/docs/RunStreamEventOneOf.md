# RunStreamEventOneOf

Occurs when a new [run](/docs/api-reference/runs/object) is created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunObject**](RunObject.md) |  | 

## Example

```python
from openapiopenai.models.run_stream_event_one_of import RunStreamEventOneOf

# TODO update the JSON string below
json = "{}"
# create an instance of RunStreamEventOneOf from a JSON string
run_stream_event_one_of_instance = RunStreamEventOneOf.from_json(json)
# print the JSON string representation of the object
print(RunStreamEventOneOf.to_json())

# convert the object into a dict
run_stream_event_one_of_dict = run_stream_event_one_of_instance.to_dict()
# create an instance of RunStreamEventOneOf from a dict
run_stream_event_one_of_from_dict = RunStreamEventOneOf.from_dict(run_stream_event_one_of_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


