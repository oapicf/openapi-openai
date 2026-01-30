# RUN_STEP_DETAILS_TOOL_CALLS_FILE_SEARCH_RESULT_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | [**STRING_32**](STRING_32.md) | The ID of the file that result was found in. | [default to null]
**file_name** | [**STRING_32**](STRING_32.md) | The name of the file that result was found in. | [default to null]
**score** | **REAL_32** | The score of the result. All values must be a floating point number between 0 and 1. | [default to null]
**content** | [**LIST [RUN_STEP_DETAILS_TOOL_CALLS_FILE_SEARCH_RESULT_OBJECT_CONTENT_INNER]**](RunStepDetailsToolCallsFileSearchResultObject_content_inner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


