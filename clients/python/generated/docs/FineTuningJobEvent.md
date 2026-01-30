# FineTuningJobEvent

Fine-tuning job event object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | **str** | The object identifier. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | **str** | The log level of the event. | 
**message** | **str** | The message of the event. | 
**type** | **str** | The type of event. | [optional] 
**data** | **object** | The data associated with the event. | [optional] 

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


