# OpenAIFile
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The file identifier, which can be referenced in the API endpoints. | [default to null] |
| **bytes** | **Integer** | The size of the file, in bytes. | [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the file was created. | [default to null] |
| **filename** | **String** | The name of the file. | [default to null] |
| **object** | **String** | The object type, which is always &#x60;file&#x60;. | [default to null] |
| **purpose** | **String** | The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;. | [default to null] |
| **status** | **String** | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. | [default to null] |
| **status\_details** | **String** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

