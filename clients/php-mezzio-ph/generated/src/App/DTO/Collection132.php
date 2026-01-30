<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\CreateThreadAndRunRequestToolsInner::class})
 * @DTA\Validator(name="Count", options={"max":20}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\CreateThreadAndRunRequestToolsInner::class}}
 * }})
 */
class Collection132 extends \ArrayObject
{
}
