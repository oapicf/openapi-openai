<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateSpeechRequest
{
    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateSpeechRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateSpeechRequestModel::class})
     */
    public ?\App\DTO\CreateSpeechRequestModel $model = null;

    /**
     * The text to generate audio for. The maximum length is 4096 characters.
     * @DTA\Data(field="input")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":4096})
     */
    public ?string $input = null;

    /**
     * The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
     * @DTA\Data(field="voice")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $voice = null;

    /**
     * The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
     * @DTA\Data(field="response_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_format = null;

    /**
     * The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
     * @DTA\Data(field="speed", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0.25, "max":4})
     */
    public ?float $speed = null;

}
