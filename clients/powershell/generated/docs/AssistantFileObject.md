# AssistantFileObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;assistant.file&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the assistant file was created. | 
**AssistantId** | **String** | The assistant ID that the file is attached to. | 

## Examples

- Prepare the resource
```powershell
$AssistantFileObject = Initialize-PSOpenAPIToolsAssistantFileObject  -Id null `
 -Object null `
 -CreatedAt null `
 -AssistantId null
```

- Convert the resource to JSON
```powershell
$AssistantFileObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

