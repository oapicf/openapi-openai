# REALTIME_SESSION_CREATE_RESPONSE_TURN_DETECTION

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**STRING_32**](STRING_32.md) | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  | [optional] [default to null]
**threshold** | **REAL_32** | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional] [default to null]
**prefix_padding_ms** | **INTEGER_32** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional] [default to null]
**silence_duration_ms** | **INTEGER_32** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


