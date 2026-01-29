<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The Code Interpreter tool call definition.
 */
class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
{
    /**
     * The input to the Code Interpreter tool call.
     * @DTA\Data(field="input", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $input = null;

    /**
     * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type.
     * @DTA\Data(field="outputs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $outputs = null;

}
