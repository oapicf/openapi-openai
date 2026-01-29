
# Table `FineTuningJob_error`
(mapped from: FineTuningJobError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**code** | code | text NOT NULL |  | **kotlin.String** | A machine-readable error code. | 
**message** | message | text NOT NULL |  | **kotlin.String** | A human-readable error message. | 
**param** | param | text NOT NULL |  | **kotlin.String** | The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific. | 





