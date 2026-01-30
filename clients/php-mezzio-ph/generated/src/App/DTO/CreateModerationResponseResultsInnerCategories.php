<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of the categories, and whether they are flagged or not.
 */
class CreateModerationResponseResultsInnerCategories
{
    /**
     * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
     * @DTA\Data(field="hate")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $hate;

    /**
     * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
     * @DTA\Data(field="hate/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $hate_threatening;

    /**
     * Content that expresses, incites, or promotes harassing language towards any target.
     * @DTA\Data(field="harassment")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $harassment;

    /**
     * Harassment content that also includes violence or serious harm towards any target.
     * @DTA\Data(field="harassment/threatening")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $harassment_threatening;

    /**
     * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \&quot;how to shoplift\&quot; would fit this category.
     * @DTA\Data(field="illicit")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $illicit;

    /**
     * Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
     * @DTA\Data(field="illicit/violent")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $illicit_violent;

    /**
     * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
     * @DTA\Data(field="self-harm")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $self_harm;

    /**
     * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
     * @DTA\Data(field="self-harm/intent")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $self_harm_intent;

    /**
     * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
     * @DTA\Data(field="self-harm/instructions")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $self_harm_instructions;

    /**
     * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
     * @DTA\Data(field="sexual")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $sexual;

    /**
     * Sexual content that includes an individual who is under 18 years old.
     * @DTA\Data(field="sexual/minors")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $sexual_minors;

    /**
     * Content that depicts death, violence, or physical injury.
     * @DTA\Data(field="violence")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $violence;

    /**
     * Content that depicts death, violence, or physical injury in graphic detail.
     * @DTA\Data(field="violence/graphic")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $violence_graphic;

}
