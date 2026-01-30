# StaticChunkingStrategyStatic
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxChunkSizeTokens** | **Int32** | The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;. | 
**ChunkOverlapTokens** | **Int32** | The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;.  | 

## Examples

- Prepare the resource
```powershell
$StaticChunkingStrategyStatic = Initialize-PSOpenAPIToolsStaticChunkingStrategyStatic  -MaxChunkSizeTokens null `
 -ChunkOverlapTokens null
```

- Convert the resource to JSON
```powershell
$StaticChunkingStrategyStatic | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

