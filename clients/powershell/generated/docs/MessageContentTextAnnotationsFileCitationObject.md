# MessageContentTextAnnotationsFileCitationObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;file_citation&#x60;. | 
**Text** | **String** | The text in the message content that needs to be replaced. | 
**FileCitation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**StartIndex** | **Int32** |  | 
**EndIndex** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$MessageContentTextAnnotationsFileCitationObject = Initialize-PSOpenAPIToolsMessageContentTextAnnotationsFileCitationObject  -Type null `
 -Text null `
 -FileCitation null `
 -StartIndex null `
 -EndIndex null
```

- Convert the resource to JSON
```powershell
$MessageContentTextAnnotationsFileCitationObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

