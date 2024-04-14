<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
class CreateTranscriptionResponseVerboseJson
{
    /**
     * The language of the input audio.
     * @DTA\Data(field="language")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $language;

    /**
     * The duration of the input audio.
     * @DTA\Data(field="duration")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $duration;

    /**
     * The transcribed text.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * Extracted words and their corresponding timestamps.
     * @DTA\Data(field="words", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\TranscriptionWord[]|null
     */
    public $words;

    /**
     * Segments of the transcribed text and their corresponding details.
     * @DTA\Data(field="segments", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\TranscriptionSegment[]|null
     */
    public $segments;

}
