package api

import play.api.libs.json._
import model.AdminApiKey
import model.AdminApiKeysCreateRequest
import model.AdminApiKeysDelete200Response
import model.ApiKeyList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
trait DefaultApi {
  /**
    * Create an organization admin API key
    * Create a new admin-level API key for the organization.
    */
  def adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest): AdminApiKey

  /**
    * Delete an organization admin API key
    * Delete the specified admin API key.
    */
  def adminApiKeysDelete(keyId: String): AdminApiKeysDelete200Response

  /**
    * Retrieve a single organization API key
    * Get details for a specific organization API key by its ID.
    */
  def adminApiKeysGet(keyId: String): AdminApiKey

  /**
    * List organization API keys
    * Retrieve a paginated list of organization admin API keys.
    */
  def adminApiKeysList(after: Option[String], order: Option[String], limit: Option[Int]): ApiKeyList
}
