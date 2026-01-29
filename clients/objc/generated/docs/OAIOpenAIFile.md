# OAIOpenAIFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The file identifier, which can be referenced in the API endpoints. | 
**bytes** | **NSNumber*** | The size of the file, in bytes. | 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the file was created. | 
**filename** | **NSString*** | The name of the file. | 
**object** | **NSString*** | The object type, which is always &#x60;file&#x60;. | 
**purpose** | **NSString*** | The intended purpose of the file. Supported values are &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60;, &#x60;assistants&#x60;, and &#x60;assistants_output&#x60;. | 
**status** | **NSString*** | Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;. | 
**statusDetails** | **NSString*** | Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


