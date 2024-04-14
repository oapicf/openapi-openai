# CreateTranslation200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **String** | The translated text. | 
**Language** | **String** | The language of the output translation (always &#x60;english&#x60;). | 
**Duration** | **String** | The duration of the input audio. | 
**Segments** | [**TranscriptionSegment[]**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateTranslation200Response = Initialize-PSOpenAPIToolsCreateTranslation200Response  -Text null `
 -Language null `
 -Duration null `
 -Segments null
```

- Convert the resource to JSON
```powershell
$CreateTranslation200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

