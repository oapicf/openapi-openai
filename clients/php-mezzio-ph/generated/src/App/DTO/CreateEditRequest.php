<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateEditRequest
{
    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateEditRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateEditRequestModel::class})
     * @var \App\DTO\CreateEditRequestModel|null
     */
    public $model;

    /**
     * The input text to use as a starting point for the edit.
     * @DTA\Data(field="input", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $input;

    /**
     * The instruction that tells the model how to edit the prompt.
     * @DTA\Data(field="instruction")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $instruction;

    /**
     * How many edits to generate for the input and instruction.
     * @DTA\Data(field="n", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":20, "inclusive":true})
     * @var int|null
     */
    public $n;

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2, "inclusive":true})
     * @var float|null
     */
    public $temperature;

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.
     * @DTA\Data(field="top_p", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $top_p;

}
