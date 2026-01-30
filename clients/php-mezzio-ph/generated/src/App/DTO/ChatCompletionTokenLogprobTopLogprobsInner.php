<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionTokenLogprobTopLogprobsInner
{
    /**
     * The token.
     * @DTA\Data(field="token")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $token;

    /**
     * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely.
     * @DTA\Data(field="logprob")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $logprob;

    /**
     * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token.
     * @DTA\Data(field="bytes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection25::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection25::class})
     * @var \App\DTO\Collection25|null
     */
    public $bytes;

}
