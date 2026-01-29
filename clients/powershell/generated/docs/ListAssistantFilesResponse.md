# ListAssistantFilesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**AssistantFileObject[]**](AssistantFileObject.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListAssistantFilesResponse = Initialize-PSOpenAPIToolsListAssistantFilesResponse  -Object list `
 -VarData null `
 -FirstId file-abc123 `
 -LastId file-abc456 `
 -HasMore false
```

- Convert the resource to JSON
```powershell
$ListAssistantFilesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

