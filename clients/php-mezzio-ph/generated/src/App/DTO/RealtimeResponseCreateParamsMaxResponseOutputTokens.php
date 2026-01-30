<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or &#x60;inf&#x60; for the maximum available tokens for a given model. Defaults to &#x60;inf&#x60;.
 */
class RealtimeResponseCreateParamsMaxResponseOutputTokens
{
}
