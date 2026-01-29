# FineTuningJobCheckpointMetrics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Step** | **Decimal** |  | [optional] 
**TrainLoss** | **Decimal** |  | [optional] 
**TrainMeanTokenAccuracy** | **Decimal** |  | [optional] 
**ValidLoss** | **Decimal** |  | [optional] 
**ValidMeanTokenAccuracy** | **Decimal** |  | [optional] 
**FullValidLoss** | **Decimal** |  | [optional] 
**FullValidMeanTokenAccuracy** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuningJobCheckpointMetrics = Initialize-PSOpenAPIToolsFineTuningJobCheckpointMetrics  -Step null `
 -TrainLoss null `
 -TrainMeanTokenAccuracy null `
 -ValidLoss null `
 -ValidMeanTokenAccuracy null `
 -FullValidLoss null `
 -FullValidMeanTokenAccuracy null
```

- Convert the resource to JSON
```powershell
$FineTuningJobCheckpointMetrics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

