# FineTuningJobHyperparameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchSize** | [**CreateFineTuningJobRequestHyperparametersBatchSize**](CreateFineTuningJobRequestHyperparametersBatchSize.md) |  | [optional] 
**LearningRateMultiplier** | [**CreateFineTuningJobRequestHyperparametersLearningRateMultiplier**](CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md) |  | [optional] 
**NEpochs** | [**CreateFineTuningJobRequestHyperparametersNEpochs**](CreateFineTuningJobRequestHyperparametersNEpochs.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuningJobHyperparameters = Initialize-PSOpenAPIToolsFineTuningJobHyperparameters  -BatchSize null `
 -LearningRateMultiplier null `
 -NEpochs null
```

- Convert the resource to JSON
```powershell
$FineTuningJobHyperparameters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

