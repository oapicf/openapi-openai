# MessageDeltaContentTextObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the content part in the message. | 
**Type** | **String** | Always &#x60;text&#x60;. | 
**Text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentTextObject = Initialize-PSOpenAPIToolsMessageDeltaContentTextObject  -Index null `
 -Type null `
 -Text null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentTextObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

