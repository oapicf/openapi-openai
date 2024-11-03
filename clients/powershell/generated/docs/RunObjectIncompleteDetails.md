# RunObjectIncompleteDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Reason** | **String** | The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. | [optional] 

## Examples

- Prepare the resource
```powershell
$RunObjectIncompleteDetails = Initialize-PSOpenAPIToolsRunObjectIncompleteDetails  -Reason null
```

- Convert the resource to JSON
```powershell
$RunObjectIncompleteDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

