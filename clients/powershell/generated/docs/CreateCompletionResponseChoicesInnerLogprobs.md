# CreateCompletionResponseChoicesInnerLogprobs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tokens** | **String[]** |  | [optional] 
**TokenLogprobs** | **Decimal[]** |  | [optional] 
**TopLogprobs** | [**SystemCollectionsHashtable[]**](SystemCollectionsHashtable.md) |  | [optional] 
**TextOffset** | **Int32[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateCompletionResponseChoicesInnerLogprobs = Initialize-PSOpenAPIToolsCreateCompletionResponseChoicesInnerLogprobs  -Tokens null `
 -TokenLogprobs null `
 -TopLogprobs null `
 -TextOffset null
```

- Convert the resource to JSON
```powershell
$CreateCompletionResponseChoicesInnerLogprobs | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

