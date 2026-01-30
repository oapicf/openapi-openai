<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RunStepDetailsToolCallsObjectToolCallsInner
{
    /**
     * The ID of the tool call object.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="code_interpreter")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsCodeObjectCodeInterpreter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsCodeObjectCodeInterpreter::class})
     * @var \App\DTO\RunStepDetailsToolCallsCodeObjectCodeInterpreter|null
     */
    public $code_interpreter;

    /**
     * @DTA\Data(field="file_search")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch::class})
     * @var \App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch|null
     */
    public $file_search;

    /**
     * @DTA\Data(field="function")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsFunctionObjectFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsFunctionObjectFunction::class})
     * @var \App\DTO\RunStepDetailsToolCallsFunctionObjectFunction|null
     */
    public $function;

}
