# RealtimeSessionCreateResponseTurnDetection

Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  | [optional] 
**threshold** | **float** | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional] 
**prefix_padding_ms** | **int** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional] 
**silence_duration_ms** | **int** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional] 

## Example

```python
from openapiopenai.models.realtime_session_create_response_turn_detection import RealtimeSessionCreateResponseTurnDetection

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeSessionCreateResponseTurnDetection from a JSON string
realtime_session_create_response_turn_detection_instance = RealtimeSessionCreateResponseTurnDetection.from_json(json)
# print the JSON string representation of the object
print(RealtimeSessionCreateResponseTurnDetection.to_json())

# convert the object into a dict
realtime_session_create_response_turn_detection_dict = realtime_session_create_response_turn_detection_instance.to_dict()
# create an instance of RealtimeSessionCreateResponseTurnDetection from a dict
realtime_session_create_response_turn_detection_from_dict = RealtimeSessionCreateResponseTurnDetection.from_dict(realtime_session_create_response_turn_detection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


