<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RealtimeServerEventRateLimitsUpdatedRateLimitsInner
{
    /**
     * The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The maximum allowed value for the rate limit.
     * @DTA\Data(field="limit", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $limit;

    /**
     * The remaining value before the limit is reached.
     * @DTA\Data(field="remaining", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $remaining;

    /**
     * Seconds until the rate limit resets.
     * @DTA\Data(field="reset_seconds", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $reset_seconds;

}
