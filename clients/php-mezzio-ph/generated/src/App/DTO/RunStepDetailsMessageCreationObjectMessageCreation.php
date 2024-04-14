<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RunStepDetailsMessageCreationObjectMessageCreation
{
    /**
     * The ID of the message that was created by this run step.
     * @DTA\Data(field="message_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message_id;

}
