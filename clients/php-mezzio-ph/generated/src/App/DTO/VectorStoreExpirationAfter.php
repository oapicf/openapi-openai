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
     * @var string|null
     */
    public $anchor;

    /**
     * The number of days after the anchor time that the vector store will expire.
     * @DTA\Data(field="days")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":365, "inclusive":true})
     * @var int|null
     */
    public $days;

}
