
# Table `AssistantsApiNamedToolChoice`
(mapped from: AssistantsApiNamedToolChoice)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**function** | function | long |  | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  |  [optional] [foreignkey]




