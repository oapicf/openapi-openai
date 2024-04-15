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
use OpenAPIServer\Model\FineTuningJob;

/**
 * FineTuningJobTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\FineTuningJob
 */
class FineTuningJobTest extends TestCase
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
     * Test "FineTuningJob"
     */
    public function testFineTuningJob()
    {
        $testFineTuningJob = new FineTuningJob();
        $namespacedClassname = FineTuningJob::getModelsNamespace() . '\\FineTuningJob';
        $this->assertSame('\\' . FineTuningJob::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "createdAt"
     */
    public function testPropertyCreatedAt()
    {
        self::markTestIncomplete(
            'Test of "createdAt" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "error"
     */
    public function testPropertyError()
    {
        self::markTestIncomplete(
            'Test of "error" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fineTunedModel"
     */
    public function testPropertyFineTunedModel()
    {
        self::markTestIncomplete(
            'Test of "fineTunedModel" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "finishedAt"
     */
    public function testPropertyFinishedAt()
    {
        self::markTestIncomplete(
            'Test of "finishedAt" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hyperparameters"
     */
    public function testPropertyHyperparameters()
    {
        self::markTestIncomplete(
            'Test of "hyperparameters" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "model"
     */
    public function testPropertyModel()
    {
        self::markTestIncomplete(
            'Test of "model" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "object"
     */
    public function testPropertyObject()
    {
        self::markTestIncomplete(
            'Test of "object" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "organizationId"
     */
    public function testPropertyOrganizationId()
    {
        self::markTestIncomplete(
            'Test of "organizationId" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "resultFiles"
     */
    public function testPropertyResultFiles()
    {
        self::markTestIncomplete(
            'Test of "resultFiles" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "trainedTokens"
     */
    public function testPropertyTrainedTokens()
    {
        self::markTestIncomplete(
            'Test of "trainedTokens" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "trainingFile"
     */
    public function testPropertyTrainingFile()
    {
        self::markTestIncomplete(
            'Test of "trainingFile" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "validationFile"
     */
    public function testPropertyValidationFile()
    {
        self::markTestIncomplete(
            'Test of "validationFile" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "integrations"
     */
    public function testPropertyIntegrations()
    {
        self::markTestIncomplete(
            'Test of "integrations" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "seed"
     */
    public function testPropertySeed()
    {
        self::markTestIncomplete(
            'Test of "seed" property in "FineTuningJob" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = FineTuningJob::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
