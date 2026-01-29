<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TranscriptionSegment
{
    /**
     * Unique identifier of the segment.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Seek offset of the segment.
     * @DTA\Data(field="seek")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $seek = null;

    /**
     * Start time of the segment in seconds.
     * @DTA\Data(field="start")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $start = null;

    /**
     * End time of the segment in seconds.
     * @DTA\Data(field="end")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $end = null;

    /**
     * Text content of the segment.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

    /**
     * Array of token IDs for the text content.
     * @DTA\Data(field="tokens")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $tokens = null;

    /**
     * Temperature parameter used for generating the segment.
     * @DTA\Data(field="temperature")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $temperature = null;

    /**
     * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
     * @DTA\Data(field="avg_logprob")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $avg_logprob = null;

    /**
     * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
     * @DTA\Data(field="compression_ratio")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $compression_ratio = null;

    /**
     * Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
     * @DTA\Data(field="no_speech_prob")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $no_speech_prob = null;

}
