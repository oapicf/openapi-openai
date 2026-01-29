# MessageDeltaObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier of the message, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;thread.message.delta&#x60;. | 
**Delta** | [**MessageDeltaObjectDelta**](MessageDeltaObjectDelta.md) |  | 

## Examples

- Prepare the resource
```powershell
$MessageDeltaObject = Initialize-PSOpenAPIToolsMessageDeltaObject  -Id null `
 -Object null `
 -Delta null
```

- Convert the resource to JSON
```powershell
$MessageDeltaObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

