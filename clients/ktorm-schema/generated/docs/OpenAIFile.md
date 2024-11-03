
# Table `OpenAIFile`
(mapped from: OpenAIFile)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The file identifier, which can be referenced in the API endpoints. | 
**bytes** | bytes | int NOT NULL |  | **kotlin.Int** | The size of the file, in bytes. | 
**createdAt** | created_at | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) for when the file was created. | 
**filename** | filename | text NOT NULL |  | **kotlin.String** | The name of the file. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;file&#x60;. | 
**purpose** | purpose | text NOT NULL |  | [**purpose**](#Purpose) | The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;. | 
**status** | status | text NOT NULL |  | [**status**](#Status) | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. | 
**statusDetails** | status_details | text |  | **kotlin.String** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. |  [optional]










