# MessageFileObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;thread.message.file&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the message file was created. | 
**MessageId** | **String** | The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. | 

## Examples

- Prepare the resource
```powershell
$MessageFileObject = Initialize-PSOpenAPIToolsMessageFileObject  -Id null `
 -Object null `
 -CreatedAt null `
 -MessageId null
```

- Convert the resource to JSON
```powershell
$MessageFileObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

