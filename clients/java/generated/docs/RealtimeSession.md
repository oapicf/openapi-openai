

# RealtimeSession

Realtime session object configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the session object.  |  [optional] |
|**modalities** | [**List&lt;ModalitiesEnum&gt;**](#List&lt;ModalitiesEnum&gt;) | The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  |  [optional] |
|**model** | [**RealtimeSessionModel**](RealtimeSessionModel.md) |  |  [optional] |
|**instructions** | **String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  |  [optional] |
|**voice** | [**VoiceEnum**](#VoiceEnum) | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  |  [optional] |
|**inputAudioFormat** | [**InputAudioFormatEnum**](#InputAudioFormatEnum) | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  |  [optional] |
|**outputAudioFormat** | [**OutputAudioFormatEnum**](#OutputAudioFormatEnum) | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  |  [optional] |
|**inputAudioTranscription** | [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  |  [optional] |
|**turnDetection** | [**RealtimeSessionTurnDetection**](RealtimeSessionTurnDetection.md) |  |  [optional] |
|**tools** | [**List&lt;RealtimeResponseCreateParamsToolsInner&gt;**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. |  [optional] |
|**toolChoice** | **String** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  |  [optional] |
|**temperature** | **BigDecimal** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  |  [optional] |
|**maxResponseOutputTokens** | [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  |  [optional] |



## Enum: List&lt;ModalitiesEnum&gt;

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| AUDIO | &quot;audio&quot; |



## Enum: VoiceEnum

| Name | Value |
|---- | -----|
| ALLOY | &quot;alloy&quot; |
| ASH | &quot;ash&quot; |
| BALLAD | &quot;ballad&quot; |
| CORAL | &quot;coral&quot; |
| ECHO | &quot;echo&quot; |
| SAGE | &quot;sage&quot; |
| SHIMMER | &quot;shimmer&quot; |
| VERSE | &quot;verse&quot; |



## Enum: InputAudioFormatEnum

| Name | Value |
|---- | -----|
| PCM16 | &quot;pcm16&quot; |
| G711_ULAW | &quot;g711_ulaw&quot; |
| G711_ALAW | &quot;g711_alaw&quot; |



## Enum: OutputAudioFormatEnum

| Name | Value |
|---- | -----|
| PCM16 | &quot;pcm16&quot; |
| G711_ULAW | &quot;g711_ulaw&quot; |
| G711_ALAW | &quot;g711_alaw&quot; |



