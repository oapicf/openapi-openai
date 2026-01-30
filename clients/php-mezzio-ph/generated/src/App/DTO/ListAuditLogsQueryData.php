<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for listAuditLogs
 */
class ListAuditLogsQueryData
{
    /**
     * Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).
     * @DTA\Data(field="event_types[]", nullable=true)
     * TODO add validator(s) and strategy for list of \App\DTO\AuditLogEventType::class and collection format multi inside query string
     * @var \App\DTO\AuditLogEventType[]|null
     */
    public $event_types;

    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.
     * @DTA\Data(field="before", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $before;

    /**
     * Return only events performed by users with these emails.
     * @DTA\Data(field="actor_emails[]", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $actor_emails;

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
     * @DTA\Data(field="limit", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $limit;

    /**
     * Return only events performed on these targets. For example, a project ID updated.
     * @DTA\Data(field="resource_ids[]", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $resource_ids;

    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.
     * @DTA\Data(field="after", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $after;

    /**
     * Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.
     * @DTA\Data(field="actor_ids[]", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $actor_ids;

    /**
     * Return only events for these projects.
     * @DTA\Data(field="project_ids[]", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $project_ids;

}
