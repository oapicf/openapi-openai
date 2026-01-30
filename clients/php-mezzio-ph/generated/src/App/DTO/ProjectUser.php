<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents an individual user in a project.
 */
class ProjectUser
{
    /**
     * The object type, which is always &#x60;organization.project.user&#x60;
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The identifier, which can be referenced in API endpoints
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The name of the user
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The email address of the user
     * @DTA\Data(field="email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $email;

    /**
     * &#x60;owner&#x60; or &#x60;member&#x60;
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

    /**
     * The Unix timestamp (in seconds) of when the project was added.
     * @DTA\Data(field="added_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $added_at;

}
