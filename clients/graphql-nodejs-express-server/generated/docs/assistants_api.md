# assistants_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelRun**](assistants_api.md#CancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**CreateAssistant**](assistants_api.md#CreateAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**CreateMessage**](assistants_api.md#CreateMessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**CreateRun**](assistants_api.md#CreateRun) | **POST** /threads/{thread_id}/runs | Create a run.
[**CreateThread**](assistants_api.md#CreateThread) | **POST** /threads | Create a thread.
[**CreateThreadAndRun**](assistants_api.md#CreateThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**DeleteAssistant**](assistants_api.md#DeleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**DeleteMessage**](assistants_api.md#DeleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**DeleteThread**](assistants_api.md#DeleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**GetAssistant**](assistants_api.md#GetAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**GetMessage**](assistants_api.md#GetMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**GetRun**](assistants_api.md#GetRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**GetRunStep**](assistants_api.md#GetRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**GetThread**](assistants_api.md#GetThread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**ListAssistants**](assistants_api.md#ListAssistants) | **GET** /assistants | Returns a list of assistants.
[**ListMessages**](assistants_api.md#ListMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**ListRunSteps**](assistants_api.md#ListRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**ListRuns**](assistants_api.md#ListRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**ModifyAssistant**](assistants_api.md#ModifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**ModifyMessage**](assistants_api.md#ModifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**ModifyRun**](assistants_api.md#ModifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**ModifyThread**](assistants_api.md#ModifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
[**SubmitToolOuputsToRun**](assistants_api.md#SubmitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


<a name="CancelRun"></a>
# **CancelRun**
> RunObject CancelRun(threadId, runId)

Cancels a run that is &#x60;in_progress&#x60;.
<a name="CreateAssistant"></a>
# **CreateAssistant**
> AssistantObject CreateAssistant(createAssistantRequest)

Create an assistant with a model and instructions.
<a name="CreateMessage"></a>
# **CreateMessage**
> MessageObject CreateMessage(threadId, createMessageRequest)

Create a message.
<a name="CreateRun"></a>
# **CreateRun**
> RunObject CreateRun(threadId, createRunRequest, include)

Create a run.
<a name="CreateThread"></a>
# **CreateThread**
> ThreadObject CreateThread(createThreadRequest)

Create a thread.
<a name="CreateThreadAndRun"></a>
# **CreateThreadAndRun**
> RunObject CreateThreadAndRun(createThreadAndRunRequest)

Create a thread and run it in one request.
<a name="DeleteAssistant"></a>
# **DeleteAssistant**
> DeleteAssistantResponse DeleteAssistant(assistantId)

Delete an assistant.
<a name="DeleteMessage"></a>
# **DeleteMessage**
> DeleteMessageResponse DeleteMessage(threadId, messageId)

Deletes a message.
<a name="DeleteThread"></a>
# **DeleteThread**
> DeleteThreadResponse DeleteThread(threadId)

Delete a thread.
<a name="GetAssistant"></a>
# **GetAssistant**
> AssistantObject GetAssistant(assistantId)

Retrieves an assistant.
<a name="GetMessage"></a>
# **GetMessage**
> MessageObject GetMessage(threadId, messageId)

Retrieve a message.
<a name="GetRun"></a>
# **GetRun**
> RunObject GetRun(threadId, runId)

Retrieves a run.
<a name="GetRunStep"></a>
# **GetRunStep**
> RunStepObject GetRunStep(threadId, runId, stepId, include)

Retrieves a run step.
<a name="GetThread"></a>
# **GetThread**
> ThreadObject GetThread(threadId)

Retrieves a thread.
<a name="ListAssistants"></a>
# **ListAssistants**
> ListAssistantsResponse ListAssistants(limit, order, after, before)

Returns a list of assistants.
<a name="ListMessages"></a>
# **ListMessages**
> ListMessagesResponse ListMessages(threadId, limit, order, after, before, runId)

Returns a list of messages for a given thread.
<a name="ListRunSteps"></a>
# **ListRunSteps**
> ListRunStepsResponse ListRunSteps(threadId, runId, limit, order, after, before, include)

Returns a list of run steps belonging to a run.
<a name="ListRuns"></a>
# **ListRuns**
> ListRunsResponse ListRuns(threadId, limit, order, after, before)

Returns a list of runs belonging to a thread.
<a name="ModifyAssistant"></a>
# **ModifyAssistant**
> AssistantObject ModifyAssistant(assistantId, modifyAssistantRequest)

Modifies an assistant.
<a name="ModifyMessage"></a>
# **ModifyMessage**
> MessageObject ModifyMessage(threadId, messageId, modifyMessageRequest)

Modifies a message.
<a name="ModifyRun"></a>
# **ModifyRun**
> RunObject ModifyRun(threadId, runId, modifyRunRequest)

Modifies a run.
<a name="ModifyThread"></a>
# **ModifyThread**
> ThreadObject ModifyThread(threadId, modifyThreadRequest)

Modifies a thread.
<a name="SubmitToolOuputsToRun"></a>
# **SubmitToolOuputsToRun**
> RunObject SubmitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)

When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
