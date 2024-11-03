

# RunObjectIncompleteDetails

Details on why the run is incomplete. Will be `null` if the run is not incomplete.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | [**ReasonEnum**](#ReasonEnum) | The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| COMPLETION_TOKENS | &quot;max_completion_tokens&quot; |
| PROMPT_TOKENS | &quot;max_prompt_tokens&quot; |



