# CreateTranscription200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **String** | The transcribed text. | 
**Language** | **String** | The language of the input audio. | 
**Duration** | **String** | The duration of the input audio. | 
**Words** | [**TranscriptionWord[]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**Segments** | [**TranscriptionSegment[]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateTranscription200Response = Initialize-PSOpenAPIToolsCreateTranscription200Response  -Text null `
 -Language null `
 -Duration null `
 -Words null `
 -Segments null
```

- Convert the resource to JSON
```powershell
$CreateTranscription200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

