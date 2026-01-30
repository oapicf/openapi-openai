# CreateAssistantRequestToolResourcesFileSearch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorStoreIds** | **String[]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 
**VectorStores** | [**CreateAssistantRequestToolResourcesFileSearchVectorStoresInner[]**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateAssistantRequestToolResourcesFileSearch = Initialize-PSOpenAPIToolsCreateAssistantRequestToolResourcesFileSearch  -VectorStoreIds null `
 -VectorStores null
```

- Convert the resource to JSON
```powershell
$CreateAssistantRequestToolResourcesFileSearch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

