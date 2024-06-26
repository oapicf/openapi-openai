<?php
/**
 * EmbeddingTest
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

use OpenAPI\Server\Model\Embedding;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * EmbeddingTest Class Doc Comment
 *
 * @category    Class
 * @description Represents an embedding vector returned by embedding endpoint.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\Embedding
 */
class EmbeddingTest extends TestCase
{
    protected Embedding|MockObject $object;

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
        $this->object = $this->getMockBuilder(Embedding::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(Embedding::class));
        $this->assertInstanceOf(Embedding::class, $this->object);
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
     * Test attribute "embedding"
     *
     * @group unit
     * @small
     */
    public function testPropertyEmbedding(): void
    {
        $this->markTestSkipped('Test for property embedding not implemented');
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
}
