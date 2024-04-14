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
use OpenAPIServer\Model\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;

/**
 * MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
 */
class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationTest extends TestCase
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
     * Test "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation"
     */
    public function testMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation()
    {
        $testMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation = new MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation();
        $namespacedClassname = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::getModelsNamespace() . '\\MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
        $this->assertSame('\\' . MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fileId"
     */
    public function testPropertyFileId()
    {
        self::markTestIncomplete(
            'Test of "fileId" property in "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "quote"
     */
    public function testPropertyQuote()
    {
        self::markTestIncomplete(
            'Test of "quote" property in "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

