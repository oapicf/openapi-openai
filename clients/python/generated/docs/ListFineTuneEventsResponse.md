# ListFineTuneEventsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[FineTuneEvent]**](FineTuneEvent.md) |  | 

## Example

```python
from openapiopenai.models.list_fine_tune_events_response import ListFineTuneEventsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListFineTuneEventsResponse from a JSON string
list_fine_tune_events_response_instance = ListFineTuneEventsResponse.from_json(json)
# print the JSON string representation of the object
print(ListFineTuneEventsResponse.to_json())

# convert the object into a dict
list_fine_tune_events_response_dict = list_fine_tune_events_response_instance.to_dict()
# create an instance of ListFineTuneEventsResponse from a dict
list_fine_tune_events_response_form_dict = list_fine_tune_events_response.from_dict(list_fine_tune_events_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


