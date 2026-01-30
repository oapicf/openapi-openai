
# RealtimeResponseCreateParams

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **modalities** | [**inline**](#kotlin.collections.List&lt;Modalities&gt;) | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  |  [optional] |
| **instructions** | **kotlin.String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  |  [optional] |
| **voice** | [**inline**](#Voice) | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  |  [optional] |
| **outputAudioFormat** | [**inline**](#OutputAudioFormat) | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  |  [optional] |
| **tools** | [**kotlin.collections.List&lt;RealtimeResponseCreateParamsToolsInner&gt;**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. |  [optional] |
| **toolChoice** | **kotlin.String** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function, like &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60;.  |  [optional] |
| **temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  |  [optional] |
| **maxResponseOutputTokens** | [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  |  [optional] |
| **conversation** | [**RealtimeResponseCreateParamsConversation**](RealtimeResponseCreateParamsConversation.md) |  |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional] |
| **input** | [**kotlin.collections.List&lt;RealtimeConversationItem&gt;**](RealtimeConversationItem.md) | Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.  |  [optional] |


<a id="kotlin.collections.List<Modalities>"></a>
## Enum: modalities
| Name | Value |
| ---- | ----- |
| modalities | text, audio |


<a id="Voice"></a>
## Enum: voice
| Name | Value |
| ---- | ----- |
| voice | alloy, ash, ballad, coral, echo, sage, shimmer, verse |


<a id="OutputAudioFormat"></a>
## Enum: output_audio_format
| Name | Value |
| ---- | ----- |
| outputAudioFormat | pcm16, g711_ulaw, g711_alaw |



