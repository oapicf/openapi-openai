package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneEvent
import org.openapitools.models.OpenAIFile
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param _object 
 * @param createdUnderscoreat 
 * @param updatedUnderscoreat 
 * @param model 
 * @param fineUnderscoretunedUnderscoremodel 
 * @param organizationUnderscoreid 
 * @param status 
 * @param hyperparams 
 * @param trainingUnderscorefiles 
 * @param validationUnderscorefiles 
 * @param resultUnderscorefiles 
 * @param events 
 */
case class FineTune(id: String,
                _object: String,
                createdUnderscoreat: Int,
                updatedUnderscoreat: Int,
                model: String,
                fineUnderscoretunedUnderscoremodel: String,
                organizationUnderscoreid: String,
                status: String,
                hyperparams: Object,
                trainingUnderscorefiles: Seq[OpenAIFile],
                validationUnderscorefiles: Seq[OpenAIFile],
                resultUnderscorefiles: Seq[OpenAIFile],
                events: Option[Seq[FineTuneEvent]]
                )

object FineTune {
    /**
     * Creates the codec for converting FineTune from and to JSON.
     */
    implicit val decoder: Decoder[FineTune] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTune] = deriveEncoder
}
