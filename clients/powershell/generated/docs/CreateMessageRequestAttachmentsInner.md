# CreateMessageRequestAttachmentsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **String** | The ID of the file to attach to the message. | [optional] 
**Tools** | [**CreateMessageRequestAttachmentsInnerToolsInner[]**](CreateMessageRequestAttachmentsInnerToolsInner.md) | The tools to add this file to. | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateMessageRequestAttachmentsInner = Initialize-PSOpenAPIToolsCreateMessageRequestAttachmentsInner  -FileId null `
 -Tools null
```

- Convert the resource to JSON
```powershell
$CreateMessageRequestAttachmentsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

