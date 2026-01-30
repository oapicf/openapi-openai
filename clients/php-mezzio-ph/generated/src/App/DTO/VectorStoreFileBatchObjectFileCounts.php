<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VectorStoreFileBatchObjectFileCounts
{
    /**
     * The number of files that are currently being processed.
     * @DTA\Data(field="in_progress")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $in_progress;

    /**
     * The number of files that have been processed.
     * @DTA\Data(field="completed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $completed;

    /**
     * The number of files that have failed to process.
     * @DTA\Data(field="failed")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $failed;

    /**
     * The number of files that where cancelled.
     * @DTA\Data(field="cancelled")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $cancelled;

    /**
     * The total number of files.
     * @DTA\Data(field="total")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $total;

}
