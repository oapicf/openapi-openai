# OpenAPI\Client\AssistantsApi

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelRun()**](AssistantsApi.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;. |
| [**createAssistant()**](AssistantsApi.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions. |
| [**createAssistantFile()**](AssistantsApi.md#createAssistantFile) | **POST** /assistants/{assistant_id}/files | Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants). |
| [**createMessage()**](AssistantsApi.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message. |
| [**createRun()**](AssistantsApi.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run. |
| [**createThread()**](AssistantsApi.md#createThread) | **POST** /threads | Create a thread. |
| [**createThreadAndRun()**](AssistantsApi.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request. |
| [**deleteAssistant()**](AssistantsApi.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant. |
| [**deleteAssistantFile()**](AssistantsApi.md#deleteAssistantFile) | **DELETE** /assistants/{assistant_id}/files/{file_id} | Delete an assistant file. |
| [**deleteThread()**](AssistantsApi.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread. |
| [**getAssistant()**](AssistantsApi.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant. |
| [**getAssistantFile()**](AssistantsApi.md#getAssistantFile) | **GET** /assistants/{assistant_id}/files/{file_id} | Retrieves an AssistantFile. |
| [**getMessage()**](AssistantsApi.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message. |
| [**getMessageFile()**](AssistantsApi.md#getMessageFile) | **GET** /threads/{thread_id}/messages/{message_id}/files/{file_id} | Retrieves a message file. |
| [**getRun()**](AssistantsApi.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run. |
| [**getRunStep()**](AssistantsApi.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step. |
| [**getThread()**](AssistantsApi.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread. |
| [**listAssistantFiles()**](AssistantsApi.md#listAssistantFiles) | **GET** /assistants/{assistant_id}/files | Returns a list of assistant files. |
| [**listAssistants()**](AssistantsApi.md#listAssistants) | **GET** /assistants | Returns a list of assistants. |
| [**listMessageFiles()**](AssistantsApi.md#listMessageFiles) | **GET** /threads/{thread_id}/messages/{message_id}/files | Returns a list of message files. |
| [**listMessages()**](AssistantsApi.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread. |
| [**listRunSteps()**](AssistantsApi.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run. |
| [**listRuns()**](AssistantsApi.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread. |
| [**modifyAssistant()**](AssistantsApi.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant. |
| [**modifyMessage()**](AssistantsApi.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message. |
| [**modifyRun()**](AssistantsApi.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run. |
| [**modifyThread()**](AssistantsApi.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread. |
| [**submitToolOuputsToRun()**](AssistantsApi.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. |


## `cancelRun()`

```php
cancelRun($thread_id, $run_id): \OpenAPI\Client\Model\RunObject
```

Cancels a run that is `in_progress`.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to which this run belongs.
$run_id = 'run_id_example'; // string | The ID of the run to cancel.

try {
    $result = $apiInstance->cancelRun($thread_id, $run_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->cancelRun: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to which this run belongs. | |
| **run_id** | **string**| The ID of the run to cancel. | |

### Return type

[**\OpenAPI\Client\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createAssistant()`

```php
createAssistant($create_assistant_request): \OpenAPI\Client\Model\AssistantObject
```

Create an assistant with a model and instructions.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_assistant_request = new \OpenAPI\Client\Model\CreateAssistantRequest(); // \OpenAPI\Client\Model\CreateAssistantRequest

try {
    $result = $apiInstance->createAssistant($create_assistant_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->createAssistant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_assistant_request** | [**\OpenAPI\Client\Model\CreateAssistantRequest**](../Model/CreateAssistantRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AssistantObject**](../Model/AssistantObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createAssistantFile()`

```php
createAssistantFile($assistant_id, $create_assistant_file_request): \OpenAPI\Client\Model\AssistantFileObject
```

Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$assistant_id = file-abc123; // string | The ID of the assistant for which to create a File.
$create_assistant_file_request = new \OpenAPI\Client\Model\CreateAssistantFileRequest(); // \OpenAPI\Client\Model\CreateAssistantFileRequest

try {
    $result = $apiInstance->createAssistantFile($assistant_id, $create_assistant_file_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->createAssistantFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistant_id** | **string**| The ID of the assistant for which to create a File. | |
| **create_assistant_file_request** | [**\OpenAPI\Client\Model\CreateAssistantFileRequest**](../Model/CreateAssistantFileRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AssistantFileObject**](../Model/AssistantFileObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createMessage()`

```php
createMessage($thread_id, $create_message_request): \OpenAPI\Client\Model\MessageObject
```

Create a message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the [thread](/docs/api-reference/threads) to create a message for.
$create_message_request = new \OpenAPI\Client\Model\CreateMessageRequest(); // \OpenAPI\Client\Model\CreateMessageRequest

try {
    $result = $apiInstance->createMessage($thread_id, $create_message_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->createMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the [thread](/docs/api-reference/threads) to create a message for. | |
| **create_message_request** | [**\OpenAPI\Client\Model\CreateMessageRequest**](../Model/CreateMessageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\MessageObject**](../Model/MessageObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createRun()`

```php
createRun($thread_id, $create_run_request): \OpenAPI\Client\Model\RunObject
```

Create a run.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to run.
$create_run_request = new \OpenAPI\Client\Model\CreateRunRequest(); // \OpenAPI\Client\Model\CreateRunRequest

try {
    $result = $apiInstance->createRun($thread_id, $create_run_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->createRun: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to run. | |
| **create_run_request** | [**\OpenAPI\Client\Model\CreateRunRequest**](../Model/CreateRunRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createThread()`

```php
createThread($create_thread_request): \OpenAPI\Client\Model\ThreadObject
```

Create a thread.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_thread_request = new \OpenAPI\Client\Model\CreateThreadRequest(); // \OpenAPI\Client\Model\CreateThreadRequest

try {
    $result = $apiInstance->createThread($create_thread_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->createThread: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_thread_request** | [**\OpenAPI\Client\Model\CreateThreadRequest**](../Model/CreateThreadRequest.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\ThreadObject**](../Model/ThreadObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createThreadAndRun()`

```php
createThreadAndRun($create_thread_and_run_request): \OpenAPI\Client\Model\RunObject
```

Create a thread and run it in one request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_thread_and_run_request = new \OpenAPI\Client\Model\CreateThreadAndRunRequest(); // \OpenAPI\Client\Model\CreateThreadAndRunRequest

try {
    $result = $apiInstance->createThreadAndRun($create_thread_and_run_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->createThreadAndRun: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_thread_and_run_request** | [**\OpenAPI\Client\Model\CreateThreadAndRunRequest**](../Model/CreateThreadAndRunRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteAssistant()`

```php
deleteAssistant($assistant_id): \OpenAPI\Client\Model\DeleteAssistantResponse
```

Delete an assistant.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$assistant_id = 'assistant_id_example'; // string | The ID of the assistant to delete.

try {
    $result = $apiInstance->deleteAssistant($assistant_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->deleteAssistant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistant_id** | **string**| The ID of the assistant to delete. | |

### Return type

[**\OpenAPI\Client\Model\DeleteAssistantResponse**](../Model/DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteAssistantFile()`

```php
deleteAssistantFile($assistant_id, $file_id): \OpenAPI\Client\Model\DeleteAssistantFileResponse
```

Delete an assistant file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$assistant_id = 'assistant_id_example'; // string | The ID of the assistant that the file belongs to.
$file_id = 'file_id_example'; // string | The ID of the file to delete.

try {
    $result = $apiInstance->deleteAssistantFile($assistant_id, $file_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->deleteAssistantFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistant_id** | **string**| The ID of the assistant that the file belongs to. | |
| **file_id** | **string**| The ID of the file to delete. | |

### Return type

[**\OpenAPI\Client\Model\DeleteAssistantFileResponse**](../Model/DeleteAssistantFileResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteThread()`

```php
deleteThread($thread_id): \OpenAPI\Client\Model\DeleteThreadResponse
```

Delete a thread.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to delete.

try {
    $result = $apiInstance->deleteThread($thread_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->deleteThread: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to delete. | |

### Return type

[**\OpenAPI\Client\Model\DeleteThreadResponse**](../Model/DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getAssistant()`

```php
getAssistant($assistant_id): \OpenAPI\Client\Model\AssistantObject
```

Retrieves an assistant.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$assistant_id = 'assistant_id_example'; // string | The ID of the assistant to retrieve.

try {
    $result = $apiInstance->getAssistant($assistant_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->getAssistant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistant_id** | **string**| The ID of the assistant to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\AssistantObject**](../Model/AssistantObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getAssistantFile()`

```php
getAssistantFile($assistant_id, $file_id): \OpenAPI\Client\Model\AssistantFileObject
```

Retrieves an AssistantFile.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$assistant_id = 'assistant_id_example'; // string | The ID of the assistant who the file belongs to.
$file_id = 'file_id_example'; // string | The ID of the file we're getting.

try {
    $result = $apiInstance->getAssistantFile($assistant_id, $file_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->getAssistantFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistant_id** | **string**| The ID of the assistant who the file belongs to. | |
| **file_id** | **string**| The ID of the file we&#39;re getting. | |

### Return type

[**\OpenAPI\Client\Model\AssistantFileObject**](../Model/AssistantFileObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getMessage()`

```php
getMessage($thread_id, $message_id): \OpenAPI\Client\Model\MessageObject
```

Retrieve a message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
$message_id = 'message_id_example'; // string | The ID of the message to retrieve.

try {
    $result = $apiInstance->getMessage($thread_id, $message_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->getMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. | |
| **message_id** | **string**| The ID of the message to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\MessageObject**](../Model/MessageObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getMessageFile()`

```php
getMessageFile($thread_id, $message_id, $file_id): \OpenAPI\Client\Model\MessageFileObject
```

Retrieves a message file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = thread_abc123; // string | The ID of the thread to which the message and File belong.
$message_id = msg_abc123; // string | The ID of the message the file belongs to.
$file_id = file-abc123; // string | The ID of the file being retrieved.

try {
    $result = $apiInstance->getMessageFile($thread_id, $message_id, $file_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->getMessageFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to which the message and File belong. | |
| **message_id** | **string**| The ID of the message the file belongs to. | |
| **file_id** | **string**| The ID of the file being retrieved. | |

### Return type

[**\OpenAPI\Client\Model\MessageFileObject**](../Model/MessageFileObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getRun()`

```php
getRun($thread_id, $run_id): \OpenAPI\Client\Model\RunObject
```

Retrieves a run.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the [thread](/docs/api-reference/threads) that was run.
$run_id = 'run_id_example'; // string | The ID of the run to retrieve.

try {
    $result = $apiInstance->getRun($thread_id, $run_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->getRun: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the [thread](/docs/api-reference/threads) that was run. | |
| **run_id** | **string**| The ID of the run to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getRunStep()`

```php
getRunStep($thread_id, $run_id, $step_id): \OpenAPI\Client\Model\RunStepObject
```

Retrieves a run step.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to which the run and run step belongs.
$run_id = 'run_id_example'; // string | The ID of the run to which the run step belongs.
$step_id = 'step_id_example'; // string | The ID of the run step to retrieve.

try {
    $result = $apiInstance->getRunStep($thread_id, $run_id, $step_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->getRunStep: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to which the run and run step belongs. | |
| **run_id** | **string**| The ID of the run to which the run step belongs. | |
| **step_id** | **string**| The ID of the run step to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\RunStepObject**](../Model/RunStepObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getThread()`

```php
getThread($thread_id): \OpenAPI\Client\Model\ThreadObject
```

Retrieves a thread.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to retrieve.

try {
    $result = $apiInstance->getThread($thread_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->getThread: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\ThreadObject**](../Model/ThreadObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAssistantFiles()`

```php
listAssistantFiles($assistant_id, $limit, $order, $after, $before): \OpenAPI\Client\Model\ListAssistantFilesResponse
```

Returns a list of assistant files.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$assistant_id = 'assistant_id_example'; // string | The ID of the assistant the file belongs to.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$order = 'desc'; // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.

try {
    $result = $apiInstance->listAssistantFiles($assistant_id, $limit, $order, $after, $before);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->listAssistantFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistant_id** | **string**| The ID of the assistant the file belongs to. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListAssistantFilesResponse**](../Model/ListAssistantFilesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listAssistants()`

```php
listAssistants($limit, $order, $after, $before): \OpenAPI\Client\Model\ListAssistantsResponse
```

Returns a list of assistants.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$order = 'desc'; // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.

try {
    $result = $apiInstance->listAssistants($limit, $order, $after, $before);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->listAssistants: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListAssistantsResponse**](../Model/ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listMessageFiles()`

```php
listMessageFiles($thread_id, $message_id, $limit, $order, $after, $before): \OpenAPI\Client\Model\ListMessageFilesResponse
```

Returns a list of message files.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread that the message and files belong to.
$message_id = 'message_id_example'; // string | The ID of the message that the files belongs to.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$order = 'desc'; // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.

try {
    $result = $apiInstance->listMessageFiles($thread_id, $message_id, $limit, $order, $after, $before);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->listMessageFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread that the message and files belong to. | |
| **message_id** | **string**| The ID of the message that the files belongs to. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListMessageFilesResponse**](../Model/ListMessageFilesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listMessages()`

```php
listMessages($thread_id, $limit, $order, $after, $before, $run_id): \OpenAPI\Client\Model\ListMessagesResponse
```

Returns a list of messages for a given thread.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the [thread](/docs/api-reference/threads) the messages belong to.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$order = 'desc'; // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.
$run_id = 'run_id_example'; // string | Filter messages by the run ID that generated them.

try {
    $result = $apiInstance->listMessages($thread_id, $limit, $order, $after, $before, $run_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->listMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |
| **run_id** | **string**| Filter messages by the run ID that generated them. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListMessagesResponse**](../Model/ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listRunSteps()`

```php
listRunSteps($thread_id, $run_id, $limit, $order, $after, $before): \OpenAPI\Client\Model\ListRunStepsResponse
```

Returns a list of run steps belonging to a run.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread the run and run steps belong to.
$run_id = 'run_id_example'; // string | The ID of the run the run steps belong to.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$order = 'desc'; // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.

try {
    $result = $apiInstance->listRunSteps($thread_id, $run_id, $limit, $order, $after, $before);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->listRunSteps: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread the run and run steps belong to. | |
| **run_id** | **string**| The ID of the run the run steps belong to. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListRunStepsResponse**](../Model/ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listRuns()`

```php
listRuns($thread_id, $limit, $order, $after, $before): \OpenAPI\Client\Model\ListRunsResponse
```

Returns a list of runs belonging to a thread.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread the run belongs to.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
$order = 'desc'; // string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$before = 'before_example'; // string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.

try {
    $result = $apiInstance->listRuns($thread_id, $limit, $order, $after, $before);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->listRuns: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread the run belongs to. | |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |
| **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;] |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ListRunsResponse**](../Model/ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modifyAssistant()`

```php
modifyAssistant($assistant_id, $modify_assistant_request): \OpenAPI\Client\Model\AssistantObject
```

Modifies an assistant.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$assistant_id = 'assistant_id_example'; // string | The ID of the assistant to modify.
$modify_assistant_request = new \OpenAPI\Client\Model\ModifyAssistantRequest(); // \OpenAPI\Client\Model\ModifyAssistantRequest

try {
    $result = $apiInstance->modifyAssistant($assistant_id, $modify_assistant_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->modifyAssistant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistant_id** | **string**| The ID of the assistant to modify. | |
| **modify_assistant_request** | [**\OpenAPI\Client\Model\ModifyAssistantRequest**](../Model/ModifyAssistantRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AssistantObject**](../Model/AssistantObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modifyMessage()`

```php
modifyMessage($thread_id, $message_id, $modify_message_request): \OpenAPI\Client\Model\MessageObject
```

Modifies a message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to which this message belongs.
$message_id = 'message_id_example'; // string | The ID of the message to modify.
$modify_message_request = new \OpenAPI\Client\Model\ModifyMessageRequest(); // \OpenAPI\Client\Model\ModifyMessageRequest

try {
    $result = $apiInstance->modifyMessage($thread_id, $message_id, $modify_message_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->modifyMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to which this message belongs. | |
| **message_id** | **string**| The ID of the message to modify. | |
| **modify_message_request** | [**\OpenAPI\Client\Model\ModifyMessageRequest**](../Model/ModifyMessageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\MessageObject**](../Model/MessageObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modifyRun()`

```php
modifyRun($thread_id, $run_id, $modify_run_request): \OpenAPI\Client\Model\RunObject
```

Modifies a run.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the [thread](/docs/api-reference/threads) that was run.
$run_id = 'run_id_example'; // string | The ID of the run to modify.
$modify_run_request = new \OpenAPI\Client\Model\ModifyRunRequest(); // \OpenAPI\Client\Model\ModifyRunRequest

try {
    $result = $apiInstance->modifyRun($thread_id, $run_id, $modify_run_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->modifyRun: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the [thread](/docs/api-reference/threads) that was run. | |
| **run_id** | **string**| The ID of the run to modify. | |
| **modify_run_request** | [**\OpenAPI\Client\Model\ModifyRunRequest**](../Model/ModifyRunRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `modifyThread()`

```php
modifyThread($thread_id, $modify_thread_request): \OpenAPI\Client\Model\ThreadObject
```

Modifies a thread.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the thread to modify. Only the `metadata` can be modified.
$modify_thread_request = new \OpenAPI\Client\Model\ModifyThreadRequest(); // \OpenAPI\Client\Model\ModifyThreadRequest

try {
    $result = $apiInstance->modifyThread($thread_id, $modify_thread_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->modifyThread: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. | |
| **modify_thread_request** | [**\OpenAPI\Client\Model\ModifyThreadRequest**](../Model/ModifyThreadRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ThreadObject**](../Model/ThreadObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `submitToolOuputsToRun()`

```php
submitToolOuputsToRun($thread_id, $run_id, $submit_tool_outputs_run_request): \OpenAPI\Client\Model\RunObject
```

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AssistantsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$thread_id = 'thread_id_example'; // string | The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
$run_id = 'run_id_example'; // string | The ID of the run that requires the tool output submission.
$submit_tool_outputs_run_request = new \OpenAPI\Client\Model\SubmitToolOutputsRunRequest(); // \OpenAPI\Client\Model\SubmitToolOutputsRunRequest

try {
    $result = $apiInstance->submitToolOuputsToRun($thread_id, $run_id, $submit_tool_outputs_run_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AssistantsApi->submitToolOuputsToRun: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **thread_id** | **string**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. | |
| **run_id** | **string**| The ID of the run that requires the tool output submission. | |
| **submit_tool_outputs_run_request** | [**\OpenAPI\Client\Model\SubmitToolOutputsRunRequest**](../Model/SubmitToolOutputsRunRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
