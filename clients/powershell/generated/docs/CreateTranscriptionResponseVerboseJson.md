# CreateTranscriptionResponseVerboseJson
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Language** | **String** | The language of the input audio. | 
**Duration** | **String** | The duration of the input audio. | 
**Text** | **String** | The transcribed text. | 
**Words** | [**TranscriptionWord[]**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. | [optional] 
**Segments** | [**TranscriptionSegment[]**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateTranscriptionResponseVerboseJson = Initialize-PSOpenAPIToolsCreateTranscriptionResponseVerboseJson  -Language null `
 -Duration null `
 -Text null `
 -Words null `
 -Segments null
```

- Convert the resource to JSON
```powershell
$CreateTranscriptionResponseVerboseJson | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

