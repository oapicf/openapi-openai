# FineTuneSupervisedMethodHyperparameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchSize** | [**FineTuneDPOMethodHyperparametersBatchSize**](FineTuneDPOMethodHyperparametersBatchSize.md) |  | [optional] 
**LearningRateMultiplier** | [**FineTuneDPOMethodHyperparametersLearningRateMultiplier**](FineTuneDPOMethodHyperparametersLearningRateMultiplier.md) |  | [optional] 
**NEpochs** | [**FineTuneDPOMethodHyperparametersNEpochs**](FineTuneDPOMethodHyperparametersNEpochs.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuneSupervisedMethodHyperparameters = Initialize-PSOpenAPIToolsFineTuneSupervisedMethodHyperparameters  -BatchSize null `
 -LearningRateMultiplier null `
 -NEpochs null
```

- Convert the resource to JSON
```powershell
$FineTuneSupervisedMethodHyperparameters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

