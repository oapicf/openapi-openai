# WWW::OpenAPIClient::Object::RunStepObjectStepDetails

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RunStepObjectStepDetails;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;message_creation&#x60;. | 
**message_creation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 
**tool_calls** | [**ARRAY[RunStepDetailsToolCallsObjectToolCallsInner]**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


