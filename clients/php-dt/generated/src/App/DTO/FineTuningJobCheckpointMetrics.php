<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Metrics at the step number during the fine-tuning job.
 */
class FineTuningJobCheckpointMetrics
{
    /**
     * @DTA\Data(field="step", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $step = null;

    /**
     * @DTA\Data(field="train_loss", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $train_loss = null;

    /**
     * @DTA\Data(field="train_mean_token_accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $train_mean_token_accuracy = null;

    /**
     * @DTA\Data(field="valid_loss", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $valid_loss = null;

    /**
     * @DTA\Data(field="valid_mean_token_accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $valid_mean_token_accuracy = null;

    /**
     * @DTA\Data(field="full_valid_loss", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $full_valid_loss = null;

    /**
     * @DTA\Data(field="full_valid_mean_token_accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $full_valid_mean_token_accuracy = null;

}
