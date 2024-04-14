<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for cancelFineTune
 */
class CancelFineTuneParameterData
{
    /**
     * The ID of the fine-tune job to cancel
     * @DTA\Data(subset="path", field="fine_tune_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $fine_tune_id = null;

}