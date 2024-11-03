<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
 */
class RunStepStreamEventOneOf1
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepObject::class})
     */
    public ?\App\DTO\RunStepObject $data = null;

}
