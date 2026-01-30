<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details about the input tokens used in the Response.
 */
class RealtimeResponseUsageInputTokenDetails
{
    /**
     * The number of cached tokens used in the Response.
     * @DTA\Data(field="cached_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $cached_tokens;

    /**
     * The number of text tokens used in the Response.
     * @DTA\Data(field="text_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $text_tokens;

    /**
     * The number of audio tokens used in the Response.
     * @DTA\Data(field="audio_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $audio_tokens;

}
