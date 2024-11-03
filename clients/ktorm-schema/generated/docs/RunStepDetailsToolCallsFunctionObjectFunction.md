
# Table `RunStepDetailsToolCallsFunctionObject_function`
(mapped from: RunStepDetailsToolCallsFunctionObjectFunction)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | The name of the function. | 
**arguments** | arguments | text NOT NULL |  | **kotlin.String** | The arguments passed to the function. | 
**output** | output | text NOT NULL |  | **kotlin.String** | The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. | 





