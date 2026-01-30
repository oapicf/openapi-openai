<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for usageCosts
 */
class UsageCostsQueryData
{
    /**
     * Start time (Unix seconds) of the query time range, inclusive.
     * @DTA\Data(field="start_time")
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * End time (Unix seconds) of the query time range, exclusive.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.
     * @DTA\Data(field="limit", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $limit;

    /**
     * Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
     * @DTA\Data(field="group_by", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $group_by;

    /**
     * A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
     * @DTA\Data(field="page", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $page;

    /**
     * Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
     * @DTA\Data(field="bucket_width", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bucket_width;

    /**
     * Return only costs for these projects.
     * @DTA\Data(field="project_ids", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $project_ids;

}
