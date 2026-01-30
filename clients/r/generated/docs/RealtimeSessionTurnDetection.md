# openapi::RealtimeSessionTurnDetection

Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  | [optional] [Enum: [server_vad]] 
**threshold** | **numeric** | Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  | [optional] 
**prefix_padding_ms** | **integer** | Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  | [optional] 
**silence_duration_ms** | **integer** | Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  | [optional] 


