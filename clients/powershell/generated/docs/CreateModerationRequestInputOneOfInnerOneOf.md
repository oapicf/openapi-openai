# CreateModerationRequestInputOneOfInnerOneOf
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;image_url&#x60;. | 
**ImageUrl** | [**CreateModerationRequestInputOneOfInnerOneOfImageUrl**](CreateModerationRequestInputOneOfInnerOneOfImageUrl.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateModerationRequestInputOneOfInnerOneOf = Initialize-PSOpenAPIToolsCreateModerationRequestInputOneOfInnerOneOf  -Type null `
 -ImageUrl null
```

- Convert the resource to JSON
```powershell
$CreateModerationRequestInputOneOfInnerOneOf | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

