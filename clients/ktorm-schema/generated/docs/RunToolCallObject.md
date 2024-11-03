
# Table `RunToolCallObject`
(mapped from: RunToolCallObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | 
**function** | function | long NOT NULL |  | [**RunToolCallObjectFunction**](RunToolCallObjectFunction.md) |  |  [foreignkey]





