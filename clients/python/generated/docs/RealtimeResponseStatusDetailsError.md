# RealtimeResponseStatusDetailsError

A description of the error that caused the response to fail,  populated when the `status` is `failed`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of error. | [optional] 
**code** | **str** | Error code, if any. | [optional] 

## Example

```python
from openapiopenai.models.realtime_response_status_details_error import RealtimeResponseStatusDetailsError

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseStatusDetailsError from a JSON string
realtime_response_status_details_error_instance = RealtimeResponseStatusDetailsError.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseStatusDetailsError.to_json())

# convert the object into a dict
realtime_response_status_details_error_dict = realtime_response_status_details_error_instance.to_dict()
# create an instance of RealtimeResponseStatusDetailsError from a dict
realtime_response_status_details_error_from_dict = RealtimeResponseStatusDetailsError.from_dict(realtime_response_status_details_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


