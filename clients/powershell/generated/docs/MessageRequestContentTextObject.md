# MessageRequestContentTextObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;text&#x60;. | 
**Text** | **String** | Text content to be sent to the model | 

## Examples

- Prepare the resource
```powershell
$MessageRequestContentTextObject = Initialize-PSOpenAPIToolsMessageRequestContentTextObject  -Type null `
 -Text null
```

- Convert the resource to JSON
```powershell
$MessageRequestContentTextObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

