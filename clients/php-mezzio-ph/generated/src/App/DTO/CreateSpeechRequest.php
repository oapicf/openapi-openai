<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateSpeechRequest
{
    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateSpeechRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateSpeechRequestModel::class})
     * @var \App\DTO\CreateSpeechRequestModel|null
     */
    public $model;

    /**
     * The text to generate audio for. The maximum length is 4096 characters.
     * @DTA\Data(field="input")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":4096})
     * @var string|null
     */
    public $input;

    /**
     * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
     * @DTA\Data(field="voice")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $voice;

    /**
     * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
     * @DTA\Data(field="response_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_format;

    /**
     * The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
     * @DTA\Data(field="speed", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0.25, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":4, "inclusive":true})
     * @var float|null
     */
    public $speed;

}
