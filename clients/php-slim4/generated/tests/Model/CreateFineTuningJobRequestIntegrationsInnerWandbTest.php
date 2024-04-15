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
use OpenAPIServer\Model\CreateFineTuningJobRequestIntegrationsInnerWandb;

/**
 * CreateFineTuningJobRequestIntegrationsInnerWandbTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CreateFineTuningJobRequestIntegrationsInnerWandb
 */
class CreateFineTuningJobRequestIntegrationsInnerWandbTest extends TestCase
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
     * Test "CreateFineTuningJobRequestIntegrationsInnerWandb"
     */
    public function testCreateFineTuningJobRequestIntegrationsInnerWandb()
    {
        $testCreateFineTuningJobRequestIntegrationsInnerWandb = new CreateFineTuningJobRequestIntegrationsInnerWandb();
        $namespacedClassname = CreateFineTuningJobRequestIntegrationsInnerWandb::getModelsNamespace() . '\\CreateFineTuningJobRequestIntegrationsInnerWandb';
        $this->assertSame('\\' . CreateFineTuningJobRequestIntegrationsInnerWandb::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CreateFineTuningJobRequestIntegrationsInnerWandb" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "project"
     */
    public function testPropertyProject()
    {
        self::markTestIncomplete(
            'Test of "project" property in "CreateFineTuningJobRequestIntegrationsInnerWandb" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "CreateFineTuningJobRequestIntegrationsInnerWandb" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "entity"
     */
    public function testPropertyEntity()
    {
        self::markTestIncomplete(
            'Test of "entity" property in "CreateFineTuningJobRequestIntegrationsInnerWandb" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "tags"
     */
    public function testPropertyTags()
    {
        self::markTestIncomplete(
            'Test of "tags" property in "CreateFineTuningJobRequestIntegrationsInnerWandb" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CreateFineTuningJobRequestIntegrationsInnerWandb::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
