/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.core

import java.util.concurrent.TimeUnit

import akka.actor.{ActorSystem, ExtendedActorSystem, Extension, ExtensionId, ExtensionIdProvider}
import akka.http.scaladsl.model.StatusCodes.CustomStatusCode
import akka.http.scaladsl.model.headers.RawHeader
import com.typesafe.config.Config

import scala.jdk.CollectionConverters._
import scala.concurrent.duration.FiniteDuration

class ApiSettings(config: Config) extends Extension {
  def this(system: ExtendedActorSystem) = this(system.settings.config)

  private def cfg = config.getConfig("org.openapitools.client.apiRequest")

  val alwaysTrustCertificates: Boolean = cfg.getBoolean("trust-certificates")
  val defaultHeaders: List[RawHeader] = cfg.getConfig("default-headers").entrySet.asScala.toList.map(c => RawHeader(c.getKey, c.getValue.render))
  val connectionTimeout = FiniteDuration(cfg.getDuration("connection-timeout", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS)
  val compressionEnabled: Boolean = cfg.getBoolean("compression.enabled")
  val compressionSizeThreshold: Int = cfg.getBytes("compression.size-threshold").toInt
  val customCodes: List[CustomStatusCode] = cfg.getConfigList("custom-codes").asScala.toList.map { c =>
    CustomStatusCode(
      c.getInt("code"))(
      c.getString("reason"),
      if (c.hasPath("defaultMessage")) c.getString("defaultMessage") else c.getString("reason"),
      c.getBoolean("success"),
      if (c.hasPath("allowsEntity")) c.getBoolean("allowsEntity") else true
    )
  }
}

object ApiSettings extends ExtensionId[ApiSettings] with ExtensionIdProvider {

  override def lookup = ApiSettings

  override def createExtension(system: ExtendedActorSystem): ApiSettings =
    new ApiSettings(system)

  // needed to get the type right when used from Java
  override def get(system: ActorSystem): ApiSettings = super.get(system)
}
