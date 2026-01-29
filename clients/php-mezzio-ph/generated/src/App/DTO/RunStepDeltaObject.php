<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming.
 */
class RunStepDeltaObject
{
    /**
     * The identifier of the run step, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The object type, which is always &#x60;thread.run.step.delta&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="delta")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaObjectDelta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaObjectDelta::class})
     * @var \App\DTO\RunStepDeltaObjectDelta|null
     */
    public $delta;

}
