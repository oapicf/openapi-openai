# ProjectRateLimitListResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**ProjectRateLimit[]**](ProjectRateLimit.md) |  | 
**FirstId** | **String** |  | 
**LastId** | **String** |  | 
**HasMore** | **Boolean** |  | 

## Examples

- Prepare the resource
```powershell
$ProjectRateLimitListResponse = Initialize-PSOpenAPIToolsProjectRateLimitListResponse  -Object null `
 -VarData null `
 -FirstId null `
 -LastId null `
 -HasMore null
```

- Convert the resource to JSON
```powershell
$ProjectRateLimitListResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

