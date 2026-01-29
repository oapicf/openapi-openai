

# RunObjectIncompleteDetails

Details on why the run is incomplete. Will be `null` if the run is not incomplete.

The class is defined in **[RunObjectIncompleteDetails.java](../../src/main/java/org/openapitools/model/RunObjectIncompleteDetails.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. |  [optional property]

## ReasonEnum

Name | Value
---- | -----
MAX_COMPLETION_TOKENS | `"max_completion_tokens"`
MAX_PROMPT_TOKENS | `"max_prompt_tokens"`


