# AssistantObjectToolResourcesFileSearch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorStoreIds** | **String[]** | The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssistantObjectToolResourcesFileSearch = Initialize-PSOpenAPIToolsAssistantObjectToolResourcesFileSearch  -VectorStoreIds null
```

- Convert the resource to JSON
```powershell
$AssistantObjectToolResourcesFileSearch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

