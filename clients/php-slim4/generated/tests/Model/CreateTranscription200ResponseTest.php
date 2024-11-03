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
use OpenAPIServer\Model\CreateTranscription200Response;

/**
 * CreateTranscription200ResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateTranscription200Response
 */
class CreateTranscription200ResponseTest extends TestCase
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
     * Test "CreateTranscription200Response"
     */
    public function testCreateTranscription200Response()
    {
        $testCreateTranscription200Response = new CreateTranscription200Response();
        $namespacedClassname = CreateTranscription200Response::getModelsNamespace() . '\\CreateTranscription200Response';
        $this->assertSame('\\' . CreateTranscription200Response::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateTranscription200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "text"
     */
    public function testPropertyText()
    {
        self::markTestIncomplete(
            'Test of "text" property in "CreateTranscription200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "language"
     */
    public function testPropertyLanguage()
    {
        self::markTestIncomplete(
            'Test of "language" property in "CreateTranscription200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "duration"
     */
    public function testPropertyDuration()
    {
        self::markTestIncomplete(
            'Test of "duration" property in "CreateTranscription200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "words"
     */
    public function testPropertyWords()
    {
        self::markTestIncomplete(
            'Test of "words" property in "CreateTranscription200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "segments"
     */
    public function testPropertySegments()
    {
        self::markTestIncomplete(
            'Test of "segments" property in "CreateTranscription200Response" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateTranscription200Response::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

