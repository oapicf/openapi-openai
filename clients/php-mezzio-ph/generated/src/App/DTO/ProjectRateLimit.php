<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a project rate limit config.
 */
class ProjectRateLimit
{
    /**
     * The object type, which is always &#x60;project.rate_limit&#x60;
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The model this rate limit applies to.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * The maximum requests per minute.
     * @DTA\Data(field="max_requests_per_1_minute")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_requests_per_1_minute;

    /**
     * The maximum tokens per minute.
     * @DTA\Data(field="max_tokens_per_1_minute")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_tokens_per_1_minute;

    /**
     * The maximum images per minute. Only present for relevant models.
     * @DTA\Data(field="max_images_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_images_per_1_minute;

    /**
     * The maximum audio megabytes per minute. Only present for relevant models.
     * @DTA\Data(field="max_audio_megabytes_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_audio_megabytes_per_1_minute;

    /**
     * The maximum requests per day. Only present for relevant models.
     * @DTA\Data(field="max_requests_per_1_day", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_requests_per_1_day;

    /**
     * The maximum batch input tokens per day. Only present for relevant models.
     * @DTA\Data(field="batch_1_day_max_input_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $batch_1_day_max_input_tokens;

}
