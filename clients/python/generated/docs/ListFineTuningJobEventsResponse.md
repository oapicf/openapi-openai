# ListFineTuningJobEventsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[FineTuningJobEvent]**](FineTuningJobEvent.md) |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.list_fine_tuning_job_events_response import ListFineTuningJobEventsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListFineTuningJobEventsResponse from a JSON string
list_fine_tuning_job_events_response_instance = ListFineTuningJobEventsResponse.from_json(json)
# print the JSON string representation of the object
print(ListFineTuningJobEventsResponse.to_json())

# convert the object into a dict
list_fine_tuning_job_events_response_dict = list_fine_tuning_job_events_response_instance.to_dict()
# create an instance of ListFineTuningJobEventsResponse from a dict
list_fine_tuning_job_events_response_from_dict = ListFineTuningJobEventsResponse.from_dict(list_fine_tuning_job_events_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


