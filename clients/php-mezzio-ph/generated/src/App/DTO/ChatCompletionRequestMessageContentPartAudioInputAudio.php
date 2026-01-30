<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionRequestMessageContentPartAudioInputAudio
{
    /**
     * Base64 encoded audio data.
     * @DTA\Data(field="data")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $data;

    /**
     * The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;.
     * @DTA\Data(field="format")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $format;

}
