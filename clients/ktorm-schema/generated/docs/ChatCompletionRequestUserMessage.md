
# Table `ChatCompletionRequestUserMessage`
(mapped from: ChatCompletionRequestUserMessage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**content** | content | long NOT NULL |  | [**ChatCompletionRequestUserMessageContent**](ChatCompletionRequestUserMessageContent.md) |  |  [foreignkey]
**role** | role | text NOT NULL |  | [**role**](#Role) | The role of the messages author, in this case &#x60;user&#x60;. | 
**name** | name | text |  | **kotlin.String** | An optional name for the participant. Provides the model information to differentiate between participants of the same role. |  [optional]





