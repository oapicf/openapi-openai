<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The per-line object of the batch output and error files
 */
class BatchRequestOutput
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * A developer-provided per-request id that will be used to match outputs to inputs.
     * @DTA\Data(field="custom_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $custom_id;

    /**
     * @DTA\Data(field="response", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchRequestOutputResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchRequestOutputResponse::class})
     * @var \App\DTO\BatchRequestOutputResponse|null
     */
    public $response;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchRequestOutputError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchRequestOutputError::class})
     * @var \App\DTO\BatchRequestOutputError|null
     */
    public $error;

}
