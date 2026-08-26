

# FineTuneMethod

The method used for fine-tuning.

The class is defined in **[FineTuneMethod.java](../../src/main/java/org/openapitools/model/FineTuneMethod.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. |  [optional property]
**supervised** | [`FineTuneSupervisedMethod`](FineTuneSupervisedMethod.md) |  |  [optional property]
**dpo** | [`FineTuneDPOMethod`](FineTuneDPOMethod.md) |  |  [optional property]

## TypeEnum

Name | Value
---- | -----
SUPERVISED | `"supervised"`
DPO | `"dpo"`




