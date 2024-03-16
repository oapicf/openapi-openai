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
use OpenAPIServer\Model\OpenAIFile;

/**
 * OpenAIFileTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\OpenAIFile
 */
class OpenAIFileTest extends TestCase
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
     * Test "OpenAIFile"
     */
    public function testOpenAIFile()
    {
        $testOpenAIFile = new OpenAIFile();
        $namespacedClassname = OpenAIFile::getModelsNamespace() . '\\OpenAIFile';
        $this->assertSame('\\' . OpenAIFile::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "object"
     */
    public function testPropertyObject()
    {
        self::markTestIncomplete(
            'Test of "object" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "bytes"
     */
    public function testPropertyBytes()
    {
        self::markTestIncomplete(
            'Test of "bytes" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "createdAt"
     */
    public function testPropertyCreatedAt()
    {
        self::markTestIncomplete(
            'Test of "createdAt" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "filename"
     */
    public function testPropertyFilename()
    {
        self::markTestIncomplete(
            'Test of "filename" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "purpose"
     */
    public function testPropertyPurpose()
    {
        self::markTestIncomplete(
            'Test of "purpose" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "statusDetails"
     */
    public function testPropertyStatusDetails()
    {
        self::markTestIncomplete(
            'Test of "statusDetails" property in "OpenAIFile" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = OpenAIFile::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

