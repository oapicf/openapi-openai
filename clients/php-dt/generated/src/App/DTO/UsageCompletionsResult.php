<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The aggregated completions usage details of the specific time bucket.
 */
class UsageCompletionsResult
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
     * @DTA\Data(field="input_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $input_tokens = null;

    /**
     * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
     * @DTA\Data(field="input_cached_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $input_cached_tokens = null;

    /**
     * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
     * @DTA\Data(field="output_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $output_tokens = null;

    /**
     * The aggregated number of audio input tokens used, including cached tokens.
     * @DTA\Data(field="input_audio_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $input_audio_tokens = null;

    /**
     * The aggregated number of audio output tokens used.
     * @DTA\Data(field="output_audio_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $output_audio_tokens = null;

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

    /**
     * When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not.
     * @DTA\Data(field="batch", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $batch = null;

}
