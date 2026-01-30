# RealtimeResponseCreateParams
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Modalities** | **String[]** | The set of modalities the model can respond with. To disable audio, set this to [&quot;&quot;text&quot;&quot;].  | [optional] 
**Instructions** | **String** | The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. &quot;&quot;be extremely succinct&quot;&quot;, &quot;&quot;act friendly&quot;&quot;, &quot;&quot;here are examples of good  responses&quot;&quot;) and on audio behavior (e.g. &quot;&quot;talk quickly&quot;&quot;, &quot;&quot;inject emotion  into your voice&quot;&quot;, &quot;&quot;laugh frequently&quot;&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  | [optional] 
**Voice** | **String** | The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  | [optional] 
**OutputAudioFormat** | **String** | The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  | [optional] 
**Tools** | [**RealtimeResponseCreateParamsToolsInner[]**](RealtimeResponseCreateParamsToolsInner.md) | Tools (functions) available to the model. | [optional] 
**ToolChoice** | **String** | How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function, like &#x60;{&quot;&quot;type&quot;&quot;: &quot;&quot;function&quot;&quot;, &quot;&quot;function&quot;&quot;: {&quot;&quot;name&quot;&quot;: &quot;&quot;my_function&quot;&quot;}}&#x60;.  | [optional] 
**Temperature** | **Decimal** | Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  | [optional] 
**MaxResponseOutputTokens** | [**RealtimeResponseCreateParamsMaxResponseOutputTokens**](RealtimeResponseCreateParamsMaxResponseOutputTokens.md) |  | [optional] 
**Conversation** | [**RealtimeResponseCreateParamsConversation**](RealtimeResponseCreateParamsConversation.md) |  | [optional] 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 
**VarInput** | [**RealtimeConversationItem[]**](RealtimeConversationItem.md) | Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeResponseCreateParams = Initialize-PSOpenAPIToolsRealtimeResponseCreateParams  -Modalities null `
 -Instructions null `
 -Voice null `
 -OutputAudioFormat null `
 -Tools null `
 -ToolChoice null `
 -Temperature null `
 -MaxResponseOutputTokens null `
 -Conversation null `
 -Metadata null `
 -VarInput null
```

- Convert the resource to JSON
```powershell
$RealtimeResponseCreateParams | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

