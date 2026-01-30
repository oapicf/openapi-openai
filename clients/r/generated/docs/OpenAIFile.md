# openapi::OpenAIFile

The `File` object represents a document that has been uploaded to OpenAI.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The file identifier, which can be referenced in the API endpoints. | 
**bytes** | **integer** | The size of the file, in bytes. | 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the file was created. | 
**filename** | **character** | The name of the file. | 
**object** | **character** | The object type, which is always &#x60;file&#x60;. | [Enum: [file]] 
**purpose** | **character** | The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;. | [Enum: [assistants, assistants_output, batch, batch_output, fine-tune, fine-tune-results, vision]] 
**status** | **character** | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. | [Enum: [uploaded, processed, error]] 
**status_details** | **character** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. | [optional] 


