
# Table `CreateChatCompletionStreamResponse`
(mapped from: CreateChatCompletionStreamResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | A unique identifier for the chat completion. Each chunk has the same ID. | 
**choices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateChatCompletionStreamResponseChoicesInner&gt;**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**created** | created | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | 
**model** | model | text NOT NULL |  | **kotlin.String** | The model to generate the completion. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;chat.completion.chunk&#x60;. | 
**systemFingerprint** | system_fingerprint | text |  | **kotlin.String** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional]



# **Table `CreateChatCompletionStreamResponseCreateChatCompletionStreamResponseChoicesInner`**
(mapped from: CreateChatCompletionStreamResponseCreateChatCompletionStreamResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createChatCompletionStreamResponse | createChatCompletionStreamResponse | long | | kotlin.Long | Primary Key | *one*
createChatCompletionStreamResponseChoicesInner | createChatCompletionStreamResponseChoicesInner | long | | kotlin.Long | Foreign Key | *many*







