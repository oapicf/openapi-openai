# ModifyThreadRequestToolResourcesFileSearch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorStoreIds** | **String[]** | The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  | [optional] 

## Examples

- Prepare the resource
```powershell
$ModifyThreadRequestToolResourcesFileSearch = Initialize-PSOpenAPIToolsModifyThreadRequestToolResourcesFileSearch  -VectorStoreIds null
```

- Convert the resource to JSON
```powershell
$ModifyThreadRequestToolResourcesFileSearch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

