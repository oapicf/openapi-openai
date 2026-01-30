# FineTuningJobEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** | The object type, which is always &quot;&quot;fine_tuning.job.event&quot;&quot;. | 
**Id** | **String** | The object identifier. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**Level** | **String** | The log level of the event. | 
**Message** | **String** | The message of the event. | 
**Type** | **String** | The type of event. | [optional] 
**VarData** | [**SystemCollectionsHashtable**](.md) | The data associated with the event. | [optional] 

## Examples

- Prepare the resource
```powershell
$FineTuningJobEvent = Initialize-PSOpenAPIToolsFineTuningJobEvent  -Object null `
 -Id null `
 -CreatedAt null `
 -Level null `
 -Message null `
 -Type null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$FineTuningJobEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

