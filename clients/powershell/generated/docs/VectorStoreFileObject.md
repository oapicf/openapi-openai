# VectorStoreFileObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;vector_store.file&#x60;. | 
**UsageBytes** | **Int32** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**VectorStoreId** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**Status** | **String** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | 
**LastError** | [**VectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md) |  | 
**ChunkingStrategy** | [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$VectorStoreFileObject = Initialize-PSOpenAPIToolsVectorStoreFileObject  -Id null `
 -Object null `
 -UsageBytes null `
 -CreatedAt null `
 -VectorStoreId null `
 -Status null `
 -LastError null `
 -ChunkingStrategy null
```

- Convert the resource to JSON
```powershell
$VectorStoreFileObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

