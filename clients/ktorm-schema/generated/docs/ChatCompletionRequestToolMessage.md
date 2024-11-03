
# Table `ChatCompletionRequestToolMessage`
(mapped from: ChatCompletionRequestToolMessage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**role** | role | text NOT NULL |  | [**role**](#Role) | The role of the messages author, in this case &#x60;tool&#x60;. | 
**content** | content | text NOT NULL |  | **kotlin.String** | The contents of the tool message. | 
**toolCallId** | tool_call_id | text NOT NULL |  | **kotlin.String** | Tool call that this message is responding to. | 





