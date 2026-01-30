
# OpenAIFile

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The file identifier, which can be referenced in the API endpoints. |  |
| **bytes** | **kotlin.Int** | The size of the file, in bytes. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the file was created. |  |
| **filename** | **kotlin.String** | The name of the file. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;file&#x60;. |  |
| **purpose** | [**inline**](#Purpose) | The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;. |  |
| **status** | [**inline**](#Status) | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. |  |
| **statusDetails** | **kotlin.String** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | file |


<a id="Purpose"></a>
## Enum: purpose
| Name | Value |
| ---- | ----- |
| purpose | assistants, assistants_output, batch, batch_output, fine-tune, fine-tune-results, vision |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | uploaded, processed, error |



