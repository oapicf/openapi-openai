# CreateVectorStoreFileBatchRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileIds** | **String[]** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | 
**ChunkingStrategy** | [**ChunkingStrategyRequestParam**](ChunkingStrategyRequestParam.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateVectorStoreFileBatchRequest = Initialize-PSOpenAPIToolsCreateVectorStoreFileBatchRequest  -FileIds null `
 -ChunkingStrategy null
```

- Convert the resource to JSON
```powershell
$CreateVectorStoreFileBatchRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

