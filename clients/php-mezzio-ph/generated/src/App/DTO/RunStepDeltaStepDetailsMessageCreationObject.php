<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of the message creation by the run step.
 */
class RunStepDeltaStepDetailsMessageCreationObject
{
    /**
     * Always &#x60;message_creation&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="message_creation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaStepDetailsMessageCreationObjectMessageCreation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaStepDetailsMessageCreationObjectMessageCreation::class})
     * @var \App\DTO\RunStepDeltaStepDetailsMessageCreationObjectMessageCreation|null
     */
    public $message_creation;

}
