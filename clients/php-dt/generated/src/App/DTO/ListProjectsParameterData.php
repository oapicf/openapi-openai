<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for listProjects
 */
class ListProjectsParameterData
{
    /**
     * If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
     * @DTA\Data(subset="query", field="include_archived", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $include_archived = null;

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
     * @DTA\Data(subset="query", field="limit", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $limit = null;

    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.
     * @DTA\Data(subset="query", field="after", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $after = null;

}
