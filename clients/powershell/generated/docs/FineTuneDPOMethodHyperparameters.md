# FineTuneDPOMethodHyperparameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Beta** | [**FineTuneDPOMethodHyperparametersBeta**](FineTuneDPOMethodHyperparametersBeta.md) |  | [optional] 
**BatchSize** | [**FineTuneDPOMethodHyperparametersBatchSize**](FineTuneDPOMethodHyperparametersBatchSize.md) |  | [optional] 
**LearningRateMultiplier** | [**FineTuneDPOMethodHyperparametersLearningRateMultiplier**](FineTuneDPOMethodHyperparametersLearningRateMultiplier.md) |  | [optional] 
**NEpochs** | [**FineTuneDPOMethodHyperparametersNEpochs**](FineTuneDPOMethodHyperparametersNEpochs.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuneDPOMethodHyperparameters = Initialize-PSOpenAPIToolsFineTuneDPOMethodHyperparameters  -Beta null `
 -BatchSize null `
 -LearningRateMultiplier null `
 -NEpochs null
```

- Convert the resource to JSON
```powershell
$FineTuneDPOMethodHyperparameters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

