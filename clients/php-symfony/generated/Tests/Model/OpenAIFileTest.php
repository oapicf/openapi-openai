<?php
/**
 * OpenAIFileTest
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

use OpenAPI\Server\Model\OpenAIFile;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * OpenAIFileTest Class Doc Comment
 *
 * @category    Class
 * @description OpenAIFile
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\OpenAIFile
 */
class OpenAIFileTest extends TestCase
{
    protected OpenAIFile|MockObject $object;

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
        $this->object = $this->getMockBuilder(OpenAIFile::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(OpenAIFile::class));
        $this->assertInstanceOf(OpenAIFile::class, $this->object);
    }

    /**
     * Test attribute "id"
     *
     * @group unit
     * @small
     */
    public function testPropertyId(): void
    {
        $this->markTestSkipped('Test for property id not implemented');
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
     * Test attribute "bytes"
     *
     * @group unit
     * @small
     */
    public function testPropertyBytes(): void
    {
        $this->markTestSkipped('Test for property bytes not implemented');
    }

    /**
     * Test attribute "createdAt"
     *
     * @group unit
     * @small
     */
    public function testPropertyCreatedAt(): void
    {
        $this->markTestSkipped('Test for property createdAt not implemented');
    }

    /**
     * Test attribute "filename"
     *
     * @group unit
     * @small
     */
    public function testPropertyFilename(): void
    {
        $this->markTestSkipped('Test for property filename not implemented');
    }

    /**
     * Test attribute "purpose"
     *
     * @group unit
     * @small
     */
    public function testPropertyPurpose(): void
    {
        $this->markTestSkipped('Test for property purpose not implemented');
    }

    /**
     * Test attribute "status"
     *
     * @group unit
     * @small
     */
    public function testPropertyStatus(): void
    {
        $this->markTestSkipped('Test for property status not implemented');
    }

    /**
     * Test attribute "statusDetails"
     *
     * @group unit
     * @small
     */
    public function testPropertyStatusDetails(): void
    {
        $this->markTestSkipped('Test for property statusDetails not implemented');
    }
}
