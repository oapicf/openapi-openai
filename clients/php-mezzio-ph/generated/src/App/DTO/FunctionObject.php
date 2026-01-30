<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class FunctionObject
{
    /**
     * A description of what the function does, used by the model to choose when and how to call the function.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $description;

    /**
     * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
     * @DTA\Data(field="parameters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection20::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection20::class})
     * @var \App\DTO\Collection20|null
     */
    public $parameters;

    /**
     * Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the &#x60;parameters&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
     * @DTA\Data(field="strict", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $strict;

}
