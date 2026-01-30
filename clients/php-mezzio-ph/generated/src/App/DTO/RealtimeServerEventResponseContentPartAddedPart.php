<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The content part that was added.
 */
class RealtimeServerEventResponseContentPartAddedPart
{
    /**
     * The content type (\&quot;text\&quot;, \&quot;audio\&quot;).
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The text content (if type is \&quot;text\&quot;).
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * Base64-encoded audio data (if type is \&quot;audio\&quot;).
     * @DTA\Data(field="audio", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $audio;

    /**
     * The transcript of the audio (if type is \&quot;audio\&quot;).
     * @DTA\Data(field="transcript", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $transcript;

}
