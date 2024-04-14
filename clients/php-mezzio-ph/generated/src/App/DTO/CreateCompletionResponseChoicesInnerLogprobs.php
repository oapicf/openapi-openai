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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection12::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection12::class})
     * @var \App\DTO\Collection12|null
     */
    public $text_offset;

    /**
     * @DTA\Data(field="token_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection13::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection13::class})
     * @var \App\DTO\Collection13|null
     */
    public $token_logprobs;

    /**
     * @DTA\Data(field="tokens", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection14::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection14::class})
     * @var \App\DTO\Collection14|null
     */
    public $tokens;

    /**
     * @DTA\Data(field="top_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection16::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection16::class})
     * @var \App\DTO\Collection16|null
     */
    public $top_logprobs;

}
