<?php

/**
 * OpenAI API
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * APIs for sampling from and fine-tuning language models
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\CreateCompletionResponseChoicesInner;

/**
 * CreateCompletionResponseChoicesInnerTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateCompletionResponseChoicesInner
 */
class CreateCompletionResponseChoicesInnerTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
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
     * Test "CreateCompletionResponseChoicesInner"
     */
    public function testCreateCompletionResponseChoicesInner()
    {
        $testCreateCompletionResponseChoicesInner = new CreateCompletionResponseChoicesInner();
        $namespacedClassname = CreateCompletionResponseChoicesInner::getModelsNamespace() . '\\CreateCompletionResponseChoicesInner';
        $this->assertSame('\\' . CreateCompletionResponseChoicesInner::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateCompletionResponseChoicesInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "text"
     */
    public function testPropertyText()
    {
        self::markTestIncomplete(
            'Test of "text" property in "CreateCompletionResponseChoicesInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "index"
     */
    public function testPropertyIndex()
    {
        self::markTestIncomplete(
            'Test of "index" property in "CreateCompletionResponseChoicesInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "logprobs"
     */
    public function testPropertyLogprobs()
    {
        self::markTestIncomplete(
            'Test of "logprobs" property in "CreateCompletionResponseChoicesInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "finishReason"
     */
    public function testPropertyFinishReason()
    {
        self::markTestIncomplete(
            'Test of "finishReason" property in "CreateCompletionResponseChoicesInner" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateCompletionResponseChoicesInner::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

