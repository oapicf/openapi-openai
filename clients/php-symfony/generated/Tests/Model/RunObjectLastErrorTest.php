<?php
/**
 * RunObjectLastErrorTest
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

use OpenAPI\Server\Model\RunObjectLastError;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * RunObjectLastErrorTest Class Doc Comment
 *
 * @category    Class
 * @description The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\RunObjectLastError
 */
class RunObjectLastErrorTest extends TestCase
{
    protected RunObjectLastError|MockObject $object;

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
        $this->object = $this->getMockBuilder(RunObjectLastError::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(RunObjectLastError::class));
        $this->assertInstanceOf(RunObjectLastError::class, $this->object);
    }

    /**
     * Test attribute "code"
     *
     * @group unit
     * @small
     */
    public function testPropertyCode(): void
    {
        $this->markTestSkipped('Test for property code not implemented');
    }

    /**
     * Test attribute "message"
     *
     * @group unit
     * @small
     */
    public function testPropertyMessage(): void
    {
        $this->markTestSkipped('Test for property message not implemented');
    }
}
