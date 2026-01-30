# Org.OpenAPITools.Model.RunStepDetailsToolCallsFileSearchResultObject
A result instance of the file search.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **string** | The ID of the file that result was found in. | 
**FileName** | **string** | The name of the file that result was found in. | 
**Score** | **decimal** | The score of the result. All values must be a floating point number between 0 and 1. | 
**Content** | [**List&lt;RunStepDetailsToolCallsFileSearchResultObjectContentInner&gt;**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

