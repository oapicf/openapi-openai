

# RunObjectIncompleteDetails

Details on why the run is incomplete. Will be `null` if the run is not incomplete.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**Reason**](#Reason) | The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. |  [optional]


## Enum: Reason
Allowed values: [max_completion_tokens, max_prompt_tokens]




