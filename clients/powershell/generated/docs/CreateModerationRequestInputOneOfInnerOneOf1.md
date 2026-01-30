# CreateModerationRequestInputOneOfInnerOneOf1
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &#x60;text&#x60;. | 
**Text** | **String** | A string of text to classify. | 

## Examples

- Prepare the resource
```powershell
$CreateModerationRequestInputOneOfInnerOneOf1 = Initialize-PSOpenAPIToolsCreateModerationRequestInputOneOfInnerOneOf1  -Type null `
 -Text I want to kill them
```

- Convert the resource to JSON
```powershell
$CreateModerationRequestInputOneOfInnerOneOf1 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

