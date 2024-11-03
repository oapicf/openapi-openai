

# RunStepDeltaStepDetailsToolCallsRetrievalObject

The class is defined in **[RunStepDeltaStepDetailsToolCallsRetrievalObject.java](../../src/main/java/org/openapitools/model/RunStepDeltaStepDetailsToolCallsRetrievalObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` | The index of the tool call in the tool calls array. | 
**id** | `String` | The ID of the tool call object. |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | 
**retrieval** | `Object` | For now, this is always going to be an empty object. |  [optional property]



## TypeEnum

Name | Value
---- | -----
RETRIEVAL | `"retrieval"`



