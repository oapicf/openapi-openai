# openapi::FineTuneMethod

The method used for fine-tuning.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;. | [optional] [Enum: [supervised, dpo]] 
**supervised** | [**FineTuneSupervisedMethod**](.md) |  | [optional] 
**dpo** | [**FineTuneDPOMethod**](.md) |  | [optional] 


