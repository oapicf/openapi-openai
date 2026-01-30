<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RealtimeServerEventRateLimitsUpdatedRateLimitsInner
{
    /**
     * The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The maximum allowed value for the rate limit.
     * @DTA\Data(field="limit", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $limit = null;

    /**
     * The remaining value before the limit is reached.
     * @DTA\Data(field="remaining", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $remaining = null;

    /**
     * Seconds until the rate limit resets.
     * @DTA\Data(field="reset_seconds", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $reset_seconds = null;

}
