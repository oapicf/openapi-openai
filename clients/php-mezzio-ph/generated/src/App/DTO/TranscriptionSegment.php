<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TranscriptionSegment
{
    /**
     * Unique identifier of the segment.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Seek offset of the segment.
     * @DTA\Data(field="seek")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $seek;

    /**
     * Start time of the segment in seconds.
     * @DTA\Data(field="start")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $start;

    /**
     * End time of the segment in seconds.
     * @DTA\Data(field="end")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $end;

    /**
     * Text content of the segment.
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * Array of token IDs for the text content.
     * @DTA\Data(field="tokens")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var int[]|null
     */
    public $tokens;

    /**
     * Temperature parameter used for generating the segment.
     * @DTA\Data(field="temperature")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $temperature;

    /**
     * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
     * @DTA\Data(field="avg_logprob")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $avg_logprob;

    /**
     * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
     * @DTA\Data(field="compression_ratio")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $compression_ratio;

    /**
     * Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent.
     * @DTA\Data(field="no_speech_prob")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $no_speech_prob;

}
