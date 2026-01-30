<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details on the tool outputs needed for this run to continue.
 */
class RunObjectRequiredActionSubmitToolOutputs
{
    /**
     * A list of the relevant tool calls.
     * @DTA\Data(field="tool_calls")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection133::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection133::class})
     * @var \App\DTO\Collection133|null
     */
    public $tool_calls;

}
