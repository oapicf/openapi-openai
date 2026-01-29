<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
{
    /**
     * The ID of the message that was created by this run step.
     * @DTA\Data(field="message_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message_id = null;

}
