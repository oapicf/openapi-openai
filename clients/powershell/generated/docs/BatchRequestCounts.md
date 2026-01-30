# BatchRequestCounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **Int32** | Total number of requests in the batch. | 
**Completed** | **Int32** | Number of requests that have been completed successfully. | 
**Failed** | **Int32** | Number of requests that have failed. | 

## Examples

- Prepare the resource
```powershell
$BatchRequestCounts = Initialize-PSOpenAPIToolsBatchRequestCounts  -Total null `
 -Completed null `
 -Failed null
```

- Convert the resource to JSON
```powershell
$BatchRequestCounts | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

