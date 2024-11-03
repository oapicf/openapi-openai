
# SubmitToolOutputsRunRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **toolOutputs** | [**kotlin.collections.List&lt;SubmitToolOutputsRunRequestToolOutputsInner&gt;**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. |  |
| **stream** | **kotlin.Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  |  [optional] |



