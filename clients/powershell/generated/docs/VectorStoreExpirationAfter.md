# VectorStoreExpirationAfter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Anchor** | **String** | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. | 
**Days** | **Int32** | The number of days after the anchor time that the vector store will expire. | 

## Examples

- Prepare the resource
```powershell
$VectorStoreExpirationAfter = Initialize-PSOpenAPIToolsVectorStoreExpirationAfter  -Anchor null `
 -Days null
```

- Convert the resource to JSON
```powershell
$VectorStoreExpirationAfter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

