
# Table `ChatCompletionMessageToolCall`
(mapped from: ChatCompletionMessageToolCall)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of the tool call. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**function** | function | long NOT NULL |  | [**ChatCompletionMessageToolCallFunction**](ChatCompletionMessageToolCallFunction.md) |  |  [foreignkey]





