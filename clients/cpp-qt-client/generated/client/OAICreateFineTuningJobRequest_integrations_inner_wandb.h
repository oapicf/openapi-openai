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
 * OAICreateFineTuningJobRequest_integrations_inner_wandb.h
 *
 * The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 */

#ifndef OAICreateFineTuningJobRequest_integrations_inner_wandb_H
#define OAICreateFineTuningJobRequest_integrations_inner_wandb_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateFineTuningJobRequest_integrations_inner_wandb : public OAIObject {
public:
    OAICreateFineTuningJobRequest_integrations_inner_wandb();
    OAICreateFineTuningJobRequest_integrations_inner_wandb(QString json);
    ~OAICreateFineTuningJobRequest_integrations_inner_wandb() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getProject() const;
    void setProject(const QString &project);
    bool is_project_Set() const;
    bool is_project_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getEntity() const;
    void setEntity(const QString &entity);
    bool is_entity_Set() const;
    bool is_entity_Valid() const;

    QList<QString> getTags() const;
    void setTags(const QList<QString> &tags);
    bool is_tags_Set() const;
    bool is_tags_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_project;
    bool m_project_isSet;
    bool m_project_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString m_entity;
    bool m_entity_isSet;
    bool m_entity_isValid;

    QList<QString> m_tags;
    bool m_tags_isSet;
    bool m_tags_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateFineTuningJobRequest_integrations_inner_wandb)

#endif // OAICreateFineTuningJobRequest_integrations_inner_wandb_H
