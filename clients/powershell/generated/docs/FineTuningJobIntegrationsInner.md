# FineTuningJobIntegrationsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the integration being enabled for the fine-tuning job | 
**Wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  | 

## Examples

- Prepare the resource
```powershell
$FineTuningJobIntegrationsInner = Initialize-PSOpenAPIToolsFineTuningJobIntegrationsInner  -Type null `
 -Wandb null
```

- Convert the resource to JSON
```powershell
$FineTuningJobIntegrationsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

