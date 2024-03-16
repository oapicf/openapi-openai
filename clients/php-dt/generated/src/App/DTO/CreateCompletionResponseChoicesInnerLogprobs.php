<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateCompletionResponseChoicesInnerLogprobs
{
    /**
     * @DTA\Data(field="tokens", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection4::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection4::class})
     */
    public ?\App\DTO\Collection4 $tokens = null;

    /**
     * @DTA\Data(field="token_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection5::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection5::class})
     */
    public ?\App\DTO\Collection5 $token_logprobs = null;

    /**
     * @DTA\Data(field="top_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     */
    public ?\App\DTO\Collection6 $top_logprobs = null;

    /**
     * @DTA\Data(field="text_offset", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection7::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection7::class})
     */
    public ?\App\DTO\Collection7 $text_offset = null;

}
