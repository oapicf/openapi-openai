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

#include "OAIMessageObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMessageObject::OAIMessageObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMessageObject::OAIMessageObject() {
    this->initializeModel();
}

OAIMessageObject::~OAIMessageObject() {}

void OAIMessageObject::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_thread_id_isSet = false;
    m_thread_id_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_incomplete_details_isSet = false;
    m_incomplete_details_isValid = false;

    m_completed_at_isSet = false;
    m_completed_at_isValid = false;

    m_incomplete_at_isSet = false;
    m_incomplete_at_isValid = false;

    m_role_isSet = false;
    m_role_isValid = false;

    m_content_isSet = false;
    m_content_isValid = false;

    m_assistant_id_isSet = false;
    m_assistant_id_isValid = false;

    m_run_id_isSet = false;
    m_run_id_isValid = false;

    m_file_ids_isSet = false;
    m_file_ids_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;
}

void OAIMessageObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMessageObject::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_thread_id_isValid = ::OpenAPI::fromJsonValue(thread_id, json[QString("thread_id")]);
    m_thread_id_isSet = !json[QString("thread_id")].isNull() && m_thread_id_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_incomplete_details_isValid = ::OpenAPI::fromJsonValue(incomplete_details, json[QString("incomplete_details")]);
    m_incomplete_details_isSet = !json[QString("incomplete_details")].isNull() && m_incomplete_details_isValid;

    m_completed_at_isValid = ::OpenAPI::fromJsonValue(completed_at, json[QString("completed_at")]);
    m_completed_at_isSet = !json[QString("completed_at")].isNull() && m_completed_at_isValid;

    m_incomplete_at_isValid = ::OpenAPI::fromJsonValue(incomplete_at, json[QString("incomplete_at")]);
    m_incomplete_at_isSet = !json[QString("incomplete_at")].isNull() && m_incomplete_at_isValid;

    m_role_isValid = ::OpenAPI::fromJsonValue(role, json[QString("role")]);
    m_role_isSet = !json[QString("role")].isNull() && m_role_isValid;

    m_content_isValid = ::OpenAPI::fromJsonValue(content, json[QString("content")]);
    m_content_isSet = !json[QString("content")].isNull() && m_content_isValid;

    m_assistant_id_isValid = ::OpenAPI::fromJsonValue(assistant_id, json[QString("assistant_id")]);
    m_assistant_id_isSet = !json[QString("assistant_id")].isNull() && m_assistant_id_isValid;

    m_run_id_isValid = ::OpenAPI::fromJsonValue(run_id, json[QString("run_id")]);
    m_run_id_isSet = !json[QString("run_id")].isNull() && m_run_id_isValid;

    m_file_ids_isValid = ::OpenAPI::fromJsonValue(file_ids, json[QString("file_ids")]);
    m_file_ids_isSet = !json[QString("file_ids")].isNull() && m_file_ids_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;
}

QString OAIMessageObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMessageObject::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(object));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(created_at));
    }
    if (m_thread_id_isSet) {
        obj.insert(QString("thread_id"), ::OpenAPI::toJsonValue(thread_id));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (incomplete_details.isSet()) {
        obj.insert(QString("incomplete_details"), ::OpenAPI::toJsonValue(incomplete_details));
    }
    if (m_completed_at_isSet) {
        obj.insert(QString("completed_at"), ::OpenAPI::toJsonValue(completed_at));
    }
    if (m_incomplete_at_isSet) {
        obj.insert(QString("incomplete_at"), ::OpenAPI::toJsonValue(incomplete_at));
    }
    if (m_role_isSet) {
        obj.insert(QString("role"), ::OpenAPI::toJsonValue(role));
    }
    if (content.size() > 0) {
        obj.insert(QString("content"), ::OpenAPI::toJsonValue(content));
    }
    if (m_assistant_id_isSet) {
        obj.insert(QString("assistant_id"), ::OpenAPI::toJsonValue(assistant_id));
    }
    if (m_run_id_isSet) {
        obj.insert(QString("run_id"), ::OpenAPI::toJsonValue(run_id));
    }
    if (file_ids.size() > 0) {
        obj.insert(QString("file_ids"), ::OpenAPI::toJsonValue(file_ids));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    return obj;
}

QString OAIMessageObject::getId() const {
    return id;
}
void OAIMessageObject::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIMessageObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIMessageObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIMessageObject::getObject() const {
    return object;
}
void OAIMessageObject::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIMessageObject::is_object_Set() const{
    return m_object_isSet;
}

bool OAIMessageObject::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIMessageObject::getCreatedAt() const {
    return created_at;
}
void OAIMessageObject::setCreatedAt(const qint32 &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool OAIMessageObject::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIMessageObject::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIMessageObject::getThreadId() const {
    return thread_id;
}
void OAIMessageObject::setThreadId(const QString &thread_id) {
    this->thread_id = thread_id;
    this->m_thread_id_isSet = true;
}

bool OAIMessageObject::is_thread_id_Set() const{
    return m_thread_id_isSet;
}

bool OAIMessageObject::is_thread_id_Valid() const{
    return m_thread_id_isValid;
}

QString OAIMessageObject::getStatus() const {
    return status;
}
void OAIMessageObject::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIMessageObject::is_status_Set() const{
    return m_status_isSet;
}

bool OAIMessageObject::is_status_Valid() const{
    return m_status_isValid;
}

OAIMessageObject_incomplete_details OAIMessageObject::getIncompleteDetails() const {
    return incomplete_details;
}
void OAIMessageObject::setIncompleteDetails(const OAIMessageObject_incomplete_details &incomplete_details) {
    this->incomplete_details = incomplete_details;
    this->m_incomplete_details_isSet = true;
}

bool OAIMessageObject::is_incomplete_details_Set() const{
    return m_incomplete_details_isSet;
}

bool OAIMessageObject::is_incomplete_details_Valid() const{
    return m_incomplete_details_isValid;
}

qint32 OAIMessageObject::getCompletedAt() const {
    return completed_at;
}
void OAIMessageObject::setCompletedAt(const qint32 &completed_at) {
    this->completed_at = completed_at;
    this->m_completed_at_isSet = true;
}

bool OAIMessageObject::is_completed_at_Set() const{
    return m_completed_at_isSet;
}

bool OAIMessageObject::is_completed_at_Valid() const{
    return m_completed_at_isValid;
}

qint32 OAIMessageObject::getIncompleteAt() const {
    return incomplete_at;
}
void OAIMessageObject::setIncompleteAt(const qint32 &incomplete_at) {
    this->incomplete_at = incomplete_at;
    this->m_incomplete_at_isSet = true;
}

bool OAIMessageObject::is_incomplete_at_Set() const{
    return m_incomplete_at_isSet;
}

bool OAIMessageObject::is_incomplete_at_Valid() const{
    return m_incomplete_at_isValid;
}

QString OAIMessageObject::getRole() const {
    return role;
}
void OAIMessageObject::setRole(const QString &role) {
    this->role = role;
    this->m_role_isSet = true;
}

bool OAIMessageObject::is_role_Set() const{
    return m_role_isSet;
}

bool OAIMessageObject::is_role_Valid() const{
    return m_role_isValid;
}

QList<OAIMessageObject_content_inner> OAIMessageObject::getContent() const {
    return content;
}
void OAIMessageObject::setContent(const QList<OAIMessageObject_content_inner> &content) {
    this->content = content;
    this->m_content_isSet = true;
}

bool OAIMessageObject::is_content_Set() const{
    return m_content_isSet;
}

bool OAIMessageObject::is_content_Valid() const{
    return m_content_isValid;
}

QString OAIMessageObject::getAssistantId() const {
    return assistant_id;
}
void OAIMessageObject::setAssistantId(const QString &assistant_id) {
    this->assistant_id = assistant_id;
    this->m_assistant_id_isSet = true;
}

bool OAIMessageObject::is_assistant_id_Set() const{
    return m_assistant_id_isSet;
}

bool OAIMessageObject::is_assistant_id_Valid() const{
    return m_assistant_id_isValid;
}

QString OAIMessageObject::getRunId() const {
    return run_id;
}
void OAIMessageObject::setRunId(const QString &run_id) {
    this->run_id = run_id;
    this->m_run_id_isSet = true;
}

bool OAIMessageObject::is_run_id_Set() const{
    return m_run_id_isSet;
}

bool OAIMessageObject::is_run_id_Valid() const{
    return m_run_id_isValid;
}

QList<QString> OAIMessageObject::getFileIds() const {
    return file_ids;
}
void OAIMessageObject::setFileIds(const QList<QString> &file_ids) {
    this->file_ids = file_ids;
    this->m_file_ids_isSet = true;
}

bool OAIMessageObject::is_file_ids_Set() const{
    return m_file_ids_isSet;
}

bool OAIMessageObject::is_file_ids_Valid() const{
    return m_file_ids_isValid;
}

OAIObject OAIMessageObject::getMetadata() const {
    return metadata;
}
void OAIMessageObject::setMetadata(const OAIObject &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAIMessageObject::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAIMessageObject::is_metadata_Valid() const{
    return m_metadata_isValid;
}

bool OAIMessageObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_object_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_thread_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (incomplete_details.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_completed_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_incomplete_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_role_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (content.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_assistant_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_run_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (file_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_metadata_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMessageObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_at_isValid && m_thread_id_isValid && m_status_isValid && m_incomplete_details_isValid && m_completed_at_isValid && m_incomplete_at_isValid && m_role_isValid && m_content_isValid && m_assistant_id_isValid && m_run_id_isValid && m_file_ids_isValid && m_metadata_isValid && true;
}

} // namespace OpenAPI
