<?php
/**
 * CreateTranslation200ResponseTest
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

use OpenAPI\Server\Model\CreateTranslation200Response;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CreateTranslation200ResponseTest Class Doc Comment
 *
 * @category    Class
 * @description CreateTranslation200Response
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CreateTranslation200Response
 */
class CreateTranslation200ResponseTest extends TestCase
{
    protected CreateTranslation200Response|MockObject $object;

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
        $this->object = $this->getMockBuilder(CreateTranslation200Response::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CreateTranslation200Response::class));
        $this->assertInstanceOf(CreateTranslation200Response::class, $this->object);
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