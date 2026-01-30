# RealtimeServerEventResponseContentPartAddedPart
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The content type (&quot;&quot;text&quot;&quot;, &quot;&quot;audio&quot;&quot;). | [optional] 
**Text** | **String** | The text content (if type is &quot;&quot;text&quot;&quot;). | [optional] 
**Audio** | **String** | Base64-encoded audio data (if type is &quot;&quot;audio&quot;&quot;). | [optional] 
**Transcript** | **String** | The transcript of the audio (if type is &quot;&quot;audio&quot;&quot;). | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeServerEventResponseContentPartAddedPart = Initialize-PSOpenAPIToolsRealtimeServerEventResponseContentPartAddedPart  -Type null `
 -Text null `
 -Audio null `
 -Transcript null
```

- Convert the resource to JSON
```powershell
$RealtimeServerEventResponseContentPartAddedPart | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

