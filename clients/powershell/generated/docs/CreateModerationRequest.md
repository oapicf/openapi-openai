# CreateModerationRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarInput** | [**CreateModerationRequestInput**](CreateModerationRequestInput.md) |  | 
**Model** | [**CreateModerationRequestModel**](CreateModerationRequestModel.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateModerationRequest = Initialize-PSOpenAPIToolsCreateModerationRequest  -VarInput null `
 -Model null
```

- Convert the resource to JSON
```powershell
$CreateModerationRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

