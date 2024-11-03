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
use OpenAPIServer\Model\CreateCompletionResponse;

/**
 * CreateCompletionResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateCompletionResponse
 */
class CreateCompletionResponseTest extends TestCase
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
     * Test "CreateCompletionResponse"
     */
    public function testCreateCompletionResponse()
    {
        $testCreateCompletionResponse = new CreateCompletionResponse();
        $namespacedClassname = CreateCompletionResponse::getModelsNamespace() . '\\CreateCompletionResponse';
        $this->assertSame('\\' . CreateCompletionResponse::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "choices"
     */
    public function testPropertyChoices()
    {
        self::markTestIncomplete(
            'Test of "choices" property in "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "created"
     */
    public function testPropertyCreated()
    {
        self::markTestIncomplete(
            'Test of "created" property in "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "model"
     */
    public function testPropertyModel()
    {
        self::markTestIncomplete(
            'Test of "model" property in "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "systemFingerprint"
     */
    public function testPropertySystemFingerprint()
    {
        self::markTestIncomplete(
            'Test of "systemFingerprint" property in "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "object"
     */
    public function testPropertyObject()
    {
        self::markTestIncomplete(
            'Test of "object" property in "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "usage"
     */
    public function testPropertyUsage()
    {
        self::markTestIncomplete(
            'Test of "usage" property in "CreateCompletionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateCompletionResponse::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

