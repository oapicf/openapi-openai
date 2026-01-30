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
 * The version of the OpenAPI document: 2.3.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region addUploadPart
    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).
     * @param \App\DTO\AddUploadPartParameterData $parameters
     * @param \App\DTO\AddUploadPartRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function addUploadPartRaw(
        \App\DTO\AddUploadPartParameterData $parameters,
        \App\DTO\AddUploadPartRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/uploads/{upload_id}/parts', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).
     * @param \App\DTO\AddUploadPartParameterData $parameters
     * @param \App\DTO\AddUploadPartRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function addUploadPart(
        \App\DTO\AddUploadPartParameterData $parameters,
        \App\DTO\AddUploadPartRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->addUploadPartRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\UploadPart();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).
     * @param \App\DTO\AddUploadPartParameterData $parameters
     * @param \App\DTO\AddUploadPartRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\UploadPart
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function addUploadPartResult(
        \App\DTO\AddUploadPartParameterData $parameters,
        \App\DTO\AddUploadPartRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\UploadPart
    {
        return $this->getSuccessfulContent(...$this->addUploadPart($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adminApiKeysCreate
    /**
     * Create an organization admin API key
     * @param \App\DTO\AdminApiKeysCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adminApiKeysCreateRaw(
        \App\DTO\AdminApiKeysCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/admin_api_keys', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create an organization admin API key
     * @param \App\DTO\AdminApiKeysCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adminApiKeysCreate(
        \App\DTO\AdminApiKeysCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adminApiKeysCreateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* The newly created admin API key. */
                $responseContent = new \App\DTO\AdminApiKey();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create an organization admin API key
     * @param \App\DTO\AdminApiKeysCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdminApiKey
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adminApiKeysCreateResult(
        \App\DTO\AdminApiKeysCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdminApiKey
    {
        return $this->getSuccessfulContent(...$this->adminApiKeysCreate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adminApiKeysDelete
    /**
     * Delete an organization admin API key
     * @param \App\DTO\AdminApiKeysDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adminApiKeysDeleteRaw(
        \App\DTO\AdminApiKeysDeleteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/organization/admin_api_keys/{key_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete an organization admin API key
     * @param \App\DTO\AdminApiKeysDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adminApiKeysDelete(
        \App\DTO\AdminApiKeysDeleteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adminApiKeysDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Confirmation that the API key was deleted. */
                $responseContent = new \App\DTO\AdminApiKeysDelete200Response();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete an organization admin API key
     * @param \App\DTO\AdminApiKeysDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdminApiKeysDelete200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adminApiKeysDeleteResult(
        \App\DTO\AdminApiKeysDeleteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdminApiKeysDelete200Response
    {
        return $this->getSuccessfulContent(...$this->adminApiKeysDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adminApiKeysGet
    /**
     * Retrieve a single organization API key
     * @param \App\DTO\AdminApiKeysGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adminApiKeysGetRaw(
        \App\DTO\AdminApiKeysGetParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/admin_api_keys/{key_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieve a single organization API key
     * @param \App\DTO\AdminApiKeysGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adminApiKeysGet(
        \App\DTO\AdminApiKeysGetParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adminApiKeysGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Details of the requested API key. */
                $responseContent = new \App\DTO\AdminApiKey();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieve a single organization API key
     * @param \App\DTO\AdminApiKeysGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdminApiKey
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adminApiKeysGetResult(
        \App\DTO\AdminApiKeysGetParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdminApiKey
    {
        return $this->getSuccessfulContent(...$this->adminApiKeysGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adminApiKeysList
    /**
     * List organization API keys
     * @param \App\DTO\AdminApiKeysListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adminApiKeysListRaw(
        \App\DTO\AdminApiKeysListParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/admin_api_keys', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List organization API keys
     * @param \App\DTO\AdminApiKeysListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adminApiKeysList(
        \App\DTO\AdminApiKeysListParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adminApiKeysListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* A list of organization API keys. */
                $responseContent = new \App\DTO\ApiKeyList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List organization API keys
     * @param \App\DTO\AdminApiKeysListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ApiKeyList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adminApiKeysListResult(
        \App\DTO\AdminApiKeysListParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ApiKeyList
    {
        return $this->getSuccessfulContent(...$this->adminApiKeysList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region archiveProject
    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * @param \App\DTO\ArchiveProjectParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function archiveProjectRaw(
        \App\DTO\ArchiveProjectParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/projects/{project_id}/archive', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * @param \App\DTO\ArchiveProjectParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function archiveProject(
        \App\DTO\ArchiveProjectParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->archiveProjectRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project archived successfully. */
                $responseContent = new \App\DTO\Project();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     * @param \App\DTO\ArchiveProjectParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Project
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function archiveProjectResult(
        \App\DTO\ArchiveProjectParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Project
    {
        return $this->getSuccessfulContent(...$this->archiveProject($parameters, $security, $responseMediaType));
    }
    //endregion

    //region cancelBatch
    /**
     * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
     * @param \App\DTO\CancelBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function cancelBatchRaw(
        \App\DTO\CancelBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/batches/{batch_id}/cancel', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
     * @param \App\DTO\CancelBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function cancelBatch(
        \App\DTO\CancelBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->cancelBatchRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Batch is cancelling. Returns the cancelling batch's details. */
                $responseContent = new \App\DTO\Batch();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
     * @param \App\DTO\CancelBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Batch
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function cancelBatchResult(
        \App\DTO\CancelBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Batch
    {
        return $this->getSuccessfulContent(...$this->cancelBatch($parameters, $security, $responseMediaType));
    }
    //endregion

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

    //region cancelUpload
    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled.
     * @param \App\DTO\CancelUploadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function cancelUploadRaw(
        \App\DTO\CancelUploadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/uploads/{upload_id}/cancel', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled.
     * @param \App\DTO\CancelUploadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function cancelUpload(
        \App\DTO\CancelUploadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->cancelUploadRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\Upload();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled.
     * @param \App\DTO\CancelUploadParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Upload
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function cancelUploadResult(
        \App\DTO\CancelUploadParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Upload
    {
        return $this->getSuccessfulContent(...$this->cancelUpload($parameters, $security, $responseMediaType));
    }
    //endregion

    //region cancelVectorStoreFileBatch
    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param \App\DTO\CancelVectorStoreFileBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function cancelVectorStoreFileBatchRaw(
        \App\DTO\CancelVectorStoreFileBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param \App\DTO\CancelVectorStoreFileBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function cancelVectorStoreFileBatch(
        \App\DTO\CancelVectorStoreFileBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->cancelVectorStoreFileBatchRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreFileBatchObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     * @param \App\DTO\CancelVectorStoreFileBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreFileBatchObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function cancelVectorStoreFileBatchResult(
        \App\DTO\CancelVectorStoreFileBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreFileBatchObject
    {
        return $this->getSuccessfulContent(...$this->cancelVectorStoreFileBatch($parameters, $security, $responseMediaType));
    }
    //endregion

    //region completeUpload
    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
     * @param \App\DTO\CompleteUploadParameterData $parameters
     * @param \App\DTO\CompleteUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function completeUploadRaw(
        \App\DTO\CompleteUploadParameterData $parameters,
        \App\DTO\CompleteUploadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/uploads/{upload_id}/complete', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
     * @param \App\DTO\CompleteUploadParameterData $parameters
     * @param \App\DTO\CompleteUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function completeUpload(
        \App\DTO\CompleteUploadParameterData $parameters,
        \App\DTO\CompleteUploadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->completeUploadRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\Upload();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
     * @param \App\DTO\CompleteUploadParameterData $parameters
     * @param \App\DTO\CompleteUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Upload
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function completeUploadResult(
        \App\DTO\CompleteUploadParameterData $parameters,
        \App\DTO\CompleteUploadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Upload
    {
        return $this->getSuccessfulContent(...$this->completeUpload($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
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

    //region createBatch
    /**
     * Creates and executes a batch from an uploaded file of requests
     * @param \App\DTO\CreateBatchRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createBatchRaw(
        \App\DTO\CreateBatchRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/batches', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     * @param \App\DTO\CreateBatchRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createBatch(
        \App\DTO\CreateBatchRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createBatchRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Batch created successfully. */
                $responseContent = new \App\DTO\Batch();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates and executes a batch from an uploaded file of requests
     * @param \App\DTO\CreateBatchRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Batch
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createBatchResult(
        \App\DTO\CreateBatchRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Batch
    {
        return $this->getSuccessfulContent(...$this->createBatch($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createChatCompletion
    /**
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).
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
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).
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
     * Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).
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
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
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
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
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
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
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
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).
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
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).
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
     * Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).
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

    //region createProject
    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * @param \App\DTO\ProjectCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createProjectRaw(
        \App\DTO\ProjectCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/projects', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * @param \App\DTO\ProjectCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createProject(
        \App\DTO\ProjectCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createProjectRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project created successfully. */
                $responseContent = new \App\DTO\Project();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     * @param \App\DTO\ProjectCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Project
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createProjectResult(
        \App\DTO\ProjectCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Project
    {
        return $this->getSuccessfulContent(...$this->createProject($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createProjectServiceAccount
    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * @param \App\DTO\CreateProjectServiceAccountParameterData $parameters
     * @param \App\DTO\ProjectServiceAccountCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createProjectServiceAccountRaw(
        \App\DTO\CreateProjectServiceAccountParameterData $parameters,
        \App\DTO\ProjectServiceAccountCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/projects/{project_id}/service_accounts', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * @param \App\DTO\CreateProjectServiceAccountParameterData $parameters
     * @param \App\DTO\ProjectServiceAccountCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createProjectServiceAccount(
        \App\DTO\CreateProjectServiceAccountParameterData $parameters,
        \App\DTO\ProjectServiceAccountCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createProjectServiceAccountRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project service account created successfully. */
                $responseContent = new \App\DTO\ProjectServiceAccountCreateResponse();
                break;
            case 400:
                /* Error response when project is archived. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     * @param \App\DTO\CreateProjectServiceAccountParameterData $parameters
     * @param \App\DTO\ProjectServiceAccountCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ProjectServiceAccountCreateResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createProjectServiceAccountResult(
        \App\DTO\CreateProjectServiceAccountParameterData $parameters,
        \App\DTO\ProjectServiceAccountCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectServiceAccountCreateResponse
    {
        return $this->getSuccessfulContent(...$this->createProjectServiceAccount($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createProjectUser
    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * @param \App\DTO\CreateProjectUserParameterData $parameters
     * @param \App\DTO\ProjectUserCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createProjectUserRaw(
        \App\DTO\CreateProjectUserParameterData $parameters,
        \App\DTO\ProjectUserCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/projects/{project_id}/users', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * @param \App\DTO\CreateProjectUserParameterData $parameters
     * @param \App\DTO\ProjectUserCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createProjectUser(
        \App\DTO\CreateProjectUserParameterData $parameters,
        \App\DTO\ProjectUserCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createProjectUserRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* User added to project successfully. */
                $responseContent = new \App\DTO\ProjectUser();
                break;
            case 400:
                /* Error response for various conditions. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     * @param \App\DTO\CreateProjectUserParameterData $parameters
     * @param \App\DTO\ProjectUserCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ProjectUser
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createProjectUserResult(
        \App\DTO\CreateProjectUserParameterData $parameters,
        \App\DTO\ProjectUserCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectUser
    {
        return $this->getSuccessfulContent(...$this->createProjectUser($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createRealtimeSession
    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.
     * @param \App\DTO\RealtimeSessionCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createRealtimeSessionRaw(
        \App\DTO\RealtimeSessionCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/realtime/sessions', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.
     * @param \App\DTO\RealtimeSessionCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createRealtimeSession(
        \App\DTO\RealtimeSessionCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createRealtimeSessionRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Session created successfully. */
                $responseContent = new \App\DTO\RealtimeSessionCreateResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.
     * @param \App\DTO\RealtimeSessionCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\RealtimeSessionCreateResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createRealtimeSessionResult(
        \App\DTO\RealtimeSessionCreateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\RealtimeSessionCreateResponse
    {
        return $this->getSuccessfulContent(...$this->createRealtimeSession($requestContent, $security, $requestMediaType, $responseMediaType));
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
        $request = $this->createRequest('POST', '/threads/{thread_id}/runs', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
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

    //region createUpload
    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).
     * @param \App\DTO\CreateUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createUploadRaw(
        \App\DTO\CreateUploadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/uploads', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).
     * @param \App\DTO\CreateUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createUpload(
        \App\DTO\CreateUploadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createUploadRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\Upload();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).
     * @param \App\DTO\CreateUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Upload
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createUploadResult(
        \App\DTO\CreateUploadRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Upload
    {
        return $this->getSuccessfulContent(...$this->createUpload($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createVectorStore
    /**
     * Create a vector store.
     * @param \App\DTO\CreateVectorStoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createVectorStoreRaw(
        \App\DTO\CreateVectorStoreRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vector_stores', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a vector store.
     * @param \App\DTO\CreateVectorStoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createVectorStore(
        \App\DTO\CreateVectorStoreRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createVectorStoreRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a vector store.
     * @param \App\DTO\CreateVectorStoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createVectorStoreResult(
        \App\DTO\CreateVectorStoreRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreObject
    {
        return $this->getSuccessfulContent(...$this->createVectorStore($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createVectorStoreFile
    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param \App\DTO\CreateVectorStoreFileParameterData $parameters
     * @param \App\DTO\CreateVectorStoreFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createVectorStoreFileRaw(
        \App\DTO\CreateVectorStoreFileParameterData $parameters,
        \App\DTO\CreateVectorStoreFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vector_stores/{vector_store_id}/files', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param \App\DTO\CreateVectorStoreFileParameterData $parameters
     * @param \App\DTO\CreateVectorStoreFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createVectorStoreFile(
        \App\DTO\CreateVectorStoreFileParameterData $parameters,
        \App\DTO\CreateVectorStoreFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createVectorStoreFileRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreFileObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     * @param \App\DTO\CreateVectorStoreFileParameterData $parameters
     * @param \App\DTO\CreateVectorStoreFileRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreFileObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createVectorStoreFileResult(
        \App\DTO\CreateVectorStoreFileParameterData $parameters,
        \App\DTO\CreateVectorStoreFileRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreFileObject
    {
        return $this->getSuccessfulContent(...$this->createVectorStoreFile($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createVectorStoreFileBatch
    /**
     * Create a vector store file batch.
     * @param \App\DTO\CreateVectorStoreFileBatchParameterData $parameters
     * @param \App\DTO\CreateVectorStoreFileBatchRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createVectorStoreFileBatchRaw(
        \App\DTO\CreateVectorStoreFileBatchParameterData $parameters,
        \App\DTO\CreateVectorStoreFileBatchRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vector_stores/{vector_store_id}/file_batches', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a vector store file batch.
     * @param \App\DTO\CreateVectorStoreFileBatchParameterData $parameters
     * @param \App\DTO\CreateVectorStoreFileBatchRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createVectorStoreFileBatch(
        \App\DTO\CreateVectorStoreFileBatchParameterData $parameters,
        \App\DTO\CreateVectorStoreFileBatchRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createVectorStoreFileBatchRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreFileBatchObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a vector store file batch.
     * @param \App\DTO\CreateVectorStoreFileBatchParameterData $parameters
     * @param \App\DTO\CreateVectorStoreFileBatchRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreFileBatchObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createVectorStoreFileBatchResult(
        \App\DTO\CreateVectorStoreFileBatchParameterData $parameters,
        \App\DTO\CreateVectorStoreFileBatchRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreFileBatchObject
    {
        return $this->getSuccessfulContent(...$this->createVectorStoreFileBatch($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
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

    //region deleteInvite
    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * @param \App\DTO\DeleteInviteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteInviteRaw(
        \App\DTO\DeleteInviteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/organization/invites/{invite_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * @param \App\DTO\DeleteInviteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteInvite(
        \App\DTO\DeleteInviteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteInviteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Invite deleted successfully. */
                $responseContent = new \App\DTO\InviteDeleteResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     * @param \App\DTO\DeleteInviteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\InviteDeleteResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteInviteResult(
        \App\DTO\DeleteInviteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\InviteDeleteResponse
    {
        return $this->getSuccessfulContent(...$this->deleteInvite($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteMessage
    /**
     * Deletes a message.
     * @param \App\DTO\DeleteMessageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteMessageRaw(
        \App\DTO\DeleteMessageParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/threads/{thread_id}/messages/{message_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Deletes a message.
     * @param \App\DTO\DeleteMessageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteMessage(
        \App\DTO\DeleteMessageParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteMessageRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteMessageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Deletes a message.
     * @param \App\DTO\DeleteMessageParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteMessageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteMessageResult(
        \App\DTO\DeleteMessageParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteMessageResponse
    {
        return $this->getSuccessfulContent(...$this->deleteMessage($parameters, $security, $responseMediaType));
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

    //region deleteProjectApiKey
    /**
     * Deletes an API key from the project.
     * @param \App\DTO\DeleteProjectApiKeyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteProjectApiKeyRaw(
        \App\DTO\DeleteProjectApiKeyParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/organization/projects/{project_id}/api_keys/{key_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Deletes an API key from the project.
     * @param \App\DTO\DeleteProjectApiKeyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteProjectApiKey(
        \App\DTO\DeleteProjectApiKeyParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteProjectApiKeyRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project API key deleted successfully. */
                $responseContent = new \App\DTO\ProjectApiKeyDeleteResponse();
                break;
            case 400:
                /* Error response for various conditions. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Deletes an API key from the project.
     * @param \App\DTO\DeleteProjectApiKeyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectApiKeyDeleteResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteProjectApiKeyResult(
        \App\DTO\DeleteProjectApiKeyParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectApiKeyDeleteResponse
    {
        return $this->getSuccessfulContent(...$this->deleteProjectApiKey($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteProjectServiceAccount
    /**
     * Deletes a service account from the project.
     * @param \App\DTO\DeleteProjectServiceAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteProjectServiceAccountRaw(
        \App\DTO\DeleteProjectServiceAccountParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/organization/projects/{project_id}/service_accounts/{service_account_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Deletes a service account from the project.
     * @param \App\DTO\DeleteProjectServiceAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteProjectServiceAccount(
        \App\DTO\DeleteProjectServiceAccountParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteProjectServiceAccountRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project service account deleted successfully. */
                $responseContent = new \App\DTO\ProjectServiceAccountDeleteResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Deletes a service account from the project.
     * @param \App\DTO\DeleteProjectServiceAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectServiceAccountDeleteResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteProjectServiceAccountResult(
        \App\DTO\DeleteProjectServiceAccountParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectServiceAccountDeleteResponse
    {
        return $this->getSuccessfulContent(...$this->deleteProjectServiceAccount($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteProjectUser
    /**
     * Deletes a user from the project.
     * @param \App\DTO\DeleteProjectUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteProjectUserRaw(
        \App\DTO\DeleteProjectUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/organization/projects/{project_id}/users/{user_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Deletes a user from the project.
     * @param \App\DTO\DeleteProjectUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteProjectUser(
        \App\DTO\DeleteProjectUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteProjectUserRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project user deleted successfully. */
                $responseContent = new \App\DTO\ProjectUserDeleteResponse();
                break;
            case 400:
                /* Error response for various conditions. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Deletes a user from the project.
     * @param \App\DTO\DeleteProjectUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectUserDeleteResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteProjectUserResult(
        \App\DTO\DeleteProjectUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectUserDeleteResponse
    {
        return $this->getSuccessfulContent(...$this->deleteProjectUser($parameters, $security, $responseMediaType));
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

    //region deleteUser
    /**
     * Deletes a user from the organization.
     * @param \App\DTO\DeleteUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteUserRaw(
        \App\DTO\DeleteUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/organization/users/{user_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Deletes a user from the organization.
     * @param \App\DTO\DeleteUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteUser(
        \App\DTO\DeleteUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteUserRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* User deleted successfully. */
                $responseContent = new \App\DTO\UserDeleteResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Deletes a user from the organization.
     * @param \App\DTO\DeleteUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UserDeleteResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteUserResult(
        \App\DTO\DeleteUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserDeleteResponse
    {
        return $this->getSuccessfulContent(...$this->deleteUser($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteVectorStore
    /**
     * Delete a vector store.
     * @param \App\DTO\DeleteVectorStoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteVectorStoreRaw(
        \App\DTO\DeleteVectorStoreParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/vector_stores/{vector_store_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete a vector store.
     * @param \App\DTO\DeleteVectorStoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteVectorStore(
        \App\DTO\DeleteVectorStoreParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteVectorStoreRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteVectorStoreResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete a vector store.
     * @param \App\DTO\DeleteVectorStoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteVectorStoreResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteVectorStoreResult(
        \App\DTO\DeleteVectorStoreParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteVectorStoreResponse
    {
        return $this->getSuccessfulContent(...$this->deleteVectorStore($parameters, $security, $responseMediaType));
    }
    //endregion

    //region deleteVectorStoreFile
    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param \App\DTO\DeleteVectorStoreFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteVectorStoreFileRaw(
        \App\DTO\DeleteVectorStoreFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/vector_stores/{vector_store_id}/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param \App\DTO\DeleteVectorStoreFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteVectorStoreFile(
        \App\DTO\DeleteVectorStoreFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteVectorStoreFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\DeleteVectorStoreFileResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     * @param \App\DTO\DeleteVectorStoreFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeleteVectorStoreFileResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteVectorStoreFileResult(
        \App\DTO\DeleteVectorStoreFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteVectorStoreFileResponse
    {
        return $this->getSuccessfulContent(...$this->deleteVectorStoreFile($parameters, $security, $responseMediaType));
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
        $request = $this->createRequest('GET', '/threads/{thread_id}/runs/{run_id}/steps/{step_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
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

    //region getVectorStore
    /**
     * Retrieves a vector store.
     * @param \App\DTO\GetVectorStoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getVectorStoreRaw(
        \App\DTO\GetVectorStoreParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vector_stores/{vector_store_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a vector store.
     * @param \App\DTO\GetVectorStoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getVectorStore(
        \App\DTO\GetVectorStoreParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getVectorStoreRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a vector store.
     * @param \App\DTO\GetVectorStoreParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getVectorStoreResult(
        \App\DTO\GetVectorStoreParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreObject
    {
        return $this->getSuccessfulContent(...$this->getVectorStore($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getVectorStoreFile
    /**
     * Retrieves a vector store file.
     * @param \App\DTO\GetVectorStoreFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getVectorStoreFileRaw(
        \App\DTO\GetVectorStoreFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vector_stores/{vector_store_id}/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a vector store file.
     * @param \App\DTO\GetVectorStoreFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getVectorStoreFile(
        \App\DTO\GetVectorStoreFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getVectorStoreFileRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreFileObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a vector store file.
     * @param \App\DTO\GetVectorStoreFileParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreFileObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getVectorStoreFileResult(
        \App\DTO\GetVectorStoreFileParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreFileObject
    {
        return $this->getSuccessfulContent(...$this->getVectorStoreFile($parameters, $security, $responseMediaType));
    }
    //endregion

    //region getVectorStoreFileBatch
    /**
     * Retrieves a vector store file batch.
     * @param \App\DTO\GetVectorStoreFileBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getVectorStoreFileBatchRaw(
        \App\DTO\GetVectorStoreFileBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vector_stores/{vector_store_id}/file_batches/{batch_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a vector store file batch.
     * @param \App\DTO\GetVectorStoreFileBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getVectorStoreFileBatch(
        \App\DTO\GetVectorStoreFileBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getVectorStoreFileBatchRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreFileBatchObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a vector store file batch.
     * @param \App\DTO\GetVectorStoreFileBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreFileBatchObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getVectorStoreFileBatchResult(
        \App\DTO\GetVectorStoreFileBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreFileBatchObject
    {
        return $this->getSuccessfulContent(...$this->getVectorStoreFileBatch($parameters, $security, $responseMediaType));
    }
    //endregion

    //region inviteUser
    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * @param \App\DTO\InviteRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function inviteUserRaw(
        \App\DTO\InviteRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/invites', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * @param \App\DTO\InviteRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function inviteUser(
        \App\DTO\InviteRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->inviteUserRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* User invited successfully. */
                $responseContent = new \App\DTO\Invite();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     * @param \App\DTO\InviteRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Invite
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function inviteUserResult(
        \App\DTO\InviteRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Invite
    {
        return $this->getSuccessfulContent(...$this->inviteUser($requestContent, $security, $requestMediaType, $responseMediaType));
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

    //region listAuditLogs
    /**
     * List user actions and configuration changes within this organization.
     * @param \App\DTO\ListAuditLogsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listAuditLogsRaw(
        \App\DTO\ListAuditLogsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/audit_logs', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List user actions and configuration changes within this organization.
     * @param \App\DTO\ListAuditLogsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listAuditLogs(
        \App\DTO\ListAuditLogsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listAuditLogsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Audit logs listed successfully. */
                $responseContent = new \App\DTO\ListAuditLogsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List user actions and configuration changes within this organization.
     * @param \App\DTO\ListAuditLogsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListAuditLogsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listAuditLogsResult(
        \App\DTO\ListAuditLogsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListAuditLogsResponse
    {
        return $this->getSuccessfulContent(...$this->listAuditLogs($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listBatches
    /**
     * List your organization's batches.
     * @param \App\DTO\ListBatchesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listBatchesRaw(
        \App\DTO\ListBatchesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/batches', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List your organization's batches.
     * @param \App\DTO\ListBatchesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listBatches(
        \App\DTO\ListBatchesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listBatchesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Batch listed successfully. */
                $responseContent = new \App\DTO\ListBatchesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List your organization's batches.
     * @param \App\DTO\ListBatchesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListBatchesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listBatchesResult(
        \App\DTO\ListBatchesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListBatchesResponse
    {
        return $this->getSuccessfulContent(...$this->listBatches($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listFiles
    /**
     * Returns a list of files.
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
     * Returns a list of files.
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
     * Returns a list of files.
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

    //region listFilesInVectorStoreBatch
    /**
     * Returns a list of vector store files in a batch.
     * @param \App\DTO\ListFilesInVectorStoreBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listFilesInVectorStoreBatchRaw(
        \App\DTO\ListFilesInVectorStoreBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vector_stores/{vector_store_id}/file_batches/{batch_id}/files', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of vector store files in a batch.
     * @param \App\DTO\ListFilesInVectorStoreBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listFilesInVectorStoreBatch(
        \App\DTO\ListFilesInVectorStoreBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listFilesInVectorStoreBatchRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListVectorStoreFilesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of vector store files in a batch.
     * @param \App\DTO\ListFilesInVectorStoreBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListVectorStoreFilesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listFilesInVectorStoreBatchResult(
        \App\DTO\ListFilesInVectorStoreBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListVectorStoreFilesResponse
    {
        return $this->getSuccessfulContent(...$this->listFilesInVectorStoreBatch($parameters, $security, $responseMediaType));
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

    //region listInvites
    /**
     * Returns a list of invites in the organization.
     * @param \App\DTO\ListInvitesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listInvitesRaw(
        \App\DTO\ListInvitesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/invites', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of invites in the organization.
     * @param \App\DTO\ListInvitesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listInvites(
        \App\DTO\ListInvitesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listInvitesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Invites listed successfully. */
                $responseContent = new \App\DTO\InviteListResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of invites in the organization.
     * @param \App\DTO\ListInvitesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\InviteListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listInvitesResult(
        \App\DTO\ListInvitesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\InviteListResponse
    {
        return $this->getSuccessfulContent(...$this->listInvites($parameters, $security, $responseMediaType));
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

    //region listProjectApiKeys
    /**
     * Returns a list of API keys in the project.
     * @param \App\DTO\ListProjectApiKeysParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listProjectApiKeysRaw(
        \App\DTO\ListProjectApiKeysParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}/api_keys', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of API keys in the project.
     * @param \App\DTO\ListProjectApiKeysParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listProjectApiKeys(
        \App\DTO\ListProjectApiKeysParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listProjectApiKeysRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project API keys listed successfully. */
                $responseContent = new \App\DTO\ProjectApiKeyListResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of API keys in the project.
     * @param \App\DTO\ListProjectApiKeysParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectApiKeyListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listProjectApiKeysResult(
        \App\DTO\ListProjectApiKeysParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectApiKeyListResponse
    {
        return $this->getSuccessfulContent(...$this->listProjectApiKeys($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listProjectRateLimits
    /**
     * Returns the rate limits per model for a project.
     * @param \App\DTO\ListProjectRateLimitsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listProjectRateLimitsRaw(
        \App\DTO\ListProjectRateLimitsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}/rate_limits', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns the rate limits per model for a project.
     * @param \App\DTO\ListProjectRateLimitsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listProjectRateLimits(
        \App\DTO\ListProjectRateLimitsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listProjectRateLimitsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project rate limits listed successfully. */
                $responseContent = new \App\DTO\ProjectRateLimitListResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns the rate limits per model for a project.
     * @param \App\DTO\ListProjectRateLimitsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectRateLimitListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listProjectRateLimitsResult(
        \App\DTO\ListProjectRateLimitsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectRateLimitListResponse
    {
        return $this->getSuccessfulContent(...$this->listProjectRateLimits($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listProjectServiceAccounts
    /**
     * Returns a list of service accounts in the project.
     * @param \App\DTO\ListProjectServiceAccountsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listProjectServiceAccountsRaw(
        \App\DTO\ListProjectServiceAccountsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}/service_accounts', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of service accounts in the project.
     * @param \App\DTO\ListProjectServiceAccountsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listProjectServiceAccounts(
        \App\DTO\ListProjectServiceAccountsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listProjectServiceAccountsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project service accounts listed successfully. */
                $responseContent = new \App\DTO\ProjectServiceAccountListResponse();
                break;
            case 400:
                /* Error response when project is archived. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of service accounts in the project.
     * @param \App\DTO\ListProjectServiceAccountsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectServiceAccountListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listProjectServiceAccountsResult(
        \App\DTO\ListProjectServiceAccountsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectServiceAccountListResponse
    {
        return $this->getSuccessfulContent(...$this->listProjectServiceAccounts($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listProjectUsers
    /**
     * Returns a list of users in the project.
     * @param \App\DTO\ListProjectUsersParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listProjectUsersRaw(
        \App\DTO\ListProjectUsersParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}/users', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of users in the project.
     * @param \App\DTO\ListProjectUsersParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listProjectUsers(
        \App\DTO\ListProjectUsersParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listProjectUsersRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project users listed successfully. */
                $responseContent = new \App\DTO\ProjectUserListResponse();
                break;
            case 400:
                /* Error response when project is archived. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of users in the project.
     * @param \App\DTO\ListProjectUsersParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectUserListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listProjectUsersResult(
        \App\DTO\ListProjectUsersParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectUserListResponse
    {
        return $this->getSuccessfulContent(...$this->listProjectUsers($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listProjects
    /**
     * Returns a list of projects.
     * @param \App\DTO\ListProjectsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listProjectsRaw(
        \App\DTO\ListProjectsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of projects.
     * @param \App\DTO\ListProjectsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listProjects(
        \App\DTO\ListProjectsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listProjectsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Projects listed successfully. */
                $responseContent = new \App\DTO\ProjectListResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of projects.
     * @param \App\DTO\ListProjectsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listProjectsResult(
        \App\DTO\ListProjectsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectListResponse
    {
        return $this->getSuccessfulContent(...$this->listProjects($parameters, $security, $responseMediaType));
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

    //region listUsers
    /**
     * Lists all of the users in the organization.
     * @param \App\DTO\ListUsersParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listUsersRaw(
        \App\DTO\ListUsersParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/users', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Lists all of the users in the organization.
     * @param \App\DTO\ListUsersParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listUsers(
        \App\DTO\ListUsersParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listUsersRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Users listed successfully. */
                $responseContent = new \App\DTO\UserListResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Lists all of the users in the organization.
     * @param \App\DTO\ListUsersParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UserListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listUsersResult(
        \App\DTO\ListUsersParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserListResponse
    {
        return $this->getSuccessfulContent(...$this->listUsers($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listVectorStoreFiles
    /**
     * Returns a list of vector store files.
     * @param \App\DTO\ListVectorStoreFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listVectorStoreFilesRaw(
        \App\DTO\ListVectorStoreFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vector_stores/{vector_store_id}/files', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of vector store files.
     * @param \App\DTO\ListVectorStoreFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listVectorStoreFiles(
        \App\DTO\ListVectorStoreFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listVectorStoreFilesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListVectorStoreFilesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of vector store files.
     * @param \App\DTO\ListVectorStoreFilesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListVectorStoreFilesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listVectorStoreFilesResult(
        \App\DTO\ListVectorStoreFilesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListVectorStoreFilesResponse
    {
        return $this->getSuccessfulContent(...$this->listVectorStoreFiles($parameters, $security, $responseMediaType));
    }
    //endregion

    //region listVectorStores
    /**
     * Returns a list of vector stores.
     * @param \App\DTO\ListVectorStoresParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listVectorStoresRaw(
        \App\DTO\ListVectorStoresParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/vector_stores', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of vector stores.
     * @param \App\DTO\ListVectorStoresParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listVectorStores(
        \App\DTO\ListVectorStoresParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listVectorStoresRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListVectorStoresResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Returns a list of vector stores.
     * @param \App\DTO\ListVectorStoresParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ListVectorStoresResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listVectorStoresResult(
        \App\DTO\ListVectorStoresParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListVectorStoresResponse
    {
        return $this->getSuccessfulContent(...$this->listVectorStores($parameters, $security, $responseMediaType));
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

    //region modifyProject
    /**
     * Modifies a project in the organization.
     * @param \App\DTO\ModifyProjectParameterData $parameters
     * @param \App\DTO\ProjectUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyProjectRaw(
        \App\DTO\ModifyProjectParameterData $parameters,
        \App\DTO\ProjectUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/projects/{project_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies a project in the organization.
     * @param \App\DTO\ModifyProjectParameterData $parameters
     * @param \App\DTO\ProjectUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyProject(
        \App\DTO\ModifyProjectParameterData $parameters,
        \App\DTO\ProjectUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyProjectRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project updated successfully. */
                $responseContent = new \App\DTO\Project();
                break;
            case 400:
                /* Error response when updating the default project. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies a project in the organization.
     * @param \App\DTO\ModifyProjectParameterData $parameters
     * @param \App\DTO\ProjectUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Project
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyProjectResult(
        \App\DTO\ModifyProjectParameterData $parameters,
        \App\DTO\ProjectUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Project
    {
        return $this->getSuccessfulContent(...$this->modifyProject($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region modifyProjectUser
    /**
     * Modifies a user's role in the project.
     * @param \App\DTO\ModifyProjectUserParameterData $parameters
     * @param \App\DTO\ProjectUserUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyProjectUserRaw(
        \App\DTO\ModifyProjectUserParameterData $parameters,
        \App\DTO\ProjectUserUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/projects/{project_id}/users/{user_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies a user's role in the project.
     * @param \App\DTO\ModifyProjectUserParameterData $parameters
     * @param \App\DTO\ProjectUserUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyProjectUser(
        \App\DTO\ModifyProjectUserParameterData $parameters,
        \App\DTO\ProjectUserUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyProjectUserRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project user's role updated successfully. */
                $responseContent = new \App\DTO\ProjectUser();
                break;
            case 400:
                /* Error response for various conditions. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies a user's role in the project.
     * @param \App\DTO\ModifyProjectUserParameterData $parameters
     * @param \App\DTO\ProjectUserUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ProjectUser
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyProjectUserResult(
        \App\DTO\ModifyProjectUserParameterData $parameters,
        \App\DTO\ProjectUserUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectUser
    {
        return $this->getSuccessfulContent(...$this->modifyProjectUser($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
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

    //region modifyUser
    /**
     * Modifies a user's role in the organization.
     * @param \App\DTO\ModifyUserParameterData $parameters
     * @param \App\DTO\UserRoleUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyUserRaw(
        \App\DTO\ModifyUserParameterData $parameters,
        \App\DTO\UserRoleUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/users/{user_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies a user's role in the organization.
     * @param \App\DTO\ModifyUserParameterData $parameters
     * @param \App\DTO\UserRoleUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyUser(
        \App\DTO\ModifyUserParameterData $parameters,
        \App\DTO\UserRoleUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyUserRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* User role updated successfully. */
                $responseContent = new \App\DTO\User();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies a user's role in the organization.
     * @param \App\DTO\ModifyUserParameterData $parameters
     * @param \App\DTO\UserRoleUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\User
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyUserResult(
        \App\DTO\ModifyUserParameterData $parameters,
        \App\DTO\UserRoleUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\User
    {
        return $this->getSuccessfulContent(...$this->modifyUser($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region modifyVectorStore
    /**
     * Modifies a vector store.
     * @param \App\DTO\ModifyVectorStoreParameterData $parameters
     * @param \App\DTO\UpdateVectorStoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function modifyVectorStoreRaw(
        \App\DTO\ModifyVectorStoreParameterData $parameters,
        \App\DTO\UpdateVectorStoreRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/vector_stores/{vector_store_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Modifies a vector store.
     * @param \App\DTO\ModifyVectorStoreParameterData $parameters
     * @param \App\DTO\UpdateVectorStoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function modifyVectorStore(
        \App\DTO\ModifyVectorStoreParameterData $parameters,
        \App\DTO\UpdateVectorStoreRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->modifyVectorStoreRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\VectorStoreObject();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Modifies a vector store.
     * @param \App\DTO\ModifyVectorStoreParameterData $parameters
     * @param \App\DTO\UpdateVectorStoreRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\VectorStoreObject
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function modifyVectorStoreResult(
        \App\DTO\ModifyVectorStoreParameterData $parameters,
        \App\DTO\UpdateVectorStoreRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\VectorStoreObject
    {
        return $this->getSuccessfulContent(...$this->modifyVectorStore($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region retrieveBatch
    /**
     * Retrieves a batch.
     * @param \App\DTO\RetrieveBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveBatchRaw(
        \App\DTO\RetrieveBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/batches/{batch_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a batch.
     * @param \App\DTO\RetrieveBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveBatch(
        \App\DTO\RetrieveBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveBatchRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Batch retrieved successfully. */
                $responseContent = new \App\DTO\Batch();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a batch.
     * @param \App\DTO\RetrieveBatchParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Batch
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveBatchResult(
        \App\DTO\RetrieveBatchParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Batch
    {
        return $this->getSuccessfulContent(...$this->retrieveBatch($parameters, $security, $responseMediaType));
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

    //region retrieveInvite
    /**
     * Retrieves an invite.
     * @param \App\DTO\RetrieveInviteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveInviteRaw(
        \App\DTO\RetrieveInviteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/invites/{invite_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves an invite.
     * @param \App\DTO\RetrieveInviteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveInvite(
        \App\DTO\RetrieveInviteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveInviteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Invite retrieved successfully. */
                $responseContent = new \App\DTO\Invite();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves an invite.
     * @param \App\DTO\RetrieveInviteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Invite
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveInviteResult(
        \App\DTO\RetrieveInviteParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Invite
    {
        return $this->getSuccessfulContent(...$this->retrieveInvite($parameters, $security, $responseMediaType));
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

    //region retrieveProject
    /**
     * Retrieves a project.
     * @param \App\DTO\RetrieveProjectParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveProjectRaw(
        \App\DTO\RetrieveProjectParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a project.
     * @param \App\DTO\RetrieveProjectParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveProject(
        \App\DTO\RetrieveProjectParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveProjectRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project retrieved successfully. */
                $responseContent = new \App\DTO\Project();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a project.
     * @param \App\DTO\RetrieveProjectParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Project
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveProjectResult(
        \App\DTO\RetrieveProjectParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Project
    {
        return $this->getSuccessfulContent(...$this->retrieveProject($parameters, $security, $responseMediaType));
    }
    //endregion

    //region retrieveProjectApiKey
    /**
     * Retrieves an API key in the project.
     * @param \App\DTO\RetrieveProjectApiKeyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveProjectApiKeyRaw(
        \App\DTO\RetrieveProjectApiKeyParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}/api_keys/{key_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves an API key in the project.
     * @param \App\DTO\RetrieveProjectApiKeyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveProjectApiKey(
        \App\DTO\RetrieveProjectApiKeyParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveProjectApiKeyRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project API key retrieved successfully. */
                $responseContent = new \App\DTO\ProjectApiKey();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves an API key in the project.
     * @param \App\DTO\RetrieveProjectApiKeyParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectApiKey
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveProjectApiKeyResult(
        \App\DTO\RetrieveProjectApiKeyParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectApiKey
    {
        return $this->getSuccessfulContent(...$this->retrieveProjectApiKey($parameters, $security, $responseMediaType));
    }
    //endregion

    //region retrieveProjectServiceAccount
    /**
     * Retrieves a service account in the project.
     * @param \App\DTO\RetrieveProjectServiceAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveProjectServiceAccountRaw(
        \App\DTO\RetrieveProjectServiceAccountParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}/service_accounts/{service_account_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a service account in the project.
     * @param \App\DTO\RetrieveProjectServiceAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveProjectServiceAccount(
        \App\DTO\RetrieveProjectServiceAccountParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveProjectServiceAccountRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project service account retrieved successfully. */
                $responseContent = new \App\DTO\ProjectServiceAccount();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a service account in the project.
     * @param \App\DTO\RetrieveProjectServiceAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectServiceAccount
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveProjectServiceAccountResult(
        \App\DTO\RetrieveProjectServiceAccountParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectServiceAccount
    {
        return $this->getSuccessfulContent(...$this->retrieveProjectServiceAccount($parameters, $security, $responseMediaType));
    }
    //endregion

    //region retrieveProjectUser
    /**
     * Retrieves a user in the project.
     * @param \App\DTO\RetrieveProjectUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveProjectUserRaw(
        \App\DTO\RetrieveProjectUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/projects/{project_id}/users/{user_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a user in the project.
     * @param \App\DTO\RetrieveProjectUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveProjectUser(
        \App\DTO\RetrieveProjectUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveProjectUserRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project user retrieved successfully. */
                $responseContent = new \App\DTO\ProjectUser();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a user in the project.
     * @param \App\DTO\RetrieveProjectUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProjectUser
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveProjectUserResult(
        \App\DTO\RetrieveProjectUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectUser
    {
        return $this->getSuccessfulContent(...$this->retrieveProjectUser($parameters, $security, $responseMediaType));
    }
    //endregion

    //region retrieveUser
    /**
     * Retrieves a user by their identifier.
     * @param \App\DTO\RetrieveUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveUserRaw(
        \App\DTO\RetrieveUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/users/{user_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a user by their identifier.
     * @param \App\DTO\RetrieveUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveUser(
        \App\DTO\RetrieveUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveUserRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* User retrieved successfully. */
                $responseContent = new \App\DTO\User();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Retrieves a user by their identifier.
     * @param \App\DTO\RetrieveUserParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\User
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveUserResult(
        \App\DTO\RetrieveUserParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\User
    {
        return $this->getSuccessfulContent(...$this->retrieveUser($parameters, $security, $responseMediaType));
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

    //region updateProjectRateLimits
    /**
     * Updates a project rate limit.
     * @param \App\DTO\UpdateProjectRateLimitsParameterData $parameters
     * @param \App\DTO\ProjectRateLimitUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function updateProjectRateLimitsRaw(
        \App\DTO\UpdateProjectRateLimitsParameterData $parameters,
        \App\DTO\ProjectRateLimitUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/organization/projects/{project_id}/rate_limits/{rate_limit_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Updates a project rate limit.
     * @param \App\DTO\UpdateProjectRateLimitsParameterData $parameters
     * @param \App\DTO\ProjectRateLimitUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function updateProjectRateLimits(
        \App\DTO\UpdateProjectRateLimitsParameterData $parameters,
        \App\DTO\ProjectRateLimitUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->updateProjectRateLimitsRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Project rate limit updated successfully. */
                $responseContent = new \App\DTO\ProjectRateLimit();
                break;
            case 400:
                /* Error response for various conditions. */
                $responseContent = new \App\DTO\ErrorResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Updates a project rate limit.
     * @param \App\DTO\UpdateProjectRateLimitsParameterData $parameters
     * @param \App\DTO\ProjectRateLimitUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ProjectRateLimit
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function updateProjectRateLimitsResult(
        \App\DTO\UpdateProjectRateLimitsParameterData $parameters,
        \App\DTO\ProjectRateLimitUpdateRequest $requestContent,
        iterable $security = ['ApiKeyAuth' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProjectRateLimit
    {
        return $this->getSuccessfulContent(...$this->updateProjectRateLimits($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region usageAudioSpeeches
    /**
     * Get audio speeches usage details for the organization.
     * @param \App\DTO\UsageAudioSpeechesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageAudioSpeechesRaw(
        \App\DTO\UsageAudioSpeechesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/audio_speeches', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get audio speeches usage details for the organization.
     * @param \App\DTO\UsageAudioSpeechesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageAudioSpeeches(
        \App\DTO\UsageAudioSpeechesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageAudioSpeechesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get audio speeches usage details for the organization.
     * @param \App\DTO\UsageAudioSpeechesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageAudioSpeechesResult(
        \App\DTO\UsageAudioSpeechesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageAudioSpeeches($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageAudioTranscriptions
    /**
     * Get audio transcriptions usage details for the organization.
     * @param \App\DTO\UsageAudioTranscriptionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageAudioTranscriptionsRaw(
        \App\DTO\UsageAudioTranscriptionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/audio_transcriptions', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get audio transcriptions usage details for the organization.
     * @param \App\DTO\UsageAudioTranscriptionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageAudioTranscriptions(
        \App\DTO\UsageAudioTranscriptionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageAudioTranscriptionsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get audio transcriptions usage details for the organization.
     * @param \App\DTO\UsageAudioTranscriptionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageAudioTranscriptionsResult(
        \App\DTO\UsageAudioTranscriptionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageAudioTranscriptions($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageCodeInterpreterSessions
    /**
     * Get code interpreter sessions usage details for the organization.
     * @param \App\DTO\UsageCodeInterpreterSessionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageCodeInterpreterSessionsRaw(
        \App\DTO\UsageCodeInterpreterSessionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/code_interpreter_sessions', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     * @param \App\DTO\UsageCodeInterpreterSessionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageCodeInterpreterSessions(
        \App\DTO\UsageCodeInterpreterSessionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageCodeInterpreterSessionsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get code interpreter sessions usage details for the organization.
     * @param \App\DTO\UsageCodeInterpreterSessionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageCodeInterpreterSessionsResult(
        \App\DTO\UsageCodeInterpreterSessionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageCodeInterpreterSessions($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageCompletions
    /**
     * Get completions usage details for the organization.
     * @param \App\DTO\UsageCompletionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageCompletionsRaw(
        \App\DTO\UsageCompletionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/completions', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get completions usage details for the organization.
     * @param \App\DTO\UsageCompletionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageCompletions(
        \App\DTO\UsageCompletionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageCompletionsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get completions usage details for the organization.
     * @param \App\DTO\UsageCompletionsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageCompletionsResult(
        \App\DTO\UsageCompletionsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageCompletions($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageCosts
    /**
     * Get costs details for the organization.
     * @param \App\DTO\UsageCostsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageCostsRaw(
        \App\DTO\UsageCostsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/costs', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get costs details for the organization.
     * @param \App\DTO\UsageCostsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageCosts(
        \App\DTO\UsageCostsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageCostsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Costs data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get costs details for the organization.
     * @param \App\DTO\UsageCostsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageCostsResult(
        \App\DTO\UsageCostsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageCosts($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageEmbeddings
    /**
     * Get embeddings usage details for the organization.
     * @param \App\DTO\UsageEmbeddingsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageEmbeddingsRaw(
        \App\DTO\UsageEmbeddingsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/embeddings', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get embeddings usage details for the organization.
     * @param \App\DTO\UsageEmbeddingsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageEmbeddings(
        \App\DTO\UsageEmbeddingsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageEmbeddingsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get embeddings usage details for the organization.
     * @param \App\DTO\UsageEmbeddingsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageEmbeddingsResult(
        \App\DTO\UsageEmbeddingsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageEmbeddings($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageImages
    /**
     * Get images usage details for the organization.
     * @param \App\DTO\UsageImagesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageImagesRaw(
        \App\DTO\UsageImagesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/images', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get images usage details for the organization.
     * @param \App\DTO\UsageImagesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageImages(
        \App\DTO\UsageImagesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageImagesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get images usage details for the organization.
     * @param \App\DTO\UsageImagesParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageImagesResult(
        \App\DTO\UsageImagesParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageImages($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageModerations
    /**
     * Get moderations usage details for the organization.
     * @param \App\DTO\UsageModerationsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageModerationsRaw(
        \App\DTO\UsageModerationsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/moderations', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get moderations usage details for the organization.
     * @param \App\DTO\UsageModerationsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageModerations(
        \App\DTO\UsageModerationsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageModerationsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get moderations usage details for the organization.
     * @param \App\DTO\UsageModerationsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageModerationsResult(
        \App\DTO\UsageModerationsParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageModerations($parameters, $security, $responseMediaType));
    }
    //endregion

    //region usageVectorStores
    /**
     * Get vector stores usage details for the organization.
     * @param \App\DTO\UsageVectorStoresParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function usageVectorStoresRaw(
        \App\DTO\UsageVectorStoresParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/organization/usage/vector_stores', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get vector stores usage details for the organization.
     * @param \App\DTO\UsageVectorStoresParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function usageVectorStores(
        \App\DTO\UsageVectorStoresParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->usageVectorStoresRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Usage data retrieved successfully. */
                $responseContent = new \App\DTO\UsageResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get vector stores usage details for the organization.
     * @param \App\DTO\UsageVectorStoresParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UsageResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function usageVectorStoresResult(
        \App\DTO\UsageVectorStoresParameterData $parameters,
        iterable $security = ['ApiKeyAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UsageResponse
    {
        return $this->getSuccessfulContent(...$this->usageVectorStores($parameters, $security, $responseMediaType));
    }
    //endregion
}

