

# RunCompletionUsage

Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completionTokens** | **Integer** | Number of completion tokens used over the course of the run. |  |
|**promptTokens** | **Integer** | Number of prompt tokens used over the course of the run. |  |
|**totalTokens** | **Integer** | Total number of tokens used (prompt + completion). |  |



