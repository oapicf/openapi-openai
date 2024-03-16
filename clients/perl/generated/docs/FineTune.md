# WWW::OpenAPIClient::Object::FineTune

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FineTune;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | 
**object** | **string** |  | 
**created_at** | **int** |  | 
**updated_at** | **int** |  | 
**model** | **string** |  | 
**fine_tuned_model** | **string** |  | 
**organization_id** | **string** |  | 
**status** | **string** |  | 
**hyperparams** | **object** |  | 
**training_files** | [**ARRAY[OpenAIFile]**](OpenAIFile.md) |  | 
**validation_files** | [**ARRAY[OpenAIFile]**](OpenAIFile.md) |  | 
**result_files** | [**ARRAY[OpenAIFile]**](OpenAIFile.md) |  | 
**events** | [**ARRAY[FineTuneEvent]**](FineTuneEvent.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


