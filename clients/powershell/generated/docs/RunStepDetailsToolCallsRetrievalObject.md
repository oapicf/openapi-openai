# RunStepDetailsToolCallsRetrievalObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The ID of the tool call object. | 
**Type** | **String** | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | 
**Retrieval** | [**SystemCollectionsHashtable**](.md) | For now, this is always going to be an empty object. | 

## Examples

- Prepare the resource
```powershell
$RunStepDetailsToolCallsRetrievalObject = Initialize-PSOpenAPIToolsRunStepDetailsToolCallsRetrievalObject  -Id null `
 -Type null `
 -Retrieval null
```

- Convert the resource to JSON
```powershell
$RunStepDetailsToolCallsRetrievalObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

