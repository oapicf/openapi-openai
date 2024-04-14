# RunStepStreamEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **str** |  | 
**data** | [**RunStepObject**](RunStepObject.md) |  | 

## Example

```python
from openapiopenai.models.run_step_stream_event import RunStepStreamEvent

# TODO update the JSON string below
json = "{}"
# create an instance of RunStepStreamEvent from a JSON string
run_step_stream_event_instance = RunStepStreamEvent.from_json(json)
# print the JSON string representation of the object
print(RunStepStreamEvent.to_json())

# convert the object into a dict
run_step_stream_event_dict = run_step_stream_event_instance.to_dict()
# create an instance of RunStepStreamEvent from a dict
run_step_stream_event_form_dict = run_step_stream_event.from_dict(run_step_stream_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


