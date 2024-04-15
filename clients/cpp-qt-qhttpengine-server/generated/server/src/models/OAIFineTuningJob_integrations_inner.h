/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIFineTuningJob_integrations_inner.h
 *
 * 
 */

#ifndef OAIFineTuningJob_integrations_inner_H
#define OAIFineTuningJob_integrations_inner_H

#include <QJsonObject>

#include "OAICreateFineTuningJobRequest_integrations_inner_wandb.h"
#include "OAIFineTuningIntegration.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFineTuningJob_integrations_inner : public OAIObject {
public:
    OAIFineTuningJob_integrations_inner();
    OAIFineTuningJob_integrations_inner(QString json);
    ~OAIFineTuningJob_integrations_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAICreateFineTuningJobRequest_integrations_inner_wandb getWandb() const;
    void setWandb(const OAICreateFineTuningJobRequest_integrations_inner_wandb &wandb);
    bool is_wandb_Set() const;
    bool is_wandb_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAICreateFineTuningJobRequest_integrations_inner_wandb wandb;
    bool m_wandb_isSet;
    bool m_wandb_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFineTuningJob_integrations_inner)

#endif // OAIFineTuningJob_integrations_inner_H