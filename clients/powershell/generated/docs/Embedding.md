# Embedding
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the embedding in the list of embeddings. | 
**Embedding** | **Decimal[]** | The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  | 
**Object** | **String** | The object type, which is always &quot;&quot;embedding&quot;&quot;. | 

## Examples

- Prepare the resource
```powershell
$Embedding = Initialize-PSOpenAPIToolsEmbedding  -Index null `
 -Embedding null `
 -Object null
```

- Convert the resource to JSON
```powershell
$Embedding | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

