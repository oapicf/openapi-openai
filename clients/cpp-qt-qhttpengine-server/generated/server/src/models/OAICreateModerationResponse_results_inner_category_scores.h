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

/*
 * OAICreateModerationResponse_results_inner_category_scores.h
 *
 * 
 */

#ifndef OAICreateModerationResponse_results_inner_category_scores_H
#define OAICreateModerationResponse_results_inner_category_scores_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateModerationResponse_results_inner_category_scores : public OAIObject {
public:
    OAICreateModerationResponse_results_inner_category_scores();
    OAICreateModerationResponse_results_inner_category_scores(QString json);
    ~OAICreateModerationResponse_results_inner_category_scores() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getHate() const;
    void setHate(const double &hate);
    bool is_hate_Set() const;
    bool is_hate_Valid() const;

    double getHateThreatening() const;
    void setHateThreatening(const double &hate_threatening);
    bool is_hate_threatening_Set() const;
    bool is_hate_threatening_Valid() const;

    double getSelfHarm() const;
    void setSelfHarm(const double &self_harm);
    bool is_self_harm_Set() const;
    bool is_self_harm_Valid() const;

    double getSexual() const;
    void setSexual(const double &sexual);
    bool is_sexual_Set() const;
    bool is_sexual_Valid() const;

    double getSexualMinors() const;
    void setSexualMinors(const double &sexual_minors);
    bool is_sexual_minors_Set() const;
    bool is_sexual_minors_Valid() const;

    double getViolence() const;
    void setViolence(const double &violence);
    bool is_violence_Set() const;
    bool is_violence_Valid() const;

    double getViolenceGraphic() const;
    void setViolenceGraphic(const double &violence_graphic);
    bool is_violence_graphic_Set() const;
    bool is_violence_graphic_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double hate;
    bool m_hate_isSet;
    bool m_hate_isValid;

    double hate_threatening;
    bool m_hate_threatening_isSet;
    bool m_hate_threatening_isValid;

    double self_harm;
    bool m_self_harm_isSet;
    bool m_self_harm_isValid;

    double sexual;
    bool m_sexual_isSet;
    bool m_sexual_isValid;

    double sexual_minors;
    bool m_sexual_minors_isSet;
    bool m_sexual_minors_isValid;

    double violence;
    bool m_violence_isSet;
    bool m_violence_isValid;

    double violence_graphic;
    bool m_violence_graphic_isSet;
    bool m_violence_graphic_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateModerationResponse_results_inner_category_scores)

#endif // OAICreateModerationResponse_results_inner_category_scores_H
