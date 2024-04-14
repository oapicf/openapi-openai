<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Describes an OpenAI model offering that can be used with the API.
 */
class Model
{
    /**
     * The model identifier, which can be referenced in the API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The Unix timestamp (in seconds) when the model was created.
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created = null;

    /**
     * The object type, which is always \&quot;model\&quot;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The organization that owns the model.
     * @DTA\Data(field="owned_by")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $owned_by = null;

}
