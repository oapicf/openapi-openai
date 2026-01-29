# WWW::OpenAPIClient::Object::SubmitToolOutputsRunRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::SubmitToolOutputsRunRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tool_outputs** | [**ARRAY[SubmitToolOutputsRunRequestToolOutputsInner]**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. | 
**stream** | **boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


