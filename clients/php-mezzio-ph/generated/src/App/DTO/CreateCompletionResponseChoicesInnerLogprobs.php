<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateCompletionResponseChoicesInnerLogprobs
{
    /**
     * @DTA\Data(field="text_offset", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection31::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection31::class})
     * @var \App\DTO\Collection31|null
     */
    public $text_offset;

    /**
     * @DTA\Data(field="token_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection32::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection32::class})
     * @var \App\DTO\Collection32|null
     */
    public $token_logprobs;

    /**
     * @DTA\Data(field="tokens", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection33::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection33::class})
     * @var \App\DTO\Collection33|null
     */
    public $tokens;

    /**
     * @DTA\Data(field="top_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection35::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection35::class})
     * @var \App\DTO\Collection35|null
     */
    public $top_logprobs;

}
