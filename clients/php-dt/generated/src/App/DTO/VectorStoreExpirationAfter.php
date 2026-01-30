<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The expiration policy for a vector store.
 */
class VectorStoreExpirationAfter
{
    /**
     * Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;.
     * @DTA\Data(field="anchor")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $anchor = null;

    /**
     * The number of days after the anchor time that the vector store will expire.
     * @DTA\Data(field="days")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":365})
     */
    public ?int $days = null;

}
