# MessageContentTextAnnotationsFilePathObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;file_path&#x60;. | 
**Text** | **String** | The text in the message content that needs to be replaced. | 
**FilePath** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | 
**StartIndex** | **Int32** |  | 
**EndIndex** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$MessageContentTextAnnotationsFilePathObject = Initialize-PSOpenAPIToolsMessageContentTextAnnotationsFilePathObject  -Type null `
 -Text null `
 -FilePath null `
 -StartIndex null `
 -EndIndex null
```

- Convert the resource to JSON
```powershell
$MessageContentTextAnnotationsFilePathObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

