# RealtimeSessionCreateRequest

Realtime session object configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modalities** | **List[str]** | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  | [optional] 
**model** | **str** | The Realtime model used for this session.  | 
**instructions** | **str** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] 
**voice** | **str** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] 
**input_audio_format** | **str** | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**output_audio_format** | **str** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**input_audio_transcription** | [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  | [optional] 
**turn_detection** | [**RealtimeSessionCreateRequestTurnDetection**](RealtimeSessionCreateRequestTurnDetection.md) |  | [optional] 
**tools** | [**List[RealtimeResponseCreateParamsToolsInner]**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] 
**tool_choice** | **str** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  | [optional] 
**temperature** | **float** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] 
**max_response_output_tokens** | [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] 

## Example

```python
from openapiopenai.models.realtime_session_create_request import RealtimeSessionCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RealtimeSessionCreateRequest from a JSON string
realtime_session_create_request_instance = RealtimeSessionCreateRequest.from_json(json)
# print the JSON string representation of the object
print(RealtimeSessionCreateRequest.to_json())

# convert the object into a dict
realtime_session_create_request_dict = realtime_session_create_request_instance.to_dict()
# create an instance of RealtimeSessionCreateRequest from a dict
realtime_session_create_request_from_dict = RealtimeSessionCreateRequest.from_dict(realtime_session_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


