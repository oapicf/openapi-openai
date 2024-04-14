# MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **String** | The ID of the specific File the citation is from. | [optional] 
**Quote** | **String** | The specific quote in the file. | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation = Initialize-PSOpenAPIToolsMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation  -FileId null `
 -Quote null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

