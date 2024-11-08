/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateModerationResponse_results_inner_category_scores.h
 *
 * A list of the categories along with their scores as predicted by model.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateModerationResponse_results_inner_category_scores_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateModerationResponse_results_inner_category_scores_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// A list of the categories along with their scores as predicted by model.
/// </summary>
class  CreateModerationResponse_results_inner_category_scores
    : public ModelBase
{
public:
    CreateModerationResponse_results_inner_category_scores();
    virtual ~CreateModerationResponse_results_inner_category_scores();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateModerationResponse_results_inner_category_scores members

    /// <summary>
    /// The score for the category &#39;hate&#39;.
    /// </summary>
    double getHate() const;
    bool hateIsSet() const;
    void unsetHate();

    void setHate(double value);

    /// <summary>
    /// The score for the category &#39;hate/threatening&#39;.
    /// </summary>
    double getHateThreatening() const;
    bool hateThreateningIsSet() const;
    void unsetHate_threatening();

    void setHateThreatening(double value);

    /// <summary>
    /// The score for the category &#39;harassment&#39;.
    /// </summary>
    double getHarassment() const;
    bool harassmentIsSet() const;
    void unsetHarassment();

    void setHarassment(double value);

    /// <summary>
    /// The score for the category &#39;harassment/threatening&#39;.
    /// </summary>
    double getHarassmentThreatening() const;
    bool harassmentThreateningIsSet() const;
    void unsetHarassment_threatening();

    void setHarassmentThreatening(double value);

    /// <summary>
    /// The score for the category &#39;self-harm&#39;.
    /// </summary>
    double getSelfHarm() const;
    bool selfHarmIsSet() const;
    void unsetSelf_harm();

    void setSelfHarm(double value);

    /// <summary>
    /// The score for the category &#39;self-harm/intent&#39;.
    /// </summary>
    double getSelfHarmIntent() const;
    bool selfHarmIntentIsSet() const;
    void unsetSelf_harm_intent();

    void setSelfHarmIntent(double value);

    /// <summary>
    /// The score for the category &#39;self-harm/instructions&#39;.
    /// </summary>
    double getSelfHarmInstructions() const;
    bool selfHarmInstructionsIsSet() const;
    void unsetSelf_harm_instructions();

    void setSelfHarmInstructions(double value);

    /// <summary>
    /// The score for the category &#39;sexual&#39;.
    /// </summary>
    double getSexual() const;
    bool sexualIsSet() const;
    void unsetSexual();

    void setSexual(double value);

    /// <summary>
    /// The score for the category &#39;sexual/minors&#39;.
    /// </summary>
    double getSexualMinors() const;
    bool sexualMinorsIsSet() const;
    void unsetSexual_minors();

    void setSexualMinors(double value);

    /// <summary>
    /// The score for the category &#39;violence&#39;.
    /// </summary>
    double getViolence() const;
    bool violenceIsSet() const;
    void unsetViolence();

    void setViolence(double value);

    /// <summary>
    /// The score for the category &#39;violence/graphic&#39;.
    /// </summary>
    double getViolenceGraphic() const;
    bool violenceGraphicIsSet() const;
    void unsetViolence_graphic();

    void setViolenceGraphic(double value);


protected:
    double m_Hate;
    bool m_HateIsSet;
    double m_Hate_threatening;
    bool m_Hate_threateningIsSet;
    double m_Harassment;
    bool m_HarassmentIsSet;
    double m_Harassment_threatening;
    bool m_Harassment_threateningIsSet;
    double m_Self_harm;
    bool m_Self_harmIsSet;
    double m_Self_harm_intent;
    bool m_Self_harm_intentIsSet;
    double m_Self_harm_instructions;
    bool m_Self_harm_instructionsIsSet;
    double m_Sexual;
    bool m_SexualIsSet;
    double m_Sexual_minors;
    bool m_Sexual_minorsIsSet;
    double m_Violence;
    bool m_ViolenceIsSet;
    double m_Violence_graphic;
    bool m_Violence_graphicIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateModerationResponse_results_inner_category_scores_H_ */
