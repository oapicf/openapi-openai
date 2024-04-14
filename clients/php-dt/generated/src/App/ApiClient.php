<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 * The version of the OpenAPI document: 2.0.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region cancelFineTuningJob
    /**
     * Immediately cancel a fine-tune job.
     * @param \App\DTO\CancelFineTuningJobParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function cancelFineTuningJobRaw(
        \App\DTO\CancelFineTuningJobParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/fine_tuning/jobs/{fine_tuning_job_id}/cancel', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Immediately cancel a fine-tune job.
     * @param \App\DTO\CancelFineTuningJobParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function cancelFineTuningJob(
        \App\DTO\CancelFineTuningJobParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->cancelFineTuningJobRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\FineTuningJob();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Immediately cancel a fine-tune job.
     * @param \App\DTO\CancelFineTuningJobParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\FineTuningJob
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function cancelFineTuningJobResult(
        \App\DTO\CancelFineTuningJobParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\FineTuningJob
    {
        return $this->getSuccessfulContent(...$this->cancelFineTuningJob($parameters, $security, $responseMediaType));
    }
    //endregion

    //region cancelRun
    /**
     * Cancels a run that is `in_progress`.
     * @param \App\DTO\CancelRunParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function cancelRunRaw(
        \App\DTO\CancelRunParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/{thread_id}/runs/{run_id}/cancel', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param \App\DTO\CancelRunParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function cancelRun(
        \App\DTO\CancelRunParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->cancelRunRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\RunObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param \App\DTO\CancelRunParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\RunObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function cancelRunResult(
        \App\DTO\CancelRunParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\RunObject
    {
        return $this->getSuccessfulContent(...$this->cancelRun($parameters, $security, $responseMediaType));
    }
    //endregion

    //region createAssistant
    /**
     * Create an assistant with a model and instructions.
     * @param \App\DTO\CreateAssistantRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createAssistantRaw(
        \App\DTO\CreateAssistantRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/assistants', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create an assistant with a model and instructions.
     * @param \App\DTO\CreateAssistantRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createAssistant(
        \App\DTO\CreateAssistantRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createAssistantRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\AssistantObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create an assistant with a model and instructions.
     * @param \App\DTO\CreateAssistantRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AssistantObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createAssistantResult(
        \App\DTO\CreateAssistantRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AssistantObject
    {
        return $this->getSuccessfulContent(...$this->createAssistant($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createAssistantFile
    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param \App\DTO\CreateAssistantFileParameterData $parameters
     * @param \App\DTO\CreateAssistantFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createAssistantFileRaw(
        \App\DTO\CreateAssistantFileParameterData $parameters,
        \App\DTO\CreateAssistantFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/assistants/{assistant_id}/files', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param \App\DTO\CreateAssistantFileParameterData $parameters
     * @param \App\DTO\CreateAssistantFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createAssistantFile(
        \App\DTO\CreateAssistantFileParameterData $parameters,
        \App\DTO\CreateAssistantFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createAssistantFileRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\AssistantFileObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param \App\DTO\CreateAssistantFileParameterData $parameters
     * @param \App\DTO\CreateAssistantFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AssistantFileObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createAssistantFileResult(
        \App\DTO\CreateAssistantFileParameterData $parameters,
        \App\DTO\CreateAssistantFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AssistantFileObject
    {
        return $this->getSuccessfulContent(...$this->createAssistantFile($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createChatCompletion
    /**
     * Creates a model response for the given chat conversation.
     * @param \App\DTO\CreateChatCompletionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createChatCompletionRaw(
        \App\DTO\CreateChatCompletionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/chat/completions', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param \App\DTO\CreateChatCompletionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createChatCompletion(
        \App\DTO\CreateChatCompletionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createChatCompletionRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateChatCompletionResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param \App\DTO\CreateChatCompletionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateChatCompletionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createChatCompletionResult(
        \App\DTO\CreateChatCompletionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateChatCompletionResponse
    {
        return $this->getSuccessfulContent(...$this->createChatCompletion($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createCompletion
    /**
     * Creates a completion for the provided prompt and parameters.
     * @param \App\DTO\CreateCompletionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createCompletionRaw(
        \App\DTO\CreateCompletionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/completions', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param \App\DTO\CreateCompletionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createCompletion(
        \App\DTO\CreateCompletionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createCompletionRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateCompletionResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param \App\DTO\CreateCompletionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateCompletionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createCompletionResult(
        \App\DTO\CreateCompletionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateCompletionResponse
    {
        return $this->getSuccessfulContent(...$this->createCompletion($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createEmbedding
    /**
     * Creates an embedding vector representing the input text.
     * @param \App\DTO\CreateEmbeddingRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createEmbeddingRaw(
        \App\DTO\CreateEmbeddingRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/embeddings', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param \App\DTO\CreateEmbeddingRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createEmbedding(
        \App\DTO\CreateEmbeddingRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createEmbeddingRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateEmbeddingResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param \App\DTO\CreateEmbeddingRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateEmbeddingResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createEmbeddingResult(
        \App\DTO\CreateEmbeddingRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateEmbeddingResponse
    {
        return $this->getSuccessfulContent(...$this->createEmbedding($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createFile
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * @param \App\DTO\CreateFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createFileRaw(
        \App\DTO\CreateFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/files', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * @param \App\DTO\CreateFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createFile(
        \App\DTO\CreateFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createFileRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\OpenAIFile();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * @param \App\DTO\CreateFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\OpenAIFile
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createFileResult(
        \App\DTO\CreateFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\OpenAIFile
    {
        return $this->getSuccessfulContent(...$this->createFile($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createFineTuningJob
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\CreateFineTuningJobRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createFineTuningJobRaw(
        \App\DTO\CreateFineTuningJobRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/fine_tuning/jobs', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\CreateFineTuningJobRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createFineTuningJob(
        \App\DTO\CreateFineTuningJobRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createFineTuningJobRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\FineTuningJob();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\CreateFineTuningJobRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\FineTuningJob
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createFineTuningJobResult(
        \App\DTO\CreateFineTuningJobRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\FineTuningJob
    {
        return $this->getSuccessfulContent(...$this->createFineTuningJob($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createImage
    /**
     * Creates an image given a prompt.
     * @param \App\DTO\CreateImageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createImageRaw(
        \App\DTO\CreateImageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/images/generations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates an image given a prompt.
     * @param \App\DTO\CreateImageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createImage(
        \App\DTO\CreateImageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createImageRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ImagesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates an image given a prompt.
     * @param \App\DTO\CreateImageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ImagesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createImageResult(
        \App\DTO\CreateImageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ImagesResponse
    {
        return $this->getSuccessfulContent(...$this->createImage($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createImageEdit
    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param \App\DTO\CreateImageEditRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createImageEditRaw(
        \App\DTO\CreateImageEditRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/images/edits', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param \App\DTO\CreateImageEditRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createImageEdit(
        \App\DTO\CreateImageEditRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createImageEditRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ImagesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param \App\DTO\CreateImageEditRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ImagesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createImageEditResult(
        \App\DTO\CreateImageEditRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ImagesResponse
    {
        return $this->getSuccessfulContent(...$this->createImageEdit($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createImageVariation
    /**
     * Creates a variation of a given image.
     * @param \App\DTO\CreateImageVariationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createImageVariationRaw(
        \App\DTO\CreateImageVariationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/images/variations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a variation of a given image.
     * @param \App\DTO\CreateImageVariationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createImageVariation(
        \App\DTO\CreateImageVariationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createImageVariationRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ImagesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates a variation of a given image.
     * @param \App\DTO\CreateImageVariationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ImagesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createImageVariationResult(
        \App\DTO\CreateImageVariationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ImagesResponse
    {
        return $this->getSuccessfulContent(...$this->createImageVariation($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createMessage
    /**
     * Create a message.
     * @param \App\DTO\CreateMessageParameterData $parameters
     * @param \App\DTO\CreateMessageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createMessageRaw(
        \App\DTO\CreateMessageParameterData $parameters,
        \App\DTO\CreateMessageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/{thread_id}/messages', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a message.
     * @param \App\DTO\CreateMessageParameterData $parameters
     * @param \App\DTO\CreateMessageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createMessage(
        \App\DTO\CreateMessageParameterData $parameters,
        \App\DTO\CreateMessageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createMessageRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\MessageObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a message.
     * @param \App\DTO\CreateMessageParameterData $parameters
     * @param \App\DTO\CreateMessageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\MessageObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createMessageResult(
        \App\DTO\CreateMessageParameterData $parameters,
        \App\DTO\CreateMessageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\MessageObject
    {
        return $this->getSuccessfulContent(...$this->createMessage($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createModeration
    /**
     * Classifies if text is potentially harmful.
     * @param \App\DTO\CreateModerationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createModerationRaw(
        \App\DTO\CreateModerationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/moderations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Classifies if text is potentially harmful.
     * @param \App\DTO\CreateModerationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createModeration(
        \App\DTO\CreateModerationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createModerationRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateModerationResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Classifies if text is potentially harmful.
     * @param \App\DTO\CreateModerationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateModerationResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createModerationResult(
        \App\DTO\CreateModerationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateModerationResponse
    {
        return $this->getSuccessfulContent(...$this->createModeration($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createRun
    /**
     * Create a run.
     * @param \App\DTO\CreateRunParameterData $parameters
     * @param \App\DTO\CreateRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createRunRaw(
        \App\DTO\CreateRunParameterData $parameters,
        \App\DTO\CreateRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/{thread_id}/runs', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a run.
     * @param \App\DTO\CreateRunParameterData $parameters
     * @param \App\DTO\CreateRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createRun(
        \App\DTO\CreateRunParameterData $parameters,
        \App\DTO\CreateRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createRunRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\RunObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a run.
     * @param \App\DTO\CreateRunParameterData $parameters
     * @param \App\DTO\CreateRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\RunObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createRunResult(
        \App\DTO\CreateRunParameterData $parameters,
        \App\DTO\CreateRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\RunObject
    {
        return $this->getSuccessfulContent(...$this->createRun($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createSpeech
    /**
     * Generates audio from the input text.
     * @param \App\DTO\CreateSpeechRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createSpeechRaw(
        \App\DTO\CreateSpeechRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/octet-stream'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/audio/speech', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Generates audio from the input text.
     * @param \App\DTO\CreateSpeechRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createSpeech(
        \App\DTO\CreateSpeechRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/octet-stream'
    ): array
    {
        $response = $this->createSpeechRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Generates audio from the input text.
     * @param \App\DTO\CreateSpeechRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createSpeechResult(
        \App\DTO\CreateSpeechRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/octet-stream'
    ): string
    {
        return $this->getSuccessfulContent(...$this->createSpeech($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createThread
    /**
     * Create a thread.
     * @param \App\DTO\CreateThreadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createThreadRaw(
        \App\DTO\CreateThreadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a thread.
     * @param \App\DTO\CreateThreadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createThread(
        \App\DTO\CreateThreadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createThreadRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ThreadObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a thread.
     * @param \App\DTO\CreateThreadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ThreadObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createThreadResult(
        \App\DTO\CreateThreadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ThreadObject
    {
        return $this->getSuccessfulContent(...$this->createThread($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createThreadAndRun
    /**
     * Create a thread and run it in one request.
     * @param \App\DTO\CreateThreadAndRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createThreadAndRunRaw(
        \App\DTO\CreateThreadAndRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/runs', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a thread and run it in one request.
     * @param \App\DTO\CreateThreadAndRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createThreadAndRun(
        \App\DTO\CreateThreadAndRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createThreadAndRunRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\RunObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a thread and run it in one request.
     * @param \App\DTO\CreateThreadAndRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\RunObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createThreadAndRunResult(
        \App\DTO\CreateThreadAndRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\RunObject
    {
        return $this->getSuccessfulContent(...$this->createThreadAndRun($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createTranscription
    /**
     * Transcribes audio into the input language.
     * @param \App\DTO\CreateTranscriptionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createTranscriptionRaw(
        \App\DTO\CreateTranscriptionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/audio/transcriptions', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Transcribes audio into the input language.
     * @param \App\DTO\CreateTranscriptionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createTranscription(
        \App\DTO\CreateTranscriptionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createTranscriptionRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateTranscription200Response();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Transcribes audio into the input language.
     * @param \App\DTO\CreateTranscriptionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateTranscription200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createTranscriptionResult(
        \App\DTO\CreateTranscriptionRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateTranscription200Response
    {
        return $this->getSuccessfulContent(...$this->createTranscription($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createTranslation
    /**
     * Translates audio into English.
     * @param \App\DTO\CreateTranslationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createTranslationRaw(
        \App\DTO\CreateTranslationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/audio/translations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Translates audio into English.
     * @param \App\DTO\CreateTranslationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createTranslation(
        \App\DTO\CreateTranslationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createTranslationRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateTranslation200Response();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Translates audio into English.
     * @param \App\DTO\CreateTranslationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateTranslation200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createTranslationResult(
        \App\DTO\CreateTranslationRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateTranslation200Response
    {
        return $this->getSuccessfulContent(...$this->createTranslation($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region deleteAssistant
    /**
     * Delete an assistant.
     * @param \App\DTO\DeleteAssistantParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteAssistantRaw(
        \App\DTO\DeleteAssistantParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/assistants/{assistant_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete an assistant.
     * @param \App\DTO\DeleteAssistantParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteAssistant(
        \App\DTO\DeleteAssistantParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteAssistantRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteAssistantResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete an assistant.
     * @param \App\DTO\DeleteAssistantParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteAssistantResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteAssistantResult(
        \App\DTO\DeleteAssistantParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteAssistantResponse
    {
        return $this->getSuccessfulContent(...$this->deleteAssistant($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteAssistantFile
    /**
     * Delete an assistant file.
     * @param \App\DTO\DeleteAssistantFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteAssistantFileRaw(
        \App\DTO\DeleteAssistantFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/assistants/{assistant_id}/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete an assistant file.
     * @param \App\DTO\DeleteAssistantFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteAssistantFile(
        \App\DTO\DeleteAssistantFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteAssistantFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteAssistantFileResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete an assistant file.
     * @param \App\DTO\DeleteAssistantFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteAssistantFileResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteAssistantFileResult(
        \App\DTO\DeleteAssistantFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteAssistantFileResponse
    {
        return $this->getSuccessfulContent(...$this->deleteAssistantFile($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteFile
    /**
     * Delete a file.
     * @param \App\DTO\DeleteFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteFileRaw(
        \App\DTO\DeleteFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete a file.
     * @param \App\DTO\DeleteFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteFile(
        \App\DTO\DeleteFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteFileResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete a file.
     * @param \App\DTO\DeleteFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteFileResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteFileResult(
        \App\DTO\DeleteFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteFileResponse
    {
        return $this->getSuccessfulContent(...$this->deleteFile($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteModel
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param \App\DTO\DeleteModelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteModelRaw(
        \App\DTO\DeleteModelParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/models/{model}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param \App\DTO\DeleteModelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteModel(
        \App\DTO\DeleteModelParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteModelRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteModelResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param \App\DTO\DeleteModelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteModelResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteModelResult(
        \App\DTO\DeleteModelParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteModelResponse
    {
        return $this->getSuccessfulContent(...$this->deleteModel($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteThread
    /**
     * Delete a thread.
     * @param \App\DTO\DeleteThreadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteThreadRaw(
        \App\DTO\DeleteThreadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/threads/{thread_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete a thread.
     * @param \App\DTO\DeleteThreadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteThread(
        \App\DTO\DeleteThreadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteThreadRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteThreadResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete a thread.
     * @param \App\DTO\DeleteThreadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteThreadResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteThreadResult(
        \App\DTO\DeleteThreadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteThreadResponse
    {
        return $this->getSuccessfulContent(...$this->deleteThread($parameters, $security, $responseMediaType));
    }
    //endregion

    //region downloadFile
    /**
     * Returns the contents of the specified file.
     * @param \App\DTO\DownloadFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function downloadFileRaw(
        \App\DTO\DownloadFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/files/{file_id}/content', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns the contents of the specified file.
     * @param \App\DTO\DownloadFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function downloadFile(
        \App\DTO\DownloadFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->downloadFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns the contents of the specified file.
     * @param \App\DTO\DownloadFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function downloadFileResult(
        \App\DTO\DownloadFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->downloadFile($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getAssistant
    /**
     * Retrieves an assistant.
     * @param \App\DTO\GetAssistantParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getAssistantRaw(
        \App\DTO\GetAssistantParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/assistants/{assistant_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves an assistant.
     * @param \App\DTO\GetAssistantParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getAssistant(
        \App\DTO\GetAssistantParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getAssistantRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\AssistantObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves an assistant.
     * @param \App\DTO\GetAssistantParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AssistantObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getAssistantResult(
        \App\DTO\GetAssistantParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AssistantObject
    {
        return $this->getSuccessfulContent(...$this->getAssistant($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getAssistantFile
    /**
     * Retrieves an AssistantFile.
     * @param \App\DTO\GetAssistantFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getAssistantFileRaw(
        \App\DTO\GetAssistantFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/assistants/{assistant_id}/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves an AssistantFile.
     * @param \App\DTO\GetAssistantFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getAssistantFile(
        \App\DTO\GetAssistantFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getAssistantFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\AssistantFileObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves an AssistantFile.
     * @param \App\DTO\GetAssistantFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AssistantFileObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getAssistantFileResult(
        \App\DTO\GetAssistantFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AssistantFileObject
    {
        return $this->getSuccessfulContent(...$this->getAssistantFile($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getMessage
    /**
     * Retrieve a message.
     * @param \App\DTO\GetMessageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getMessageRaw(
        \App\DTO\GetMessageParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/messages/{message_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve a message.
     * @param \App\DTO\GetMessageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getMessage(
        \App\DTO\GetMessageParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getMessageRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\MessageObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve a message.
     * @param \App\DTO\GetMessageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MessageObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getMessageResult(
        \App\DTO\GetMessageParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MessageObject
    {
        return $this->getSuccessfulContent(...$this->getMessage($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getMessageFile
    /**
     * Retrieves a message file.
     * @param \App\DTO\GetMessageFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getMessageFileRaw(
        \App\DTO\GetMessageFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/messages/{message_id}/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a message file.
     * @param \App\DTO\GetMessageFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getMessageFile(
        \App\DTO\GetMessageFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getMessageFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\MessageFileObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a message file.
     * @param \App\DTO\GetMessageFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MessageFileObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getMessageFileResult(
        \App\DTO\GetMessageFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MessageFileObject
    {
        return $this->getSuccessfulContent(...$this->getMessageFile($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getRun
    /**
     * Retrieves a run.
     * @param \App\DTO\GetRunParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getRunRaw(
        \App\DTO\GetRunParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/runs/{run_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a run.
     * @param \App\DTO\GetRunParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getRun(
        \App\DTO\GetRunParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getRunRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\RunObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a run.
     * @param \App\DTO\GetRunParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\RunObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getRunResult(
        \App\DTO\GetRunParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\RunObject
    {
        return $this->getSuccessfulContent(...$this->getRun($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getRunStep
    /**
     * Retrieves a run step.
     * @param \App\DTO\GetRunStepParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getRunStepRaw(
        \App\DTO\GetRunStepParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/runs/{run_id}/steps/{step_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a run step.
     * @param \App\DTO\GetRunStepParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getRunStep(
        \App\DTO\GetRunStepParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getRunStepRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\RunStepObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a run step.
     * @param \App\DTO\GetRunStepParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\RunStepObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getRunStepResult(
        \App\DTO\GetRunStepParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\RunStepObject
    {
        return $this->getSuccessfulContent(...$this->getRunStep($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getThread
    /**
     * Retrieves a thread.
     * @param \App\DTO\GetThreadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getThreadRaw(
        \App\DTO\GetThreadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a thread.
     * @param \App\DTO\GetThreadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getThread(
        \App\DTO\GetThreadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getThreadRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ThreadObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a thread.
     * @param \App\DTO\GetThreadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ThreadObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getThreadResult(
        \App\DTO\GetThreadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ThreadObject
    {
        return $this->getSuccessfulContent(...$this->getThread($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listAssistantFiles
    /**
     * Returns a list of assistant files.
     * @param \App\DTO\ListAssistantFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listAssistantFilesRaw(
        \App\DTO\ListAssistantFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/assistants/{assistant_id}/files', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of assistant files.
     * @param \App\DTO\ListAssistantFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listAssistantFiles(
        \App\DTO\ListAssistantFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listAssistantFilesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListAssistantFilesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of assistant files.
     * @param \App\DTO\ListAssistantFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListAssistantFilesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listAssistantFilesResult(
        \App\DTO\ListAssistantFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListAssistantFilesResponse
    {
        return $this->getSuccessfulContent(...$this->listAssistantFiles($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listAssistants
    /**
     * Returns a list of assistants.
     * @param \App\DTO\ListAssistantsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listAssistantsRaw(
        \App\DTO\ListAssistantsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/assistants', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of assistants.
     * @param \App\DTO\ListAssistantsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listAssistants(
        \App\DTO\ListAssistantsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listAssistantsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListAssistantsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of assistants.
     * @param \App\DTO\ListAssistantsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListAssistantsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listAssistantsResult(
        \App\DTO\ListAssistantsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListAssistantsResponse
    {
        return $this->getSuccessfulContent(...$this->listAssistants($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listFiles
    /**
     * Returns a list of files that belong to the user's organization.
     * @param \App\DTO\ListFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listFilesRaw(
        \App\DTO\ListFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/files', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of files that belong to the user's organization.
     * @param \App\DTO\ListFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listFiles(
        \App\DTO\ListFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listFilesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListFilesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of files that belong to the user's organization.
     * @param \App\DTO\ListFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListFilesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listFilesResult(
        \App\DTO\ListFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListFilesResponse
    {
        return $this->getSuccessfulContent(...$this->listFiles($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listFineTuningEvents
    /**
     * Get status updates for a fine-tuning job.
     * @param \App\DTO\ListFineTuningEventsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listFineTuningEventsRaw(
        \App\DTO\ListFineTuningEventsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/fine_tuning/jobs/{fine_tuning_job_id}/events', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get status updates for a fine-tuning job.
     * @param \App\DTO\ListFineTuningEventsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listFineTuningEvents(
        \App\DTO\ListFineTuningEventsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listFineTuningEventsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListFineTuningJobEventsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get status updates for a fine-tuning job.
     * @param \App\DTO\ListFineTuningEventsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListFineTuningJobEventsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listFineTuningEventsResult(
        \App\DTO\ListFineTuningEventsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListFineTuningJobEventsResponse
    {
        return $this->getSuccessfulContent(...$this->listFineTuningEvents($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listFineTuningJobCheckpoints
    /**
     * List checkpoints for a fine-tuning job.
     * @param \App\DTO\ListFineTuningJobCheckpointsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listFineTuningJobCheckpointsRaw(
        \App\DTO\ListFineTuningJobCheckpointsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List checkpoints for a fine-tuning job.
     * @param \App\DTO\ListFineTuningJobCheckpointsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listFineTuningJobCheckpoints(
        \App\DTO\ListFineTuningJobCheckpointsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listFineTuningJobCheckpointsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListFineTuningJobCheckpointsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List checkpoints for a fine-tuning job.
     * @param \App\DTO\ListFineTuningJobCheckpointsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListFineTuningJobCheckpointsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listFineTuningJobCheckpointsResult(
        \App\DTO\ListFineTuningJobCheckpointsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListFineTuningJobCheckpointsResponse
    {
        return $this->getSuccessfulContent(...$this->listFineTuningJobCheckpoints($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listMessageFiles
    /**
     * Returns a list of message files.
     * @param \App\DTO\ListMessageFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listMessageFilesRaw(
        \App\DTO\ListMessageFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/messages/{message_id}/files', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of message files.
     * @param \App\DTO\ListMessageFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listMessageFiles(
        \App\DTO\ListMessageFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listMessageFilesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListMessageFilesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of message files.
     * @param \App\DTO\ListMessageFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListMessageFilesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listMessageFilesResult(
        \App\DTO\ListMessageFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListMessageFilesResponse
    {
        return $this->getSuccessfulContent(...$this->listMessageFiles($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listMessages
    /**
     * Returns a list of messages for a given thread.
     * @param \App\DTO\ListMessagesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listMessagesRaw(
        \App\DTO\ListMessagesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/messages', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of messages for a given thread.
     * @param \App\DTO\ListMessagesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listMessages(
        \App\DTO\ListMessagesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listMessagesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListMessagesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of messages for a given thread.
     * @param \App\DTO\ListMessagesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListMessagesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listMessagesResult(
        \App\DTO\ListMessagesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListMessagesResponse
    {
        return $this->getSuccessfulContent(...$this->listMessages($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listModels
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listModelsRaw(
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/models', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listModels(
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listModelsRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListModelsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListModelsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listModelsResult(
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListModelsResponse
    {
        return $this->getSuccessfulContent(...$this->listModels($security, $responseMediaType));
    }
    //endregion

    //region listPaginatedFineTuningJobs
    /**
     * List your organization's fine-tuning jobs
     * @param \App\DTO\ListPaginatedFineTuningJobsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listPaginatedFineTuningJobsRaw(
        \App\DTO\ListPaginatedFineTuningJobsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/fine_tuning/jobs', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List your organization's fine-tuning jobs
     * @param \App\DTO\ListPaginatedFineTuningJobsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listPaginatedFineTuningJobs(
        \App\DTO\ListPaginatedFineTuningJobsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listPaginatedFineTuningJobsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListPaginatedFineTuningJobsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List your organization's fine-tuning jobs
     * @param \App\DTO\ListPaginatedFineTuningJobsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListPaginatedFineTuningJobsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listPaginatedFineTuningJobsResult(
        \App\DTO\ListPaginatedFineTuningJobsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListPaginatedFineTuningJobsResponse
    {
        return $this->getSuccessfulContent(...$this->listPaginatedFineTuningJobs($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listRunSteps
    /**
     * Returns a list of run steps belonging to a run.
     * @param \App\DTO\ListRunStepsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listRunStepsRaw(
        \App\DTO\ListRunStepsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/runs/{run_id}/steps', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param \App\DTO\ListRunStepsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listRunSteps(
        \App\DTO\ListRunStepsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listRunStepsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListRunStepsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param \App\DTO\ListRunStepsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListRunStepsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listRunStepsResult(
        \App\DTO\ListRunStepsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListRunStepsResponse
    {
        return $this->getSuccessfulContent(...$this->listRunSteps($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listRuns
    /**
     * Returns a list of runs belonging to a thread.
     * @param \App\DTO\ListRunsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listRunsRaw(
        \App\DTO\ListRunsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/threads/{thread_id}/runs', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param \App\DTO\ListRunsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listRuns(
        \App\DTO\ListRunsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listRunsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListRunsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param \App\DTO\ListRunsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListRunsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listRunsResult(
        \App\DTO\ListRunsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListRunsResponse
    {
        return $this->getSuccessfulContent(...$this->listRuns($parameters, $security, $responseMediaType));
    }
    //endregion

    //region modifyAssistant
    /**
     * Modifies an assistant.
     * @param \App\DTO\ModifyAssistantParameterData $parameters
     * @param \App\DTO\ModifyAssistantRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyAssistantRaw(
        \App\DTO\ModifyAssistantParameterData $parameters,
        \App\DTO\ModifyAssistantRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/assistants/{assistant_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies an assistant.
     * @param \App\DTO\ModifyAssistantParameterData $parameters
     * @param \App\DTO\ModifyAssistantRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyAssistant(
        \App\DTO\ModifyAssistantParameterData $parameters,
        \App\DTO\ModifyAssistantRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyAssistantRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\AssistantObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies an assistant.
     * @param \App\DTO\ModifyAssistantParameterData $parameters
     * @param \App\DTO\ModifyAssistantRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AssistantObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyAssistantResult(
        \App\DTO\ModifyAssistantParameterData $parameters,
        \App\DTO\ModifyAssistantRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AssistantObject
    {
        return $this->getSuccessfulContent(...$this->modifyAssistant($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region modifyMessage
    /**
     * Modifies a message.
     * @param \App\DTO\ModifyMessageParameterData $parameters
     * @param \App\DTO\ModifyMessageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyMessageRaw(
        \App\DTO\ModifyMessageParameterData $parameters,
        \App\DTO\ModifyMessageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/{thread_id}/messages/{message_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies a message.
     * @param \App\DTO\ModifyMessageParameterData $parameters
     * @param \App\DTO\ModifyMessageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyMessage(
        \App\DTO\ModifyMessageParameterData $parameters,
        \App\DTO\ModifyMessageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyMessageRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\MessageObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies a message.
     * @param \App\DTO\ModifyMessageParameterData $parameters
     * @param \App\DTO\ModifyMessageRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\MessageObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyMessageResult(
        \App\DTO\ModifyMessageParameterData $parameters,
        \App\DTO\ModifyMessageRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\MessageObject
    {
        return $this->getSuccessfulContent(...$this->modifyMessage($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region modifyRun
    /**
     * Modifies a run.
     * @param \App\DTO\ModifyRunParameterData $parameters
     * @param \App\DTO\ModifyRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyRunRaw(
        \App\DTO\ModifyRunParameterData $parameters,
        \App\DTO\ModifyRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/{thread_id}/runs/{run_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies a run.
     * @param \App\DTO\ModifyRunParameterData $parameters
     * @param \App\DTO\ModifyRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyRun(
        \App\DTO\ModifyRunParameterData $parameters,
        \App\DTO\ModifyRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyRunRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\RunObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies a run.
     * @param \App\DTO\ModifyRunParameterData $parameters
     * @param \App\DTO\ModifyRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\RunObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyRunResult(
        \App\DTO\ModifyRunParameterData $parameters,
        \App\DTO\ModifyRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\RunObject
    {
        return $this->getSuccessfulContent(...$this->modifyRun($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region modifyThread
    /**
     * Modifies a thread.
     * @param \App\DTO\ModifyThreadParameterData $parameters
     * @param \App\DTO\ModifyThreadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyThreadRaw(
        \App\DTO\ModifyThreadParameterData $parameters,
        \App\DTO\ModifyThreadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/{thread_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies a thread.
     * @param \App\DTO\ModifyThreadParameterData $parameters
     * @param \App\DTO\ModifyThreadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyThread(
        \App\DTO\ModifyThreadParameterData $parameters,
        \App\DTO\ModifyThreadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyThreadRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ThreadObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies a thread.
     * @param \App\DTO\ModifyThreadParameterData $parameters
     * @param \App\DTO\ModifyThreadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ThreadObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyThreadResult(
        \App\DTO\ModifyThreadParameterData $parameters,
        \App\DTO\ModifyThreadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ThreadObject
    {
        return $this->getSuccessfulContent(...$this->modifyThread($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region retrieveFile
    /**
     * Returns information about a specific file.
     * @param \App\DTO\RetrieveFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveFileRaw(
        \App\DTO\RetrieveFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns information about a specific file.
     * @param \App\DTO\RetrieveFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveFile(
        \App\DTO\RetrieveFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\OpenAIFile();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns information about a specific file.
     * @param \App\DTO\RetrieveFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\OpenAIFile
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveFileResult(
        \App\DTO\RetrieveFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\OpenAIFile
    {
        return $this->getSuccessfulContent(...$this->retrieveFile($parameters, $security, $responseMediaType));
    }
    //endregion

    //region retrieveFineTuningJob
    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\RetrieveFineTuningJobParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveFineTuningJobRaw(
        \App\DTO\RetrieveFineTuningJobParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/fine_tuning/jobs/{fine_tuning_job_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\RetrieveFineTuningJobParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveFineTuningJob(
        \App\DTO\RetrieveFineTuningJobParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveFineTuningJobRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\FineTuningJob();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\RetrieveFineTuningJobParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\FineTuningJob
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveFineTuningJobResult(
        \App\DTO\RetrieveFineTuningJobParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\FineTuningJob
    {
        return $this->getSuccessfulContent(...$this->retrieveFineTuningJob($parameters, $security, $responseMediaType));
    }
    //endregion

    //region retrieveModel
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param \App\DTO\RetrieveModelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveModelRaw(
        \App\DTO\RetrieveModelParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/models/{model}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param \App\DTO\RetrieveModelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveModel(
        \App\DTO\RetrieveModelParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveModelRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\Model();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param \App\DTO\RetrieveModelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Model
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveModelResult(
        \App\DTO\RetrieveModelParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Model
    {
        return $this->getSuccessfulContent(...$this->retrieveModel($parameters, $security, $responseMediaType));
    }
    //endregion

    //region submitToolOuputsToRun
    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.
     * @param \App\DTO\SubmitToolOuputsToRunParameterData $parameters
     * @param \App\DTO\SubmitToolOutputsRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function submitToolOuputsToRunRaw(
        \App\DTO\SubmitToolOuputsToRunParameterData $parameters,
        \App\DTO\SubmitToolOutputsRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/threads/{thread_id}/runs/{run_id}/submit_tool_outputs', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.
     * @param \App\DTO\SubmitToolOuputsToRunParameterData $parameters
     * @param \App\DTO\SubmitToolOutputsRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function submitToolOuputsToRun(
        \App\DTO\SubmitToolOuputsToRunParameterData $parameters,
        \App\DTO\SubmitToolOutputsRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->submitToolOuputsToRunRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\RunObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request.
     * @param \App\DTO\SubmitToolOuputsToRunParameterData $parameters
     * @param \App\DTO\SubmitToolOutputsRunRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\RunObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function submitToolOuputsToRunResult(
        \App\DTO\SubmitToolOuputsToRunParameterData $parameters,
        \App\DTO\SubmitToolOutputsRunRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\RunObject
    {
        return $this->getSuccessfulContent(...$this->submitToolOuputsToRun($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion
}

