
# Table `RunStepDetailsToolCallsFunctionObject`
(mapped from: RunStepDetailsToolCallsFunctionObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of the tool call object. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. | 
**function** | function | long NOT NULL |  | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  |  [foreignkey]





