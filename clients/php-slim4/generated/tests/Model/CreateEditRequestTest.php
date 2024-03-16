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
 * APIs for sampling from and fine-tuning language models
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
use OpenAPIServer\Model\CreateEditRequest;

/**
 * CreateEditRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateEditRequest
 */
class CreateEditRequestTest extends TestCase
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
     * Test "CreateEditRequest"
     */
    public function testCreateEditRequest()
    {
        $testCreateEditRequest = new CreateEditRequest();
        $namespacedClassname = CreateEditRequest::getModelsNamespace() . '\\CreateEditRequest';
        $this->assertSame('\\' . CreateEditRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateEditRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "model"
     */
    public function testPropertyModel()
    {
        self::markTestIncomplete(
            'Test of "model" property in "CreateEditRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "input"
     */
    public function testPropertyInput()
    {
        self::markTestIncomplete(
            'Test of "input" property in "CreateEditRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "instruction"
     */
    public function testPropertyInstruction()
    {
        self::markTestIncomplete(
            'Test of "instruction" property in "CreateEditRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "n"
     */
    public function testPropertyN()
    {
        self::markTestIncomplete(
            'Test of "n" property in "CreateEditRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "temperature"
     */
    public function testPropertyTemperature()
    {
        self::markTestIncomplete(
            'Test of "temperature" property in "CreateEditRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "topP"
     */
    public function testPropertyTopP()
    {
        self::markTestIncomplete(
            'Test of "topP" property in "CreateEditRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateEditRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
