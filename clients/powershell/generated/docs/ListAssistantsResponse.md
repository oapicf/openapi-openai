# ListAssistantsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**AssistantObject[]**](AssistantObject.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ListAssistantsResponse = Initialize-PSOpenAPIToolsListAssistantsResponse  -Object list `
 -VarData null `
 -FirstId asst_abc123 `
 -LastId asst_abc456 `
 -HasMore false
```

- Convert the resource to JSON
```powershell
$ListAssistantsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

