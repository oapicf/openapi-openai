# MessageContentTextAnnotationsFileCitationObjectFileCitation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **String** | The ID of the specific File the citation is from. | 
**Quote** | **String** | The specific quote in the file. | 

## Examples

- Prepare the resource
```powershell
$MessageContentTextAnnotationsFileCitationObjectFileCitation = Initialize-PSOpenAPIToolsMessageContentTextAnnotationsFileCitationObjectFileCitation  -FileId null `
 -Quote null
```

- Convert the resource to JSON
```powershell
$MessageContentTextAnnotationsFileCitationObjectFileCitation | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

