<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateModerationRequest
{
    /**
     * @DTA\Data(field="input")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationRequestInput::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationRequestInput::class})
     */
    public ?\App\DTO\CreateModerationRequestInput $input = null;

    /**
     * @DTA\Data(field="model", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateModerationRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateModerationRequestModel::class})
     */
    public ?\App\DTO\CreateModerationRequestModel $model = null;

}
