# BatchRequestOutputResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StatusCode** | **Int32** | The HTTP status code of the response | [optional] 
**RequestId** | **String** | An unique identifier for the OpenAI API request. Please include this request ID when contacting support. | [optional] 
**Body** | [**SystemCollectionsHashtable**](.md) | The JSON body of the response | [optional] 

## Examples

- Prepare the resource
```powershell
$BatchRequestOutputResponse = Initialize-PSOpenAPIToolsBatchRequestOutputResponse  -StatusCode null `
 -RequestId null `
 -Body null
```

- Convert the resource to JSON
```powershell
$BatchRequestOutputResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

