<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The hyperparameters used for the fine-tuning job.
 */
class FineTuneSupervisedMethodHyperparameters
{
    /**
     * @DTA\Data(field="batch_size", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneDPOMethodHyperparametersBatchSize::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneDPOMethodHyperparametersBatchSize::class})
     */
    public ?\App\DTO\FineTuneDPOMethodHyperparametersBatchSize $batch_size = null;

    /**
     * @DTA\Data(field="learning_rate_multiplier", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneDPOMethodHyperparametersLearningRateMultiplier::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneDPOMethodHyperparametersLearningRateMultiplier::class})
     */
    public ?\App\DTO\FineTuneDPOMethodHyperparametersLearningRateMultiplier $learning_rate_multiplier = null;

    /**
     * @DTA\Data(field="n_epochs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneDPOMethodHyperparametersNEpochs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneDPOMethodHyperparametersNEpochs::class})
     */
    public ?\App\DTO\FineTuneDPOMethodHyperparametersNEpochs $n_epochs = null;

}
