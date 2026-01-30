# PredictionContent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.  | 
**Content** | [**PredictionContentContent**](PredictionContentContent.md) |  | 

## Examples

- Prepare the resource
```powershell
$PredictionContent = Initialize-PSOpenAPIToolsPredictionContent  -Type null `
 -Content null
```

- Convert the resource to JSON
```powershell
$PredictionContent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

