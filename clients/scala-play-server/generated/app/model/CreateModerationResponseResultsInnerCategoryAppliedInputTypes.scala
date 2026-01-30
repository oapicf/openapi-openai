package model

import play.api.libs.json._

/**
  * A list of the categories along with the input type(s) that the score applies to.
  * @param hate The applied input type(s) for the category 'hate'.
  * @param hateThreatening The applied input type(s) for the category 'hate/threatening'.
  * @param harassment The applied input type(s) for the category 'harassment'.
  * @param harassmentThreatening The applied input type(s) for the category 'harassment/threatening'.
  * @param illicit The applied input type(s) for the category 'illicit'.
  * @param illicitViolent The applied input type(s) for the category 'illicit/violent'.
  * @param selfHarm The applied input type(s) for the category 'self-harm'.
  * @param selfHarmIntent The applied input type(s) for the category 'self-harm/intent'.
  * @param selfHarmInstructions The applied input type(s) for the category 'self-harm/instructions'.
  * @param sexual The applied input type(s) for the category 'sexual'.
  * @param sexualMinors The applied input type(s) for the category 'sexual/minors'.
  * @param violence The applied input type(s) for the category 'violence'.
  * @param violenceGraphic The applied input type(s) for the category 'violence/graphic'.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationResponseResultsInnerCategoryAppliedInputTypes(
  hate: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Hate.Value,
  hateThreatening: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HateThreatening.Value,
  harassment: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Harassment.Value,
  harassmentThreatening: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.HarassmentThreatening.Value,
  illicit: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Illicit.Value,
  illicitViolent: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.IllicitViolent.Value,
  selfHarm: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarm.Value,
  selfHarmIntent: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmIntent.Value,
  selfHarmInstructions: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SelfHarmInstructions.Value,
  sexual: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Sexual.Value,
  sexualMinors: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.SexualMinors.Value,
  violence: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Violence.Value,
  violenceGraphic: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.ViolenceGraphic.Value
)

object CreateModerationResponseResultsInnerCategoryAppliedInputTypes {
  implicit lazy val createModerationResponseResultsInnerCategoryAppliedInputTypesJsonFormat: Format[CreateModerationResponseResultsInnerCategoryAppliedInputTypes] = Json.format[CreateModerationResponseResultsInnerCategoryAppliedInputTypes]

  // noinspection TypeAnnotation
  object Hate extends Enumeration {
    val Text = Value("text")

    type Hate = Value
    implicit lazy val HateJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object HateThreatening extends Enumeration {
    val Text = Value("text")

    type HateThreatening = Value
    implicit lazy val HateThreateningJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Harassment extends Enumeration {
    val Text = Value("text")

    type Harassment = Value
    implicit lazy val HarassmentJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object HarassmentThreatening extends Enumeration {
    val Text = Value("text")

    type HarassmentThreatening = Value
    implicit lazy val HarassmentThreateningJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Illicit extends Enumeration {
    val Text = Value("text")

    type Illicit = Value
    implicit lazy val IllicitJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object IllicitViolent extends Enumeration {
    val Text = Value("text")

    type IllicitViolent = Value
    implicit lazy val IllicitViolentJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object SelfHarm extends Enumeration {
    val Text = Value("text")
    val Image = Value("image")

    type SelfHarm = Value
    implicit lazy val SelfHarmJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object SelfHarmIntent extends Enumeration {
    val Text = Value("text")
    val Image = Value("image")

    type SelfHarmIntent = Value
    implicit lazy val SelfHarmIntentJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object SelfHarmInstructions extends Enumeration {
    val Text = Value("text")
    val Image = Value("image")

    type SelfHarmInstructions = Value
    implicit lazy val SelfHarmInstructionsJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Sexual extends Enumeration {
    val Text = Value("text")
    val Image = Value("image")

    type Sexual = Value
    implicit lazy val SexualJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object SexualMinors extends Enumeration {
    val Text = Value("text")

    type SexualMinors = Value
    implicit lazy val SexualMinorsJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Violence extends Enumeration {
    val Text = Value("text")
    val Image = Value("image")

    type Violence = Value
    implicit lazy val ViolenceJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ViolenceGraphic extends Enumeration {
    val Text = Value("text")
    val Image = Value("image")

    type ViolenceGraphic = Value
    implicit lazy val ViolenceGraphicJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

