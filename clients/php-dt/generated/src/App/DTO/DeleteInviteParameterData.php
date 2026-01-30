<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for deleteInvite
 */
class DeleteInviteParameterData
{
    /**
     * The ID of the invite to delete.
     * @DTA\Data(subset="path", field="invite_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $invite_id = null;

}
