# RunStepStreamEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarEvent** | **String** |  | 
**VarData** | [**RunStepObject**](RunStepObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepStreamEvent = Initialize-PSOpenAPIToolsRunStepStreamEvent  -VarEvent null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$RunStepStreamEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

