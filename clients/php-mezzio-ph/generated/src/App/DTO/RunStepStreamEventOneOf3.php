<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
 */
class RunStepStreamEventOneOf3
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepObject::class})
     * @var \App\DTO\RunStepObject|null
     */
    public $data;

}
