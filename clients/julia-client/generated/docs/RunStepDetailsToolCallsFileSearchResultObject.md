# RunStepDetailsToolCallsFileSearchResultObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`file_id`** | **`String`** | The ID of the file that result was found in. | [default to nothing]
**`file_name`** | **`String`** | The name of the file that result was found in. | [default to nothing]
**`score`** | **`Float64`** | The score of the result. All values must be a floating point number between 0 and 1. | [default to nothing]
**`content`** | [**`Vector{RunStepDetailsToolCallsFileSearchResultObjectContentInner}`**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


