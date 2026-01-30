<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of the categories along with their scores as predicted by model.
 */
class CreateModerationResponseResultsInnerCategoryScores
{
    /**
     * The score for the category &#39;hate&#39;.
     * @DTA\Data(field="hate")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $hate = null;

    /**
     * The score for the category &#39;hate/threatening&#39;.
     * @DTA\Data(field="hate/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $hate_threatening = null;

    /**
     * The score for the category &#39;harassment&#39;.
     * @DTA\Data(field="harassment")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $harassment = null;

    /**
     * The score for the category &#39;harassment/threatening&#39;.
     * @DTA\Data(field="harassment/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $harassment_threatening = null;

    /**
     * The score for the category &#39;illicit&#39;.
     * @DTA\Data(field="illicit")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $illicit = null;

    /**
     * The score for the category &#39;illicit/violent&#39;.
     * @DTA\Data(field="illicit/violent")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $illicit_violent = null;

    /**
     * The score for the category &#39;self-harm&#39;.
     * @DTA\Data(field="self-harm")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $self_harm = null;

    /**
     * The score for the category &#39;self-harm/intent&#39;.
     * @DTA\Data(field="self-harm/intent")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $self_harm_intent = null;

    /**
     * The score for the category &#39;self-harm/instructions&#39;.
     * @DTA\Data(field="self-harm/instructions")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $self_harm_instructions = null;

    /**
     * The score for the category &#39;sexual&#39;.
     * @DTA\Data(field="sexual")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $sexual = null;

    /**
     * The score for the category &#39;sexual/minors&#39;.
     * @DTA\Data(field="sexual/minors")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $sexual_minors = null;

    /**
     * The score for the category &#39;violence&#39;.
     * @DTA\Data(field="violence")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $violence = null;

    /**
     * The score for the category &#39;violence/graphic&#39;.
     * @DTA\Data(field="violence/graphic")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $violence_graphic = null;

}
