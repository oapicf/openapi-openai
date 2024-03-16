# openapi::FineTune


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** |  | 
**object** | **character** |  | 
**created_at** | **integer** |  | 
**updated_at** | **integer** |  | 
**model** | **character** |  | 
**fine_tuned_model** | **character** |  | 
**organization_id** | **character** |  | 
**status** | **character** |  | 
**hyperparams** | **object** |  | 
**training_files** | [**array[OpenAIFile]**](OpenAIFile.md) |  | 
**validation_files** | [**array[OpenAIFile]**](OpenAIFile.md) |  | 
**result_files** | [**array[OpenAIFile]**](OpenAIFile.md) |  | 
**events** | [**array[FineTuneEvent]**](FineTuneEvent.md) |  | [optional] 


