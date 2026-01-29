<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ObjectList", options={"type":\App\DTO\FineTuningJobIntegrationsInner::class})
 * @DTA\Validator(name="Count", options={"max":5}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"TypeCompliant", "options":{"type":\App\DTO\FineTuningJobIntegrationsInner::class}}
 * }})
 */
class Collection24 extends \ArrayObject
{
}
