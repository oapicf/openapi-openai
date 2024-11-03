<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for retrieveFineTuningJob
 */
class RetrieveFineTuningJobParameterData
{
    /**
     * The ID of the fine-tuning job.
     * @DTA\Data(subset="path", field="fine_tuning_job_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $fine_tuning_job_id = null;

}
