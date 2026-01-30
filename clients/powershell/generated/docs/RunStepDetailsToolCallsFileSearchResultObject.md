# RunStepDetailsToolCallsFileSearchResultObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **String** | The ID of the file that result was found in. | 
**FileName** | **String** | The name of the file that result was found in. | 
**Score** | **Decimal** | The score of the result. All values must be a floating point number between 0 and 1. | 
**Content** | [**RunStepDetailsToolCallsFileSearchResultObjectContentInner[]**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsFileSearchResultObject = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsFileSearchResultObject  -FileId null `
 -FileName null `
 -Score null `
 -Content null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsFileSearchResultObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

