# RealtimeResponseStatusDetails

Additional details about the status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of error that caused the response to fail, corresponding  with the &#x60;status&#x60; field (&#x60;completed&#x60;, &#x60;cancelled&#x60;, &#x60;incomplete&#x60;,  &#x60;failed&#x60;).  | [optional] 
**reason** | **str** | The reason the Response did not complete. For a &#x60;cancelled&#x60; Response,  one of &#x60;turn_detected&#x60; (the server VAD detected a new start of speech)  or &#x60;client_cancelled&#x60; (the client sent a cancel event). For an  &#x60;incomplete&#x60; Response, one of &#x60;max_output_tokens&#x60; or &#x60;content_filter&#x60;  (the server-side safety filter activated and cut off the response).  | [optional] 
**error** | [**RealtimeResponseStatusDetailsError**](RealtimeResponseStatusDetailsError.md) |  | [optional] 

## Example

```python
from openapiopenai.models.realtime_response_status_details import RealtimeResponseStatusDetails

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeResponseStatusDetails from a JSON string
realtime_response_status_details_instance = RealtimeResponseStatusDetails.from_json(json)
# print the JSON string representation of the object
print(RealtimeResponseStatusDetails.to_json())

# convert the object into a dict
realtime_response_status_details_dict = realtime_response_status_details_instance.to_dict()
# create an instance of RealtimeResponseStatusDetails from a dict
realtime_response_status_details_from_dict = RealtimeResponseStatusDetails.from_dict(realtime_response_status_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


