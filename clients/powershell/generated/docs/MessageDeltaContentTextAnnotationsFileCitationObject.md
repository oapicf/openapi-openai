# MessageDeltaContentTextAnnotationsFileCitationObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the annotation in the text content part. | 
**Type** | **String** | Always &#x60;file_citation&#x60;. | 
**Text** | **String** | The text in the message content that needs to be replaced. | [optional] 
**FileCitation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] 
**StartIndex** | **Int32** |  | [optional] 
**EndIndex** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentTextAnnotationsFileCitationObject = Initialize-PSOpenAPIToolsMessageDeltaContentTextAnnotationsFileCitationObject  -Index null `
 -Type null `
 -Text null `
 -FileCitation null `
 -StartIndex null `
 -EndIndex null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentTextAnnotationsFileCitationObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

