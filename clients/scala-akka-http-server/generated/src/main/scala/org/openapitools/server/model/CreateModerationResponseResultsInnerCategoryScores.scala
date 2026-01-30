package org.openapitools.server.model


/**
 * A list of the categories along with their scores as predicted by model.
 *
 * @param hate The score for the category 'hate'. for example: ''null''
 * @param hateThreatening The score for the category 'hate/threatening'. for example: ''null''
 * @param harassment The score for the category 'harassment'. for example: ''null''
 * @param harassmentThreatening The score for the category 'harassment/threatening'. for example: ''null''
 * @param illicit The score for the category 'illicit'. for example: ''null''
 * @param illicitViolent The score for the category 'illicit/violent'. for example: ''null''
 * @param selfHarm The score for the category 'self-harm'. for example: ''null''
 * @param selfHarmIntent The score for the category 'self-harm/intent'. for example: ''null''
 * @param selfHarmInstructions The score for the category 'self-harm/instructions'. for example: ''null''
 * @param sexual The score for the category 'sexual'. for example: ''null''
 * @param sexualMinors The score for the category 'sexual/minors'. for example: ''null''
 * @param violence The score for the category 'violence'. for example: ''null''
 * @param violenceGraphic The score for the category 'violence/graphic'. for example: ''null''
*/
final case class CreateModerationResponseResultsInnerCategoryScores (
  hate: Double,
  hateThreatening: Double,
  harassment: Double,
  harassmentThreatening: Double,
  illicit: Double,
  illicitViolent: Double,
  selfHarm: Double,
  selfHarmIntent: Double,
  selfHarmInstructions: Double,
  sexual: Double,
  sexualMinors: Double,
  violence: Double,
  violenceGraphic: Double
)

