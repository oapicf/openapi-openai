# UsageCodeInterpreterSessionsResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Sessions** | **Int32** | The number of code interpreter sessions. | 
**ProjectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. | [optional] 

## Examples

- Prepare the resource
```powershell
$UsageCodeInterpreterSessionsResult = Initialize-PSOpenAPIToolsUsageCodeInterpreterSessionsResult  -Object null `
 -Sessions null `
 -ProjectId null
```

- Convert the resource to JSON
```powershell
$UsageCodeInterpreterSessionsResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

