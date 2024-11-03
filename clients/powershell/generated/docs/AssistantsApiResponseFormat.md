# AssistantsApiResponseFormat
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;. | [optional] [default to "text"]

## Examples

- Prepare the resource
```powershell
$AssistantsApiResponseFormat = Initialize-PSOpenAPIToolsAssistantsApiResponseFormat  -Type json_object
```

- Convert the resource to JSON
```powershell
$AssistantsApiResponseFormat | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

