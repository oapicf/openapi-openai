# VectorStoreFileBatchObjectFileCounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InProgress** | **Int32** | The number of files that are currently being processed. | 
**Completed** | **Int32** | The number of files that have been processed. | 
**Failed** | **Int32** | The number of files that have failed to process. | 
**Cancelled** | **Int32** | The number of files that where cancelled. | 
**Total** | **Int32** | The total number of files. | 

## Examples

- Prepare the resource
```powershell
$VectorStoreFileBatchObjectFileCounts = Initialize-PSOpenAPIToolsVectorStoreFileBatchObjectFileCounts  -InProgress null `
 -Completed null `
 -Failed null `
 -Cancelled null `
 -Total null
```

- Convert the resource to JSON
```powershell
$VectorStoreFileBatchObjectFileCounts | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

