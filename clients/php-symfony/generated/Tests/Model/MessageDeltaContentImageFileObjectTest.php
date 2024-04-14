<?php
/**
 * MessageDeltaContentImageFileObjectTest
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

use OpenAPI\Server\Model\MessageDeltaContentImageFileObject;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * MessageDeltaContentImageFileObjectTest Class Doc Comment
 *
 * @category    Class
 * @description References an image [File](/docs/api-reference/files) in the content of a message.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\MessageDeltaContentImageFileObject
 */
class MessageDeltaContentImageFileObjectTest extends TestCase
{
    protected MessageDeltaContentImageFileObject|MockObject $object;

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
        $this->object = $this->getMockBuilder(MessageDeltaContentImageFileObject::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(MessageDeltaContentImageFileObject::class));
        $this->assertInstanceOf(MessageDeltaContentImageFileObject::class, $this->object);
    }

    /**
     * Test attribute "index"
     *
     * @group unit
     * @small
     */
    public function testPropertyIndex(): void
    {
        $this->markTestSkipped('Test for property index not implemented');
    }

    /**
     * Test attribute "type"
     *
     * @group unit
     * @small
     */
    public function testPropertyType(): void
    {
        $this->markTestSkipped('Test for property type not implemented');
    }

    /**
     * Test attribute "imageFile"
     *
     * @group unit
     * @small
     */
    public function testPropertyImageFile(): void
    {
        $this->markTestSkipped('Test for property imageFile not implemented');
    }
}
