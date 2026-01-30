<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
 */
class FineTuningJobHyperparameters
{
    /**
     * @DTA\Data(field="batch_size", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersBatchSize::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersBatchSize::class})
     */
    public ?\App\DTO\CreateFineTuningJobRequestHyperparametersBatchSize $batch_size = null;

    /**
     * @DTA\Data(field="learning_rate_multiplier", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersLearningRateMultiplier::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersLearningRateMultiplier::class})
     */
    public ?\App\DTO\CreateFineTuningJobRequestHyperparametersLearningRateMultiplier $learning_rate_multiplier = null;

    /**
     * @DTA\Data(field="n_epochs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersNEpochs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersNEpochs::class})
     */
    public ?\App\DTO\CreateFineTuningJobRequestHyperparametersNEpochs $n_epochs = null;

}
