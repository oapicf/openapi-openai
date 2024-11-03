# RunToolCallObjectFunction
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the function. | 
**Arguments** | **String** | The arguments that the model expects you to pass to the function. | 

## Examples

- Prepare the resource
```powershell
$RunToolCallObjectFunction = Initialize-PSOpenAPIToolsRunToolCallObjectFunction  -Name null `
 -Arguments null
```

- Convert the resource to JSON
```powershell
$RunToolCallObjectFunction | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

