# RealtimeSessionTurnDetection


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`type`** | **`String`** | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  | [optional] [default to nothing]
**`threshold`** | **`Float64`** | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional] [default to nothing]
**`prefix_padding_ms`** | **`Int64`** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional] [default to nothing]
**`silence_duration_ms`** | **`Int64`** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


