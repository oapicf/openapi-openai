<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ScalarList", options={"type":"string"})
 * @DTA\Validator(name="Count", options={"max":10000}, blocker=true)
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"Scalar", "options":{"type":"string"}}
 * }})
 */
class Collection129 extends \ArrayObject
{
}
