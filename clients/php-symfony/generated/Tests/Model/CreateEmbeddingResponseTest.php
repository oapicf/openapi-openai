<?php
/**
 * CreateEmbeddingResponseTest
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
 * APIs for sampling from and fine-tuning language models
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

use OpenAPI\Server\Model\CreateEmbeddingResponse;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CreateEmbeddingResponseTest Class Doc Comment
 *
 * @category    Class
 * @description CreateEmbeddingResponse
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CreateEmbeddingResponse
 */
class CreateEmbeddingResponseTest extends TestCase
{
    protected CreateEmbeddingResponse|MockObject $object;

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
        $this->object = $this->getMockBuilder(CreateEmbeddingResponse::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CreateEmbeddingResponse::class));
        $this->assertInstanceOf(CreateEmbeddingResponse::class, $this->object);
    }

    /**
     * Test attribute "object"
     *
     * @group unit
     * @small
     */
    public function testPropertyObject(): void
    {
        $this->markTestSkipped('Test for property object not implemented');
    }

    /**
     * Test attribute "model"
     *
     * @group unit
     * @small
     */
    public function testPropertyModel(): void
    {
        $this->markTestSkipped('Test for property model not implemented');
    }

    /**
     * Test attribute "data"
     *
     * @group unit
     * @small
     */
    public function testPropertyData(): void
    {
        $this->markTestSkipped('Test for property data not implemented');
    }

    /**
     * Test attribute "usage"
     *
     * @group unit
     * @small
     */
    public function testPropertyUsage(): void
    {
        $this->markTestSkipped('Test for property usage not implemented');
    }
}
