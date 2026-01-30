<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\CreateThreadRequestToolResourcesFileSearchVectorStoresInner::class})
 * @DTA\Validator(name="Count", options={"max":1}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\CreateThreadRequestToolResourcesFileSearchVectorStoresInner::class}}
 * }})
 */
class Collection130 extends \ArrayObject
{
}
