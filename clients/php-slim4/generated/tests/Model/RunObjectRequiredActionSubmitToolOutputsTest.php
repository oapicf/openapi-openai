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
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
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
use OpenAPIServer\Model\RunObjectRequiredActionSubmitToolOutputs;

/**
 * RunObjectRequiredActionSubmitToolOutputsTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\RunObjectRequiredActionSubmitToolOutputs
 */
class RunObjectRequiredActionSubmitToolOutputsTest extends TestCase
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
     * Test "RunObjectRequiredActionSubmitToolOutputs"
     */
    public function testRunObjectRequiredActionSubmitToolOutputs()
    {
        $testRunObjectRequiredActionSubmitToolOutputs = new RunObjectRequiredActionSubmitToolOutputs();
        $namespacedClassname = RunObjectRequiredActionSubmitToolOutputs::getModelsNamespace() . '\\RunObjectRequiredActionSubmitToolOutputs';
        $this->assertSame('\\' . RunObjectRequiredActionSubmitToolOutputs::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "RunObjectRequiredActionSubmitToolOutputs" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "toolCalls"
     */
    public function testPropertyToolCalls()
    {
        self::markTestIncomplete(
            'Test of "toolCalls" property in "RunObjectRequiredActionSubmitToolOutputs" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = RunObjectRequiredActionSubmitToolOutputs::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

