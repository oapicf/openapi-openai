

# RunStepDeltaStepDetailsToolCallsFileSearchObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index of the tool call in the tool calls array. |  |
|**id** | **String** | The ID of the tool call object. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. |  |
|**fileSearch** | **Object** | For now, this is always going to be an empty object. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE_SEARCH | &quot;file_search&quot; |



