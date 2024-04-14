# PSOpenAPITools.PSOpenAPITools\Api.AssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Stop-Run**](AssistantsApi.md#Stop-Run) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**New-Assistant**](AssistantsApi.md#New-Assistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**New-AssistantFile**](AssistantsApi.md#New-AssistantFile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
[**New-Message**](AssistantsApi.md#New-Message) | **POST** /threads/{thread_id}/messages | Create a message.
[**New-Run**](AssistantsApi.md#New-Run) | **POST** /threads/{thread_id}/runs | Create a run.
[**New-Thread**](AssistantsApi.md#New-Thread) | **POST** /threads | Create a thread.
[**New-ThreadAndRun**](AssistantsApi.md#New-ThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**Invoke-DeleteAssistant**](AssistantsApi.md#Invoke-DeleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**Invoke-DeleteAssistantFile**](AssistantsApi.md#Invoke-DeleteAssistantFile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file.
[**Invoke-DeleteThread**](AssistantsApi.md#Invoke-DeleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**Get-Assistant**](AssistantsApi.md#Get-Assistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**Get-AssistantFile**](AssistantsApi.md#Get-AssistantFile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile.
[**Get-Message**](AssistantsApi.md#Get-Message) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**Get-MessageFile**](AssistantsApi.md#Get-MessageFile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file.
[**Get-Run**](AssistantsApi.md#Get-Run) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**Get-RunStep**](AssistantsApi.md#Get-RunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**Get-Thread**](AssistantsApi.md#Get-Thread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**Invoke-ListAssistantFiles**](AssistantsApi.md#Invoke-ListAssistantFiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files.
[**Invoke-ListAssistants**](AssistantsApi.md#Invoke-ListAssistants) | **GET** /assistants | Returns a list of assistants.
[**Invoke-ListMessageFiles**](AssistantsApi.md#Invoke-ListMessageFiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files.
[**Invoke-ListMessages**](AssistantsApi.md#Invoke-ListMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**Invoke-ListRunSteps**](AssistantsApi.md#Invoke-ListRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**Invoke-ListRuns**](AssistantsApi.md#Invoke-ListRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**Edit-Assistant**](AssistantsApi.md#Edit-Assistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**Edit-Message**](AssistantsApi.md#Edit-Message) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**Edit-Run**](AssistantsApi.md#Edit-Run) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**Edit-Thread**](AssistantsApi.md#Edit-Thread) | **POST** /threads/{thread_id} | Modifies a thread.
[**Submit-ToolOuputsToRun**](AssistantsApi.md#Submit-ToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: &quot;&quot;requires_action&quot;&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


<a id="Stop-Run"></a>
# **Stop-Run**
> RunObject Stop-Run<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RunId] <String><br>

Cancels a run that is `in_progress`.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread to which this run belongs.
$RunId = "MyRunId" # String | The ID of the run to cancel.

# Cancels a run that is `in_progress`.
try {
    $Result = Stop-Run -ThreadId $ThreadId -RunId $RunId
} catch {
    Write-Host ("Exception occurred when calling Stop-Run: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to which this run belongs. | 
 **RunId** | **String**| The ID of the run to cancel. | 

### Return type

[**RunObject**](RunObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Assistant"></a>
# **New-Assistant**
> AssistantObject New-Assistant<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateAssistantRequest] <PSCustomObject><br>

Create an assistant with a model and instructions.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateAssistantRequestModel = Initialize-CreateAssistantRequestModel 

$FunctionObject = Initialize-FunctionObject -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  }
$AssistantObjectToolsInner = Initialize-AssistantObjectToolsInner -Type "code_interpreter" -VarFunction $FunctionObject

$CreateAssistantRequest = Initialize-CreateAssistantRequest -Model $CreateAssistantRequestModel -Name "MyName" -Description "MyDescription" -Instructions "MyInstructions" -Tools $AssistantObjectToolsInner -FileIds "MyFileIds" -Metadata # CreateAssistantRequest | 

# Create an assistant with a model and instructions.
try {
    $Result = New-Assistant -CreateAssistantRequest $CreateAssistantRequest
} catch {
    Write-Host ("Exception occurred when calling New-Assistant: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateAssistantRequest** | [**CreateAssistantRequest**](CreateAssistantRequest.md)|  | 

### Return type

[**AssistantObject**](AssistantObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-AssistantFile"></a>
# **New-AssistantFile**
> AssistantFileObject New-AssistantFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssistantId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateAssistantFileRequest] <PSCustomObject><br>

Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AssistantId = "file-abc123" # String | The ID of the assistant for which to create a File. 
$CreateAssistantFileRequest = Initialize-CreateAssistantFileRequest -FileId "MyFileId" # CreateAssistantFileRequest | 

# Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
try {
    $Result = New-AssistantFile -AssistantId $AssistantId -CreateAssistantFileRequest $CreateAssistantFileRequest
} catch {
    Write-Host ("Exception occurred when calling New-AssistantFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssistantId** | **String**| The ID of the assistant for which to create a File.  | 
 **CreateAssistantFileRequest** | [**CreateAssistantFileRequest**](CreateAssistantFileRequest.md)|  | 

### Return type

[**AssistantFileObject**](AssistantFileObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Message"></a>
# **New-Message**
> MessageObject New-Message<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateMessageRequest] <PSCustomObject><br>

Create a message.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the [thread](/docs/api-reference/threads) to create a message for.
$CreateMessageRequest = Initialize-CreateMessageRequest -Role "user" -Content "MyContent" -FileIds "MyFileIds" -Metadata # CreateMessageRequest | 

# Create a message.
try {
    $Result = New-Message -ThreadId $ThreadId -CreateMessageRequest $CreateMessageRequest
} catch {
    Write-Host ("Exception occurred when calling New-Message: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | 
 **CreateMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | 

### Return type

[**MessageObject**](MessageObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Run"></a>
# **New-Run**
> RunObject New-Run<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateRunRequest] <PSCustomObject><br>

Create a run.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread to run.
$CreateRunRequestModel = Initialize-CreateRunRequestModel 
$CreateMessageRequest = Initialize-CreateMessageRequest -Role "user" -Content "MyContent" -FileIds "MyFileIds" -Metadata 

$FunctionObject = Initialize-FunctionObject -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  }
$AssistantObjectToolsInner = Initialize-AssistantObjectToolsInner -Type "code_interpreter" -VarFunction $FunctionObject

$TruncationObject = Initialize-TruncationObject -Type "auto" -LastMessages 0

$ChatCompletionNamedToolChoiceFunction = Initialize-ChatCompletionNamedToolChoiceFunction -Name "MyName"
$AssistantsApiToolChoiceOption = Initialize-AssistantsApiToolChoiceOption -Type "function" -VarFunction $ChatCompletionNamedToolChoiceFunction

$AssistantsApiResponseFormatOption = Initialize-AssistantsApiResponseFormatOption -Type "text"
$CreateRunRequest = Initialize-CreateRunRequest -AssistantId "MyAssistantId" -Model $CreateRunRequestModel -Instructions "MyInstructions" -AdditionalInstructions "MyAdditionalInstructions" -AdditionalMessages $CreateMessageRequest -Tools $AssistantObjectToolsInner -Metadata  -Temperature 1 -Stream $false -MaxPromptTokens 0 -MaxCompletionTokens 0 -TruncationStrategy $TruncationObject -ToolChoice $AssistantsApiToolChoiceOption -ResponseFormat $AssistantsApiResponseFormatOption # CreateRunRequest | 

# Create a run.
try {
    $Result = New-Run -ThreadId $ThreadId -CreateRunRequest $CreateRunRequest
} catch {
    Write-Host ("Exception occurred when calling New-Run: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to run. | 
 **CreateRunRequest** | [**CreateRunRequest**](CreateRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-Thread"></a>
# **New-Thread**
> ThreadObject New-Thread<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateThreadRequest] <PSCustomObject><br>

Create a thread.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateMessageRequest = Initialize-CreateMessageRequest -Role "user" -Content "MyContent" -FileIds "MyFileIds" -Metadata 
$CreateThreadRequest = Initialize-CreateThreadRequest -Messages $CreateMessageRequest -Metadata # CreateThreadRequest |  (optional)

# Create a thread.
try {
    $Result = New-Thread -CreateThreadRequest $CreateThreadRequest
} catch {
    Write-Host ("Exception occurred when calling New-Thread: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateThreadRequest** | [**CreateThreadRequest**](CreateThreadRequest.md)|  | [optional] 

### Return type

[**ThreadObject**](ThreadObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ThreadAndRun"></a>
# **New-ThreadAndRun**
> RunObject New-ThreadAndRun<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateThreadAndRunRequest] <PSCustomObject><br>

Create a thread and run it in one request.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$CreateMessageRequest = Initialize-CreateMessageRequest -Role "user" -Content "MyContent" -FileIds "MyFileIds" -Metadata 
$CreateThreadRequest = Initialize-CreateThreadRequest -Messages $CreateMessageRequest -Metadata 

$CreateRunRequestModel = Initialize-CreateRunRequestModel 

$FunctionObject = Initialize-FunctionObject -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  }
$CreateThreadAndRunRequestToolsInner = Initialize-CreateThreadAndRunRequestToolsInner -Type "code_interpreter" -VarFunction $FunctionObject

$TruncationObject = Initialize-TruncationObject -Type "auto" -LastMessages 0

$ChatCompletionNamedToolChoiceFunction = Initialize-ChatCompletionNamedToolChoiceFunction -Name "MyName"
$AssistantsApiToolChoiceOption = Initialize-AssistantsApiToolChoiceOption -Type "function" -VarFunction $ChatCompletionNamedToolChoiceFunction

$AssistantsApiResponseFormatOption = Initialize-AssistantsApiResponseFormatOption -Type "text"
$CreateThreadAndRunRequest = Initialize-CreateThreadAndRunRequest -AssistantId "MyAssistantId" -Thread $CreateThreadRequest -Model $CreateRunRequestModel -Instructions "MyInstructions" -Tools $CreateThreadAndRunRequestToolsInner -Metadata  -Temperature 1 -Stream $false -MaxPromptTokens 0 -MaxCompletionTokens 0 -TruncationStrategy $TruncationObject -ToolChoice $AssistantsApiToolChoiceOption -ResponseFormat $AssistantsApiResponseFormatOption # CreateThreadAndRunRequest | 

# Create a thread and run it in one request.
try {
    $Result = New-ThreadAndRun -CreateThreadAndRunRequest $CreateThreadAndRunRequest
} catch {
    Write-Host ("Exception occurred when calling New-ThreadAndRun: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CreateThreadAndRunRequest** | [**CreateThreadAndRunRequest**](CreateThreadAndRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteAssistant"></a>
# **Invoke-DeleteAssistant**
> DeleteAssistantResponse Invoke-DeleteAssistant<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssistantId] <String><br>

Delete an assistant.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AssistantId = "MyAssistantId" # String | The ID of the assistant to delete.

# Delete an assistant.
try {
    $Result = Invoke-DeleteAssistant -AssistantId $AssistantId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteAssistant: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssistantId** | **String**| The ID of the assistant to delete. | 

### Return type

[**DeleteAssistantResponse**](DeleteAssistantResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteAssistantFile"></a>
# **Invoke-DeleteAssistantFile**
> DeleteAssistantFileResponse Invoke-DeleteAssistantFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssistantId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Delete an assistant file.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AssistantId = "MyAssistantId" # String | The ID of the assistant that the file belongs to.
$FileId = "MyFileId" # String | The ID of the file to delete.

# Delete an assistant file.
try {
    $Result = Invoke-DeleteAssistantFile -AssistantId $AssistantId -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteAssistantFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssistantId** | **String**| The ID of the assistant that the file belongs to. | 
 **FileId** | **String**| The ID of the file to delete. | 

### Return type

[**DeleteAssistantFileResponse**](DeleteAssistantFileResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteThread"></a>
# **Invoke-DeleteThread**
> DeleteThreadResponse Invoke-DeleteThread<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>

Delete a thread.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread to delete.

# Delete a thread.
try {
    $Result = Invoke-DeleteThread -ThreadId $ThreadId
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteThread: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to delete. | 

### Return type

[**DeleteThreadResponse**](DeleteThreadResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Assistant"></a>
# **Get-Assistant**
> AssistantObject Get-Assistant<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssistantId] <String><br>

Retrieves an assistant.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AssistantId = "MyAssistantId" # String | The ID of the assistant to retrieve.

# Retrieves an assistant.
try {
    $Result = Get-Assistant -AssistantId $AssistantId
} catch {
    Write-Host ("Exception occurred when calling Get-Assistant: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssistantId** | **String**| The ID of the assistant to retrieve. | 

### Return type

[**AssistantObject**](AssistantObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-AssistantFile"></a>
# **Get-AssistantFile**
> AssistantFileObject Get-AssistantFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssistantId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Retrieves an AssistantFile.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AssistantId = "MyAssistantId" # String | The ID of the assistant who the file belongs to.
$FileId = "MyFileId" # String | The ID of the file we're getting.

# Retrieves an AssistantFile.
try {
    $Result = Get-AssistantFile -AssistantId $AssistantId -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Get-AssistantFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssistantId** | **String**| The ID of the assistant who the file belongs to. | 
 **FileId** | **String**| The ID of the file we&#39;re getting. | 

### Return type

[**AssistantFileObject**](AssistantFileObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Message"></a>
# **Get-Message**
> MessageObject Get-Message<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <String><br>

Retrieve a message.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
$MessageId = "MyMessageId" # String | The ID of the message to retrieve.

# Retrieve a message.
try {
    $Result = Get-Message -ThreadId $ThreadId -MessageId $MessageId
} catch {
    Write-Host ("Exception occurred when calling Get-Message: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
 **MessageId** | **String**| The ID of the message to retrieve. | 

### Return type

[**MessageObject**](MessageObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-MessageFile"></a>
# **Get-MessageFile**
> MessageFileObject Get-MessageFile<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FileId] <String><br>

Retrieves a message file.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "thread_abc123" # String | The ID of the thread to which the message and File belong.
$MessageId = "msg_abc123" # String | The ID of the message the file belongs to.
$FileId = "file-abc123" # String | The ID of the file being retrieved.

# Retrieves a message file.
try {
    $Result = Get-MessageFile -ThreadId $ThreadId -MessageId $MessageId -FileId $FileId
} catch {
    Write-Host ("Exception occurred when calling Get-MessageFile: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to which the message and File belong. | 
 **MessageId** | **String**| The ID of the message the file belongs to. | 
 **FileId** | **String**| The ID of the file being retrieved. | 

### Return type

[**MessageFileObject**](MessageFileObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Run"></a>
# **Get-Run**
> RunObject Get-Run<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RunId] <String><br>

Retrieves a run.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the [thread](/docs/api-reference/threads) that was run.
$RunId = "MyRunId" # String | The ID of the run to retrieve.

# Retrieves a run.
try {
    $Result = Get-Run -ThreadId $ThreadId -RunId $RunId
} catch {
    Write-Host ("Exception occurred when calling Get-Run: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **RunId** | **String**| The ID of the run to retrieve. | 

### Return type

[**RunObject**](RunObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-RunStep"></a>
# **Get-RunStep**
> RunStepObject Get-RunStep<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RunId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StepId] <String><br>

Retrieves a run step.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread to which the run and run step belongs.
$RunId = "MyRunId" # String | The ID of the run to which the run step belongs.
$StepId = "MyStepId" # String | The ID of the run step to retrieve.

# Retrieves a run step.
try {
    $Result = Get-RunStep -ThreadId $ThreadId -RunId $RunId -StepId $StepId
} catch {
    Write-Host ("Exception occurred when calling Get-RunStep: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to which the run and run step belongs. | 
 **RunId** | **String**| The ID of the run to which the run step belongs. | 
 **StepId** | **String**| The ID of the run step to retrieve. | 

### Return type

[**RunStepObject**](RunStepObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Thread"></a>
# **Get-Thread**
> ThreadObject Get-Thread<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>

Retrieves a thread.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread to retrieve.

# Retrieves a thread.
try {
    $Result = Get-Thread -ThreadId $ThreadId
} catch {
    Write-Host ("Exception occurred when calling Get-Thread: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to retrieve. | 

### Return type

[**ThreadObject**](ThreadObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListAssistantFiles"></a>
# **Invoke-ListAssistantFiles**
> ListAssistantFilesResponse Invoke-ListAssistantFiles<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssistantId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

Returns a list of assistant files.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AssistantId = "MyAssistantId" # String | The ID of the assistant the file belongs to.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# Returns a list of assistant files.
try {
    $Result = Invoke-ListAssistantFiles -AssistantId $AssistantId -Limit $Limit -Order $Order -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListAssistantFiles: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssistantId** | **String**| The ID of the assistant the file belongs to. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAssistantFilesResponse**](ListAssistantFilesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListAssistants"></a>
# **Invoke-ListAssistants**
> ListAssistantsResponse Invoke-ListAssistants<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

Returns a list of assistants.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# Returns a list of assistants.
try {
    $Result = Invoke-ListAssistants -Limit $Limit -Order $Order -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListAssistants: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListAssistantsResponse**](ListAssistantsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListMessageFiles"></a>
# **Invoke-ListMessageFiles**
> ListMessageFilesResponse Invoke-ListMessageFiles<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

Returns a list of message files.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread that the message and files belong to.
$MessageId = "MyMessageId" # String | The ID of the message that the files belongs to.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# Returns a list of message files.
try {
    $Result = Invoke-ListMessageFiles -ThreadId $ThreadId -MessageId $MessageId -Limit $Limit -Order $Order -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListMessageFiles: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread that the message and files belong to. | 
 **MessageId** | **String**| The ID of the message that the files belongs to. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListMessageFilesResponse**](ListMessageFilesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListMessages"></a>
# **Invoke-ListMessages**
> ListMessagesResponse Invoke-ListMessages<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RunId] <String><br>

Returns a list of messages for a given thread.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
$RunId = "MyRunId" # String | Filter messages by the run ID that generated them.  (optional)

# Returns a list of messages for a given thread.
try {
    $Result = Invoke-ListMessages -ThreadId $ThreadId -Limit $Limit -Order $Order -After $After -Before $Before -RunId $RunId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListMessages: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **RunId** | **String**| Filter messages by the run ID that generated them.  | [optional] 

### Return type

[**ListMessagesResponse**](ListMessagesResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListRunSteps"></a>
# **Invoke-ListRunSteps**
> ListRunStepsResponse Invoke-ListRunSteps<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RunId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

Returns a list of run steps belonging to a run.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread the run and run steps belong to.
$RunId = "MyRunId" # String | The ID of the run the run steps belong to.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# Returns a list of run steps belonging to a run.
try {
    $Result = Invoke-ListRunSteps -ThreadId $ThreadId -RunId $RunId -Limit $Limit -Order $Order -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListRunSteps: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread the run and run steps belong to. | 
 **RunId** | **String**| The ID of the run the run steps belong to. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListRunStepsResponse**](ListRunStepsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ListRuns"></a>
# **Invoke-ListRuns**
> ListRunsResponse Invoke-ListRuns<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-After] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Before] <String><br>

Returns a list of runs belonging to a thread.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread the run belongs to.
$Limit = 56 # Int32 | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
$Order = "asc" # String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to "desc")
$After = "MyAfter" # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
$Before = "MyBefore" # String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

# Returns a list of runs belonging to a thread.
try {
    $Result = Invoke-ListRuns -ThreadId $ThreadId -Limit $Limit -Order $Order -After $After -Before $Before
} catch {
    Write-Host ("Exception occurred when calling Invoke-ListRuns: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread the run belongs to. | 
 **Limit** | **Int32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **Order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &quot;desc&quot;]
 **After** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **Before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListRunsResponse**](ListRunsResponse.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-Assistant"></a>
# **Edit-Assistant**
> AssistantObject Edit-Assistant<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssistantId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ModifyAssistantRequest] <PSCustomObject><br>

Modifies an assistant.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$AssistantId = "MyAssistantId" # String | The ID of the assistant to modify.
$FunctionObject = Initialize-FunctionObject -Description "MyDescription" -Name "MyName" -Parameters @{ key_example =  }
$AssistantObjectToolsInner = Initialize-AssistantObjectToolsInner -Type "code_interpreter" -VarFunction $FunctionObject

$ModifyAssistantRequest = Initialize-ModifyAssistantRequest -Model "MyModel" -Name "MyName" -Description "MyDescription" -Instructions "MyInstructions" -Tools $AssistantObjectToolsInner -FileIds "MyFileIds" -Metadata # ModifyAssistantRequest | 

# Modifies an assistant.
try {
    $Result = Edit-Assistant -AssistantId $AssistantId -ModifyAssistantRequest $ModifyAssistantRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-Assistant: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssistantId** | **String**| The ID of the assistant to modify. | 
 **ModifyAssistantRequest** | [**ModifyAssistantRequest**](ModifyAssistantRequest.md)|  | 

### Return type

[**AssistantObject**](AssistantObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-Message"></a>
# **Edit-Message**
> MessageObject Edit-Message<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MessageId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ModifyMessageRequest] <PSCustomObject><br>

Modifies a message.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread to which this message belongs.
$MessageId = "MyMessageId" # String | The ID of the message to modify.
$ModifyMessageRequest = Initialize-ModifyMessageRequest -Metadata # ModifyMessageRequest | 

# Modifies a message.
try {
    $Result = Edit-Message -ThreadId $ThreadId -MessageId $MessageId -ModifyMessageRequest $ModifyMessageRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-Message: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to which this message belongs. | 
 **MessageId** | **String**| The ID of the message to modify. | 
 **ModifyMessageRequest** | [**ModifyMessageRequest**](ModifyMessageRequest.md)|  | 

### Return type

[**MessageObject**](MessageObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-Run"></a>
# **Edit-Run**
> RunObject Edit-Run<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RunId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ModifyRunRequest] <PSCustomObject><br>

Modifies a run.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the [thread](/docs/api-reference/threads) that was run.
$RunId = "MyRunId" # String | The ID of the run to modify.
$ModifyRunRequest = Initialize-ModifyRunRequest -Metadata # ModifyRunRequest | 

# Modifies a run.
try {
    $Result = Edit-Run -ThreadId $ThreadId -RunId $RunId -ModifyRunRequest $ModifyRunRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-Run: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **RunId** | **String**| The ID of the run to modify. | 
 **ModifyRunRequest** | [**ModifyRunRequest**](ModifyRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Edit-Thread"></a>
# **Edit-Thread**
> ThreadObject Edit-Thread<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ModifyThreadRequest] <PSCustomObject><br>

Modifies a thread.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the thread to modify. Only the `metadata` can be modified.
$ModifyThreadRequest = Initialize-ModifyThreadRequest -Metadata # ModifyThreadRequest | 

# Modifies a thread.
try {
    $Result = Edit-Thread -ThreadId $ThreadId -ModifyThreadRequest $ModifyThreadRequest
} catch {
    Write-Host ("Exception occurred when calling Edit-Thread: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | 
 **ModifyThreadRequest** | [**ModifyThreadRequest**](ModifyThreadRequest.md)|  | 

### Return type

[**ThreadObject**](ThreadObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Submit-ToolOuputsToRun"></a>
# **Submit-ToolOuputsToRun**
> RunObject Submit-ToolOuputsToRun<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ThreadId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-RunId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SubmitToolOutputsRunRequest] <PSCustomObject><br>

When a run has the `status: ""requires_action""` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration

$ThreadId = "MyThreadId" # String | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
$RunId = "MyRunId" # String | The ID of the run that requires the tool output submission.
$SubmitToolOutputsRunRequestToolOutputsInner = Initialize-SubmitToolOutputsRunRequestToolOutputsInner -ToolCallId "MyToolCallId" -Output "MyOutput"
$SubmitToolOutputsRunRequest = Initialize-SubmitToolOutputsRunRequest -ToolOutputs $SubmitToolOutputsRunRequestToolOutputsInner -Stream $false # SubmitToolOutputsRunRequest | 

# When a run has the `status: ""requires_action""` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
try {
    $Result = Submit-ToolOuputsToRun -ThreadId $ThreadId -RunId $RunId -SubmitToolOutputsRunRequest $SubmitToolOutputsRunRequest
} catch {
    Write-Host ("Exception occurred when calling Submit-ToolOuputsToRun: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ThreadId** | **String**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
 **RunId** | **String**| The ID of the run that requires the tool output submission. | 
 **SubmitToolOutputsRunRequest** | [**SubmitToolOutputsRunRequest**](SubmitToolOutputsRunRequest.md)|  | 

### Return type

[**RunObject**](RunObject.md) (PSCustomObject)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

