<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateModerationResponseResultsInnerCategoryScores
{
    /**
     * @DTA\Data(field="hate")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $hate = null;

    /**
     * @DTA\Data(field="hate/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $hate_threatening = null;

    /**
     * @DTA\Data(field="self-harm")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $self_harm = null;

    /**
     * @DTA\Data(field="sexual")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $sexual = null;

    /**
     * @DTA\Data(field="sexual/minors")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $sexual_minors = null;

    /**
     * @DTA\Data(field="violence")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $violence = null;

    /**
     * @DTA\Data(field="violence/graphic")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $violence_graphic = null;

}
