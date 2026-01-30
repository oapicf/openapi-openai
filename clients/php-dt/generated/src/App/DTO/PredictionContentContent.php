<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly.
 */
class PredictionContentContent
{
}
