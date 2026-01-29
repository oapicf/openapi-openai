# CreateAssistantFileRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FileId** | **String** | A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;&quot;&quot;assistants&quot;&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files. | 

## Examples

- Prepare the resource
```powershell
$CreateAssistantFileRequest = Initialize-PSOpenAPIToolsCreateAssistantFileRequest  -FileId null
```

- Convert the resource to JSON
```powershell
$CreateAssistantFileRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

