# CHAT_COMPLETION_FUNCTIONS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | [default to null]
**description** | [**STRING_32**](STRING_32.md) | The description of what the function does. | [optional] [default to null]
**parameters** | [**STRING_TABLE [ANY]**](ANY.md) | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


