<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The hyperparameters used for the fine-tuning job.
 */
class CreateFineTuningJobRequestHyperparameters
{
    /**
     * @DTA\Data(field="batch_size", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersBatchSize::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersBatchSize::class})
     * @var \App\DTO\CreateFineTuningJobRequestHyperparametersBatchSize|null
     */
    public $batch_size;

    /**
     * @DTA\Data(field="learning_rate_multiplier", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersLearningRateMultiplier::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersLearningRateMultiplier::class})
     * @var \App\DTO\CreateFineTuningJobRequestHyperparametersLearningRateMultiplier|null
     */
    public $learning_rate_multiplier;

    /**
     * @DTA\Data(field="n_epochs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersNEpochs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparametersNEpochs::class})
     * @var \App\DTO\CreateFineTuningJobRequestHyperparametersNEpochs|null
     */
    public $n_epochs;

}
