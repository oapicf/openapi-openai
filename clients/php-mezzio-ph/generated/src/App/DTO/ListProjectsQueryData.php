<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for listProjects
 */
class ListProjectsQueryData
{
    /**
     * If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
     * @DTA\Data(field="include_archived", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $include_archived;

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
     * @DTA\Data(field="limit", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $limit;

    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.
     * @DTA\Data(field="after", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $after;

}
