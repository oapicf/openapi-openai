# openapi::ChatCompletionRequestDeveloperMessage

Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**ChatCompletionRequestDeveloperMessageContent**](ChatCompletionRequestDeveloperMessage_content.md) |  | 
**role** | **character** | The role of the messages author, in this case &#x60;developer&#x60;. | [Enum: [developer]] 
**name** | **character** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 


