<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RunStepDetailsToolCallsObjectToolCallsInner
{
    /**
     * The ID of the tool call object.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="code_interpreter")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsCodeObjectCodeInterpreter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsCodeObjectCodeInterpreter::class})
     */
    public ?\App\DTO\RunStepDetailsToolCallsCodeObjectCodeInterpreter $code_interpreter = null;

    /**
     * @DTA\Data(field="file_search")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch::class})
     */
    public ?\App\DTO\RunStepDetailsToolCallsFileSearchObjectFileSearch $file_search = null;

    /**
     * @DTA\Data(field="function")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDetailsToolCallsFunctionObjectFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDetailsToolCallsFunctionObjectFunction::class})
     */
    public ?\App\DTO\RunStepDetailsToolCallsFunctionObjectFunction $function = null;

}
