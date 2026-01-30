<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RealtimeResponseCreateParamsToolsInner
{
    /**
     * The type of the tool, i.e. &#x60;function&#x60;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The name of the function.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Parameters of the function in JSON Schema.
     * @DTA\Data(field="parameters", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $parameters = null;

}
