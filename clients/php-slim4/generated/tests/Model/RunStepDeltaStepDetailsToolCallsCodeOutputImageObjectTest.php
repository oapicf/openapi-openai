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
use OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;

/**
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
 */
class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectTest extends TestCase
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
     * Test "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject"
     */
    public function testRunStepDeltaStepDetailsToolCallsCodeOutputImageObject()
    {
        $testRunStepDeltaStepDetailsToolCallsCodeOutputImageObject = new RunStepDeltaStepDetailsToolCallsCodeOutputImageObject();
        $namespacedClassname = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getModelsNamespace() . '\\RunStepDeltaStepDetailsToolCallsCodeOutputImageObject';
        $this->assertSame('\\' . RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "index"
     */
    public function testPropertyIndex()
    {
        self::markTestIncomplete(
            'Test of "index" property in "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        self::markTestIncomplete(
            'Test of "type" property in "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "image"
     */
    public function testPropertyImage()
    {
        self::markTestIncomplete(
            'Test of "image" property in "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

