<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateTranscriptionRequest
{
    /**
     * The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.
     * @DTA\Data(field="file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file = null;

    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateTranscriptionRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateTranscriptionRequestModel::class})
     */
    public ?\App\DTO\CreateTranscriptionRequestModel $model = null;

    /**
     * An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.
     * @DTA\Data(field="prompt", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $prompt = null;

    /**
     * The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.
     * @DTA\Data(field="response_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_format = null;

    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $temperature = null;

    /**
     * The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.
     * @DTA\Data(field="language", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $language = null;

}
