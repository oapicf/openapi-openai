# RealtimeSession
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Unique identifier for the session object.  | [optional] 
**Modalities** | **String[]** | The set of modalities the model can respond with. To disable audio, set this to [&quot;&quot;text&quot;&quot;].  | [optional] 
**Model** | [**RealtimeSessionModel**](RealtimeSessionModel.md) |  | [optional] 
**Instructions** | **String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. &quot;&quot;be extremely succinct&quot;&quot;, &quot;&quot;act friendly&quot;&quot;, &quot;&quot;here are examples of good  responses&quot;&quot;) and on audio behavior (e.g. &quot;&quot;talk quickly&quot;&quot;, &quot;&quot;inject emotion  into your voice&quot;&quot;, &quot;&quot;laugh frequently&quot;&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] 
**Voice** | **String** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] 
**InputAudioFormat** | **String** | The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**OutputAudioFormat** | **String** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**InputAudioTranscription** | [**RealtimeSessionInputAudioTranscription**](RealtimeSessionInputAudioTranscription.md) |  | [optional] 
**TurnDetection** | [**RealtimeSessionTurnDetection**](RealtimeSessionTurnDetection.md) |  | [optional] 
**Tools** | [**RealtimeResponseCreateParamsToolsInner[]**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] 
**ToolChoice** | **String** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  | [optional] 
**Temperature** | **Decimal** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] 
**MaxResponseOutputTokens** | [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeSession = Initialize-PSOpenAPIToolsRealtimeSession  -Id null `
 -Modalities null `
 -Model null `
 -Instructions null `
 -Voice null `
 -InputAudioFormat null `
 -OutputAudioFormat null `
 -InputAudioTranscription null `
 -TurnDetection null `
 -Tools null `
 -ToolChoice null `
 -Temperature null `
 -MaxResponseOutputTokens null
```

- Convert the resource to JSON
```powershell
$RealtimeSession | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

