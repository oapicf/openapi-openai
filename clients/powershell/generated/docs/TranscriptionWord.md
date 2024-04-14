# TranscriptionWord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Word** | **String** | The text content of the word. | 
**Start** | **Double** | Start time of the word in seconds. | 
**VarEnd** | **Double** | End time of the word in seconds. | 

## Examples

- Prepare the resource
```powershell
$TranscriptionWord = Initialize-PSOpenAPIToolsTranscriptionWord  -Word null `
 -Start null `
 -VarEnd null
```

- Convert the resource to JSON
```powershell
$TranscriptionWord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

