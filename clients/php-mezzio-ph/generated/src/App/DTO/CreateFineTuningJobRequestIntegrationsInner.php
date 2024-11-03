<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateFineTuningJobRequestIntegrationsInner
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestIntegrationsInnerType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestIntegrationsInnerType::class})
     * @var \App\DTO\CreateFineTuningJobRequestIntegrationsInnerType|null
     */
    public $type;

    /**
     * @DTA\Data(field="wandb")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestIntegrationsInnerWandb::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestIntegrationsInnerWandb::class})
     * @var \App\DTO\CreateFineTuningJobRequestIntegrationsInnerWandb|null
     */
    public $wandb;

}
