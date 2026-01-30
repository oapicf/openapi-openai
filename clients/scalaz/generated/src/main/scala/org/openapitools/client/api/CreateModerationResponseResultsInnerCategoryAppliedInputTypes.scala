package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationResponseResultsInnerCategoryAppliedInputTypes._

case class CreateModerationResponseResultsInnerCategoryAppliedInputTypes (
  /* The applied input type(s) for the category 'hate'. */
  hate: List[Hate],
/* The applied input type(s) for the category 'hate/threatening'. */
  hateThreatening: List[HateThreatening],
/* The applied input type(s) for the category 'harassment'. */
  harassment: List[Harassment],
/* The applied input type(s) for the category 'harassment/threatening'. */
  harassmentThreatening: List[HarassmentThreatening],
/* The applied input type(s) for the category 'illicit'. */
  illicit: List[Illicit],
/* The applied input type(s) for the category 'illicit/violent'. */
  illicitViolent: List[IllicitViolent],
/* The applied input type(s) for the category 'self-harm'. */
  selfHarm: List[SelfHarm],
/* The applied input type(s) for the category 'self-harm/intent'. */
  selfHarmIntent: List[SelfHarmIntent],
/* The applied input type(s) for the category 'self-harm/instructions'. */
  selfHarmInstructions: List[SelfHarmInstructions],
/* The applied input type(s) for the category 'sexual'. */
  sexual: List[Sexual],
/* The applied input type(s) for the category 'sexual/minors'. */
  sexualMinors: List[SexualMinors],
/* The applied input type(s) for the category 'violence'. */
  violence: List[Violence],
/* The applied input type(s) for the category 'violence/graphic'. */
  violenceGraphic: List[ViolenceGraphic])

object CreateModerationResponseResultsInnerCategoryAppliedInputTypes {
  import DateTimeCodecs._
  sealed trait List[Hate]

  object List[Hate] {
    def toList[Hate](s: String): Option[List[Hate]] = s match {
      case _ => None
    }

    def fromList[Hate](x: List[Hate]): String = x match {
    }
  }

  implicit val List[Hate]EnumEncoder: EncodeJson[List[Hate]] =
    EncodeJson[List[Hate]](is => StringEncodeJson(List[Hate].fromList[Hate](is)))

  implicit val List[Hate]EnumDecoder: DecodeJson[List[Hate]] =
    DecodeJson.optionDecoder[List[Hate]](n => n.string.flatMap(jStr => List[Hate].toList[Hate](jStr)), "List[Hate] failed to de-serialize")
  sealed trait List[HateThreatening]

  object List[HateThreatening] {
    def toList[HateThreatening](s: String): Option[List[HateThreatening]] = s match {
      case _ => None
    }

    def fromList[HateThreatening](x: List[HateThreatening]): String = x match {
    }
  }

  implicit val List[HateThreatening]EnumEncoder: EncodeJson[List[HateThreatening]] =
    EncodeJson[List[HateThreatening]](is => StringEncodeJson(List[HateThreatening].fromList[HateThreatening](is)))

  implicit val List[HateThreatening]EnumDecoder: DecodeJson[List[HateThreatening]] =
    DecodeJson.optionDecoder[List[HateThreatening]](n => n.string.flatMap(jStr => List[HateThreatening].toList[HateThreatening](jStr)), "List[HateThreatening] failed to de-serialize")
  sealed trait List[Harassment]

  object List[Harassment] {
    def toList[Harassment](s: String): Option[List[Harassment]] = s match {
      case _ => None
    }

    def fromList[Harassment](x: List[Harassment]): String = x match {
    }
  }

  implicit val List[Harassment]EnumEncoder: EncodeJson[List[Harassment]] =
    EncodeJson[List[Harassment]](is => StringEncodeJson(List[Harassment].fromList[Harassment](is)))

  implicit val List[Harassment]EnumDecoder: DecodeJson[List[Harassment]] =
    DecodeJson.optionDecoder[List[Harassment]](n => n.string.flatMap(jStr => List[Harassment].toList[Harassment](jStr)), "List[Harassment] failed to de-serialize")
  sealed trait List[HarassmentThreatening]

  object List[HarassmentThreatening] {
    def toList[HarassmentThreatening](s: String): Option[List[HarassmentThreatening]] = s match {
      case _ => None
    }

    def fromList[HarassmentThreatening](x: List[HarassmentThreatening]): String = x match {
    }
  }

  implicit val List[HarassmentThreatening]EnumEncoder: EncodeJson[List[HarassmentThreatening]] =
    EncodeJson[List[HarassmentThreatening]](is => StringEncodeJson(List[HarassmentThreatening].fromList[HarassmentThreatening](is)))

  implicit val List[HarassmentThreatening]EnumDecoder: DecodeJson[List[HarassmentThreatening]] =
    DecodeJson.optionDecoder[List[HarassmentThreatening]](n => n.string.flatMap(jStr => List[HarassmentThreatening].toList[HarassmentThreatening](jStr)), "List[HarassmentThreatening] failed to de-serialize")
  sealed trait List[Illicit]

  object List[Illicit] {
    def toList[Illicit](s: String): Option[List[Illicit]] = s match {
      case _ => None
    }

    def fromList[Illicit](x: List[Illicit]): String = x match {
    }
  }

  implicit val List[Illicit]EnumEncoder: EncodeJson[List[Illicit]] =
    EncodeJson[List[Illicit]](is => StringEncodeJson(List[Illicit].fromList[Illicit](is)))

  implicit val List[Illicit]EnumDecoder: DecodeJson[List[Illicit]] =
    DecodeJson.optionDecoder[List[Illicit]](n => n.string.flatMap(jStr => List[Illicit].toList[Illicit](jStr)), "List[Illicit] failed to de-serialize")
  sealed trait List[IllicitViolent]

  object List[IllicitViolent] {
    def toList[IllicitViolent](s: String): Option[List[IllicitViolent]] = s match {
      case _ => None
    }

    def fromList[IllicitViolent](x: List[IllicitViolent]): String = x match {
    }
  }

  implicit val List[IllicitViolent]EnumEncoder: EncodeJson[List[IllicitViolent]] =
    EncodeJson[List[IllicitViolent]](is => StringEncodeJson(List[IllicitViolent].fromList[IllicitViolent](is)))

  implicit val List[IllicitViolent]EnumDecoder: DecodeJson[List[IllicitViolent]] =
    DecodeJson.optionDecoder[List[IllicitViolent]](n => n.string.flatMap(jStr => List[IllicitViolent].toList[IllicitViolent](jStr)), "List[IllicitViolent] failed to de-serialize")
  sealed trait List[SelfHarm]

  object List[SelfHarm] {
    def toList[SelfHarm](s: String): Option[List[SelfHarm]] = s match {
      case _ => None
    }

    def fromList[SelfHarm](x: List[SelfHarm]): String = x match {
    }
  }

  implicit val List[SelfHarm]EnumEncoder: EncodeJson[List[SelfHarm]] =
    EncodeJson[List[SelfHarm]](is => StringEncodeJson(List[SelfHarm].fromList[SelfHarm](is)))

  implicit val List[SelfHarm]EnumDecoder: DecodeJson[List[SelfHarm]] =
    DecodeJson.optionDecoder[List[SelfHarm]](n => n.string.flatMap(jStr => List[SelfHarm].toList[SelfHarm](jStr)), "List[SelfHarm] failed to de-serialize")
  sealed trait List[SelfHarmIntent]

  object List[SelfHarmIntent] {
    def toList[SelfHarmIntent](s: String): Option[List[SelfHarmIntent]] = s match {
      case _ => None
    }

    def fromList[SelfHarmIntent](x: List[SelfHarmIntent]): String = x match {
    }
  }

  implicit val List[SelfHarmIntent]EnumEncoder: EncodeJson[List[SelfHarmIntent]] =
    EncodeJson[List[SelfHarmIntent]](is => StringEncodeJson(List[SelfHarmIntent].fromList[SelfHarmIntent](is)))

  implicit val List[SelfHarmIntent]EnumDecoder: DecodeJson[List[SelfHarmIntent]] =
    DecodeJson.optionDecoder[List[SelfHarmIntent]](n => n.string.flatMap(jStr => List[SelfHarmIntent].toList[SelfHarmIntent](jStr)), "List[SelfHarmIntent] failed to de-serialize")
  sealed trait List[SelfHarmInstructions]

  object List[SelfHarmInstructions] {
    def toList[SelfHarmInstructions](s: String): Option[List[SelfHarmInstructions]] = s match {
      case _ => None
    }

    def fromList[SelfHarmInstructions](x: List[SelfHarmInstructions]): String = x match {
    }
  }

  implicit val List[SelfHarmInstructions]EnumEncoder: EncodeJson[List[SelfHarmInstructions]] =
    EncodeJson[List[SelfHarmInstructions]](is => StringEncodeJson(List[SelfHarmInstructions].fromList[SelfHarmInstructions](is)))

  implicit val List[SelfHarmInstructions]EnumDecoder: DecodeJson[List[SelfHarmInstructions]] =
    DecodeJson.optionDecoder[List[SelfHarmInstructions]](n => n.string.flatMap(jStr => List[SelfHarmInstructions].toList[SelfHarmInstructions](jStr)), "List[SelfHarmInstructions] failed to de-serialize")
  sealed trait List[Sexual]

  object List[Sexual] {
    def toList[Sexual](s: String): Option[List[Sexual]] = s match {
      case _ => None
    }

    def fromList[Sexual](x: List[Sexual]): String = x match {
    }
  }

  implicit val List[Sexual]EnumEncoder: EncodeJson[List[Sexual]] =
    EncodeJson[List[Sexual]](is => StringEncodeJson(List[Sexual].fromList[Sexual](is)))

  implicit val List[Sexual]EnumDecoder: DecodeJson[List[Sexual]] =
    DecodeJson.optionDecoder[List[Sexual]](n => n.string.flatMap(jStr => List[Sexual].toList[Sexual](jStr)), "List[Sexual] failed to de-serialize")
  sealed trait List[SexualMinors]

  object List[SexualMinors] {
    def toList[SexualMinors](s: String): Option[List[SexualMinors]] = s match {
      case _ => None
    }

    def fromList[SexualMinors](x: List[SexualMinors]): String = x match {
    }
  }

  implicit val List[SexualMinors]EnumEncoder: EncodeJson[List[SexualMinors]] =
    EncodeJson[List[SexualMinors]](is => StringEncodeJson(List[SexualMinors].fromList[SexualMinors](is)))

  implicit val List[SexualMinors]EnumDecoder: DecodeJson[List[SexualMinors]] =
    DecodeJson.optionDecoder[List[SexualMinors]](n => n.string.flatMap(jStr => List[SexualMinors].toList[SexualMinors](jStr)), "List[SexualMinors] failed to de-serialize")
  sealed trait List[Violence]

  object List[Violence] {
    def toList[Violence](s: String): Option[List[Violence]] = s match {
      case _ => None
    }

    def fromList[Violence](x: List[Violence]): String = x match {
    }
  }

  implicit val List[Violence]EnumEncoder: EncodeJson[List[Violence]] =
    EncodeJson[List[Violence]](is => StringEncodeJson(List[Violence].fromList[Violence](is)))

  implicit val List[Violence]EnumDecoder: DecodeJson[List[Violence]] =
    DecodeJson.optionDecoder[List[Violence]](n => n.string.flatMap(jStr => List[Violence].toList[Violence](jStr)), "List[Violence] failed to de-serialize")
  sealed trait List[ViolenceGraphic]

  object List[ViolenceGraphic] {
    def toList[ViolenceGraphic](s: String): Option[List[ViolenceGraphic]] = s match {
      case _ => None
    }

    def fromList[ViolenceGraphic](x: List[ViolenceGraphic]): String = x match {
    }
  }

  implicit val List[ViolenceGraphic]EnumEncoder: EncodeJson[List[ViolenceGraphic]] =
    EncodeJson[List[ViolenceGraphic]](is => StringEncodeJson(List[ViolenceGraphic].fromList[ViolenceGraphic](is)))

  implicit val List[ViolenceGraphic]EnumDecoder: DecodeJson[List[ViolenceGraphic]] =
    DecodeJson.optionDecoder[List[ViolenceGraphic]](n => n.string.flatMap(jStr => List[ViolenceGraphic].toList[ViolenceGraphic](jStr)), "List[ViolenceGraphic] failed to de-serialize")

  implicit val CreateModerationResponseResultsInnerCategoryAppliedInputTypesCodecJson: CodecJson[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = CodecJson.derive[CreateModerationResponseResultsInnerCategoryAppliedInputTypes]
  implicit val CreateModerationResponseResultsInnerCategoryAppliedInputTypesDecoder: EntityDecoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = jsonOf[CreateModerationResponseResultsInnerCategoryAppliedInputTypes]
  implicit val CreateModerationResponseResultsInnerCategoryAppliedInputTypesEncoder: EntityEncoder[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = jsonEncoderOf[CreateModerationResponseResultsInnerCategoryAppliedInputTypes]
}
