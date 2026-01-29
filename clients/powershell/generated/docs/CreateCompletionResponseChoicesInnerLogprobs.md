# CreateCompletionResponseChoicesInnerLogprobs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TextOffset** | **Int32[]** |  | [optional] 
**TokenLogprobs** | **Decimal[]** |  | [optional] 
**Tokens** | **String[]** |  | [optional] 
**TopLogprobs** | [**System.Collections.Hashtable[]**](Map.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateCompletionResponseChoicesInnerLogprobs = Initialize-PSOpenAPIToolsCreateCompletionResponseChoicesInnerLogprobs  -TextOffset null `
 -TokenLogprobs null `
 -Tokens null `
 -TopLogprobs null
```

- Convert the resource to JSON
```powershell
$CreateCompletionResponseChoicesInnerLogprobs | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

