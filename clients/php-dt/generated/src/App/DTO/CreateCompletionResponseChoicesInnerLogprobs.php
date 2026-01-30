<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateCompletionResponseChoicesInnerLogprobs
{
    /**
     * @DTA\Data(field="text_offset", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection31::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection31::class})
     */
    public ?\App\DTO\Collection31 $text_offset = null;

    /**
     * @DTA\Data(field="token_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection32::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection32::class})
     */
    public ?\App\DTO\Collection32 $token_logprobs = null;

    /**
     * @DTA\Data(field="tokens", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection33::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection33::class})
     */
    public ?\App\DTO\Collection33 $tokens = null;

    /**
     * @DTA\Data(field="top_logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection35::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection35::class})
     */
    public ?\App\DTO\Collection35 $top_logprobs = null;

}
