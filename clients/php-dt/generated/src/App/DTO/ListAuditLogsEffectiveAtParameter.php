<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ListAuditLogsEffectiveAtParameter
{
    /**
     * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value.
     * @DTA\Data(field="gt", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $gt = null;

    /**
     * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value.
     * @DTA\Data(field="gte", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $gte = null;

    /**
     * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value.
     * @DTA\Data(field="lt", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lt = null;

    /**
     * Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value.
     * @DTA\Data(field="lte", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lte = null;

}
