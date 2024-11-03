# CreateCompletionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | A unique identifier for the completion. | [default to null]
**choices** | [**CreateCompletionResponseChoicesInner**](CreateCompletionResponse_choices_inner.md) | The list of completion choices the model generated for the input prompt. | [default to null]
**created** | **Int!** | The Unix timestamp (in seconds) of when the completion was created. | [default to null]
**model** | **String!** | The model used for completion. | [default to null]
**systemFingerprint** | **String!** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] [default to null]
**object** | **String!** | The object type, which is always \&quot;text_completion\&quot; | [default to null]
**usage** | [***CompletionUsage**](CompletionUsage.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


