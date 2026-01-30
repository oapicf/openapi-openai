# UpdateVectorStoreRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the vector store. | [optional] 
**ExpiresAfter** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateVectorStoreRequest = Initialize-PSOpenAPIToolsUpdateVectorStoreRequest  -Name null `
 -ExpiresAfter null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$UpdateVectorStoreRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

