<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The aggregated images usage details of the specific time bucket.
 */
class UsageImagesResult
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The number of images processed.
     * @DTA\Data(field="images")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $images;

    /**
     * The count of requests made to the model.
     * @DTA\Data(field="num_model_requests")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $num_model_requests;

    /**
     * When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
     * @DTA\Data(field="source", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $source;

    /**
     * When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
     * @DTA\Data(field="size", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $size;

    /**
     * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     * @DTA\Data(field="project_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $project_id;

    /**
     * When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
     * @DTA\Data(field="user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $user_id;

    /**
     * When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
     * @DTA\Data(field="api_key_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $api_key_id;

    /**
     * When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

}
