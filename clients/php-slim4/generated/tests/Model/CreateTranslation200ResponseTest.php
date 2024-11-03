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
use OpenAPIServer\Model\CreateTranslation200Response;

/**
 * CreateTranslation200ResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateTranslation200Response
 */
class CreateTranslation200ResponseTest extends TestCase
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
     * Test "CreateTranslation200Response"
     */
    public function testCreateTranslation200Response()
    {
        $testCreateTranslation200Response = new CreateTranslation200Response();
        $namespacedClassname = CreateTranslation200Response::getModelsNamespace() . '\\CreateTranslation200Response';
        $this->assertSame('\\' . CreateTranslation200Response::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateTranslation200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "text"
     */
    public function testPropertyText()
    {
        self::markTestIncomplete(
            'Test of "text" property in "CreateTranslation200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "language"
     */
    public function testPropertyLanguage()
    {
        self::markTestIncomplete(
            'Test of "language" property in "CreateTranslation200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "duration"
     */
    public function testPropertyDuration()
    {
        self::markTestIncomplete(
            'Test of "duration" property in "CreateTranslation200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "segments"
     */
    public function testPropertySegments()
    {
        self::markTestIncomplete(
            'Test of "segments" property in "CreateTranslation200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateTranslation200Response::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

