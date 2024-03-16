# CreateChatCompletionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**CreateChatCompletionRequestModel**](CreateChatCompletionRequestModel.md) |  | [default to null]
**messages** | [**array[ChatCompletionRequestMessage]**](ChatCompletionRequestMessage.md) |  | [default to null]
**functions** | [**array[ChatCompletionFunctions]**](ChatCompletionFunctions.md) |  | [optional] [default to null]
**functionUnderscorecall** | [**CreateChatCompletionRequestFunctionCall**](CreateChatCompletionRequestFunctionCall.md) |  | [optional] [default to null]
**temperature** | **integer** |  | [optional] [default to 1]
**topUnderscorep** | **integer** |  | [optional] [default to 1]
**n** | **integer** |  | [optional] [default to 1]
**stream** | **boolean** |  | [optional] [default to false]
**stop** | [**CreateChatCompletionRequestStop**](CreateChatCompletionRequestStop.md) |  | [optional] [default to null]
**maxUnderscoretokens** | **integer** |  | [optional] [default to null]
**presenceUnderscorepenalty** | **integer** |  | [optional] [default to 0]
**frequencyUnderscorepenalty** | **integer** |  | [optional] [default to 0]
**logitUnderscorebias** | **map** |  | [optional] [default to null]
**user** | **string** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


