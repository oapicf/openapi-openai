# RealtimeResponseCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modalities** | [**Vec<models::ChatCompletionModalitiesInner>**](ChatCompletionModalities_inner.md) | The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  | [optional] [default to None]
**instructions** | **String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  | [optional] [default to None]
**voice** | [***models::RealtimeResponseCreateParamsVoice**](RealtimeResponseCreateParams_voice.md) |  | [optional] [default to None]
**output_audio_format** | [***models::RealtimeResponseCreateParamsOutputAudioFormat**](RealtimeResponseCreateParams_output_audio_format.md) |  | [optional] [default to None]
**tools** | [**Vec<models::RealtimeResponseCreateParamsToolsInner>**](RealtimeResponseCreateParams_tools_inner.md) | Tools (functions) available to the model. | [optional] [default to None]
**tool_choice** | **String** | How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`.  | [optional] [default to None]
**temperature** | **f64** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] [default to None]
**max_response_output_tokens** | [***models::RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParams_max_response_output_tokens.md) |  | [optional] [default to None]
**conversation** | [***models::RealtimeResponseCreateParamsConversation**](RealtimeResponseCreateParams_conversation.md) |  | [optional] [default to None]
**metadata** | [***serde_json::Value**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to None]
**input** | [**Vec<models::RealtimeConversationItem>**](RealtimeConversationItem.md) | Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


