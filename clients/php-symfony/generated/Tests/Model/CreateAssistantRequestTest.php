<?php
/**
 * CreateAssistantRequestTest
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

use OpenAPI\Server\Model\CreateAssistantRequest;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CreateAssistantRequestTest Class Doc Comment
 *
 * @category    Class
 * @description CreateAssistantRequest
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CreateAssistantRequest
 */
class CreateAssistantRequestTest extends TestCase
{
    protected CreateAssistantRequest|MockObject $object;

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
        $this->object = $this->getMockBuilder(CreateAssistantRequest::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CreateAssistantRequest::class));
        $this->assertInstanceOf(CreateAssistantRequest::class, $this->object);
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
     * Test attribute "name"
     *
     * @group unit
     * @small
     */
    public function testPropertyName(): void
    {
        $this->markTestSkipped('Test for property name not implemented');
    }

    /**
     * Test attribute "description"
     *
     * @group unit
     * @small
     */
    public function testPropertyDescription(): void
    {
        $this->markTestSkipped('Test for property description not implemented');
    }

    /**
     * Test attribute "instructions"
     *
     * @group unit
     * @small
     */
    public function testPropertyInstructions(): void
    {
        $this->markTestSkipped('Test for property instructions not implemented');
    }

    /**
     * Test attribute "tools"
     *
     * @group unit
     * @small
     */
    public function testPropertyTools(): void
    {
        $this->markTestSkipped('Test for property tools not implemented');
    }

    /**
     * Test attribute "fileIds"
     *
     * @group unit
     * @small
     */
    public function testPropertyFileIds(): void
    {
        $this->markTestSkipped('Test for property fileIds not implemented');
    }

    /**
     * Test attribute "metadata"
     *
     * @group unit
     * @small
     */
    public function testPropertyMetadata(): void
    {
        $this->markTestSkipped('Test for property metadata not implemented');
    }
}
