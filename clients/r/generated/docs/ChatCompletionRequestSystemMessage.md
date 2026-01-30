# openapi::ChatCompletionRequestSystemMessage

Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**ChatCompletionRequestSystemMessageContent**](ChatCompletionRequestSystemMessage_content.md) |  | 
**role** | **character** | The role of the messages author, in this case &#x60;system&#x60;. | [Enum: [system]] 
**name** | **character** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. | [optional] 


