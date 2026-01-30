package api

import model.AdminApiKey
import model.AdminApiKeysCreateRequest
import model.AdminApiKeysDelete200Response
import model.ApiKeyList

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def adminApiKeysCreate(adminApiKeysCreateRequest: AdminApiKeysCreateRequest): AdminApiKey = {
    // TODO: Implement better logic

    AdminApiKey(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adminApiKeysDelete(keyId: String): AdminApiKeysDelete200Response = {
    // TODO: Implement better logic

    AdminApiKeysDelete200Response(None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adminApiKeysGet(keyId: String): AdminApiKey = {
    // TODO: Implement better logic

    AdminApiKey(None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adminApiKeysList(after: Option[String], order: Option[String], limit: Option[Int]): ApiKeyList = {
    // TODO: Implement better logic

    ApiKeyList(None, None, None, None, None)
  }
}
