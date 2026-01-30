# UsageVectorStoresResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**UsageBytes** | **Int32** | The vector stores usage in bytes. | 
**ProjectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 

## Examples

- Prepare the resource
```powershell
$UsageVectorStoresResult = Initialize-PSOpenAPIToolsUsageVectorStoresResult  -Object null `
 -UsageBytes null `
 -ProjectId null
```

- Convert the resource to JSON
```powershell
$UsageVectorStoresResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

