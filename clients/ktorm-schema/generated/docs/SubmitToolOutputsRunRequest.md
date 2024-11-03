
# Table `SubmitToolOutputsRunRequest`
(mapped from: SubmitToolOutputsRunRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**toolOutputs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SubmitToolOutputsRunRequestToolOutputsInner&gt;**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. | 
**stream** | stream | boolean |  | **kotlin.Boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  |  [optional]


# **Table `SubmitToolOutputsRunRequestSubmitToolOutputsRunRequestToolOutputsInner`**
(mapped from: SubmitToolOutputsRunRequestSubmitToolOutputsRunRequestToolOutputsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
submitToolOutputsRunRequest | submitToolOutputsRunRequest | long | | kotlin.Long | Primary Key | *one*
submitToolOutputsRunRequestToolOutputsInner | submitToolOutputsRunRequestToolOutputsInner | long | | kotlin.Long | Foreign Key | *many*




