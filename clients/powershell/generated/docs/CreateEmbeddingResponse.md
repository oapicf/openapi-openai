# CreateEmbeddingResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Model** | **String** |  | 
**VarData** | [**CreateEmbeddingResponseDataInner[]**](CreateEmbeddingResponseDataInner.md) |  | 
**Usage** | [**CreateEmbeddingResponseUsage**](CreateEmbeddingResponseUsage.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateEmbeddingResponse = Initialize-PSOpenAPIToolsCreateEmbeddingResponse  -Object null `
 -Model null `
 -VarData null `
 -Usage null
```

- Convert the resource to JSON
```powershell
$CreateEmbeddingResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

