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
use OpenAPIServer\Model\CreateMessageRequest;

/**
 * CreateMessageRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateMessageRequest
 */
class CreateMessageRequestTest extends TestCase
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
     * Test "CreateMessageRequest"
     */
    public function testCreateMessageRequest()
    {
        $testCreateMessageRequest = new CreateMessageRequest();
        $namespacedClassname = CreateMessageRequest::getModelsNamespace() . '\\CreateMessageRequest';
        $this->assertSame('\\' . CreateMessageRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateMessageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "role"
     */
    public function testPropertyRole()
    {
        self::markTestIncomplete(
            'Test of "role" property in "CreateMessageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "content"
     */
    public function testPropertyContent()
    {
        self::markTestIncomplete(
            'Test of "content" property in "CreateMessageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fileIds"
     */
    public function testPropertyFileIds()
    {
        self::markTestIncomplete(
            'Test of "fileIds" property in "CreateMessageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "metadata"
     */
    public function testPropertyMetadata()
    {
        self::markTestIncomplete(
            'Test of "metadata" property in "CreateMessageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateMessageRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

