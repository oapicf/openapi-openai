# MessageStreamEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarEvent** | **String** |  | 
**VarData** | [**MessageObject**](MessageObject.md) |  | 

## Examples

- Prepare the resource
```powershell
$MessageStreamEvent = Initialize-PSOpenAPIToolsMessageStreamEvent  -VarEvent null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$MessageStreamEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

