# OAIAssistantsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](OAIAssistantsApi.md#cancelrun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**createAssistant**](OAIAssistantsApi.md#createassistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**createMessage**](OAIAssistantsApi.md#createmessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**createRun**](OAIAssistantsApi.md#createrun) | **POST** /threads/{thread_id}/runs | Create a run.
[**createThread**](OAIAssistantsApi.md#createthread) | **POST** /threads | Create a thread.
[**createThreadAndRun**](OAIAssistantsApi.md#createthreadandrun) | **POST** /threads/runs | Create a thread and run it in one request.
[**deleteAssistant**](OAIAssistantsApi.md#deleteassistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**deleteMessage**](OAIAssistantsApi.md#deletemessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**deleteThread**](OAIAssistantsApi.md#deletethread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**getAssistant**](OAIAssistantsApi.md#getassistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**getMessage**](OAIAssistantsApi.md#getmessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**getRun**](OAIAssistantsApi.md#getrun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**getRunStep**](OAIAssistantsApi.md#getrunstep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**getThread**](OAIAssistantsApi.md#getthread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**listAssistants**](OAIAssistantsApi.md#listassistants) | **GET** /assistants | Returns a list of assistants.
[**listMessages**](OAIAssistantsApi.md#listmessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**listRunSteps**](OAIAssistantsApi.md#listrunsteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**listRuns**](OAIAssistantsApi.md#listruns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**modifyAssistant**](OAIAssistantsApi.md#modifyassistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**modifyMessage**](OAIAssistantsApi.md#modifymessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modifyRun**](OAIAssistantsApi.md#modifyrun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modifyThread**](OAIAssistantsApi.md#modifythread) | **POST** /threads/{thread_id} | Modifies a thread.
[**submitToolOuputsToRun**](OAIAssistantsApi.md#submittoolouputstorun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 


# **cancelRun**
```objc
-(NSURLSessionTask*) cancelRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
        completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;
```

Cancels a run that is `in_progress`.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to which this run belongs.
NSString* runId = @"runId_example"; // The ID of the run to cancel.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Cancels a run that is `in_progress`.
[apiInstance cancelRunWithThreadId:threadId
              runId:runId
          completionHandler: ^(OAIRunObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->cancelRun: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to which this run belongs. | 
 **runId** | **NSString***| The ID of the run to cancel. | 

### Return type

[**OAIRunObject***](OAIRunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createAssistant**
```objc
-(NSURLSessionTask*) createAssistantWithCreateAssistantRequest: (OAICreateAssistantRequest*) createAssistantRequest
        completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler;
```

Create an assistant with a model and instructions.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateAssistantRequest* createAssistantRequest = [[OAICreateAssistantRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Create an assistant with a model and instructions.
[apiInstance createAssistantWithCreateAssistantRequest:createAssistantRequest
          completionHandler: ^(OAIAssistantObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->createAssistant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAssistantRequest** | [**OAICreateAssistantRequest***](OAICreateAssistantRequest.md)|  | 

### Return type

[**OAIAssistantObject***](OAIAssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createMessage**
```objc
-(NSURLSessionTask*) createMessageWithThreadId: (NSString*) threadId
    createMessageRequest: (OAICreateMessageRequest*) createMessageRequest
        completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler;
```

Create a message.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the [thread](/docs/api-reference/threads) to create a message for.
OAICreateMessageRequest* createMessageRequest = [[OAICreateMessageRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Create a message.
[apiInstance createMessageWithThreadId:threadId
              createMessageRequest:createMessageRequest
          completionHandler: ^(OAIMessageObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->createMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the [thread](/docs/api-reference/threads) to create a message for. | 
 **createMessageRequest** | [**OAICreateMessageRequest***](OAICreateMessageRequest.md)|  | 

### Return type

[**OAIMessageObject***](OAIMessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createRun**
```objc
-(NSURLSessionTask*) createRunWithThreadId: (NSString*) threadId
    createRunRequest: (OAICreateRunRequest*) createRunRequest
    include: (NSArray<NSString*>*) include
        completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;
```

Create a run.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to run.
OAICreateRunRequest* createRunRequest = [[OAICreateRunRequest alloc] init]; // 
NSArray<NSString*>* include = @[@"include_example"]; // A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Create a run.
[apiInstance createRunWithThreadId:threadId
              createRunRequest:createRunRequest
              include:include
          completionHandler: ^(OAIRunObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->createRun: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to run. | 
 **createRunRequest** | [**OAICreateRunRequest***](OAICreateRunRequest.md)|  | 
 **include** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**OAIRunObject***](OAIRunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createThread**
```objc
-(NSURLSessionTask*) createThreadWithCreateThreadRequest: (OAICreateThreadRequest*) createThreadRequest
        completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler;
```

Create a thread.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateThreadRequest* createThreadRequest = [[OAICreateThreadRequest alloc] init]; //  (optional)

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Create a thread.
[apiInstance createThreadWithCreateThreadRequest:createThreadRequest
          completionHandler: ^(OAIThreadObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->createThread: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadRequest** | [**OAICreateThreadRequest***](OAICreateThreadRequest.md)|  | [optional] 

### Return type

[**OAIThreadObject***](OAIThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createThreadAndRun**
```objc
-(NSURLSessionTask*) createThreadAndRunWithCreateThreadAndRunRequest: (OAICreateThreadAndRunRequest*) createThreadAndRunRequest
        completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;
```

Create a thread and run it in one request.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateThreadAndRunRequest* createThreadAndRunRequest = [[OAICreateThreadAndRunRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Create a thread and run it in one request.
[apiInstance createThreadAndRunWithCreateThreadAndRunRequest:createThreadAndRunRequest
          completionHandler: ^(OAIRunObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->createThreadAndRun: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadAndRunRequest** | [**OAICreateThreadAndRunRequest***](OAICreateThreadAndRunRequest.md)|  | 

### Return type

[**OAIRunObject***](OAIRunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteAssistant**
```objc
-(NSURLSessionTask*) deleteAssistantWithAssistantId: (NSString*) assistantId
        completionHandler: (void (^)(OAIDeleteAssistantResponse* output, NSError* error)) handler;
```

Delete an assistant.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* assistantId = @"assistantId_example"; // The ID of the assistant to delete.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Delete an assistant.
[apiInstance deleteAssistantWithAssistantId:assistantId
          completionHandler: ^(OAIDeleteAssistantResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->deleteAssistant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **NSString***| The ID of the assistant to delete. | 

### Return type

[**OAIDeleteAssistantResponse***](OAIDeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteMessage**
```objc
-(NSURLSessionTask*) deleteMessageWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
        completionHandler: (void (^)(OAIDeleteMessageResponse* output, NSError* error)) handler;
```

Deletes a message.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to which this message belongs.
NSString* messageId = @"messageId_example"; // The ID of the message to delete.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Deletes a message.
[apiInstance deleteMessageWithThreadId:threadId
              messageId:messageId
          completionHandler: ^(OAIDeleteMessageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->deleteMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to which this message belongs. | 
 **messageId** | **NSString***| The ID of the message to delete. | 

### Return type

[**OAIDeleteMessageResponse***](OAIDeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteThread**
```objc
-(NSURLSessionTask*) deleteThreadWithThreadId: (NSString*) threadId
        completionHandler: (void (^)(OAIDeleteThreadResponse* output, NSError* error)) handler;
```

Delete a thread.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to delete.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Delete a thread.
[apiInstance deleteThreadWithThreadId:threadId
          completionHandler: ^(OAIDeleteThreadResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->deleteThread: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to delete. | 

### Return type

[**OAIDeleteThreadResponse***](OAIDeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssistant**
```objc
-(NSURLSessionTask*) getAssistantWithAssistantId: (NSString*) assistantId
        completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler;
```

Retrieves an assistant.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* assistantId = @"assistantId_example"; // The ID of the assistant to retrieve.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Retrieves an assistant.
[apiInstance getAssistantWithAssistantId:assistantId
          completionHandler: ^(OAIAssistantObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->getAssistant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **NSString***| The ID of the assistant to retrieve. | 

### Return type

[**OAIAssistantObject***](OAIAssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getMessage**
```objc
-(NSURLSessionTask*) getMessageWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
        completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler;
```

Retrieve a message.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
NSString* messageId = @"messageId_example"; // The ID of the message to retrieve.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Retrieve a message.
[apiInstance getMessageWithThreadId:threadId
              messageId:messageId
          completionHandler: ^(OAIMessageObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->getMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | 
 **messageId** | **NSString***| The ID of the message to retrieve. | 

### Return type

[**OAIMessageObject***](OAIMessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRun**
```objc
-(NSURLSessionTask*) getRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
        completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;
```

Retrieves a run.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the [thread](/docs/api-reference/threads) that was run.
NSString* runId = @"runId_example"; // The ID of the run to retrieve.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Retrieves a run.
[apiInstance getRunWithThreadId:threadId
              runId:runId
          completionHandler: ^(OAIRunObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->getRun: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **runId** | **NSString***| The ID of the run to retrieve. | 

### Return type

[**OAIRunObject***](OAIRunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRunStep**
```objc
-(NSURLSessionTask*) getRunStepWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    stepId: (NSString*) stepId
    include: (NSArray<NSString*>*) include
        completionHandler: (void (^)(OAIRunStepObject* output, NSError* error)) handler;
```

Retrieves a run step.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to which the run and run step belongs.
NSString* runId = @"runId_example"; // The ID of the run to which the run step belongs.
NSString* stepId = @"stepId_example"; // The ID of the run step to retrieve.
NSArray<NSString*>* include = @[@"include_example"]; // A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Retrieves a run step.
[apiInstance getRunStepWithThreadId:threadId
              runId:runId
              stepId:stepId
              include:include
          completionHandler: ^(OAIRunStepObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->getRunStep: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to which the run and run step belongs. | 
 **runId** | **NSString***| The ID of the run to which the run step belongs. | 
 **stepId** | **NSString***| The ID of the run step to retrieve. | 
 **include** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**OAIRunStepObject***](OAIRunStepObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getThread**
```objc
-(NSURLSessionTask*) getThreadWithThreadId: (NSString*) threadId
        completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler;
```

Retrieves a thread.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to retrieve.

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Retrieves a thread.
[apiInstance getThreadWithThreadId:threadId
          completionHandler: ^(OAIThreadObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->getThread: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to retrieve. | 

### Return type

[**OAIThreadObject***](OAIThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listAssistants**
```objc
-(NSURLSessionTask*) listAssistantsWithLimit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
        completionHandler: (void (^)(OAIListAssistantsResponse* output, NSError* error)) handler;
```

Returns a list of assistants.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Returns a list of assistants.
[apiInstance listAssistantsWithLimit:limit
              order:order
              after:after
              before:before
          completionHandler: ^(OAIListAssistantsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->listAssistants: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**OAIListAssistantsResponse***](OAIListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listMessages**
```objc
-(NSURLSessionTask*) listMessagesWithThreadId: (NSString*) threadId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    runId: (NSString*) runId
        completionHandler: (void (^)(OAIListMessagesResponse* output, NSError* error)) handler;
```

Returns a list of messages for a given thread.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the [thread](/docs/api-reference/threads) the messages belong to.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
NSString* runId = @"runId_example"; // Filter messages by the run ID that generated them.  (optional)

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Returns a list of messages for a given thread.
[apiInstance listMessagesWithThreadId:threadId
              limit:limit
              order:order
              after:after
              before:before
              runId:runId
          completionHandler: ^(OAIListMessagesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->listMessages: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **runId** | **NSString***| Filter messages by the run ID that generated them.  | [optional] 

### Return type

[**OAIListMessagesResponse***](OAIListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRunSteps**
```objc
-(NSURLSessionTask*) listRunStepsWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    include: (NSArray<NSString*>*) include
        completionHandler: (void (^)(OAIListRunStepsResponse* output, NSError* error)) handler;
```

Returns a list of run steps belonging to a run.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread the run and run steps belong to.
NSString* runId = @"runId_example"; // The ID of the run the run steps belong to.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
NSArray<NSString*>* include = @[@"include_example"]; // A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Returns a list of run steps belonging to a run.
[apiInstance listRunStepsWithThreadId:threadId
              runId:runId
              limit:limit
              order:order
              after:after
              before:before
              include:include
          completionHandler: ^(OAIListRunStepsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->listRunSteps: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread the run and run steps belong to. | 
 **runId** | **NSString***| The ID of the run the run steps belong to. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **include** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  | [optional] 

### Return type

[**OAIListRunStepsResponse***](OAIListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listRuns**
```objc
-(NSURLSessionTask*) listRunsWithThreadId: (NSString*) threadId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
        completionHandler: (void (^)(OAIListRunsResponse* output, NSError* error)) handler;
```

Returns a list of runs belonging to a thread.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread the run belongs to.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Returns a list of runs belonging to a thread.
[apiInstance listRunsWithThreadId:threadId
              limit:limit
              order:order
              after:after
              before:before
          completionHandler: ^(OAIListRunsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->listRuns: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread the run belongs to. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**OAIListRunsResponse***](OAIListRunsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyAssistant**
```objc
-(NSURLSessionTask*) modifyAssistantWithAssistantId: (NSString*) assistantId
    modifyAssistantRequest: (OAIModifyAssistantRequest*) modifyAssistantRequest
        completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler;
```

Modifies an assistant.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* assistantId = @"assistantId_example"; // The ID of the assistant to modify.
OAIModifyAssistantRequest* modifyAssistantRequest = [[OAIModifyAssistantRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Modifies an assistant.
[apiInstance modifyAssistantWithAssistantId:assistantId
              modifyAssistantRequest:modifyAssistantRequest
          completionHandler: ^(OAIAssistantObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->modifyAssistant: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **NSString***| The ID of the assistant to modify. | 
 **modifyAssistantRequest** | [**OAIModifyAssistantRequest***](OAIModifyAssistantRequest.md)|  | 

### Return type

[**OAIAssistantObject***](OAIAssistantObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyMessage**
```objc
-(NSURLSessionTask*) modifyMessageWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    modifyMessageRequest: (OAIModifyMessageRequest*) modifyMessageRequest
        completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler;
```

Modifies a message.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to which this message belongs.
NSString* messageId = @"messageId_example"; // The ID of the message to modify.
OAIModifyMessageRequest* modifyMessageRequest = [[OAIModifyMessageRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Modifies a message.
[apiInstance modifyMessageWithThreadId:threadId
              messageId:messageId
              modifyMessageRequest:modifyMessageRequest
          completionHandler: ^(OAIMessageObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->modifyMessage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to which this message belongs. | 
 **messageId** | **NSString***| The ID of the message to modify. | 
 **modifyMessageRequest** | [**OAIModifyMessageRequest***](OAIModifyMessageRequest.md)|  | 

### Return type

[**OAIMessageObject***](OAIMessageObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyRun**
```objc
-(NSURLSessionTask*) modifyRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    modifyRunRequest: (OAIModifyRunRequest*) modifyRunRequest
        completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;
```

Modifies a run.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the [thread](/docs/api-reference/threads) that was run.
NSString* runId = @"runId_example"; // The ID of the run to modify.
OAIModifyRunRequest* modifyRunRequest = [[OAIModifyRunRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Modifies a run.
[apiInstance modifyRunWithThreadId:threadId
              runId:runId
              modifyRunRequest:modifyRunRequest
          completionHandler: ^(OAIRunObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->modifyRun: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the [thread](/docs/api-reference/threads) that was run. | 
 **runId** | **NSString***| The ID of the run to modify. | 
 **modifyRunRequest** | [**OAIModifyRunRequest***](OAIModifyRunRequest.md)|  | 

### Return type

[**OAIRunObject***](OAIRunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyThread**
```objc
-(NSURLSessionTask*) modifyThreadWithThreadId: (NSString*) threadId
    modifyThreadRequest: (OAIModifyThreadRequest*) modifyThreadRequest
        completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler;
```

Modifies a thread.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the thread to modify. Only the `metadata` can be modified.
OAIModifyThreadRequest* modifyThreadRequest = [[OAIModifyThreadRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// Modifies a thread.
[apiInstance modifyThreadWithThreadId:threadId
              modifyThreadRequest:modifyThreadRequest
          completionHandler: ^(OAIThreadObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->modifyThread: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | 
 **modifyThreadRequest** | [**OAIModifyThreadRequest***](OAIModifyThreadRequest.md)|  | 

### Return type

[**OAIThreadObject***](OAIThreadObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submitToolOuputsToRun**
```objc
-(NSURLSessionTask*) submitToolOuputsToRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    submitToolOutputsRunRequest: (OAISubmitToolOutputsRunRequest*) submitToolOutputsRunRequest
        completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler;
```

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* threadId = @"threadId_example"; // The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
NSString* runId = @"runId_example"; // The ID of the run that requires the tool output submission.
OAISubmitToolOutputsRunRequest* submitToolOutputsRunRequest = [[OAISubmitToolOutputsRunRequest alloc] init]; // 

OAIAssistantsApi*apiInstance = [[OAIAssistantsApi alloc] init];

// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
[apiInstance submitToolOuputsToRunWithThreadId:threadId
              runId:runId
              submitToolOutputsRunRequest:submitToolOutputsRunRequest
          completionHandler: ^(OAIRunObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssistantsApi->submitToolOuputsToRun: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **NSString***| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | 
 **runId** | **NSString***| The ID of the run that requires the tool output submission. | 
 **submitToolOutputsRunRequest** | [**OAISubmitToolOutputsRunRequest***](OAISubmitToolOutputsRunRequest.md)|  | 

### Return type

[**OAIRunObject***](OAIRunObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

