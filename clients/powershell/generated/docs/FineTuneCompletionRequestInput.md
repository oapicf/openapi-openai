# FineTuneCompletionRequestInput
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Prompt** | **String** | The input prompt for this training example. | [optional] 
**Completion** | **String** | The desired completion for this training example. | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuneCompletionRequestInput = Initialize-PSOpenAPIToolsFineTuneCompletionRequestInput  -Prompt null `
 -Completion null
```

- Convert the resource to JSON
```powershell
$FineTuneCompletionRequestInput | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

