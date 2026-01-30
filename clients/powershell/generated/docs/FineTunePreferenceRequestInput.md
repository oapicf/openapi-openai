# FineTunePreferenceRequestInput
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarInput** | [**FineTunePreferenceRequestInputInput**](FineTunePreferenceRequestInputInput.md) |  | [optional] 
**PreferredCompletion** | [**FineTunePreferenceRequestInputPreferredCompletionInner[]**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The preferred completion message for the output. | [optional] 
**NonPreferredCompletion** | [**FineTunePreferenceRequestInputPreferredCompletionInner[]**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The non-preferred completion message for the output. | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTunePreferenceRequestInput = Initialize-PSOpenAPIToolsFineTunePreferenceRequestInput  -VarInput null `
 -PreferredCompletion null `
 -NonPreferredCompletion null
```

- Convert the resource to JSON
```powershell
$FineTunePreferenceRequestInput | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

