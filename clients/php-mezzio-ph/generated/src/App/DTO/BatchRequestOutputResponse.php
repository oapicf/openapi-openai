<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BatchRequestOutputResponse
{
    /**
     * The HTTP status code of the response
     * @DTA\Data(field="status_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $status_code;

    /**
     * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
     * @DTA\Data(field="request_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $request_id;

    /**
     * The JSON body of the response
     * @DTA\Data(field="body", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $body;

}
