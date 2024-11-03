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
 * OAIMessageObject.h
 *
 * Represents a message within a [thread](/docs/api-reference/threads).
 */

#ifndef OAIMessageObject_H
#define OAIMessageObject_H

#include <QJsonObject>

#include "OAIMessageObject_content_inner.h"
#include "OAIMessageObject_incomplete_details.h"
#include "OAIObject.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIMessageObject_incomplete_details;
class OAIMessageObject_content_inner;

class OAIMessageObject : public OAIObject {
public:
    OAIMessageObject();
    OAIMessageObject(QString json);
    ~OAIMessageObject() override;

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

    QString getThreadId() const;
    void setThreadId(const QString &thread_id);
    bool is_thread_id_Set() const;
    bool is_thread_id_Valid() const;

    QString getStatus() const;
    void setStatus(const QString &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAIMessageObject_incomplete_details getIncompleteDetails() const;
    void setIncompleteDetails(const OAIMessageObject_incomplete_details &incomplete_details);
    bool is_incomplete_details_Set() const;
    bool is_incomplete_details_Valid() const;

    qint32 getCompletedAt() const;
    void setCompletedAt(const qint32 &completed_at);
    bool is_completed_at_Set() const;
    bool is_completed_at_Valid() const;

    qint32 getIncompleteAt() const;
    void setIncompleteAt(const qint32 &incomplete_at);
    bool is_incomplete_at_Set() const;
    bool is_incomplete_at_Valid() const;

    QString getRole() const;
    void setRole(const QString &role);
    bool is_role_Set() const;
    bool is_role_Valid() const;

    QList<OAIMessageObject_content_inner> getContent() const;
    void setContent(const QList<OAIMessageObject_content_inner> &content);
    bool is_content_Set() const;
    bool is_content_Valid() const;

    QString getAssistantId() const;
    void setAssistantId(const QString &assistant_id);
    bool is_assistant_id_Set() const;
    bool is_assistant_id_Valid() const;

    QString getRunId() const;
    void setRunId(const QString &run_id);
    bool is_run_id_Set() const;
    bool is_run_id_Valid() const;

    QList<QString> getFileIds() const;
    void setFileIds(const QList<QString> &file_ids);
    bool is_file_ids_Set() const;
    bool is_file_ids_Valid() const;

    OAIObject getMetadata() const;
    void setMetadata(const OAIObject &metadata);
    bool is_metadata_Set() const;
    bool is_metadata_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString m_object;
    bool m_object_isSet;
    bool m_object_isValid;

    qint32 m_created_at;
    bool m_created_at_isSet;
    bool m_created_at_isValid;

    QString m_thread_id;
    bool m_thread_id_isSet;
    bool m_thread_id_isValid;

    QString m_status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAIMessageObject_incomplete_details m_incomplete_details;
    bool m_incomplete_details_isSet;
    bool m_incomplete_details_isValid;

    qint32 m_completed_at;
    bool m_completed_at_isSet;
    bool m_completed_at_isValid;

    qint32 m_incomplete_at;
    bool m_incomplete_at_isSet;
    bool m_incomplete_at_isValid;

    QString m_role;
    bool m_role_isSet;
    bool m_role_isValid;

    QList<OAIMessageObject_content_inner> m_content;
    bool m_content_isSet;
    bool m_content_isValid;

    QString m_assistant_id;
    bool m_assistant_id_isSet;
    bool m_assistant_id_isValid;

    QString m_run_id;
    bool m_run_id_isSet;
    bool m_run_id_isValid;

    QList<QString> m_file_ids;
    bool m_file_ids_isSet;
    bool m_file_ids_isValid;

    OAIObject m_metadata;
    bool m_metadata_isSet;
    bool m_metadata_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageObject)

#endif // OAIMessageObject_H
