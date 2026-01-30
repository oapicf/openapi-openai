# UsageResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**UsageTimeBucket[]**](UsageTimeBucket.md) |  | 
**HasMore** | **Boolean** |  | 
**NextPage** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$UsageResponse = Initialize-PSOpenAPIToolsUsageResponse  -Object null `
 -VarData null `
 -HasMore null `
 -NextPage null
```

- Convert the resource to JSON
```powershell
$UsageResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

