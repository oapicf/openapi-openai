# StaticChunkingStrategyRequestParam
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;static&#x60;. | 
**Static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Examples

- Prepare the resource
```powershell
$StaticChunkingStrategyRequestParam = Initialize-PSOpenAPIToolsStaticChunkingStrategyRequestParam  -Type null `
 -Static null
```

- Convert the resource to JSON
```powershell
$StaticChunkingStrategyRequestParam | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

