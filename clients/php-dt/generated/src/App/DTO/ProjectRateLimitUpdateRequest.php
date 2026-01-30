<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProjectRateLimitUpdateRequest
{
    /**
     * The maximum requests per minute.
     * @DTA\Data(field="max_requests_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_requests_per_1_minute = null;

    /**
     * The maximum tokens per minute.
     * @DTA\Data(field="max_tokens_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_tokens_per_1_minute = null;

    /**
     * The maximum images per minute. Only relevant for certain models.
     * @DTA\Data(field="max_images_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_images_per_1_minute = null;

    /**
     * The maximum audio megabytes per minute. Only relevant for certain models.
     * @DTA\Data(field="max_audio_megabytes_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_audio_megabytes_per_1_minute = null;

    /**
     * The maximum requests per day. Only relevant for certain models.
     * @DTA\Data(field="max_requests_per_1_day", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_requests_per_1_day = null;

    /**
     * The maximum batch input tokens per day. Only relevant for certain models.
     * @DTA\Data(field="batch_1_day_max_input_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $batch_1_day_max_input_tokens = null;

}
