<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RunStepDeltaStepDetailsToolCallsFunctionObject
{
    /**
     * The index of the tool call in the tool calls array.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * The ID of the tool call object.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="function", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsFunctionObjectFunction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunStepDeltaStepDetailsToolCallsFunctionObjectFunction::class})
     * @var \App\DTO\RunStepDeltaStepDetailsToolCallsFunctionObjectFunction|null
     */
    public $function;

}
