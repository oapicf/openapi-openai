# ChunkingStrategyRequestParam
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;auto&#x60;. | 
**Static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Examples

- Prepare the resource
```powershell
$ChunkingStrategyRequestParam = Initialize-PSOpenAPIToolsChunkingStrategyRequestParam  -Type null `
 -Static null
```

- Convert the resource to JSON
```powershell
$ChunkingStrategyRequestParam | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

