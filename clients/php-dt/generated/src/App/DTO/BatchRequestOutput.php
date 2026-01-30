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
     */
    public ?string $id = null;

    /**
     * A developer-provided per-request id that will be used to match outputs to inputs.
     * @DTA\Data(field="custom_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $custom_id = null;

    /**
     * @DTA\Data(field="response", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchRequestOutputResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchRequestOutputResponse::class})
     */
    public ?\App\DTO\BatchRequestOutputResponse $response = null;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchRequestOutputError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchRequestOutputError::class})
     */
    public ?\App\DTO\BatchRequestOutputError $error = null;

}
