
# Table `ChatCompletionFunctions`
(mapped from: ChatCompletionFunctions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**description** | description | text |  | **kotlin.String** | The description of what the function does. |  [optional]
**parameters** | parameters | blob |  | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. |  [optional]





