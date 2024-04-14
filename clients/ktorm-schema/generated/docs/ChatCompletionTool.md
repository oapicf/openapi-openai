
# Table `ChatCompletionTool`
(mapped from: ChatCompletionTool)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**function** | function | long NOT NULL |  | [**FunctionObject**](FunctionObject.md) |  |  [foreignkey]




