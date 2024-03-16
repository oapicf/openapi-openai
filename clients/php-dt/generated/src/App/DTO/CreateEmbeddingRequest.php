<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateEmbeddingRequest
{
    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateEmbeddingRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateEmbeddingRequestModel::class})
     */
    public ?\App\DTO\CreateEmbeddingRequestModel $model = null;

    /**
     * @DTA\Data(field="input")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateEmbeddingRequestInput::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateEmbeddingRequestInput::class})
     */
    public ?\App\DTO\CreateEmbeddingRequestInput $input = null;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user = null;

}
