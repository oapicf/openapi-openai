<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for usageCodeInterpreterSessions
 */
class UsageCodeInterpreterSessionsParameterData
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
     * Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440
     * @DTA\Data(subset="query", field="limit", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $limit = null;

    /**
     * Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
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
     * Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
     * @DTA\Data(subset="query", field="bucket_width", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $bucket_width = null;

    /**
     * Return only usage for these projects.
     * @DTA\Data(subset="query", field="project_ids", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $project_ids = null;

}
