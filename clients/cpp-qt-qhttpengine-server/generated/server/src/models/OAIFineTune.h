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
 * OAIFineTune.h
 *
 * 
 */

#ifndef OAIFineTune_H
#define OAIFineTune_H

#include <QJsonObject>

#include "OAIFineTuneEvent.h"
#include "OAIObject.h"
#include "OAIOpenAIFile.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFineTune : public OAIObject {
public:
    OAIFineTune();
    OAIFineTune(QString json);
    ~OAIFineTune() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    qint32 getCreatedAt() const;
    void setCreatedAt(const qint32 &created_at);
    bool is_created_at_Set() const;
    bool is_created_at_Valid() const;

    qint32 getUpdatedAt() const;
    void setUpdatedAt(const qint32 &updated_at);
    bool is_updated_at_Set() const;
    bool is_updated_at_Valid() const;

    QString getModel() const;
    void setModel(const QString &model);
    bool is_model_Set() const;
    bool is_model_Valid() const;

    QString getFineTunedModel() const;
    void setFineTunedModel(const QString &fine_tuned_model);
    bool is_fine_tuned_model_Set() const;
    bool is_fine_tuned_model_Valid() const;

    QString getOrganizationId() const;
    void setOrganizationId(const QString &organization_id);
    bool is_organization_id_Set() const;
    bool is_organization_id_Valid() const;

    QString getStatus() const;
    void setStatus(const QString &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAIObject getHyperparams() const;
    void setHyperparams(const OAIObject &hyperparams);
    bool is_hyperparams_Set() const;
    bool is_hyperparams_Valid() const;

    QList<OAIOpenAIFile> getTrainingFiles() const;
    void setTrainingFiles(const QList<OAIOpenAIFile> &training_files);
    bool is_training_files_Set() const;
    bool is_training_files_Valid() const;

    QList<OAIOpenAIFile> getValidationFiles() const;
    void setValidationFiles(const QList<OAIOpenAIFile> &validation_files);
    bool is_validation_files_Set() const;
    bool is_validation_files_Valid() const;

    QList<OAIOpenAIFile> getResultFiles() const;
    void setResultFiles(const QList<OAIOpenAIFile> &result_files);
    bool is_result_files_Set() const;
    bool is_result_files_Valid() const;

    QList<OAIFineTuneEvent> getEvents() const;
    void setEvents(const QList<OAIFineTuneEvent> &events);
    bool is_events_Set() const;
    bool is_events_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString object;
    bool m_object_isSet;
    bool m_object_isValid;

    qint32 created_at;
    bool m_created_at_isSet;
    bool m_created_at_isValid;

    qint32 updated_at;
    bool m_updated_at_isSet;
    bool m_updated_at_isValid;

    QString model;
    bool m_model_isSet;
    bool m_model_isValid;

    QString fine_tuned_model;
    bool m_fine_tuned_model_isSet;
    bool m_fine_tuned_model_isValid;

    QString organization_id;
    bool m_organization_id_isSet;
    bool m_organization_id_isValid;

    QString status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAIObject hyperparams;
    bool m_hyperparams_isSet;
    bool m_hyperparams_isValid;

    QList<OAIOpenAIFile> training_files;
    bool m_training_files_isSet;
    bool m_training_files_isValid;

    QList<OAIOpenAIFile> validation_files;
    bool m_validation_files_isSet;
    bool m_validation_files_isValid;

    QList<OAIOpenAIFile> result_files;
    bool m_result_files_isSet;
    bool m_result_files_isValid;

    QList<OAIFineTuneEvent> events;
    bool m_events_isSet;
    bool m_events_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFineTune)

#endif // OAIFineTune_H