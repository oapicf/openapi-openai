<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateModerationResponseResultsInnerCategories
{
    /**
     * @DTA\Data(field="hate")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $hate = null;

    /**
     * @DTA\Data(field="hate/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $hate_threatening = null;

    /**
     * @DTA\Data(field="self-harm")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $self_harm = null;

    /**
     * @DTA\Data(field="sexual")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $sexual = null;

    /**
     * @DTA\Data(field="sexual/minors")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $sexual_minors = null;

    /**
     * @DTA\Data(field="violence")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $violence = null;

    /**
     * @DTA\Data(field="violence/graphic")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $violence_graphic = null;

}
