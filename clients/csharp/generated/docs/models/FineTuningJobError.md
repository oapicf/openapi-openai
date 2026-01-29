# Org.OpenAPITools.Model.FineTuningJobError
For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | A machine-readable error code. | 
**Message** | **string** | A human-readable error message. | 
**Param** | **string** | The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

