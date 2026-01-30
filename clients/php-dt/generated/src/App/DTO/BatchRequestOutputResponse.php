<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BatchRequestOutputResponse
{
    /**
     * The HTTP status code of the response
     * @DTA\Data(field="status_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $status_code = null;

    /**
     * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
     * @DTA\Data(field="request_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $request_id = null;

    /**
     * The JSON body of the response
     * @DTA\Data(field="body", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $body = null;

}
