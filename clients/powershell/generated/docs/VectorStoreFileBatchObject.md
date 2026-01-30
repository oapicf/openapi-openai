# VectorStoreFileBatchObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**VectorStoreId** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**Status** | **String** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | 
**FileCounts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  | 

## Examples

- Prepare the resource
```powershell
$VectorStoreFileBatchObject = Initialize-PSOpenAPIToolsVectorStoreFileBatchObject  -Id null `
 -Object null `
 -CreatedAt null `
 -VectorStoreId null `
 -Status null `
 -FileCounts null
```

- Convert the resource to JSON
```powershell
$VectorStoreFileBatchObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

