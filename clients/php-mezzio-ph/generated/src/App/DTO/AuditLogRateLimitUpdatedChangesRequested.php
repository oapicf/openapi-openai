<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to update the rate limits.
 */
class AuditLogRateLimitUpdatedChangesRequested
{
    /**
     * The maximum requests per minute.
     * @DTA\Data(field="max_requests_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_requests_per_1_minute;

    /**
     * The maximum tokens per minute.
     * @DTA\Data(field="max_tokens_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_tokens_per_1_minute;

    /**
     * The maximum images per minute. Only relevant for certain models.
     * @DTA\Data(field="max_images_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_images_per_1_minute;

    /**
     * The maximum audio megabytes per minute. Only relevant for certain models.
     * @DTA\Data(field="max_audio_megabytes_per_1_minute", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_audio_megabytes_per_1_minute;

    /**
     * The maximum requests per day. Only relevant for certain models.
     * @DTA\Data(field="max_requests_per_1_day", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_requests_per_1_day;

    /**
     * The maximum batch input tokens per day. Only relevant for certain models.
     * @DTA\Data(field="batch_1_day_max_input_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $batch_1_day_max_input_tokens;

}
