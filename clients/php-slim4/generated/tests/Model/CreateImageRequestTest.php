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
use OpenAPIServer\Model\CreateImageRequest;

/**
 * CreateImageRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateImageRequest
 */
class CreateImageRequestTest extends TestCase
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
     * Test "CreateImageRequest"
     */
    public function testCreateImageRequest()
    {
        $testCreateImageRequest = new CreateImageRequest();
        $namespacedClassname = CreateImageRequest::getModelsNamespace() . '\\CreateImageRequest';
        $this->assertSame('\\' . CreateImageRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateImageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "prompt"
     */
    public function testPropertyPrompt()
    {
        self::markTestIncomplete(
            'Test of "prompt" property in "CreateImageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "n"
     */
    public function testPropertyN()
    {
        self::markTestIncomplete(
            'Test of "n" property in "CreateImageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "size"
     */
    public function testPropertySize()
    {
        self::markTestIncomplete(
            'Test of "size" property in "CreateImageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "responseFormat"
     */
    public function testPropertyResponseFormat()
    {
        self::markTestIncomplete(
            'Test of "responseFormat" property in "CreateImageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "user"
     */
    public function testPropertyUser()
    {
        self::markTestIncomplete(
            'Test of "user" property in "CreateImageRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateImageRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

