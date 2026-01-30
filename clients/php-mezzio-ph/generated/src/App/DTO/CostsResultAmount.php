<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The monetary value in its associated currency.
 */
class CostsResultAmount
{
    /**
     * The numeric value of the cost.
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $value;

    /**
     * Lowercase ISO-4217 currency e.g. \&quot;usd\&quot;
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $currency;

}
