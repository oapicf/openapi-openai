# RealtimeConversationItemContentInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  | [optional] 
**Text** | **String** | The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  | [optional] 
**Id** | **String** | ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  | [optional] 
**Audio** | **String** | Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  | [optional] 
**Transcript** | **String** | The transcript of the audio, used for &#x60;input_audio&#x60; content type.  | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeConversationItemContentInner = Initialize-PSOpenAPIToolsRealtimeConversationItemContentInner  -Type null `
 -Text null `
 -Id null `
 -Audio null `
 -Transcript null
```

- Convert the resource to JSON
```powershell
$RealtimeConversationItemContentInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

