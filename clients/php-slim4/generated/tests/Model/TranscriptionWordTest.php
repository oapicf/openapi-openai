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
use OpenAPIServer\Model\TranscriptionWord;

/**
 * TranscriptionWordTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\TranscriptionWord
 */
class TranscriptionWordTest extends TestCase
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
     * Test "TranscriptionWord"
     */
    public function testTranscriptionWord()
    {
        $testTranscriptionWord = new TranscriptionWord();
        $namespacedClassname = TranscriptionWord::getModelsNamespace() . '\\TranscriptionWord';
        $this->assertSame('\\' . TranscriptionWord::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "TranscriptionWord" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "word"
     */
    public function testPropertyWord()
    {
        self::markTestIncomplete(
            'Test of "word" property in "TranscriptionWord" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "start"
     */
    public function testPropertyStart()
    {
        self::markTestIncomplete(
            'Test of "start" property in "TranscriptionWord" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "end"
     */
    public function testPropertyEnd()
    {
        self::markTestIncomplete(
            'Test of "end" property in "TranscriptionWord" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = TranscriptionWord::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
