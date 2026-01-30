# REALTIME_CLIENT_EVENT_INPUT_AUDIO_BUFFER_APPEND

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | [**STRING_32**](STRING_32.md) | Optional client-generated ID used to identify this event. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | The event type, must be &#x60;input_audio_buffer.append&#x60;. | [default to null]
**audio** | [**STRING_32**](STRING_32.md) | Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


