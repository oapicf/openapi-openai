<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns.
 */
class RealtimeResponseUsage
{
    /**
     * The total number of tokens in the Response including input and output  text and audio tokens.
     * @DTA\Data(field="total_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $total_tokens = null;

    /**
     * The number of input tokens used in the Response, including text and  audio tokens.
     * @DTA\Data(field="input_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $input_tokens = null;

    /**
     * The number of output tokens sent in the Response, including text and  audio tokens.
     * @DTA\Data(field="output_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $output_tokens = null;

    /**
     * @DTA\Data(field="input_token_details", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeResponseUsageInputTokenDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeResponseUsageInputTokenDetails::class})
     */
    public ?\App\DTO\RealtimeResponseUsageInputTokenDetails $input_token_details = null;

    /**
     * @DTA\Data(field="output_token_details", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeResponseUsageOutputTokenDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeResponseUsageOutputTokenDetails::class})
     */
    public ?\App\DTO\RealtimeResponseUsageOutputTokenDetails $output_token_details = null;

}
