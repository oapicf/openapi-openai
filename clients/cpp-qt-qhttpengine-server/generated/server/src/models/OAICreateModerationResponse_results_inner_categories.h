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
 * OAICreateModerationResponse_results_inner_categories.h
 *
 * 
 */

#ifndef OAICreateModerationResponse_results_inner_categories_H
#define OAICreateModerationResponse_results_inner_categories_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateModerationResponse_results_inner_categories : public OAIObject {
public:
    OAICreateModerationResponse_results_inner_categories();
    OAICreateModerationResponse_results_inner_categories(QString json);
    ~OAICreateModerationResponse_results_inner_categories() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    bool isHate() const;
    void setHate(const bool &hate);
    bool is_hate_Set() const;
    bool is_hate_Valid() const;

    bool isHateThreatening() const;
    void setHateThreatening(const bool &hate_threatening);
    bool is_hate_threatening_Set() const;
    bool is_hate_threatening_Valid() const;

    bool isSelfHarm() const;
    void setSelfHarm(const bool &self_harm);
    bool is_self_harm_Set() const;
    bool is_self_harm_Valid() const;

    bool isSexual() const;
    void setSexual(const bool &sexual);
    bool is_sexual_Set() const;
    bool is_sexual_Valid() const;

    bool isSexualMinors() const;
    void setSexualMinors(const bool &sexual_minors);
    bool is_sexual_minors_Set() const;
    bool is_sexual_minors_Valid() const;

    bool isViolence() const;
    void setViolence(const bool &violence);
    bool is_violence_Set() const;
    bool is_violence_Valid() const;

    bool isViolenceGraphic() const;
    void setViolenceGraphic(const bool &violence_graphic);
    bool is_violence_graphic_Set() const;
    bool is_violence_graphic_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    bool hate;
    bool m_hate_isSet;
    bool m_hate_isValid;

    bool hate_threatening;
    bool m_hate_threatening_isSet;
    bool m_hate_threatening_isValid;

    bool self_harm;
    bool m_self_harm_isSet;
    bool m_self_harm_isValid;

    bool sexual;
    bool m_sexual_isSet;
    bool m_sexual_isValid;

    bool sexual_minors;
    bool m_sexual_minors_isSet;
    bool m_sexual_minors_isValid;

    bool violence;
    bool m_violence_isSet;
    bool m_violence_isValid;

    bool violence_graphic;
    bool m_violence_graphic_isSet;
    bool m_violence_graphic_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateModerationResponse_results_inner_categories)

#endif // OAICreateModerationResponse_results_inner_categories_H
