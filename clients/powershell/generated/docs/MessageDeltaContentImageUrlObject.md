# MessageDeltaContentImageUrlObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **Int32** | The index of the content part in the message. | 
**Type** | **String** | Always &#x60;image_url&#x60;. | 
**ImageUrl** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$MessageDeltaContentImageUrlObject = Initialize-PSOpenAPIToolsMessageDeltaContentImageUrlObject  -Index null `
 -Type null `
 -ImageUrl null
```

- Convert the resource to JSON
```powershell
$MessageDeltaContentImageUrlObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

