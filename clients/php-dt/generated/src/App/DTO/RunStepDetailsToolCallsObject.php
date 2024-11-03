<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of the tool call.
 */
class RunStepDetailsToolCallsObject
{
    /**
     * Always &#x60;tool_calls&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.
     * @DTA\Data(field="tool_calls")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $tool_calls = null;

}
