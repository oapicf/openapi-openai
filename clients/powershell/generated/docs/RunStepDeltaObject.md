# RunStepDeltaObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier of the run step, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;thread.run.step.delta&#x60;. | 
**Delta** | [**RunStepDeltaObjectDelta**](RunStepDeltaObjectDelta.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaObject = Initialize-PSOpenAPIToolsRunStepDeltaObject  -Id null `
 -Object null `
 -Delta null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

