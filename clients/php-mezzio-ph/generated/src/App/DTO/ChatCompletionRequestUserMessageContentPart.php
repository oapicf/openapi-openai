<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionRequestUserMessageContentPart
{
    /**
     * The type of the content part.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The text content.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * @DTA\Data(field="image_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartImageImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartImageImageUrl::class})
     * @var \App\DTO\ChatCompletionRequestMessageContentPartImageImageUrl|null
     */
    public $image_url;

    /**
     * @DTA\Data(field="input_audio")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio::class})
     * @var \App\DTO\ChatCompletionRequestMessageContentPartAudioInputAudio|null
     */
    public $input_audio;

}
