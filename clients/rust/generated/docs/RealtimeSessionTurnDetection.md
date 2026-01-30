# RealtimeSessionTurnDetection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | Option<**String**> | Type of turn detection, only `server_vad` is currently supported.  | [optional]
**threshold** | Option<**f64**> | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional]
**prefix_padding_ms** | Option<**i32**> | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional]
**silence_duration_ms** | Option<**i32**> | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


