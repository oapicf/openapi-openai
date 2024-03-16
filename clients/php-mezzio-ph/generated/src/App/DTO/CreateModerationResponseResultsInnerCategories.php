<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateModerationResponseResultsInnerCategories
{
    /**
     * @DTA\Data(field="hate")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $hate;

    /**
     * @DTA\Data(field="hate/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $hate_threatening;

    /**
     * @DTA\Data(field="self-harm")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $self_harm;

    /**
     * @DTA\Data(field="sexual")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $sexual;

    /**
     * @DTA\Data(field="sexual/minors")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $sexual_minors;

    /**
     * @DTA\Data(field="violence")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $violence;

    /**
     * @DTA\Data(field="violence/graphic")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $violence_graphic;

}
