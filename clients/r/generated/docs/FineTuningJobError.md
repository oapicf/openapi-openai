# openapi::FineTuningJobError

For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **character** | A machine-readable error code. | 
**message** | **character** | A human-readable error message. | 
**param** | **character** | The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. | 


