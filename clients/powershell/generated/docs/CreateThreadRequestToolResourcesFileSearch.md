# CreateThreadRequestToolResourcesFileSearch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorStoreIds** | **String[]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 
**VectorStores** | [**CreateThreadRequestToolResourcesFileSearchVectorStoresInner[]**](CreateThreadRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateThreadRequestToolResourcesFileSearch = Initialize-PSOpenAPIToolsCreateThreadRequestToolResourcesFileSearch  -VectorStoreIds null `
 -VectorStores null
```

- Convert the resource to JSON
```powershell
$CreateThreadRequestToolResourcesFileSearch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

