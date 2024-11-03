<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\AssistantObjectToolsInner::class})
 * @DTA\Validator(name="Count", options={"max":128}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\AssistantObjectToolsInner::class}}
 * }})
 */
class Collection37 extends \ArrayObject
{
}
