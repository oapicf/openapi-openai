# RunStepDeltaStepDetailsMessageCreationObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;message_creation&#x60;. | 
**MessageCreation** | [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDeltaStepDetailsMessageCreationObject = Initialize-PSOpenAPIToolsRunStepDeltaStepDetailsMessageCreationObject  -Type null `
 -MessageCreation null
```

- Convert the resource to JSON
```powershell
$RunStepDeltaStepDetailsMessageCreationObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

