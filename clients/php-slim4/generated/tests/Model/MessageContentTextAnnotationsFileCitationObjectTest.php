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
use OpenAPIServer\Model\MessageContentTextAnnotationsFileCitationObject;

/**
 * MessageContentTextAnnotationsFileCitationObjectTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\MessageContentTextAnnotationsFileCitationObject
 */
class MessageContentTextAnnotationsFileCitationObjectTest extends TestCase
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
     * Test "MessageContentTextAnnotationsFileCitationObject"
     */
    public function testMessageContentTextAnnotationsFileCitationObject()
    {
        $testMessageContentTextAnnotationsFileCitationObject = new MessageContentTextAnnotationsFileCitationObject();
        $namespacedClassname = MessageContentTextAnnotationsFileCitationObject::getModelsNamespace() . '\\MessageContentTextAnnotationsFileCitationObject';
        $this->assertSame('\\' . MessageContentTextAnnotationsFileCitationObject::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "MessageContentTextAnnotationsFileCitationObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        self::markTestIncomplete(
            'Test of "type" property in "MessageContentTextAnnotationsFileCitationObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "text"
     */
    public function testPropertyText()
    {
        self::markTestIncomplete(
            'Test of "text" property in "MessageContentTextAnnotationsFileCitationObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fileCitation"
     */
    public function testPropertyFileCitation()
    {
        self::markTestIncomplete(
            'Test of "fileCitation" property in "MessageContentTextAnnotationsFileCitationObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "startIndex"
     */
    public function testPropertyStartIndex()
    {
        self::markTestIncomplete(
            'Test of "startIndex" property in "MessageContentTextAnnotationsFileCitationObject" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "endIndex"
     */
    public function testPropertyEndIndex()
    {
        self::markTestIncomplete(
            'Test of "endIndex" property in "MessageContentTextAnnotationsFileCitationObject" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = MessageContentTextAnnotationsFileCitationObject::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
