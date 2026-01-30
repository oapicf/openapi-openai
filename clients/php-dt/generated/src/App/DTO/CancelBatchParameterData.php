<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for cancelBatch
 */
class CancelBatchParameterData
{
    /**
     * The ID of the batch to cancel.
     * @DTA\Data(subset="path", field="batch_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $batch_id = null;

}
