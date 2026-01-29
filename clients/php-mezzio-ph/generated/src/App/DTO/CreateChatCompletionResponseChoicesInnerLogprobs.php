<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Log probability information for the choice.
 */
class CreateChatCompletionResponseChoicesInnerLogprobs
{
    /**
     * A list of message content tokens with log probability information.
     * @DTA\Data(field="content")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection9::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection9::class})
     * @var \App\DTO\Collection9|null
     */
    public $content;

}
