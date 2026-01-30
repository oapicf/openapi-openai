<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UsageTimeBucketResultInner
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The aggregated number of input tokens used.
     * @DTA\Data(field="input_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $input_tokens;

    /**
     * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
     * @DTA\Data(field="input_cached_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $input_cached_tokens;

    /**
     * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
     * @DTA\Data(field="output_tokens")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $output_tokens;

    /**
     * The aggregated number of audio input tokens used, including cached tokens.
     * @DTA\Data(field="input_audio_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $input_audio_tokens;

    /**
     * The aggregated number of audio output tokens used.
     * @DTA\Data(field="output_audio_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $output_audio_tokens;

    /**
     * The count of requests made to the model.
     * @DTA\Data(field="num_model_requests")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $num_model_requests;

    /**
     * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
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

    /**
     * When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not.
     * @DTA\Data(field="batch", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $batch;

    /**
     * The number of images processed.
     * @DTA\Data(field="images")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $images;

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
     * The number of characters processed.
     * @DTA\Data(field="characters")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $characters;

    /**
     * The number of seconds processed.
     * @DTA\Data(field="seconds")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $seconds;

    /**
     * The vector stores usage in bytes.
     * @DTA\Data(field="usage_bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $usage_bytes;

    /**
     * The number of code interpreter sessions.
     * @DTA\Data(field="sessions")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $sessions;

    /**
     * @DTA\Data(field="amount", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CostsResultAmount::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CostsResultAmount::class})
     * @var \App\DTO\CostsResultAmount|null
     */
    public $amount;

    /**
     * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
     * @DTA\Data(field="line_item", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $line_item;

}
