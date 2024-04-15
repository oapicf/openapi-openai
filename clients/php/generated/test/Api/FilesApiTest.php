<?php
/**
 * FilesApiTest
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.4.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Client\Test\Api;

use \OpenAPI\Client\Configuration;
use \OpenAPI\Client\ApiException;
use \OpenAPI\Client\ObjectSerializer;
use PHPUnit\Framework\TestCase;

/**
 * FilesApiTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class FilesApiTest extends TestCase
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
     * Test case for createFile
     *
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits..
     *
     */
    public function testCreateFile()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for deleteFile
     *
     * Delete a file..
     *
     */
    public function testDeleteFile()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for downloadFile
     *
     * Returns the contents of the specified file..
     *
     */
    public function testDownloadFile()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for listFiles
     *
     * Returns a list of files that belong to the user's organization..
     *
     */
    public function testListFiles()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }

    /**
     * Test case for retrieveFile
     *
     * Returns information about a specific file..
     *
     */
    public function testRetrieveFile()
    {
        // TODO: implement
        self::markTestIncomplete('Not implemented');
    }
}