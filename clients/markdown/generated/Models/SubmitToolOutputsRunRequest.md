# SubmitToolOutputsRunRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **tool\_outputs** | [**List**](SubmitToolOutputsRunRequest_tool_outputs_inner.md) | A list of tools for which the outputs are being submitted. | [default to null] |
| **stream** | **Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

