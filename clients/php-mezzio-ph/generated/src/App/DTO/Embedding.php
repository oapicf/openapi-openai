<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents an embedding vector returned by embedding endpoint.
 */
class Embedding
{
    /**
     * The index of the embedding in the list of embeddings.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).
     * @DTA\Data(field="embedding")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection37::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection37::class})
     * @var \App\DTO\Collection37|null
     */
    public $embedding;

    /**
     * The object type, which is always \&quot;embedding\&quot;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

}
