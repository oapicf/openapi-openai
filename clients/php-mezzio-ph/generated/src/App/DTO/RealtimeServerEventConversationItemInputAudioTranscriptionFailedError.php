<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of the transcription error.
 */
class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
{
    /**
     * The type of error.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Error code, if any.
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $code;

    /**
     * A human-readable error message.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

    /**
     * Parameter related to the error, if any.
     * @DTA\Data(field="param", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $param;

}
