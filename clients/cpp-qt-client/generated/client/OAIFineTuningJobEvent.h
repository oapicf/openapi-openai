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
 * OAIFineTuningJobEvent.h
 *
 * Fine-tuning job event object
 */

#ifndef OAIFineTuningJobEvent_H
#define OAIFineTuningJobEvent_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFineTuningJobEvent : public OAIObject {
public:
    OAIFineTuningJobEvent();
    OAIFineTuningJobEvent(QString json);
    ~OAIFineTuningJobEvent() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    qint32 getCreatedAt() const;
    void setCreatedAt(const qint32 &created_at);
    bool is_created_at_Set() const;
    bool is_created_at_Valid() const;

    QString getLevel() const;
    void setLevel(const QString &level);
    bool is_level_Set() const;
    bool is_level_Valid() const;

    QString getMessage() const;
    void setMessage(const QString &message);
    bool is_message_Set() const;
    bool is_message_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    qint32 m_created_at;
    bool m_created_at_isSet;
    bool m_created_at_isValid;

    QString m_level;
    bool m_level_isSet;
    bool m_level_isValid;

    QString m_message;
    bool m_message_isSet;
    bool m_message_isValid;

    QString m_object;
    bool m_object_isSet;
    bool m_object_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFineTuningJobEvent)

#endif // OAIFineTuningJobEvent_H