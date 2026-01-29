# ListRunStepsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[RunStepObject]**](RunStepObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_run_steps_response import ListRunStepsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListRunStepsResponse from a JSON string
list_run_steps_response_instance = ListRunStepsResponse.from_json(json)
# print the JSON string representation of the object
print(ListRunStepsResponse.to_json())

# convert the object into a dict
list_run_steps_response_dict = list_run_steps_response_instance.to_dict()
# create an instance of ListRunStepsResponse from a dict
list_run_steps_response_from_dict = ListRunStepsResponse.from_dict(list_run_steps_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


