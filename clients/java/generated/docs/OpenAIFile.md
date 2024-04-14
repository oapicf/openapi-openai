

# OpenAIFile

The `File` object represents a document that has been uploaded to OpenAI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The file identifier, which can be referenced in the API endpoints. |  |
|**bytes** | **Integer** | The size of the file, in bytes. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the file was created. |  |
|**filename** | **String** | The name of the file. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;file&#x60;. |  |
|**purpose** | [**PurposeEnum**](#PurposeEnum) | The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. |  |
|**statusDetails** | **String** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |



## Enum: PurposeEnum

| Name | Value |
|---- | -----|
| FINE_TUNE | &quot;fine-tune&quot; |
| FINE_TUNE_RESULTS | &quot;fine-tune-results&quot; |
| ASSISTANTS | &quot;assistants&quot; |
| ASSISTANTS_OUTPUT | &quot;assistants_output&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UPLOADED | &quot;uploaded&quot; |
| PROCESSED | &quot;processed&quot; |
| ERROR | &quot;error&quot; |



