
# Table `CreateChatCompletionResponse`
(mapped from: CreateChatCompletionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | A unique identifier for the chat completion. | 
**choices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateChatCompletionResponseChoicesInner&gt;**](CreateChatCompletionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**created** | created | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**model** | model | text NOT NULL |  | **kotlin.String** | The model used for the chat completion. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;chat.completion&#x60;. | 
**systemFingerprint** | system_fingerprint | text |  | **kotlin.String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional]
**usage** | usage | long |  | [**CompletionUsage**](CompletionUsage.md) |  |  [optional] [foreignkey]



# **Table `CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner`**
(mapped from: CreateChatCompletionResponseCreateChatCompletionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createChatCompletionResponse | createChatCompletionResponse | long | | kotlin.Long | Primary Key | *one*
createChatCompletionResponseChoicesInner | createChatCompletionResponseChoicesInner | long | | kotlin.Long | Foreign Key | *many*








