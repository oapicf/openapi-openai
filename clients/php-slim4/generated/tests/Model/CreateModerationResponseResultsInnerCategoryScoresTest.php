<?php

/**
 * OpenAI API
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\CreateModerationResponseResultsInnerCategoryScores;

/**
 * CreateModerationResponseResultsInnerCategoryScoresTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateModerationResponseResultsInnerCategoryScores
 */
class CreateModerationResponseResultsInnerCategoryScoresTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
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
     * Test "CreateModerationResponseResultsInnerCategoryScores"
     */
    public function testCreateModerationResponseResultsInnerCategoryScores()
    {
        $testCreateModerationResponseResultsInnerCategoryScores = new CreateModerationResponseResultsInnerCategoryScores();
        $namespacedClassname = CreateModerationResponseResultsInnerCategoryScores::getModelsNamespace() . '\\CreateModerationResponseResultsInnerCategoryScores';
        $this->assertSame('\\' . CreateModerationResponseResultsInnerCategoryScores::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hate"
     */
    public function testPropertyHate()
    {
        self::markTestIncomplete(
            'Test of "hate" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hateThreatening"
     */
    public function testPropertyHateThreatening()
    {
        self::markTestIncomplete(
            'Test of "hateThreatening" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "harassment"
     */
    public function testPropertyHarassment()
    {
        self::markTestIncomplete(
            'Test of "harassment" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "harassmentThreatening"
     */
    public function testPropertyHarassmentThreatening()
    {
        self::markTestIncomplete(
            'Test of "harassmentThreatening" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "selfHarm"
     */
    public function testPropertySelfHarm()
    {
        self::markTestIncomplete(
            'Test of "selfHarm" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "selfHarmIntent"
     */
    public function testPropertySelfHarmIntent()
    {
        self::markTestIncomplete(
            'Test of "selfHarmIntent" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "selfHarmInstructions"
     */
    public function testPropertySelfHarmInstructions()
    {
        self::markTestIncomplete(
            'Test of "selfHarmInstructions" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "sexual"
     */
    public function testPropertySexual()
    {
        self::markTestIncomplete(
            'Test of "sexual" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "sexualMinors"
     */
    public function testPropertySexualMinors()
    {
        self::markTestIncomplete(
            'Test of "sexualMinors" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "violence"
     */
    public function testPropertyViolence()
    {
        self::markTestIncomplete(
            'Test of "violence" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "violenceGraphic"
     */
    public function testPropertyViolenceGraphic()
    {
        self::markTestIncomplete(
            'Test of "violenceGraphic" property in "CreateModerationResponseResultsInnerCategoryScores" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateModerationResponseResultsInnerCategoryScores::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

