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
use OpenAPIServer\Model\CreateAssistantRequest;

/**
 * CreateAssistantRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateAssistantRequest
 */
class CreateAssistantRequestTest extends TestCase
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
     * Test "CreateAssistantRequest"
     */
    public function testCreateAssistantRequest()
    {
        $testCreateAssistantRequest = new CreateAssistantRequest();
        $namespacedClassname = CreateAssistantRequest::getModelsNamespace() . '\\CreateAssistantRequest';
        $this->assertSame('\\' . CreateAssistantRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "model"
     */
    public function testPropertyModel()
    {
        self::markTestIncomplete(
            'Test of "model" property in "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "description"
     */
    public function testPropertyDescription()
    {
        self::markTestIncomplete(
            'Test of "description" property in "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "instructions"
     */
    public function testPropertyInstructions()
    {
        self::markTestIncomplete(
            'Test of "instructions" property in "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "tools"
     */
    public function testPropertyTools()
    {
        self::markTestIncomplete(
            'Test of "tools" property in "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fileIds"
     */
    public function testPropertyFileIds()
    {
        self::markTestIncomplete(
            'Test of "fileIds" property in "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "metadata"
     */
    public function testPropertyMetadata()
    {
        self::markTestIncomplete(
            'Test of "metadata" property in "CreateAssistantRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateAssistantRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
