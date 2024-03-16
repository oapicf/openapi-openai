

# ChatCompletionFunctions

The class is defined in **[ChatCompletionFunctions.java](../../src/main/java/org/openapitools/model/ChatCompletionFunctions.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | `String` | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**description** | `String` | The description of what the function does. |  [optional property]
**parameters** | `Map&lt;String, Object&gt;` | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. |  [optional property]





