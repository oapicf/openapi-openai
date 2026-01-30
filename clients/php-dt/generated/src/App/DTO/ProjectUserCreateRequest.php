<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProjectUserCreateRequest
{
    /**
     * The ID of the user.
     * @DTA\Data(field="user_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user_id = null;

    /**
     * &#x60;owner&#x60; or &#x60;member&#x60;
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

}
