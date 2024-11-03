# FineTuningJobEvent

Fine-tuning job event object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**created_at** | **int** |  | 
**level** | **str** |  | 
**message** | **str** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.fine_tuning_job_event import FineTuningJobEvent

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuningJobEvent from a JSON string
fine_tuning_job_event_instance = FineTuningJobEvent.from_json(json)
# print the JSON string representation of the object
print(FineTuningJobEvent.to_json())

# convert the object into a dict
fine_tuning_job_event_dict = fine_tuning_job_event_instance.to_dict()
# create an instance of FineTuningJobEvent from a dict
fine_tuning_job_event_from_dict = FineTuningJobEvent.from_dict(fine_tuning_job_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


