# RealtimeSessionCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modalities** | [**Vec<models::ChatCompletionModalitiesInner>**](ChatCompletionModalities_inner.md) | The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  | [optional] [default to None]
**model** | [***models::RealtimeSessionCreateRequestModel**](RealtimeSessionCreateRequest_model.md) |  | 
**instructions** | **String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  | [optional] [default to None]
**voice** | [***models::RealtimeResponseCreateParamsVoice**](RealtimeResponseCreateParams_voice.md) |  | [optional] [default to None]
**input_audio_format** | [***models::RealtimeSessionInputAudioFormat**](RealtimeSession_input_audio_format.md) |  | [optional] [default to None]
**output_audio_format** | [***models::RealtimeResponseCreateParamsOutputAudioFormat**](RealtimeResponseCreateParams_output_audio_format.md) |  | [optional] [default to None]
**input_audio_transcription** | [***models::RealtimeSessionInputAudioTranscription**](RealtimeSession_input_audio_transcription.md) |  | [optional] [default to None]
**turn_detection** | [***models::RealtimeSessionCreateRequestTurnDetection**](RealtimeSessionCreateRequest_turn_detection.md) |  | [optional] [default to None]
**tools** | [**Vec<models::RealtimeResponseCreateParamsToolsInner>**](RealtimeResponseCreateParams_tools_inner.md) | Tools (functions) available to the model. | [optional] [default to None]
**tool_choice** | **String** | How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.  | [optional] [default to None]
**temperature** | **f64** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] [default to None]
**max_response_output_tokens** | [***models::RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParams_max_response_output_tokens.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


