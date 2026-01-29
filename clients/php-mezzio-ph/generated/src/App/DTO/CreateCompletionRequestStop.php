<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence.
 */
class CreateCompletionRequestStop
{
}
