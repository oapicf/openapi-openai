# CreateChatCompletionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**array[ChatCompletionRequestMessage]**](ChatCompletionRequestMessage.md) |  | [default to null]
**model** | [**CreateChatCompletionRequestModel**](CreateChatCompletionRequestModel.md) |  | [default to null]
**frequencyUnderscorepenalty** | **integer** |  | [optional] [default to 0]
**logitUnderscorebias** | **map[String, integer]** |  | [optional] [default to null]
**logprobs** | **boolean** |  | [optional] [default to false]
**topUnderscorelogprobs** | **integer** |  | [optional] [default to null]
**maxUnderscoretokens** | **integer** |  | [optional] [default to null]
**n** | **integer** |  | [optional] [default to 1]
**presenceUnderscorepenalty** | **integer** |  | [optional] [default to 0]
**responseUnderscoreformat** | [**CreateChatCompletionRequestResponseFormat**](CreateChatCompletionRequestResponseFormat.md) |  | [optional] [default to null]
**seed** | **integer** |  | [optional] [default to null]
**stop** | [**CreateChatCompletionRequestStop**](CreateChatCompletionRequestStop.md) |  | [optional] [default to null]
**stream** | **boolean** |  | [optional] [default to false]
**temperature** | **integer** |  | [optional] [default to 1]
**topUnderscorep** | **integer** |  | [optional] [default to 1]
**tools** | [**array[ChatCompletionTool]**](ChatCompletionTool.md) |  | [optional] [default to null]
**toolUnderscorechoice** | [**ChatCompletionToolChoiceOption**](ChatCompletionToolChoiceOption.md) |  | [optional] [default to null]
**user** | **string** |  | [optional] [default to null]
**functionUnderscorecall** | [**CreateChatCompletionRequestFunctionCall**](CreateChatCompletionRequestFunctionCall.md) |  | [optional] [default to null]
**functions** | [**array[ChatCompletionFunctions]**](ChatCompletionFunctions.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


