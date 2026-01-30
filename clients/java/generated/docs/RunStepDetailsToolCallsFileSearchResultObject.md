

# RunStepDetailsToolCallsFileSearchResultObject

A result instance of the file search.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileId** | **String** | The ID of the file that result was found in. |  |
|**fileName** | **String** | The name of the file that result was found in. |  |
|**score** | **BigDecimal** | The score of the result. All values must be a floating point number between 0 and 1. |  |
|**content** | [**List&lt;RunStepDetailsToolCallsFileSearchResultObjectContentInner&gt;**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. |  [optional] |



