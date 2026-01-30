# RealtimeResponseCreateParamsToolsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the tool, i.e. &#x60;function&#x60;. | [optional] 
**Name** | **String** | The name of the function. | [optional] 
**Description** | **String** | The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  | [optional] 
**Parameters** | [**SystemCollectionsHashtable**](.md) | Parameters of the function in JSON Schema. | [optional] 

## Examples

- Prepare the resource
```powershell
$RealtimeResponseCreateParamsToolsInner = Initialize-PSOpenAPIToolsRealtimeResponseCreateParamsToolsInner  -Type null `
 -Name null `
 -Description null `
 -Parameters null
```

- Convert the resource to JSON
```powershell
$RealtimeResponseCreateParamsToolsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

