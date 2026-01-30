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
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="input_audio")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio::class})
     * @var \App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio|null
     */
    public $input_audio;

}
