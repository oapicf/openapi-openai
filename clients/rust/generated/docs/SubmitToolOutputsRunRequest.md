# SubmitToolOutputsRunRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tool_outputs** | [**Vec<models::SubmitToolOutputsRunRequestToolOutputsInner>**](SubmitToolOutputsRunRequest_tool_outputs_inner.md) | A list of tools for which the outputs are being submitted. | 
**stream** | Option<**bool**> | If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


