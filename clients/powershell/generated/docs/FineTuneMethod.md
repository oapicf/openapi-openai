# FineTuneMethod
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. | [optional] 
**Supervised** | [**FineTuneSupervisedMethod**](.md) |  | [optional] 
**Dpo** | [**FineTuneDPOMethod**](.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuneMethod = Initialize-PSOpenAPIToolsFineTuneMethod  -Type null `
 -Supervised null `
 -Dpo null
```

- Convert the resource to JSON
```powershell
$FineTuneMethod | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

