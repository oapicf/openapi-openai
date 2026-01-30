# UsageTimeBucket
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**StartTime** | **Int32** |  | 
**EndTime** | **Int32** |  | 
**Result** | [**UsageTimeBucketResultInner[]**](UsageTimeBucketResultInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$UsageTimeBucket = Initialize-PSOpenAPIToolsUsageTimeBucket  -Object null `
 -StartTime null `
 -EndTime null `
 -Result null
```

- Convert the resource to JSON
```powershell
$UsageTimeBucket | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

