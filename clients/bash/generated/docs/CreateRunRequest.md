# CreateRunRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistantUnderscoreid** | **string** |  | [default to null]
**model** | [**CreateRunRequestModel**](CreateRunRequestModel.md) |  | [optional] [default to null]
**instructions** | **string** |  | [optional] [default to null]
**additionalUnderscoreinstructions** | **string** |  | [optional] [default to null]
**additionalUnderscoremessages** | [**array[CreateMessageRequest]**](CreateMessageRequest.md) |  | [optional] [default to null]
**tools** | [**array[AssistantObjectToolsInner]**](AssistantObjectToolsInner.md) |  | [optional] [default to null]
**metadata** | **map** |  | [optional] [default to null]
**temperature** | **integer** |  | [optional] [default to 1]
**stream** | **boolean** |  | [optional] [default to null]
**maxUnderscorepromptUnderscoretokens** | **integer** |  | [optional] [default to null]
**maxUnderscorecompletionUnderscoretokens** | **integer** |  | [optional] [default to null]
**truncationUnderscorestrategy** | [**TruncationObject**](TruncationObject.md) |  | [optional] [default to null]
**toolUnderscorechoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [optional] [default to null]
**responseUnderscoreformat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


