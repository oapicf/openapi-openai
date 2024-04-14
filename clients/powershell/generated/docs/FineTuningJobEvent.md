# FineTuningJobEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**CreatedAt** | **Int32** |  | 
**Level** | **String** |  | 
**Message** | **String** |  | 
**Object** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$FineTuningJobEvent = Initialize-PSOpenAPIToolsFineTuningJobEvent  -Id null `
 -CreatedAt null `
 -Level null `
 -Message null `
 -Object null
```

- Convert the resource to JSON
```powershell
$FineTuningJobEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

