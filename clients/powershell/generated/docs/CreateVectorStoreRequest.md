# CreateVectorStoreRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileIds** | **String[]** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] 
**Name** | **String** | The name of the vector store. | [optional] 
**ExpiresAfter** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**ChunkingStrategy** | [**CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequestChunkingStrategy.md) |  | [optional] 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateVectorStoreRequest = Initialize-PSOpenAPIToolsCreateVectorStoreRequest  -FileIds null `
 -Name null `
 -ExpiresAfter null `
 -ChunkingStrategy null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$CreateVectorStoreRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

