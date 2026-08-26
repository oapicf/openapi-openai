# CreateCompletionResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | A unique identifier for the completion. | [default to nothing]
**`choices`** | [**`Vector{CreateCompletionResponseChoicesInner}`**](CreateCompletionResponseChoicesInner.md) | The list of completion choices the model generated for the input prompt. | [default to nothing]
**`created`** | **`Int64`** | The Unix timestamp (in seconds) of when the completion was created. | [default to nothing]
**`model`** | **`String`** | The model used for completion. | [default to nothing]
**`system_fingerprint`** | **`String`** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to nothing]
**`object`** | **`String`** | The object type, which is always \&quot;text_completion\&quot; | [default to nothing]
**`usage`** | [**`*CompletionUsage`**](CompletionUsage.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


