# WWW::OpenAPIClient::Object::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the tool call in the tool calls array. | 
**id** | **string** | The ID of the tool call object. | [optional] 
**type** | **string** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**code_interpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] 
**retrieval** | **object** | For now, this is always going to be an empty object. | [optional] 
**function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


