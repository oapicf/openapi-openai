

# FineTuneMethod

The method used for fine-tuning.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. |  [optional] |
|**supervised** | **FineTuneSupervisedMethod** |  |  [optional] |
|**dpo** | **FineTuneDPOMethod** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SUPERVISED | &quot;supervised&quot; |
| DPO | &quot;dpo&quot; |



