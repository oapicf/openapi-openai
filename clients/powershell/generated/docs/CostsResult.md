# CostsResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**Amount** | [**CostsResultAmount**](CostsResultAmount.md) |  | [optional] 
**LineItem** | **String** | When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result. | [optional] 
**ProjectId** | **String** | When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result. | [optional] 

## Examples

- Prepare the resource
```powershell
$CostsResult = Initialize-PSOpenAPIToolsCostsResult  -Object null `
 -Amount null `
 -LineItem null `
 -ProjectId null
```

- Convert the resource to JSON
```powershell
$CostsResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

