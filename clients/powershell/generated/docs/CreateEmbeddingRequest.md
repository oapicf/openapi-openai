# CreateEmbeddingRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | [**CreateEmbeddingRequestModel**](CreateEmbeddingRequestModel.md) |  | 
**VarInput** | [**CreateEmbeddingRequestInput**](CreateEmbeddingRequestInput.md) |  | 
**User** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateEmbeddingRequest = Initialize-PSOpenAPIToolsCreateEmbeddingRequest  -Model null `
 -VarInput null `
 -User user-1234
```

- Convert the resource to JSON
```powershell
$CreateEmbeddingRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

