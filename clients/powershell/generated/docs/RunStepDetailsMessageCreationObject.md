# RunStepDetailsMessageCreationObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;message_creation&#x60;. | 
**MessageCreation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsMessageCreationObject = Initialize-PSOpenAPIToolsRunStepDetailsMessageCreationObject  -Type null `
 -MessageCreation null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsMessageCreationObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

