<?php

/**
 * ImagesController
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
use OpenAPI\Server\Api\ImagesApiInterface;
use OpenAPI\Server\Model\CreateImageEditRequestModel;
use OpenAPI\Server\Model\CreateImageRequest;
use OpenAPI\Server\Model\ImagesResponse;

/**
 * ImagesController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class ImagesController extends Controller
{

    /**
     * Operation createImage
     *
     * Creates an image given a prompt.
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createImageAction(Request $request)
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

        // Read out all input parameter values into variables
        $createImageRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $inputFormat = $request->getMimeType($request->getContentType());
            $createImageRequest = $this->deserialize($createImageRequest, 'OpenAPI\Server\Model\CreateImageRequest', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\CreateImageRequest");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($createImageRequest, $asserts);
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

            $result = $handler->createImage($createImageRequest, $responseCode, $responseHeaders);

            // Find default response message
            $message = '';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'OK';
                    break;
            }

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
     * Operation createImageEdit
     *
     * Creates an edited or extended image given an original image and a prompt.
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createImageEditAction(Request $request)
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

        // Read out all input parameter values into variables
        $image = $request->files->get('image');
        $prompt = $request->request->get('prompt');
        $mask = $request->files->get('mask');
        $model = $request->request->get('model');
        $n = $request->request->get('n', 1);
        $size = $request->request->get('size', '1024x1024');
        $responseFormat = $request->request->get('responseFormat', 'url');
        $user = $request->request->get('user');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $prompt = $this->deserialize($prompt, 'string', 'string');
            $model = $this->deserialize($model, 'OpenAPI\Server\Model\CreateImageEditRequestModel', 'string');
            $n = $this->deserialize($n, 'int', 'string');
            $size = $this->deserialize($size, 'string', 'string');
            $responseFormat = $this->deserialize($responseFormat, 'string', 'string');
            $user = $this->deserialize($user, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\File();
        $response = $this->validate($image, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($prompt, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\File();
        $response = $this->validate($mask, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\CreateImageEditRequestModel");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($model, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThanOrEqual(1);
        $asserts[] = new Assert\LessThanOrEqual(10);
        $response = $this->validate($n, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Choice([ "256x256", "512x512", "1024x1024" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($size, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Choice([ "url", "b64_json" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($responseFormat, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($user, $asserts);
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

            $result = $handler->createImageEdit($image, $prompt, $mask, $model, $n, $size, $responseFormat, $user, $responseCode, $responseHeaders);

            // Find default response message
            $message = '';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'OK';
                    break;
            }

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
     * Operation createImageVariation
     *
     * Creates a variation of a given image.
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function createImageVariationAction(Request $request)
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

        // Read out all input parameter values into variables
        $image = $request->files->get('image');
        $model = $request->request->get('model');
        $n = $request->request->get('n', 1);
        $responseFormat = $request->request->get('responseFormat', 'url');
        $size = $request->request->get('size', '1024x1024');
        $user = $request->request->get('user');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $model = $this->deserialize($model, 'OpenAPI\Server\Model\CreateImageEditRequestModel', 'string');
            $n = $this->deserialize($n, 'int', 'string');
            $responseFormat = $this->deserialize($responseFormat, 'string', 'string');
            $size = $this->deserialize($size, 'string', 'string');
            $user = $this->deserialize($user, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\File();
        $response = $this->validate($image, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\CreateImageEditRequestModel");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($model, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThanOrEqual(1);
        $asserts[] = new Assert\LessThanOrEqual(10);
        $response = $this->validate($n, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Choice([ "url", "b64_json" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($responseFormat, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Choice([ "256x256", "512x512", "1024x1024" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($size, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($user, $asserts);
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

            $result = $handler->createImageVariation($image, $model, $n, $responseFormat, $size, $user, $responseCode, $responseHeaders);

            // Find default response message
            $message = '';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'OK';
                    break;
            }

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
     * @return ImagesApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('images');
    }
}
