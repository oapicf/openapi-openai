<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of the message creation by the run step.
 */
class RunStepDetailsMessageCreationObject
{
    /**
     * Always &#x60;message_creation&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="message_creation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsMessageCreationObjectMessageCreation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsMessageCreationObjectMessageCreation::class})
     */
    public ?\App\DTO\RunStepDetailsMessageCreationObjectMessageCreation $message_creation = null;

}
