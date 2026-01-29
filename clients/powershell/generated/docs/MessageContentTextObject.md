# MessageContentTextObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;text&#x60;. | 
**Text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | 

## Examples

- Prepare the resource
```powershell
$MessageContentTextObject = Initialize-PSOpenAPIToolsMessageContentTextObject  -Type null `
 -Text null
```

- Convert the resource to JSON
```powershell
$MessageContentTextObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

