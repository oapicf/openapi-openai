<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ResponseFormatJsonSchemaJsonSchema
{
    /**
     * A description of what the response format is for, used by the model to determine how to respond in the format.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The schema for the response format, described as a JSON Schema object.
     * @DTA\Data(field="schema", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $schema = null;

    /**
     * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the &#x60;schema&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
     * @DTA\Data(field="strict", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $strict = null;

}
