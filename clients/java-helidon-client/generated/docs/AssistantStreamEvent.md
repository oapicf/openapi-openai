

# AssistantStreamEvent

Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Whether to enable input audio transcription. |  [optional] |
|**event** | [**EventEnum**](#EventEnum) |  |  |
|**data** | [**DataEnum**](#DataEnum) |  |  |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| DONE | &quot;done&quot; |



## Enum: DataEnum

| Name | Value |
|---- | -----|
| _DONE_ | &quot;[DONE]&quot; |



