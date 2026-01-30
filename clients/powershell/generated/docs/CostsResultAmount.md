# CostsResultAmount
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **Decimal** | The numeric value of the cost. | [optional] 
**Currency** | **String** | Lowercase ISO-4217 currency e.g. &quot;&quot;usd&quot;&quot; | [optional] 

## Examples

- Prepare the resource
```powershell
$CostsResultAmount = Initialize-PSOpenAPIToolsCostsResultAmount  -Value null `
 -Currency null
```

- Convert the resource to JSON
```powershell
$CostsResultAmount | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

