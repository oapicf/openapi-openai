# ListMessagesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**MessageObject[]**](MessageObject.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListMessagesResponse = Initialize-PSOpenAPIToolsListMessagesResponse  -Object list `
 -VarData null `
 -FirstId msg_abc123 `
 -LastId msg_abc123 `
 -HasMore false
```

- Convert the resource to JSON
```powershell
$ListMessagesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

