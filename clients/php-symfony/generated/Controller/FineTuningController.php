<?php

/**
 * FineTuningController
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Controller;

use \Exception;
use JMS\Serializer\Exception\RuntimeException as SerializerRuntimeException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use OpenAPI\Server\Api\FineTuningApiInterface;
use OpenAPI\Server\Model\CreateFineTuningJobRequest;
use OpenAPI\Server\Model\FineTuningJob;
use OpenAPI\Server\Model\ListFineTuningJobCheckpointsResponse;
use OpenAPI\Server\Model\ListFineTuningJobEventsResponse;
use OpenAPI\Server\Model\ListPaginatedFineTuningJobsResponse;

/**
 * FineTuningController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class FineTuningController extends Controller
{

    /**
     * Operation cancelFineTuningJob
     *
     * Immediately cancel a fine-tune job.
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function cancelFineTuningJobAction(Request $request, $fineTuningJobId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'ApiKeyAuth' required
        // HTTP bearer authentication required
        $securityApiKeyAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $fineTuningJobId = $this->deserialize($fineTuningJobId, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($fineTuningJobId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'ApiKeyAuth'
            $handler->setApiKeyAuth($securityApiKeyAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->cancelFineTuningJob($fineTuningJobId, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'OK',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation createFineTuningJob
     *
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createFineTuningJobAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        if (!static::isContentTypeAllowed($request, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'ApiKeyAuth' required
        // HTTP bearer authentication required
        $securityApiKeyAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $createFineTuningJobRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $createFineTuningJobRequest = $this->deserialize($createFineTuningJobRequest, 'OpenAPI\Server\Model\CreateFineTuningJobRequest', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\CreateFineTuningJobRequest");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createFineTuningJobRequest, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'ApiKeyAuth'
            $handler->setApiKeyAuth($securityApiKeyAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->createFineTuningJob($createFineTuningJobRequest, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'OK',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation listFineTuningEvents
     *
     * Get status updates for a fine-tuning job.
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function listFineTuningEventsAction(Request $request, $fineTuningJobId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'ApiKeyAuth' required
        // HTTP bearer authentication required
        $securityApiKeyAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $after = $request->query->get('after');
        $limit = $request->query->get('limit', 20);

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $fineTuningJobId = $this->deserialize($fineTuningJobId, 'string', 'string');
            $after = $this->deserialize($after, 'string', 'string');
            $limit = $this->deserialize($limit, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($fineTuningJobId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($after, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($limit, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'ApiKeyAuth'
            $handler->setApiKeyAuth($securityApiKeyAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->listFineTuningEvents($fineTuningJobId, $after, $limit, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'OK',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation listFineTuningJobCheckpoints
     *
     * List checkpoints for a fine-tuning job.
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function listFineTuningJobCheckpointsAction(Request $request, $fineTuningJobId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'ApiKeyAuth' required
        // HTTP bearer authentication required
        $securityApiKeyAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $after = $request->query->get('after');
        $limit = $request->query->get('limit', 10);

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $fineTuningJobId = $this->deserialize($fineTuningJobId, 'string', 'string');
            $after = $this->deserialize($after, 'string', 'string');
            $limit = $this->deserialize($limit, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($fineTuningJobId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($after, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($limit, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'ApiKeyAuth'
            $handler->setApiKeyAuth($securityApiKeyAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->listFineTuningJobCheckpoints($fineTuningJobId, $after, $limit, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'OK',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation listPaginatedFineTuningJobs
     *
     * List your organization's fine-tuning jobs
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function listPaginatedFineTuningJobsAction(Request $request)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'ApiKeyAuth' required
        // HTTP bearer authentication required
        $securityApiKeyAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $after = $request->query->get('after');
        $limit = $request->query->get('limit', 20);

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $after = $this->deserialize($after, 'string', 'string');
            $limit = $this->deserialize($limit, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($after, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $response = $this->validate($limit, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'ApiKeyAuth'
            $handler->setApiKeyAuth($securityApiKeyAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->listPaginatedFineTuningJobs($after, $limit, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'OK',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation retrieveFineTuningJob
     *
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function retrieveFineTuningJobAction(Request $request, $fineTuningJobId)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'ApiKeyAuth' required
        // HTTP bearer authentication required
        $securityApiKeyAuth = $request->headers->get('authorization');

        // Read out all input parameter values into variables

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $fineTuningJobId = $this->deserialize($fineTuningJobId, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($fineTuningJobId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'ApiKeyAuth'
            $handler->setApiKeyAuth($securityApiKeyAuth);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->retrieveFineTuningJob($fineTuningJobId, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'OK',
                default => '',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return FineTuningApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('fineTuning');
    }
}
