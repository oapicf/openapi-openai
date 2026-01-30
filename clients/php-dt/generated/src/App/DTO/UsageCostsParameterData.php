<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for usageCosts
 */
class UsageCostsParameterData
{
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * @DTA\Data(subset="query", field="start_time")
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $start_time = null;

    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * @DTA\Data(subset="query", field="end_time", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $end_time = null;

    /**
     * A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.
     * @DTA\Data(subset="query", field="limit", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $limit = null;

    /**
     * Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
     * @DTA\Data(subset="query", field="group_by", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $group_by = null;

    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * @DTA\Data(subset="query", field="page", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $page = null;

    /**
     * Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
     * @DTA\Data(subset="query", field="bucket_width", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bucket_width = null;

    /**
     * Return only costs for these projects.
     * @DTA\Data(subset="query", field="project_ids", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $project_ids = null;

}
