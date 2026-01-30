<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ResponseFormatJsonSchema
{
    /**
     * The type of response format being defined: &#x60;json_schema&#x60;
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="json_schema")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ResponseFormatJsonSchemaJsonSchema::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ResponseFormatJsonSchemaJsonSchema::class})
     * @var \App\DTO\ResponseFormatJsonSchemaJsonSchema|null
     */
    public $json_schema;

}
