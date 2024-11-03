# WWW::OpenAPIClient::Object::RunStepDetailsToolCallsObject

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RunStepDetailsToolCallsObject;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;tool_calls&#x60;. | 
**tool_calls** | [**ARRAY[RunStepDetailsToolCallsObjectToolCallsInner]**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


