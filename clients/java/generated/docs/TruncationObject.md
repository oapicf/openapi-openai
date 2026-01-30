

# TruncationObject

Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;. |  |
|**lastMessages** | **Integer** | The number of most recent messages from the thread when constructing the context for the run. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| LAST_MESSAGES | &quot;last_messages&quot; |



