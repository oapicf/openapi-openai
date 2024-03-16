<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 * The version of the OpenAPI document: 2.0.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region cancelFineTune
    /**
     * Immediately cancel a fine-tune job.
     * @param \App\DTO\CancelFineTuneParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function cancelFineTuneRaw(
        \App\DTO\CancelFineTuneParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/fine-tunes/{fine_tune_id}/cancel', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Immediately cancel a fine-tune job.
     * @param \App\DTO\CancelFineTuneParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function cancelFineTune(
        \App\DTO\CancelFineTuneParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->cancelFineTuneRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\FineTune();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Immediately cancel a fine-tune job.
     * @param \App\DTO\CancelFineTuneParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\FineTune
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function cancelFineTuneResult(
        \App\DTO\CancelFineTuneParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\FineTune
    {
        return $this->getSuccessfulContent(...$this->cancelFineTune($parameters, $responseMediaType));
    }
    //endregion

    //region createChatCompletion
    /**
     * Creates a model response for the given chat conversation.
     * @param \App\DTO\CreateChatCompletionRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createChatCompletionRaw(
        \App\DTO\CreateChatCompletionRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/chat/completions', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param \App\DTO\CreateChatCompletionRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createChatCompletion(
        \App\DTO\CreateChatCompletionRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createChatCompletionRaw($requestContent, $requestMediaType, $responseMediaType);
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
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateChatCompletionResponse
    {
        return $this->getSuccessfulContent(...$this->createChatCompletion($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createCompletion
    /**
     * Creates a completion for the provided prompt and parameters.
     * @param \App\DTO\CreateCompletionRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createCompletionRaw(
        \App\DTO\CreateCompletionRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/completions', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param \App\DTO\CreateCompletionRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createCompletion(
        \App\DTO\CreateCompletionRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createCompletionRaw($requestContent, $requestMediaType, $responseMediaType);
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
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateCompletionResponse
    {
        return $this->getSuccessfulContent(...$this->createCompletion($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createEdit
    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param \App\DTO\CreateEditRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createEditRaw(
        \App\DTO\CreateEditRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/edits', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param \App\DTO\CreateEditRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createEdit(
        \App\DTO\CreateEditRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createEditRaw($requestContent, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateEditResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param \App\DTO\CreateEditRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateEditResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createEditResult(
        \App\DTO\CreateEditRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateEditResponse
    {
        return $this->getSuccessfulContent(...$this->createEdit($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createEmbedding
    /**
     * Creates an embedding vector representing the input text.
     * @param \App\DTO\CreateEmbeddingRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createEmbeddingRaw(
        \App\DTO\CreateEmbeddingRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/embeddings', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param \App\DTO\CreateEmbeddingRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createEmbedding(
        \App\DTO\CreateEmbeddingRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createEmbeddingRaw($requestContent, $requestMediaType, $responseMediaType);
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
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateEmbeddingResponse
    {
        return $this->getSuccessfulContent(...$this->createEmbedding($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createFile
    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
     * @param \App\DTO\CreateFileRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createFileRaw(
        \App\DTO\CreateFileRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/files', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
     * @param \App\DTO\CreateFileRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createFile(
        \App\DTO\CreateFileRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createFileRaw($requestContent, $requestMediaType, $responseMediaType);
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
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
     * @param \App\DTO\CreateFileRequest $requestContent
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
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\OpenAIFile
    {
        return $this->getSuccessfulContent(...$this->createFile($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createFineTune
    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\CreateFineTuneRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createFineTuneRaw(
        \App\DTO\CreateFineTuneRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/fine-tunes', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\CreateFineTuneRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createFineTune(
        \App\DTO\CreateFineTuneRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createFineTuneRaw($requestContent, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\FineTune();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\CreateFineTuneRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\FineTune
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createFineTuneResult(
        \App\DTO\CreateFineTuneRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\FineTune
    {
        return $this->getSuccessfulContent(...$this->createFineTune($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createImage
    /**
     * Creates an image given a prompt.
     * @param \App\DTO\CreateImageRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createImageRaw(
        \App\DTO\CreateImageRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/images/generations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates an image given a prompt.
     * @param \App\DTO\CreateImageRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createImage(
        \App\DTO\CreateImageRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createImageRaw($requestContent, $requestMediaType, $responseMediaType);
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
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ImagesResponse
    {
        return $this->getSuccessfulContent(...$this->createImage($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createImageEdit
    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param \App\DTO\CreateImageEditRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createImageEditRaw(
        \App\DTO\CreateImageEditRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/images/edits', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param \App\DTO\CreateImageEditRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createImageEdit(
        \App\DTO\CreateImageEditRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createImageEditRaw($requestContent, $requestMediaType, $responseMediaType);
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
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ImagesResponse
    {
        return $this->getSuccessfulContent(...$this->createImageEdit($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createImageVariation
    /**
     * Creates a variation of a given image.
     * @param \App\DTO\CreateImageVariationRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createImageVariationRaw(
        \App\DTO\CreateImageVariationRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/images/variations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Creates a variation of a given image.
     * @param \App\DTO\CreateImageVariationRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createImageVariation(
        \App\DTO\CreateImageVariationRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createImageVariationRaw($requestContent, $requestMediaType, $responseMediaType);
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
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ImagesResponse
    {
        return $this->getSuccessfulContent(...$this->createImageVariation($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createModeration
    /**
     * Classifies if text violates OpenAI's Content Policy
     * @param \App\DTO\CreateModerationRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createModerationRaw(
        \App\DTO\CreateModerationRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/moderations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Classifies if text violates OpenAI's Content Policy
     * @param \App\DTO\CreateModerationRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createModeration(
        \App\DTO\CreateModerationRequest $requestContent,
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createModerationRaw($requestContent, $requestMediaType, $responseMediaType);
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
     * Classifies if text violates OpenAI's Content Policy
     * @param \App\DTO\CreateModerationRequest $requestContent
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
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateModerationResponse
    {
        return $this->getSuccessfulContent(...$this->createModeration($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createTranscription
    /**
     * Transcribes audio into the input language.
     * @param \App\DTO\CreateTranscriptionRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createTranscriptionRaw(
        \App\DTO\CreateTranscriptionRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/audio/transcriptions', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Transcribes audio into the input language.
     * @param \App\DTO\CreateTranscriptionRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createTranscription(
        \App\DTO\CreateTranscriptionRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createTranscriptionRaw($requestContent, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateTranscriptionResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Transcribes audio into the input language.
     * @param \App\DTO\CreateTranscriptionRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateTranscriptionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createTranscriptionResult(
        \App\DTO\CreateTranscriptionRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateTranscriptionResponse
    {
        return $this->getSuccessfulContent(...$this->createTranscription($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region createTranslation
    /**
     * Translates audio into English.
     * @param \App\DTO\CreateTranslationRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function createTranslationRaw(
        \App\DTO\CreateTranslationRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/audio/translations', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Translates audio into English.
     * @param \App\DTO\CreateTranslationRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function createTranslation(
        \App\DTO\CreateTranslationRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->createTranslationRaw($requestContent, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\CreateTranslationResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Translates audio into English.
     * @param \App\DTO\CreateTranslationRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateTranslationResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function createTranslationResult(
        \App\DTO\CreateTranslationRequest $requestContent,
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateTranslationResponse
    {
        return $this->getSuccessfulContent(...$this->createTranslation($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region deleteFile
    /**
     * Delete a file.
     * @param \App\DTO\DeleteFileParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteFileRaw(
        \App\DTO\DeleteFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete a file.
     * @param \App\DTO\DeleteFileParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteFile(
        \App\DTO\DeleteFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteFileRaw($parameters, $responseMediaType);
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
     * @param string $responseMediaType
     * @return \App\DTO\DeleteFileResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteFileResult(
        \App\DTO\DeleteFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteFileResponse
    {
        return $this->getSuccessfulContent(...$this->deleteFile($parameters, $responseMediaType));
    }
    //endregion

    //region deleteModel
    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @param \App\DTO\DeleteModelParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deleteModelRaw(
        \App\DTO\DeleteModelParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/models/{model}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @param \App\DTO\DeleteModelParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deleteModel(
        \App\DTO\DeleteModelParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deleteModelRaw($parameters, $responseMediaType);
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
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @param \App\DTO\DeleteModelParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\DeleteModelResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deleteModelResult(
        \App\DTO\DeleteModelParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeleteModelResponse
    {
        return $this->getSuccessfulContent(...$this->deleteModel($parameters, $responseMediaType));
    }
    //endregion

    //region downloadFile
    /**
     * Returns the contents of the specified file
     * @param \App\DTO\DownloadFileParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function downloadFileRaw(
        \App\DTO\DownloadFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/files/{file_id}/content', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns the contents of the specified file
     * @param \App\DTO\DownloadFileParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function downloadFile(
        \App\DTO\DownloadFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->downloadFileRaw($parameters, $responseMediaType);
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
     * Returns the contents of the specified file
     * @param \App\DTO\DownloadFileParameterData $parameters
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function downloadFileResult(
        \App\DTO\DownloadFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->downloadFile($parameters, $responseMediaType));
    }
    //endregion

    //region listFiles
    /**
     * Returns a list of files that belong to the user's organization.
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listFilesRaw(
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/files', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns a list of files that belong to the user's organization.
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listFiles(
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listFilesRaw($responseMediaType);
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
     * @param string $responseMediaType
     * @return \App\DTO\ListFilesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listFilesResult(
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListFilesResponse
    {
        return $this->getSuccessfulContent(...$this->listFiles($responseMediaType));
    }
    //endregion

    //region listFineTuneEvents
    /**
     * Get fine-grained status updates for a fine-tune job.
     * @param \App\DTO\ListFineTuneEventsParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listFineTuneEventsRaw(
        \App\DTO\ListFineTuneEventsParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/fine-tunes/{fine_tune_id}/events', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get fine-grained status updates for a fine-tune job.
     * @param \App\DTO\ListFineTuneEventsParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listFineTuneEvents(
        \App\DTO\ListFineTuneEventsParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listFineTuneEventsRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListFineTuneEventsResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get fine-grained status updates for a fine-tune job.
     * @param \App\DTO\ListFineTuneEventsParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\ListFineTuneEventsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listFineTuneEventsResult(
        \App\DTO\ListFineTuneEventsParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListFineTuneEventsResponse
    {
        return $this->getSuccessfulContent(...$this->listFineTuneEvents($parameters, $responseMediaType));
    }
    //endregion

    //region listFineTunes
    /**
     * List your organization's fine-tuning jobs
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listFineTunesRaw(
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/fine-tunes', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List your organization's fine-tuning jobs
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listFineTunes(
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listFineTunesRaw($responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\ListFineTunesResponse();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List your organization's fine-tuning jobs
     * @param string $responseMediaType
     * @return \App\DTO\ListFineTunesResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listFineTunesResult(
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListFineTunesResponse
    {
        return $this->getSuccessfulContent(...$this->listFineTunes($responseMediaType));
    }
    //endregion

    //region listModels
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function listModelsRaw(
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/models', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function listModels(
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->listModelsRaw($responseMediaType);
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
     * @param string $responseMediaType
     * @return \App\DTO\ListModelsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function listModelsResult(
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListModelsResponse
    {
        return $this->getSuccessfulContent(...$this->listModels($responseMediaType));
    }
    //endregion

    //region retrieveFile
    /**
     * Returns information about a specific file.
     * @param \App\DTO\RetrieveFileParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveFileRaw(
        \App\DTO\RetrieveFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/files/{file_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Returns information about a specific file.
     * @param \App\DTO\RetrieveFileParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveFile(
        \App\DTO\RetrieveFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveFileRaw($parameters, $responseMediaType);
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
     * @param string $responseMediaType
     * @return \App\DTO\OpenAIFile
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveFileResult(
        \App\DTO\RetrieveFileParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\OpenAIFile
    {
        return $this->getSuccessfulContent(...$this->retrieveFile($parameters, $responseMediaType));
    }
    //endregion

    //region retrieveFineTune
    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\RetrieveFineTuneParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveFineTuneRaw(
        \App\DTO\RetrieveFineTuneParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/fine-tunes/{fine_tune_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\RetrieveFineTuneParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveFineTune(
        \App\DTO\RetrieveFineTuneParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveFineTuneRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                $responseContent = new \App\DTO\FineTune();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
     * @param \App\DTO\RetrieveFineTuneParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\FineTune
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveFineTuneResult(
        \App\DTO\RetrieveFineTuneParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\FineTune
    {
        return $this->getSuccessfulContent(...$this->retrieveFineTune($parameters, $responseMediaType));
    }
    //endregion

    //region retrieveModel
    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param \App\DTO\RetrieveModelParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveModelRaw(
        \App\DTO\RetrieveModelParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/models/{model}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param \App\DTO\RetrieveModelParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveModel(
        \App\DTO\RetrieveModelParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->retrieveModelRaw($parameters, $responseMediaType);
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
     * @param string $responseMediaType
     * @return \App\DTO\Model
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveModelResult(
        \App\DTO\RetrieveModelParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\Model
    {
        return $this->getSuccessfulContent(...$this->retrieveModel($parameters, $responseMediaType));
    }
    //endregion
}

