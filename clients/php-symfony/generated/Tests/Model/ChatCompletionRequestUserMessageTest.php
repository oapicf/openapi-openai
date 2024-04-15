<?php
/**
 * ChatCompletionRequestUserMessageTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\ChatCompletionRequestUserMessage;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * ChatCompletionRequestUserMessageTest Class Doc Comment
 *
 * @category    Class
 * @description ChatCompletionRequestUserMessage
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\ChatCompletionRequestUserMessage
 */
class ChatCompletionRequestUserMessageTest extends TestCase
{
    protected ChatCompletionRequestUserMessage|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(ChatCompletionRequestUserMessage::class)->getMockForAbstractClass();
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
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(ChatCompletionRequestUserMessage::class));
        $this->assertInstanceOf(ChatCompletionRequestUserMessage::class, $this->object);
    }

    /**
     * Test attribute "content"
     *
     * @group unit
     * @small
     */
    public function testPropertyContent(): void
    {
        $this->markTestSkipped('Test for property content not implemented');
    }

    /**
     * Test attribute "role"
     *
     * @group unit
     * @small
     */
    public function testPropertyRole(): void
    {
        $this->markTestSkipped('Test for property role not implemented');
    }

    /**
     * Test attribute "name"
     *
     * @group unit
     * @small
     */
    public function testPropertyName(): void
    {
        $this->markTestSkipped('Test for property name not implemented');
    }
}