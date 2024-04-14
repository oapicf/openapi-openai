<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for cancelFineTuningJob
 */
class CancelFineTuningJobParameterData
{
    /**
     * The ID of the fine-tuning job to cancel.
     * @DTA\Data(subset="path", field="fine_tuning_job_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $fine_tuning_job_id = null;

}
