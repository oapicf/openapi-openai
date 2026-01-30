# CreateThreadRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Messages** | [**CreateMessageRequest[]**](CreateMessageRequest.md) | A list of [messages](/docs/api-reference/messages) to start the thread with. | [optional] 
**ToolResources** | [**CreateThreadRequestToolResources**](CreateThreadRequestToolResources.md) |  | [optional] 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateThreadRequest = Initialize-PSOpenAPIToolsCreateThreadRequest  -Messages null `
 -ToolResources null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$CreateThreadRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

