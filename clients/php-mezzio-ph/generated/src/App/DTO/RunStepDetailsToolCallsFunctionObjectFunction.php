<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The definition of the function that was called.
 */
class RunStepDetailsToolCallsFunctionObjectFunction
{
    /**
     * The name of the function.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The arguments passed to the function.
     * @DTA\Data(field="arguments")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $arguments;

    /**
     * The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     * @DTA\Data(field="output")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $output;

}
