# CreateFineTuningJobRequestHyperparameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchSize** | [**CreateFineTuningJobRequestHyperparametersBatchSize**](CreateFineTuningJobRequestHyperparametersBatchSize.md) |  | [optional] 
**LearningRateMultiplier** | [**CreateFineTuningJobRequestHyperparametersLearningRateMultiplier**](CreateFineTuningJobRequestHyperparametersLearningRateMultiplier.md) |  | [optional] 
**NEpochs** | [**CreateFineTuningJobRequestHyperparametersNEpochs**](CreateFineTuningJobRequestHyperparametersNEpochs.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateFineTuningJobRequestHyperparameters = Initialize-PSOpenAPIToolsCreateFineTuningJobRequestHyperparameters  -BatchSize null `
 -LearningRateMultiplier null `
 -NEpochs null
```

- Convert the resource to JSON
```powershell
$CreateFineTuningJobRequestHyperparameters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

