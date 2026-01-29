<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The delta containing the fields that have changed on the run step.
 */
class RunStepDeltaObjectDelta
{
    /**
     * @DTA\Data(field="step_details", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaObjectDeltaStepDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaObjectDeltaStepDetails::class})
     */
    public ?\App\DTO\RunStepDeltaObjectDeltaStepDetails $step_details = null;

}
