# CreateFineTuningJobRequestIntegrationsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of integration to enable. Currently, only &quot;&quot;wandb&quot;&quot; (Weights and Biases) is supported.  | 
**Wandb** | [**CreateFineTuningJobRequestIntegrationsInnerWandb**](CreateFineTuningJobRequestIntegrationsInnerWandb.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateFineTuningJobRequestIntegrationsInner = Initialize-PSOpenAPIToolsCreateFineTuningJobRequestIntegrationsInner  -Type null `
 -Wandb null
```

- Convert the resource to JSON
```powershell
$CreateFineTuningJobRequestIntegrationsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

