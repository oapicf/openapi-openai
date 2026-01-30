# AssistantStreamEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | **Boolean** | Whether to enable input audio transcription. | [optional] 
**VarEvent** | **String** |  | 
**VarData** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$AssistantStreamEvent = Initialize-PSOpenAPIToolsAssistantStreamEvent  -Enabled null `
 -VarEvent null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$AssistantStreamEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

