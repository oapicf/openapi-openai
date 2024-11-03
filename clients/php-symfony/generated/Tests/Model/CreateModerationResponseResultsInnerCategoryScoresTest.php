<?php
/**
 * CreateModerationResponseResultsInnerCategoryScoresTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\CreateModerationResponseResultsInnerCategoryScores;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CreateModerationResponseResultsInnerCategoryScoresTest Class Doc Comment
 *
 * @category    Class
 * @description A list of the categories along with their scores as predicted by model.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CreateModerationResponseResultsInnerCategoryScores
 */
class CreateModerationResponseResultsInnerCategoryScoresTest extends TestCase
{
    protected CreateModerationResponseResultsInnerCategoryScores|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(CreateModerationResponseResultsInnerCategoryScores::class)->getMockForAbstractClass();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(CreateModerationResponseResultsInnerCategoryScores::class));
        $this->assertInstanceOf(CreateModerationResponseResultsInnerCategoryScores::class, $this->object);
    }

    /**
     * Test attribute "hate"
     *
     * @group unit
     * @small
     */
    public function testPropertyHate(): void
    {
        $this->markTestSkipped('Test for property hate not implemented');
    }

    /**
     * Test attribute "hateThreatening"
     *
     * @group unit
     * @small
     */
    public function testPropertyHateThreatening(): void
    {
        $this->markTestSkipped('Test for property hateThreatening not implemented');
    }

    /**
     * Test attribute "harassment"
     *
     * @group unit
     * @small
     */
    public function testPropertyHarassment(): void
    {
        $this->markTestSkipped('Test for property harassment not implemented');
    }

    /**
     * Test attribute "harassmentThreatening"
     *
     * @group unit
     * @small
     */
    public function testPropertyHarassmentThreatening(): void
    {
        $this->markTestSkipped('Test for property harassmentThreatening not implemented');
    }

    /**
     * Test attribute "selfHarm"
     *
     * @group unit
     * @small
     */
    public function testPropertySelfHarm(): void
    {
        $this->markTestSkipped('Test for property selfHarm not implemented');
    }

    /**
     * Test attribute "selfHarmIntent"
     *
     * @group unit
     * @small
     */
    public function testPropertySelfHarmIntent(): void
    {
        $this->markTestSkipped('Test for property selfHarmIntent not implemented');
    }

    /**
     * Test attribute "selfHarmInstructions"
     *
     * @group unit
     * @small
     */
    public function testPropertySelfHarmInstructions(): void
    {
        $this->markTestSkipped('Test for property selfHarmInstructions not implemented');
    }

    /**
     * Test attribute "sexual"
     *
     * @group unit
     * @small
     */
    public function testPropertySexual(): void
    {
        $this->markTestSkipped('Test for property sexual not implemented');
    }

    /**
     * Test attribute "sexualMinors"
     *
     * @group unit
     * @small
     */
    public function testPropertySexualMinors(): void
    {
        $this->markTestSkipped('Test for property sexualMinors not implemented');
    }

    /**
     * Test attribute "violence"
     *
     * @group unit
     * @small
     */
    public function testPropertyViolence(): void
    {
        $this->markTestSkipped('Test for property violence not implemented');
    }

    /**
     * Test attribute "violenceGraphic"
     *
     * @group unit
     * @small
     */
    public function testPropertyViolenceGraphic(): void
    {
        $this->markTestSkipped('Test for property violenceGraphic not implemented');
    }
}
