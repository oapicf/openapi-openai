<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateEmbeddingRequest
{
    /**
     * @DTA\Data(field="input")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateEmbeddingRequestInput::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateEmbeddingRequestInput::class})
     * @var \App\DTO\CreateEmbeddingRequestInput|null
     */
    public $input;

    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateEmbeddingRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateEmbeddingRequestModel::class})
     * @var \App\DTO\CreateEmbeddingRequestModel|null
     */
    public $model;

    /**
     * The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
     * @DTA\Data(field="encoding_format", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $encoding_format;

    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models.
     * @DTA\Data(field="dimensions", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @var int|null
     */
    public $dimensions;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $user;

}
