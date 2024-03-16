<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateModerationResponseResultsInnerCategoryScores
{
    /**
     * @DTA\Data(field="hate")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $hate;

    /**
     * @DTA\Data(field="hate/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $hate_threatening;

    /**
     * @DTA\Data(field="self-harm")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $self_harm;

    /**
     * @DTA\Data(field="sexual")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $sexual;

    /**
     * @DTA\Data(field="sexual/minors")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $sexual_minors;

    /**
     * @DTA\Data(field="violence")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $violence;

    /**
     * @DTA\Data(field="violence/graphic")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $violence_graphic;

}
