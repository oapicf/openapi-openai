# WWW::OpenAPIClient::Object::RunStepDetailsToolCallsFileSearchResultObject

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RunStepDetailsToolCallsFileSearchResultObject;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **string** | The ID of the file that result was found in. | 
**file_name** | **string** | The name of the file that result was found in. | 
**score** | **double** | The score of the result. All values must be a floating point number between 0 and 1. | 
**content** | [**ARRAY[RunStepDetailsToolCallsFileSearchResultObjectContentInner]**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


