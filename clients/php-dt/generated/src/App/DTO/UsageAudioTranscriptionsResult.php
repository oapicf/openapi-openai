<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The aggregated audio transcriptions usage details of the specific time bucket.
 */
class UsageAudioTranscriptionsResult
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The number of seconds processed.
     * @DTA\Data(field="seconds")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $seconds = null;

    /**
     * The count of requests made to the model.
     * @DTA\Data(field="num_model_requests")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $num_model_requests = null;

    /**
     * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     * @DTA\Data(field="project_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $project_id = null;

    /**
     * When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
     * @DTA\Data(field="user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user_id = null;

    /**
     * When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
     * @DTA\Data(field="api_key_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $api_key_id = null;

    /**
     * When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

}
