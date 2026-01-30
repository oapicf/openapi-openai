# ThreadStreamEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | **Boolean** | Whether to enable input audio transcription. | [optional] 
**VarEvent** | **String** |  | 
**VarData** | [**ThreadObject**](ThreadObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$ThreadStreamEvent = Initialize-PSOpenAPIToolsThreadStreamEvent  -Enabled null `
 -VarEvent null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$ThreadStreamEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

