# OpenApiOpenAIClient::RealtimeSession

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Unique identifier for the session object.  | [optional] |
| **modalities** | **Array&lt;String&gt;** | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  | [optional] |
| **model** | [**RealtimeSessionModel**](RealtimeSessionModel.md) |  | [optional] |
| **instructions** | **String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] |
| **voice** | **String** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] |
| **input_audio_format** | **String** | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] |
| **output_audio_format** | **String** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] |
| **input_audio_transcription** | [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  | [optional] |
| **turn_detection** | [**RealtimeSessionTurnDetection**](RealtimeSessionTurnDetection.md) |  | [optional] |
| **tools** | [**Array&lt;RealtimeResponseCreateParamsToolsInner&gt;**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] |
| **tool_choice** | **String** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  | [optional] |
| **temperature** | **Float** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] |
| **max_response_output_tokens** | [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeSession.new(
  id: null,
  modalities: null,
  model: null,
  instructions: null,
  voice: null,
  input_audio_format: null,
  output_audio_format: null,
  input_audio_transcription: null,
  turn_detection: null,
  tools: null,
  tool_choice: null,
  temperature: null,
  max_response_output_tokens: null
)
```

