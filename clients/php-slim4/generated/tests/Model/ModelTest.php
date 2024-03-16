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
use OpenAPIServer\Model\Model;

/**
 * ModelTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Model
 */
class ModelTest extends TestCase
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
     * Test "Model"
     */
    public function testModel()
    {
        $testModel = new Model();
        $namespacedClassname = Model::getModelsNamespace() . '\\Model';
        $this->assertSame('\\' . Model::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "Model" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "Model" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "object"
     */
    public function testPropertyObject()
    {
        self::markTestIncomplete(
            'Test of "object" property in "Model" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "created"
     */
    public function testPropertyCreated()
    {
        self::markTestIncomplete(
            'Test of "created" property in "Model" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "ownedBy"
     */
    public function testPropertyOwnedBy()
    {
        self::markTestIncomplete(
            'Test of "ownedBy" property in "Model" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Model::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

