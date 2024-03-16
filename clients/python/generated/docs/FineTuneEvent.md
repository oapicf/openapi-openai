# FineTuneEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**created_at** | **int** |  | 
**level** | **str** |  | 
**message** | **str** |  | 

## Example

```python
from openapiopenai.models.fine_tune_event import FineTuneEvent

# TODO update the JSON string below
json = "{}"
# create an instance of FineTuneEvent from a JSON string
fine_tune_event_instance = FineTuneEvent.from_json(json)
# print the JSON string representation of the object
print(FineTuneEvent.to_json())

# convert the object into a dict
fine_tune_event_dict = fine_tune_event_instance.to_dict()
# create an instance of FineTuneEvent from a dict
fine_tune_event_form_dict = fine_tune_event.from_dict(fine_tune_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


