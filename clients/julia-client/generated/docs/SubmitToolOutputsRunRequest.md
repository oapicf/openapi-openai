# SubmitToolOutputsRunRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`tool_outputs`** | [**`Vector{SubmitToolOutputsRunRequestToolOutputsInner}`**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. | [default to nothing]
**`stream`** | **`Bool`** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


