
# Table `CreateCompletionResponse`
(mapped from: CreateCompletionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | A unique identifier for the completion. | 
**choices** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateCompletionResponseChoicesInner&gt;**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | 
**created** | created | int NOT NULL |  | **kotlin.Int** | The Unix timestamp (in seconds) of when the completion was created. | 
**model** | model | text NOT NULL |  | **kotlin.String** | The model used for completion. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always \&quot;text_completion\&quot; | 
**systemFingerprint** | system_fingerprint | text |  | **kotlin.String** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  |  [optional]
**usage** | usage | long |  | [**CompletionUsage**](CompletionUsage.md) |  |  [optional] [foreignkey]



# **Table `CreateCompletionResponseCreateCompletionResponseChoicesInner`**
(mapped from: CreateCompletionResponseCreateCompletionResponseChoicesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createCompletionResponse | createCompletionResponse | long | | kotlin.Long | Primary Key | *one*
createCompletionResponseChoicesInner | createCompletionResponseChoicesInner | long | | kotlin.Long | Foreign Key | *many*








