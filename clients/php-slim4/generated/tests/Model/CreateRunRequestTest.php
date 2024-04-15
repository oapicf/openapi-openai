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
use OpenAPIServer\Model\CreateRunRequest;

/**
 * CreateRunRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateRunRequest
 */
class CreateRunRequestTest extends TestCase
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
     * Test "CreateRunRequest"
     */
    public function testCreateRunRequest()
    {
        $testCreateRunRequest = new CreateRunRequest();
        $namespacedClassname = CreateRunRequest::getModelsNamespace() . '\\CreateRunRequest';
        $this->assertSame('\\' . CreateRunRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "assistantId"
     */
    public function testPropertyAssistantId()
    {
        self::markTestIncomplete(
            'Test of "assistantId" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "model"
     */
    public function testPropertyModel()
    {
        self::markTestIncomplete(
            'Test of "model" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "instructions"
     */
    public function testPropertyInstructions()
    {
        self::markTestIncomplete(
            'Test of "instructions" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "additionalInstructions"
     */
    public function testPropertyAdditionalInstructions()
    {
        self::markTestIncomplete(
            'Test of "additionalInstructions" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "additionalMessages"
     */
    public function testPropertyAdditionalMessages()
    {
        self::markTestIncomplete(
            'Test of "additionalMessages" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "tools"
     */
    public function testPropertyTools()
    {
        self::markTestIncomplete(
            'Test of "tools" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "metadata"
     */
    public function testPropertyMetadata()
    {
        self::markTestIncomplete(
            'Test of "metadata" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "temperature"
     */
    public function testPropertyTemperature()
    {
        self::markTestIncomplete(
            'Test of "temperature" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "stream"
     */
    public function testPropertyStream()
    {
        self::markTestIncomplete(
            'Test of "stream" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "maxPromptTokens"
     */
    public function testPropertyMaxPromptTokens()
    {
        self::markTestIncomplete(
            'Test of "maxPromptTokens" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "maxCompletionTokens"
     */
    public function testPropertyMaxCompletionTokens()
    {
        self::markTestIncomplete(
            'Test of "maxCompletionTokens" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "truncationStrategy"
     */
    public function testPropertyTruncationStrategy()
    {
        self::markTestIncomplete(
            'Test of "truncationStrategy" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "toolChoice"
     */
    public function testPropertyToolChoice()
    {
        self::markTestIncomplete(
            'Test of "toolChoice" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "responseFormat"
     */
    public function testPropertyResponseFormat()
    {
        self::markTestIncomplete(
            'Test of "responseFormat" property in "CreateRunRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateRunRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
