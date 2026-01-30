# ThreadObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;thread&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the thread was created. | 
**ToolResources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  | 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Examples

- Prepare the resource
```powershell
$ThreadObject = Initialize-PSOpenAPIToolsThreadObject  -Id null `
 -Object null `
 -CreatedAt null `
 -ToolResources null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$ThreadObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

