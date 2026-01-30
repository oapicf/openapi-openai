<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of the categories along with the input type(s) that the score applies to.
 */
class CreateModerationResponseResultsInnerCategoryAppliedInputTypes
{
    /**
     * The applied input type(s) for the category &#39;hate&#39;.
     * @DTA\Data(field="hate")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection49::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection49::class})
     * @var \App\DTO\Collection49|null
     */
    public $hate;

    /**
     * The applied input type(s) for the category &#39;hate/threatening&#39;.
     * @DTA\Data(field="hate/threatening")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection50::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection50::class})
     * @var \App\DTO\Collection50|null
     */
    public $hate_threatening;

    /**
     * The applied input type(s) for the category &#39;harassment&#39;.
     * @DTA\Data(field="harassment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection51::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection51::class})
     * @var \App\DTO\Collection51|null
     */
    public $harassment;

    /**
     * The applied input type(s) for the category &#39;harassment/threatening&#39;.
     * @DTA\Data(field="harassment/threatening")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection52::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection52::class})
     * @var \App\DTO\Collection52|null
     */
    public $harassment_threatening;

    /**
     * The applied input type(s) for the category &#39;illicit&#39;.
     * @DTA\Data(field="illicit")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection53::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection53::class})
     * @var \App\DTO\Collection53|null
     */
    public $illicit;

    /**
     * The applied input type(s) for the category &#39;illicit/violent&#39;.
     * @DTA\Data(field="illicit/violent")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection54::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection54::class})
     * @var \App\DTO\Collection54|null
     */
    public $illicit_violent;

    /**
     * The applied input type(s) for the category &#39;self-harm&#39;.
     * @DTA\Data(field="self-harm")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     * @var \App\DTO\Collection55|null
     */
    public $self_harm;

    /**
     * The applied input type(s) for the category &#39;self-harm/intent&#39;.
     * @DTA\Data(field="self-harm/intent")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     * @var \App\DTO\Collection56|null
     */
    public $self_harm_intent;

    /**
     * The applied input type(s) for the category &#39;self-harm/instructions&#39;.
     * @DTA\Data(field="self-harm/instructions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     * @var \App\DTO\Collection57|null
     */
    public $self_harm_instructions;

    /**
     * The applied input type(s) for the category &#39;sexual&#39;.
     * @DTA\Data(field="sexual")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     * @var \App\DTO\Collection58|null
     */
    public $sexual;

    /**
     * The applied input type(s) for the category &#39;sexual/minors&#39;.
     * @DTA\Data(field="sexual/minors")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     * @var \App\DTO\Collection59|null
     */
    public $sexual_minors;

    /**
     * The applied input type(s) for the category &#39;violence&#39;.
     * @DTA\Data(field="violence")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     * @var \App\DTO\Collection60|null
     */
    public $violence;

    /**
     * The applied input type(s) for the category &#39;violence/graphic&#39;.
     * @DTA\Data(field="violence/graphic")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     * @var \App\DTO\Collection61|null
     */
    public $violence_graphic;

}
