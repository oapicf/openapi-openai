# RealtimeResponseCreateParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modalities** | Option<**Vec<Modalities>**> | The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  (enum: text, audio) | [optional]
**instructions** | Option<**String**> | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  | [optional]
**voice** | Option<**Voice**> | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  (enum: alloy, ash, ballad, coral, echo, sage, shimmer, verse) | [optional]
**output_audio_format** | Option<**OutputAudioFormat**> | The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  (enum: pcm16, g711_ulaw, g711_alaw) | [optional]
**tools** | Option<[**Vec<models::RealtimeResponseCreateParamsToolsInner>**](RealtimeResponseCreateParamsToolsInner.md)> | Tools (functions) available to the model. | [optional]
**tool_choice** | Option<**String**> | How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`.  | [optional]
**temperature** | Option<**f64**> | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional]
**max_response_output_tokens** | Option<[**models::RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md)> |  | [optional]
**conversation** | Option<[**models::RealtimeResponseCreateParamsConversation**](RealtimeResponseCreateParamsConversation.md)> |  | [optional]
**metadata** | Option<**serde_json::Value**> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional]
**input** | Option<[**Vec<models::RealtimeConversationItem>**](RealtimeConversationItem.md)> | Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


