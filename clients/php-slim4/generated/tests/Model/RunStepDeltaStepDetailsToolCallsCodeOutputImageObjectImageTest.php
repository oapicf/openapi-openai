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
use OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;

/**
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
 */
class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageTest extends TestCase
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
     * Test "RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage"
     */
    public function testRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage()
    {
        $testRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage = new RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage();
        $namespacedClassname = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::getModelsNamespace() . '\\RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';
        $this->assertSame('\\' . RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fileId"
     */
    public function testPropertyFileId()
    {
        self::markTestIncomplete(
            'Test of "fileId" property in "RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
