<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The request counts for different statuses within the batch.
 */
class BatchRequestCounts
{
    /**
     * Total number of requests in the batch.
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total = null;

    /**
     * Number of requests that have been completed successfully.
     * @DTA\Data(field="completed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $completed = null;

    /**
     * Number of requests that have failed.
     * @DTA\Data(field="failed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $failed = null;

}
