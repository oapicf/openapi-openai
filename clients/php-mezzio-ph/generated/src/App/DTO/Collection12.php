<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\CreateEmbeddingResponseDataInner::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\CreateEmbeddingResponseDataInner::class}}
 * }})
 */
class Collection12 extends \ArrayObject
{
}
