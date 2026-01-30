<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 */
class RunStepStreamEventOneOf2
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaObject::class})
     */
    public ?\App\DTO\RunStepDeltaObject $data = null;

}
