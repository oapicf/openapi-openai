<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of &#x60;method&#x60;, and should be passed in under the &#x60;method&#x60; parameter.
 */
class CreateFineTuningJobRequestHyperparameters
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
