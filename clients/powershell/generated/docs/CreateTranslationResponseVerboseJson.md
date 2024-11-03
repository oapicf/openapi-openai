# CreateTranslationResponseVerboseJson
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Language** | **String** | The language of the output translation (always &#x60;english&#x60;). | 
**Duration** | **String** | The duration of the input audio. | 
**Text** | **String** | The translated text. | 
**Segments** | [**TranscriptionSegment[]**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateTranslationResponseVerboseJson = Initialize-PSOpenAPIToolsCreateTranslationResponseVerboseJson  -Language null `
 -Duration null `
 -Text null `
 -Segments null
```

- Convert the resource to JSON
```powershell
$CreateTranslationResponseVerboseJson | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

