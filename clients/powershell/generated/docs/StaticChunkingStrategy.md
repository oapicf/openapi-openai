# StaticChunkingStrategy
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;static&#x60;. | 
**Static** | [**StaticChunkingStrategyStatic**](StaticChunkingStrategyStatic.md) |  | 

## Examples

- Prepare the resource
```powershell
$StaticChunkingStrategy = Initialize-PSOpenAPIToolsStaticChunkingStrategy  -Type null `
 -Static null
```

- Convert the resource to JSON
```powershell
$StaticChunkingStrategy | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

