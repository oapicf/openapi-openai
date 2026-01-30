<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for adminApiKeysList
 */
class AdminApiKeysListParameterData
{
    /**
     * @DTA\Data(subset="query", field="limit", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $limit = null;

    /**
     * @DTA\Data(subset="query", field="after", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $after = null;

    /**
     * @DTA\Data(subset="query", field="order", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $order = null;

}
