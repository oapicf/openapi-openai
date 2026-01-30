<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UpdateVectorStoreRequest
{
    /**
     * The name of the vector store.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="expires_after", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VectorStoreExpirationAfter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VectorStoreExpirationAfter::class})
     */
    public ?\App\DTO\VectorStoreExpirationAfter $expires_after = null;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $metadata = null;

}
