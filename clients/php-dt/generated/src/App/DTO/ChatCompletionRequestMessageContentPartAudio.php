<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Learn about [audio inputs](/docs/guides/audio).
 */
class ChatCompletionRequestMessageContentPartAudio
{
    /**
     * The type of the content part. Always &#x60;input_audio&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="input_audio")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio::class})
     */
    public ?\App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio $input_audio = null;

}
