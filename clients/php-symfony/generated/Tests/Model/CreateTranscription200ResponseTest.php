<?php
/**
 * CreateTranscription200ResponseTest
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

use OpenAPI\Server\Model\CreateTranscription200Response;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CreateTranscription200ResponseTest Class Doc Comment
 *
 * @category    Class
 * @description CreateTranscription200Response
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CreateTranscription200Response
 */
class CreateTranscription200ResponseTest extends TestCase
{
    protected CreateTranscription200Response|MockObject $object;

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
        $this->object = $this->getMockBuilder(CreateTranscription200Response::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CreateTranscription200Response::class));
        $this->assertInstanceOf(CreateTranscription200Response::class, $this->object);
    }

    /**
     * Test attribute "text"
     *
     * @group unit
     * @small
     */
    public function testPropertyText(): void
    {
        $this->markTestSkipped('Test for property text not implemented');
    }

    /**
     * Test attribute "language"
     *
     * @group unit
     * @small
     */
    public function testPropertyLanguage(): void
    {
        $this->markTestSkipped('Test for property language not implemented');
    }

    /**
     * Test attribute "duration"
     *
     * @group unit
     * @small
     */
    public function testPropertyDuration(): void
    {
        $this->markTestSkipped('Test for property duration not implemented');
    }

    /**
     * Test attribute "words"
     *
     * @group unit
     * @small
     */
    public function testPropertyWords(): void
    {
        $this->markTestSkipped('Test for property words not implemented');
    }

    /**
     * Test attribute "segments"
     *
     * @group unit
     * @small
     */
    public function testPropertySegments(): void
    {
        $this->markTestSkipped('Test for property segments not implemented');
    }
}
