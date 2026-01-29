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
     * @var float|null
     */
    public $step;

    /**
     * @DTA\Data(field="train_loss", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $train_loss;

    /**
     * @DTA\Data(field="train_mean_token_accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $train_mean_token_accuracy;

    /**
     * @DTA\Data(field="valid_loss", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $valid_loss;

    /**
     * @DTA\Data(field="valid_mean_token_accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $valid_mean_token_accuracy;

    /**
     * @DTA\Data(field="full_valid_loss", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $full_valid_loss;

    /**
     * @DTA\Data(field="full_valid_mean_token_accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $full_valid_mean_token_accuracy;

}
