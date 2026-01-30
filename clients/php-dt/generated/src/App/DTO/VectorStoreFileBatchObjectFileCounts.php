<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class VectorStoreFileBatchObjectFileCounts
{
    /**
     * The number of files that are currently being processed.
     * @DTA\Data(field="in_progress")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $in_progress = null;

    /**
     * The number of files that have been processed.
     * @DTA\Data(field="completed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $completed = null;

    /**
     * The number of files that have failed to process.
     * @DTA\Data(field="failed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $failed = null;

    /**
     * The number of files that where cancelled.
     * @DTA\Data(field="cancelled")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $cancelled = null;

    /**
     * The total number of files.
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total = null;

}
