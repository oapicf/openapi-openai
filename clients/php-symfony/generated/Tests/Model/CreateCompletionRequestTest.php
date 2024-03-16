<?php
/**
 * CreateCompletionRequestTest
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

use OpenAPI\Server\Model\CreateCompletionRequest;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CreateCompletionRequestTest Class Doc Comment
 *
 * @category    Class
 * @description CreateCompletionRequest
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CreateCompletionRequest
 */
class CreateCompletionRequestTest extends TestCase
{
    protected CreateCompletionRequest|MockObject $object;

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
        $this->object = $this->getMockBuilder(CreateCompletionRequest::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CreateCompletionRequest::class));
        $this->assertInstanceOf(CreateCompletionRequest::class, $this->object);
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
     * Test attribute "prompt"
     *
     * @group unit
     * @small
     */
    public function testPropertyPrompt(): void
    {
        $this->markTestSkipped('Test for property prompt not implemented');
    }

    /**
     * Test attribute "suffix"
     *
     * @group unit
     * @small
     */
    public function testPropertySuffix(): void
    {
        $this->markTestSkipped('Test for property suffix not implemented');
    }

    /**
     * Test attribute "maxTokens"
     *
     * @group unit
     * @small
     */
    public function testPropertyMaxTokens(): void
    {
        $this->markTestSkipped('Test for property maxTokens not implemented');
    }

    /**
     * Test attribute "temperature"
     *
     * @group unit
     * @small
     */
    public function testPropertyTemperature(): void
    {
        $this->markTestSkipped('Test for property temperature not implemented');
    }

    /**
     * Test attribute "topP"
     *
     * @group unit
     * @small
     */
    public function testPropertyTopP(): void
    {
        $this->markTestSkipped('Test for property topP not implemented');
    }

    /**
     * Test attribute "n"
     *
     * @group unit
     * @small
     */
    public function testPropertyN(): void
    {
        $this->markTestSkipped('Test for property n not implemented');
    }

    /**
     * Test attribute "stream"
     *
     * @group unit
     * @small
     */
    public function testPropertyStream(): void
    {
        $this->markTestSkipped('Test for property stream not implemented');
    }

    /**
     * Test attribute "logprobs"
     *
     * @group unit
     * @small
     */
    public function testPropertyLogprobs(): void
    {
        $this->markTestSkipped('Test for property logprobs not implemented');
    }

    /**
     * Test attribute "echo"
     *
     * @group unit
     * @small
     */
    public function testPropertyEcho(): void
    {
        $this->markTestSkipped('Test for property echo not implemented');
    }

    /**
     * Test attribute "stop"
     *
     * @group unit
     * @small
     */
    public function testPropertyStop(): void
    {
        $this->markTestSkipped('Test for property stop not implemented');
    }

    /**
     * Test attribute "presencePenalty"
     *
     * @group unit
     * @small
     */
    public function testPropertyPresencePenalty(): void
    {
        $this->markTestSkipped('Test for property presencePenalty not implemented');
    }

    /**
     * Test attribute "frequencyPenalty"
     *
     * @group unit
     * @small
     */
    public function testPropertyFrequencyPenalty(): void
    {
        $this->markTestSkipped('Test for property frequencyPenalty not implemented');
    }

    /**
     * Test attribute "bestOf"
     *
     * @group unit
     * @small
     */
    public function testPropertyBestOf(): void
    {
        $this->markTestSkipped('Test for property bestOf not implemented');
    }

    /**
     * Test attribute "logitBias"
     *
     * @group unit
     * @small
     */
    public function testPropertyLogitBias(): void
    {
        $this->markTestSkipped('Test for property logitBias not implemented');
    }

    /**
     * Test attribute "user"
     *
     * @group unit
     * @small
     */
    public function testPropertyUser(): void
    {
        $this->markTestSkipped('Test for property user not implemented');
    }
}
