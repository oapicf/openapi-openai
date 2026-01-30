# openapi::RunStepDetailsToolCallsFileSearchResultObject

A result instance of the file search.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **character** | The ID of the file that result was found in. | 
**file_name** | **character** | The name of the file that result was found in. | 
**score** | **numeric** | The score of the result. All values must be a floating point number between 0 and 1. | [Max: 1] [Min: 0] 
**content** | [**array[RunStepDetailsToolCallsFileSearchResultObjectContentInner]**](RunStepDetailsToolCallsFileSearchResultObject_content_inner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] 


