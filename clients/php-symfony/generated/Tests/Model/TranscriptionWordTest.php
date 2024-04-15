<?php
/**
 * TranscriptionWordTest
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

use OpenAPI\Server\Model\TranscriptionWord;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * TranscriptionWordTest Class Doc Comment
 *
 * @category    Class
 * @description TranscriptionWord
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\TranscriptionWord
 */
class TranscriptionWordTest extends TestCase
{
    protected TranscriptionWord|MockObject $object;

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
        $this->object = $this->getMockBuilder(TranscriptionWord::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(TranscriptionWord::class));
        $this->assertInstanceOf(TranscriptionWord::class, $this->object);
    }

    /**
     * Test attribute "word"
     *
     * @group unit
     * @small
     */
    public function testPropertyWord(): void
    {
        $this->markTestSkipped('Test for property word not implemented');
    }

    /**
     * Test attribute "start"
     *
     * @group unit
     * @small
     */
    public function testPropertyStart(): void
    {
        $this->markTestSkipped('Test for property start not implemented');
    }

    /**
     * Test attribute "end"
     *
     * @group unit
     * @small
     */
    public function testPropertyEnd(): void
    {
        $this->markTestSkipped('Test for property end not implemented');
    }
}