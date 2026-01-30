<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents an individual API key in a project.
 */
class ProjectApiKey
{
    /**
     * The object type, which is always &#x60;organization.project.api_key&#x60;
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The redacted value of the API key
     * @DTA\Data(field="redacted_value")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $redacted_value;

    /**
     * The name of the API key
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The Unix timestamp (in seconds) of when the API key was created
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * The identifier, which can be referenced in API endpoints
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="owner")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProjectApiKeyOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProjectApiKeyOwner::class})
     * @var \App\DTO\ProjectApiKeyOwner|null
     */
    public $owner;

}
