
# Table `ChatCompletionRequestFunctionMessage`
(mapped from: ChatCompletionRequestFunctionMessage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**role** | role | text NOT NULL |  | [**role**](#Role) | The role of the messages author, in this case &#x60;function&#x60;. | 
**content** | content | text NOT NULL |  | **kotlin.String** | The contents of the function message. | 
**name** | name | text NOT NULL |  | **kotlin.String** | The name of the function to call. | 





