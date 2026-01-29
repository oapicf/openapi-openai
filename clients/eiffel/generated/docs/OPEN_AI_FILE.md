# OPEN_AI_FILE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The file identifier, which can be referenced in the API endpoints. | [default to null]
**bytes** | **INTEGER_32** | The size of the file, in bytes. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the file was created. | [default to null]
**filename** | [**STRING_32**](STRING_32.md) | The name of the file. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;file&#x60;. | [default to null]
**purpose** | [**STRING_32**](STRING_32.md) | The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;. | [default to null]
**status** | [**STRING_32**](STRING_32.md) | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. | [default to null]
**status_details** | [**STRING_32**](STRING_32.md) | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


