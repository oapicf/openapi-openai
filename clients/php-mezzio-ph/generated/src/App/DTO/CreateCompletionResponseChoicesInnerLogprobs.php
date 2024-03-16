<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateCompletionResponseChoicesInnerLogprobs
{
    /**
     * @DTA\Data(field="tokens", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection4::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection4::class})
     * @var \App\DTO\Collection4|null
     */
    public $tokens;

    /**
     * @DTA\Data(field="token_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection5::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection5::class})
     * @var \App\DTO\Collection5|null
     */
    public $token_logprobs;

    /**
     * @DTA\Data(field="top_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     * @var \App\DTO\Collection6|null
     */
    public $top_logprobs;

    /**
     * @DTA\Data(field="text_offset", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection7::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection7::class})
     * @var \App\DTO\Collection7|null
     */
    public $text_offset;

}
