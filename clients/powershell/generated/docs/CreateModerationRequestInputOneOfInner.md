# CreateModerationRequestInputOneOfInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;image_url&#x60;. | 
**ImageUrl** | [**CreateModerationRequestInputOneOfInnerOneOfImageUrl**](CreateModerationRequestInputOneOfInnerOneOfImageUrl.md) |  | 
**Text** | **String** | A string of text to classify. | 

## Examples

- Prepare the resource
```powershell
$CreateModerationRequestInputOneOfInner = Initialize-PSOpenAPIToolsCreateModerationRequestInputOneOfInner  -Type null `
 -ImageUrl null `
 -Text I want to kill them
```

- Convert the resource to JSON
```powershell
$CreateModerationRequestInputOneOfInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

