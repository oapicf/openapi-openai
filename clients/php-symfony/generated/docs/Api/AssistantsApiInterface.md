# OpenAPI\Server\Api\AssistantsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRun**](AssistantsApiInterface.md#cancelRun) | **POST** /threads/{thread_id}/runs/{run_id}/cancel | Cancels a run that is &#x60;in_progress&#x60;.
[**createAssistant**](AssistantsApiInterface.md#createAssistant) | **POST** /assistants | Create an assistant with a model and instructions.
[**createMessage**](AssistantsApiInterface.md#createMessage) | **POST** /threads/{thread_id}/messages | Create a message.
[**createRun**](AssistantsApiInterface.md#createRun) | **POST** /threads/{thread_id}/runs | Create a run.
[**createThread**](AssistantsApiInterface.md#createThread) | **POST** /threads | Create a thread.
[**createThreadAndRun**](AssistantsApiInterface.md#createThreadAndRun) | **POST** /threads/runs | Create a thread and run it in one request.
[**deleteAssistant**](AssistantsApiInterface.md#deleteAssistant) | **DELETE** /assistants/{assistant_id} | Delete an assistant.
[**deleteMessage**](AssistantsApiInterface.md#deleteMessage) | **DELETE** /threads/{thread_id}/messages/{message_id} | Deletes a message.
[**deleteThread**](AssistantsApiInterface.md#deleteThread) | **DELETE** /threads/{thread_id} | Delete a thread.
[**getAssistant**](AssistantsApiInterface.md#getAssistant) | **GET** /assistants/{assistant_id} | Retrieves an assistant.
[**getMessage**](AssistantsApiInterface.md#getMessage) | **GET** /threads/{thread_id}/messages/{message_id} | Retrieve a message.
[**getRun**](AssistantsApiInterface.md#getRun) | **GET** /threads/{thread_id}/runs/{run_id} | Retrieves a run.
[**getRunStep**](AssistantsApiInterface.md#getRunStep) | **GET** /threads/{thread_id}/runs/{run_id}/steps/{step_id} | Retrieves a run step.
[**getThread**](AssistantsApiInterface.md#getThread) | **GET** /threads/{thread_id} | Retrieves a thread.
[**listAssistants**](AssistantsApiInterface.md#listAssistants) | **GET** /assistants | Returns a list of assistants.
[**listMessages**](AssistantsApiInterface.md#listMessages) | **GET** /threads/{thread_id}/messages | Returns a list of messages for a given thread.
[**listRunSteps**](AssistantsApiInterface.md#listRunSteps) | **GET** /threads/{thread_id}/runs/{run_id}/steps | Returns a list of run steps belonging to a run.
[**listRuns**](AssistantsApiInterface.md#listRuns) | **GET** /threads/{thread_id}/runs | Returns a list of runs belonging to a thread.
[**modifyAssistant**](AssistantsApiInterface.md#modifyAssistant) | **POST** /assistants/{assistant_id} | Modifies an assistant.
[**modifyMessage**](AssistantsApiInterface.md#modifyMessage) | **POST** /threads/{thread_id}/messages/{message_id} | Modifies a message.
[**modifyRun**](AssistantsApiInterface.md#modifyRun) | **POST** /threads/{thread_id}/runs/{run_id} | Modifies a run.
[**modifyThread**](AssistantsApiInterface.md#modifyThread) | **POST** /threads/{thread_id} | Modifies a thread.
[**submitToolOuputsToRun**](AssistantsApiInterface.md#submitToolOuputsToRun) | **POST** /threads/{thread_id}/runs/{run_id}/submit_tool_outputs | When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AssistantsApi:
        tags:
            - { name: "open_api_server.api", api: "assistants" }
    # ...
```

## **cancelRun**
> OpenAPI\Server\Model\RunObject cancelRun($threadId, $runId)

Cancels a run that is `in_progress`.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#cancelRun
     */
    public function cancelRun(string $threadId, string $runId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to which this run belongs. |
 **runId** | **string**| The ID of the run to cancel. |

### Return type

[**OpenAPI\Server\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createAssistant**
> OpenAPI\Server\Model\AssistantObject createAssistant($createAssistantRequest)

Create an assistant with a model and instructions.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#createAssistant
     */
    public function createAssistant(CreateAssistantRequest $createAssistantRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAssistantRequest** | [**OpenAPI\Server\Model\CreateAssistantRequest**](../Model/CreateAssistantRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\AssistantObject**](../Model/AssistantObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createMessage**
> OpenAPI\Server\Model\MessageObject createMessage($threadId, $createMessageRequest)

Create a message.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#createMessage
     */
    public function createMessage(string $threadId, CreateMessageRequest $createMessageRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the [thread](/docs/api-reference/threads) to create a message for. |
 **createMessageRequest** | [**OpenAPI\Server\Model\CreateMessageRequest**](../Model/CreateMessageRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\MessageObject**](../Model/MessageObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createRun**
> OpenAPI\Server\Model\RunObject createRun($threadId, $createRunRequest, $include)

Create a run.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#createRun
     */
    public function createRun(string $threadId, CreateRunRequest $createRunRequest, ?array $include, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to run. |
 **createRunRequest** | [**OpenAPI\Server\Model\CreateRunRequest**](../Model/CreateRunRequest.md)|  |
 **include** | [**string**](../Model/string.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. | [optional]

### Return type

[**OpenAPI\Server\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createThread**
> OpenAPI\Server\Model\ThreadObject createThread($createThreadRequest)

Create a thread.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#createThread
     */
    public function createThread(?CreateThreadRequest $createThreadRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadRequest** | [**OpenAPI\Server\Model\CreateThreadRequest**](../Model/CreateThreadRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\ThreadObject**](../Model/ThreadObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createThreadAndRun**
> OpenAPI\Server\Model\RunObject createThreadAndRun($createThreadAndRunRequest)

Create a thread and run it in one request.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#createThreadAndRun
     */
    public function createThreadAndRun(CreateThreadAndRunRequest $createThreadAndRunRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createThreadAndRunRequest** | [**OpenAPI\Server\Model\CreateThreadAndRunRequest**](../Model/CreateThreadAndRunRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteAssistant**
> OpenAPI\Server\Model\DeleteAssistantResponse deleteAssistant($assistantId)

Delete an assistant.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#deleteAssistant
     */
    public function deleteAssistant(string $assistantId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **string**| The ID of the assistant to delete. |

### Return type

[**OpenAPI\Server\Model\DeleteAssistantResponse**](../Model/DeleteAssistantResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteMessage**
> OpenAPI\Server\Model\DeleteMessageResponse deleteMessage($threadId, $messageId)

Deletes a message.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#deleteMessage
     */
    public function deleteMessage(string $threadId, string $messageId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to which this message belongs. |
 **messageId** | **string**| The ID of the message to delete. |

### Return type

[**OpenAPI\Server\Model\DeleteMessageResponse**](../Model/DeleteMessageResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteThread**
> OpenAPI\Server\Model\DeleteThreadResponse deleteThread($threadId)

Delete a thread.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#deleteThread
     */
    public function deleteThread(string $threadId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to delete. |

### Return type

[**OpenAPI\Server\Model\DeleteThreadResponse**](../Model/DeleteThreadResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAssistant**
> OpenAPI\Server\Model\AssistantObject getAssistant($assistantId)

Retrieves an assistant.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#getAssistant
     */
    public function getAssistant(string $assistantId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **string**| The ID of the assistant to retrieve. |

### Return type

[**OpenAPI\Server\Model\AssistantObject**](../Model/AssistantObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getMessage**
> OpenAPI\Server\Model\MessageObject getMessage($threadId, $messageId)

Retrieve a message.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#getMessage
     */
    public function getMessage(string $threadId, string $messageId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the [thread](/docs/api-reference/threads) to which this message belongs. |
 **messageId** | **string**| The ID of the message to retrieve. |

### Return type

[**OpenAPI\Server\Model\MessageObject**](../Model/MessageObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getRun**
> OpenAPI\Server\Model\RunObject getRun($threadId, $runId)

Retrieves a run.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#getRun
     */
    public function getRun(string $threadId, string $runId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the [thread](/docs/api-reference/threads) that was run. |
 **runId** | **string**| The ID of the run to retrieve. |

### Return type

[**OpenAPI\Server\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getRunStep**
> OpenAPI\Server\Model\RunStepObject getRunStep($threadId, $runId, $stepId, $include)

Retrieves a run step.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#getRunStep
     */
    public function getRunStep(string $threadId, string $runId, string $stepId, ?array $include, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to which the run and run step belongs. |
 **runId** | **string**| The ID of the run to which the run step belongs. |
 **stepId** | **string**| The ID of the run step to retrieve. |
 **include** | [**string**](../Model/string.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. | [optional]

### Return type

[**OpenAPI\Server\Model\RunStepObject**](../Model/RunStepObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getThread**
> OpenAPI\Server\Model\ThreadObject getThread($threadId)

Retrieves a thread.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#getThread
     */
    public function getThread(string $threadId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to retrieve. |

### Return type

[**OpenAPI\Server\Model\ThreadObject**](../Model/ThreadObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listAssistants**
> OpenAPI\Server\Model\ListAssistantsResponse listAssistants($limit, $order, $after, $before)

Returns a list of assistants.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#listAssistants
     */
    public function listAssistants(int $limit, string $order, ?string $after, ?string $before, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ListAssistantsResponse**](../Model/ListAssistantsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listMessages**
> OpenAPI\Server\Model\ListMessagesResponse listMessages($threadId, $limit, $order, $after, $before, $runId)

Returns a list of messages for a given thread.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#listMessages
     */
    public function listMessages(string $threadId, int $limit, string $order, ?string $after, ?string $before, ?string $runId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the [thread](/docs/api-reference/threads) the messages belong to. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]
 **runId** | **string**| Filter messages by the run ID that generated them. | [optional]

### Return type

[**OpenAPI\Server\Model\ListMessagesResponse**](../Model/ListMessagesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listRunSteps**
> OpenAPI\Server\Model\ListRunStepsResponse listRunSteps($threadId, $runId, $limit, $order, $after, $before, $include)

Returns a list of run steps belonging to a run.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#listRunSteps
     */
    public function listRunSteps(string $threadId, string $runId, int $limit, string $order, ?string $after, ?string $before, ?array $include, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread the run and run steps belong to. |
 **runId** | **string**| The ID of the run the run steps belong to. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]
 **include** | [**string**](../Model/string.md)| A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. | [optional]

### Return type

[**OpenAPI\Server\Model\ListRunStepsResponse**](../Model/ListRunStepsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listRuns**
> OpenAPI\Server\Model\ListRunsResponse listRuns($threadId, $limit, $order, $after, $before)

Returns a list of runs belonging to a thread.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#listRuns
     */
    public function listRuns(string $threadId, int $limit, string $order, ?string $after, ?string $before, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread the run belongs to. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ListRunsResponse**](../Model/ListRunsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyAssistant**
> OpenAPI\Server\Model\AssistantObject modifyAssistant($assistantId, $modifyAssistantRequest)

Modifies an assistant.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#modifyAssistant
     */
    public function modifyAssistant(string $assistantId, ModifyAssistantRequest $modifyAssistantRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assistantId** | **string**| The ID of the assistant to modify. |
 **modifyAssistantRequest** | [**OpenAPI\Server\Model\ModifyAssistantRequest**](../Model/ModifyAssistantRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\AssistantObject**](../Model/AssistantObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyMessage**
> OpenAPI\Server\Model\MessageObject modifyMessage($threadId, $messageId, $modifyMessageRequest)

Modifies a message.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#modifyMessage
     */
    public function modifyMessage(string $threadId, string $messageId, ModifyMessageRequest $modifyMessageRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to which this message belongs. |
 **messageId** | **string**| The ID of the message to modify. |
 **modifyMessageRequest** | [**OpenAPI\Server\Model\ModifyMessageRequest**](../Model/ModifyMessageRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\MessageObject**](../Model/MessageObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyRun**
> OpenAPI\Server\Model\RunObject modifyRun($threadId, $runId, $modifyRunRequest)

Modifies a run.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#modifyRun
     */
    public function modifyRun(string $threadId, string $runId, ModifyRunRequest $modifyRunRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the [thread](/docs/api-reference/threads) that was run. |
 **runId** | **string**| The ID of the run to modify. |
 **modifyRunRequest** | [**OpenAPI\Server\Model\ModifyRunRequest**](../Model/ModifyRunRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyThread**
> OpenAPI\Server\Model\ThreadObject modifyThread($threadId, $modifyThreadRequest)

Modifies a thread.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#modifyThread
     */
    public function modifyThread(string $threadId, ModifyThreadRequest $modifyThreadRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. |
 **modifyThreadRequest** | [**OpenAPI\Server\Model\ModifyThreadRequest**](../Model/ModifyThreadRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\ThreadObject**](../Model/ThreadObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **submitToolOuputsToRun**
> OpenAPI\Server\Model\RunObject submitToolOuputsToRun($threadId, $runId, $submitToolOutputsRunRequest)

When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AssistantsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AssistantsApiInterface;

class AssistantsApi implements AssistantsApiInterface
{

    // ...

    /**
     * Implementation of AssistantsApiInterface#submitToolOuputsToRun
     */
    public function submitToolOuputsToRun(string $threadId, string $runId, SubmitToolOutputsRunRequest $submitToolOutputsRunRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **threadId** | **string**| The ID of the [thread](/docs/api-reference/threads) to which this run belongs. |
 **runId** | **string**| The ID of the run that requires the tool output submission. |
 **submitToolOutputsRunRequest** | [**OpenAPI\Server\Model\SubmitToolOutputsRunRequest**](../Model/SubmitToolOutputsRunRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\RunObject**](../Model/RunObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

