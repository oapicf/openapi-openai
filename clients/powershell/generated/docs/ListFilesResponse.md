# ListFilesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Object** | **String** |  | 
**VarData** | [**OpenAIFile[]**](OpenAIFile.md) |  | 

## Examples

- Prepare the resource
```powershell
$ListFilesResponse = Initialize-PSOpenAPIToolsListFilesResponse  -Object null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$ListFilesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

