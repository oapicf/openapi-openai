<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The function definition.
 */
class RunToolCallObjectFunction
{
    /**
     * The name of the function.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The arguments that the model expects you to pass to the function.
     * @DTA\Data(field="arguments")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $arguments;

}
