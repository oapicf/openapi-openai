# VectorStoreObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;vector_store&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the vector store was created. | 
**Name** | **String** | The name of the vector store. | 
**UsageBytes** | **Int32** | The total number of bytes used by the files in the vector store. | 
**FileCounts** | [**VectorStoreObjectFileCounts**](VectorStoreObjectFileCounts.md) |  | 
**Status** | **String** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | 
**ExpiresAfter** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**ExpiresAt** | **Int32** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] 
**LastActiveAt** | **Int32** | The Unix timestamp (in seconds) for when the vector store was last active. | 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Examples

- Prepare the resource
```powershell
$VectorStoreObject = Initialize-PSOpenAPIToolsVectorStoreObject  -Id null `
 -Object null `
 -CreatedAt null `
 -Name null `
 -UsageBytes null `
 -FileCounts null `
 -Status null `
 -ExpiresAfter null `
 -ExpiresAt null `
 -LastActiveAt null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$VectorStoreObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

