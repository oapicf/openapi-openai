# RunStreamEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarEvent** | **String** |  | 
**VarData** | [**RunObject**](RunObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStreamEvent = Initialize-PSOpenAPIToolsRunStreamEvent  -VarEvent null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$RunStreamEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

