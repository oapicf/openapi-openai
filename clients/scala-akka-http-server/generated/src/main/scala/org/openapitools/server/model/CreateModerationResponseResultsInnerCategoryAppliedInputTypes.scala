package org.openapitools.server.model


/**
 * A list of the categories along with the input type(s) that the score applies to.
 *
 * @param hate The applied input type(s) for the category 'hate'. for example: ''null''
 * @param hateThreatening The applied input type(s) for the category 'hate/threatening'. for example: ''null''
 * @param harassment The applied input type(s) for the category 'harassment'. for example: ''null''
 * @param harassmentThreatening The applied input type(s) for the category 'harassment/threatening'. for example: ''null''
 * @param illicit The applied input type(s) for the category 'illicit'. for example: ''null''
 * @param illicitViolent The applied input type(s) for the category 'illicit/violent'. for example: ''null''
 * @param selfHarm The applied input type(s) for the category 'self-harm'. for example: ''null''
 * @param selfHarmIntent The applied input type(s) for the category 'self-harm/intent'. for example: ''null''
 * @param selfHarmInstructions The applied input type(s) for the category 'self-harm/instructions'. for example: ''null''
 * @param sexual The applied input type(s) for the category 'sexual'. for example: ''null''
 * @param sexualMinors The applied input type(s) for the category 'sexual/minors'. for example: ''null''
 * @param violence The applied input type(s) for the category 'violence'. for example: ''null''
 * @param violenceGraphic The applied input type(s) for the category 'violence/graphic'. for example: ''null''
*/
final case class CreateModerationResponseResultsInnerCategoryAppliedInputTypes (
  hate: Seq[String],
  hateThreatening: Seq[String],
  harassment: Seq[String],
  harassmentThreatening: Seq[String],
  illicit: Seq[String],
  illicitViolent: Seq[String],
  selfHarm: Seq[String],
  selfHarmIntent: Seq[String],
  selfHarmInstructions: Seq[String],
  sexual: Seq[String],
  sexualMinors: Seq[String],
  violence: Seq[String],
  violenceGraphic: Seq[String]
)

