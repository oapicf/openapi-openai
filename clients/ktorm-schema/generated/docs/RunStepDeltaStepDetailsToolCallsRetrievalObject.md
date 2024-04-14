
# Table `RunStepDeltaStepDetailsToolCallsRetrievalObject`
(mapped from: RunStepDeltaStepDetailsToolCallsRetrievalObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the tool call in the tool calls array. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of tool call. This is always going to be &#x60;retrieval&#x60; for this type of tool call. | 
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The ID of the tool call object. |  [optional]
**retrieval** | retrieval | blob |  | [**kotlin.Any**](.md) | For now, this is always going to be an empty object. |  [optional]






