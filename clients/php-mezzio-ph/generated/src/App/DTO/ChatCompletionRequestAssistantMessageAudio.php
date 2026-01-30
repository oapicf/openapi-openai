<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio).
 */
class ChatCompletionRequestAssistantMessageAudio
{
    /**
     * Unique identifier for a previous audio response from the model.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

}
