# MessageContentImageUrlObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the content part. | 
**ImageUrl** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 

## Examples

- Prepare the resource
```powershell
$MessageContentImageUrlObject = Initialize-PSOpenAPIToolsMessageContentImageUrlObject  -Type null `
 -ImageUrl null
```

- Convert the resource to JSON
```powershell
$MessageContentImageUrlObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

