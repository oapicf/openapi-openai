

# ChatCompletionRequestDeveloperMessage

Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 

The class is defined in **[ChatCompletionRequestDeveloperMessage.java](../../src/main/java/org/openapitools/model/ChatCompletionRequestDeveloperMessage.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [`ChatCompletionRequestDeveloperMessageContent`](ChatCompletionRequestDeveloperMessageContent.md) |  | 
**role** | [**RoleEnum**](#RoleEnum) | The role of the messages author, in this case &#x60;developer&#x60;. | 
**name** | `String` | An optional name for the participant. Provides the model information to differentiate between participants of the same role. |  [optional property]


## RoleEnum

Name | Value
---- | -----
DEVELOPER | `"developer"`



