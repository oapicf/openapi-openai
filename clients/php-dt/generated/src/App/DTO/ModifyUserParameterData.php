<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for modifyUser
 */
class ModifyUserParameterData
{
    /**
     * The ID of the user.
     * @DTA\Data(subset="path", field="user_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $user_id = null;

}
