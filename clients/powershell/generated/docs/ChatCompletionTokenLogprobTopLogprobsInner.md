# ChatCompletionTokenLogprobTopLogprobsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Token** | **String** | The token. | 
**Logprob** | **Decimal** | The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. | 
**Bytes** | **Int32[]** | A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. | 

## Examples

- Prepare the resource
```powershell
$ChatCompletionTokenLogprobTopLogprobsInner = Initialize-PSOpenAPIToolsChatCompletionTokenLogprobTopLogprobsInner  -Token null `
 -Logprob null `
 -Bytes null
```

- Convert the resource to JSON
```powershell
$ChatCompletionTokenLogprobTopLogprobsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

