# ThreadStreamEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarEvent** | **String** |  | 
**VarData** | [**ThreadObject**](ThreadObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$ThreadStreamEvent = Initialize-PSOpenAPIToolsThreadStreamEvent  -VarEvent null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$ThreadStreamEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

