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

#include "OAIRunStepObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepObject::OAIRunStepObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepObject::OAIRunStepObject() {
    this->initializeModel();
}

OAIRunStepObject::~OAIRunStepObject() {}

void OAIRunStepObject::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_assistant_id_isSet = false;
    m_assistant_id_isValid = false;

    m_thread_id_isSet = false;
    m_thread_id_isValid = false;

    m_run_id_isSet = false;
    m_run_id_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_step_details_isSet = false;
    m_step_details_isValid = false;

    m_last_error_isSet = false;
    m_last_error_isValid = false;

    m_expired_at_isSet = false;
    m_expired_at_isValid = false;

    m_cancelled_at_isSet = false;
    m_cancelled_at_isValid = false;

    m_failed_at_isSet = false;
    m_failed_at_isValid = false;

    m_completed_at_isSet = false;
    m_completed_at_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;

    m_usage_isSet = false;
    m_usage_isValid = false;
}

void OAIRunStepObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepObject::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_assistant_id_isValid = ::OpenAPI::fromJsonValue(assistant_id, json[QString("assistant_id")]);
    m_assistant_id_isSet = !json[QString("assistant_id")].isNull() && m_assistant_id_isValid;

    m_thread_id_isValid = ::OpenAPI::fromJsonValue(thread_id, json[QString("thread_id")]);
    m_thread_id_isSet = !json[QString("thread_id")].isNull() && m_thread_id_isValid;

    m_run_id_isValid = ::OpenAPI::fromJsonValue(run_id, json[QString("run_id")]);
    m_run_id_isSet = !json[QString("run_id")].isNull() && m_run_id_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_step_details_isValid = ::OpenAPI::fromJsonValue(step_details, json[QString("step_details")]);
    m_step_details_isSet = !json[QString("step_details")].isNull() && m_step_details_isValid;

    m_last_error_isValid = ::OpenAPI::fromJsonValue(last_error, json[QString("last_error")]);
    m_last_error_isSet = !json[QString("last_error")].isNull() && m_last_error_isValid;

    m_expired_at_isValid = ::OpenAPI::fromJsonValue(expired_at, json[QString("expired_at")]);
    m_expired_at_isSet = !json[QString("expired_at")].isNull() && m_expired_at_isValid;

    m_cancelled_at_isValid = ::OpenAPI::fromJsonValue(cancelled_at, json[QString("cancelled_at")]);
    m_cancelled_at_isSet = !json[QString("cancelled_at")].isNull() && m_cancelled_at_isValid;

    m_failed_at_isValid = ::OpenAPI::fromJsonValue(failed_at, json[QString("failed_at")]);
    m_failed_at_isSet = !json[QString("failed_at")].isNull() && m_failed_at_isValid;

    m_completed_at_isValid = ::OpenAPI::fromJsonValue(completed_at, json[QString("completed_at")]);
    m_completed_at_isSet = !json[QString("completed_at")].isNull() && m_completed_at_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;

    m_usage_isValid = ::OpenAPI::fromJsonValue(usage, json[QString("usage")]);
    m_usage_isSet = !json[QString("usage")].isNull() && m_usage_isValid;
}

QString OAIRunStepObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepObject::asJsonObject() const {
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
    if (m_assistant_id_isSet) {
        obj.insert(QString("assistant_id"), ::OpenAPI::toJsonValue(assistant_id));
    }
    if (m_thread_id_isSet) {
        obj.insert(QString("thread_id"), ::OpenAPI::toJsonValue(thread_id));
    }
    if (m_run_id_isSet) {
        obj.insert(QString("run_id"), ::OpenAPI::toJsonValue(run_id));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (step_details.isSet()) {
        obj.insert(QString("step_details"), ::OpenAPI::toJsonValue(step_details));
    }
    if (last_error.isSet()) {
        obj.insert(QString("last_error"), ::OpenAPI::toJsonValue(last_error));
    }
    if (m_expired_at_isSet) {
        obj.insert(QString("expired_at"), ::OpenAPI::toJsonValue(expired_at));
    }
    if (m_cancelled_at_isSet) {
        obj.insert(QString("cancelled_at"), ::OpenAPI::toJsonValue(cancelled_at));
    }
    if (m_failed_at_isSet) {
        obj.insert(QString("failed_at"), ::OpenAPI::toJsonValue(failed_at));
    }
    if (m_completed_at_isSet) {
        obj.insert(QString("completed_at"), ::OpenAPI::toJsonValue(completed_at));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    if (usage.isSet()) {
        obj.insert(QString("usage"), ::OpenAPI::toJsonValue(usage));
    }
    return obj;
}

QString OAIRunStepObject::getId() const {
    return id;
}
void OAIRunStepObject::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIRunStepObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIRunStepObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIRunStepObject::getObject() const {
    return object;
}
void OAIRunStepObject::setObject(const QString &object) {
    this->object = object;
    this->m_object_isSet = true;
}

bool OAIRunStepObject::is_object_Set() const{
    return m_object_isSet;
}

bool OAIRunStepObject::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIRunStepObject::getCreatedAt() const {
    return created_at;
}
void OAIRunStepObject::setCreatedAt(const qint32 &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool OAIRunStepObject::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIRunStepObject::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIRunStepObject::getAssistantId() const {
    return assistant_id;
}
void OAIRunStepObject::setAssistantId(const QString &assistant_id) {
    this->assistant_id = assistant_id;
    this->m_assistant_id_isSet = true;
}

bool OAIRunStepObject::is_assistant_id_Set() const{
    return m_assistant_id_isSet;
}

bool OAIRunStepObject::is_assistant_id_Valid() const{
    return m_assistant_id_isValid;
}

QString OAIRunStepObject::getThreadId() const {
    return thread_id;
}
void OAIRunStepObject::setThreadId(const QString &thread_id) {
    this->thread_id = thread_id;
    this->m_thread_id_isSet = true;
}

bool OAIRunStepObject::is_thread_id_Set() const{
    return m_thread_id_isSet;
}

bool OAIRunStepObject::is_thread_id_Valid() const{
    return m_thread_id_isValid;
}

QString OAIRunStepObject::getRunId() const {
    return run_id;
}
void OAIRunStepObject::setRunId(const QString &run_id) {
    this->run_id = run_id;
    this->m_run_id_isSet = true;
}

bool OAIRunStepObject::is_run_id_Set() const{
    return m_run_id_isSet;
}

bool OAIRunStepObject::is_run_id_Valid() const{
    return m_run_id_isValid;
}

QString OAIRunStepObject::getType() const {
    return type;
}
void OAIRunStepObject::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIRunStepObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepObject::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIRunStepObject::getStatus() const {
    return status;
}
void OAIRunStepObject::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIRunStepObject::is_status_Set() const{
    return m_status_isSet;
}

bool OAIRunStepObject::is_status_Valid() const{
    return m_status_isValid;
}

OAIRunStepObject_step_details OAIRunStepObject::getStepDetails() const {
    return step_details;
}
void OAIRunStepObject::setStepDetails(const OAIRunStepObject_step_details &step_details) {
    this->step_details = step_details;
    this->m_step_details_isSet = true;
}

bool OAIRunStepObject::is_step_details_Set() const{
    return m_step_details_isSet;
}

bool OAIRunStepObject::is_step_details_Valid() const{
    return m_step_details_isValid;
}

OAIRunStepObject_last_error OAIRunStepObject::getLastError() const {
    return last_error;
}
void OAIRunStepObject::setLastError(const OAIRunStepObject_last_error &last_error) {
    this->last_error = last_error;
    this->m_last_error_isSet = true;
}

bool OAIRunStepObject::is_last_error_Set() const{
    return m_last_error_isSet;
}

bool OAIRunStepObject::is_last_error_Valid() const{
    return m_last_error_isValid;
}

qint32 OAIRunStepObject::getExpiredAt() const {
    return expired_at;
}
void OAIRunStepObject::setExpiredAt(const qint32 &expired_at) {
    this->expired_at = expired_at;
    this->m_expired_at_isSet = true;
}

bool OAIRunStepObject::is_expired_at_Set() const{
    return m_expired_at_isSet;
}

bool OAIRunStepObject::is_expired_at_Valid() const{
    return m_expired_at_isValid;
}

qint32 OAIRunStepObject::getCancelledAt() const {
    return cancelled_at;
}
void OAIRunStepObject::setCancelledAt(const qint32 &cancelled_at) {
    this->cancelled_at = cancelled_at;
    this->m_cancelled_at_isSet = true;
}

bool OAIRunStepObject::is_cancelled_at_Set() const{
    return m_cancelled_at_isSet;
}

bool OAIRunStepObject::is_cancelled_at_Valid() const{
    return m_cancelled_at_isValid;
}

qint32 OAIRunStepObject::getFailedAt() const {
    return failed_at;
}
void OAIRunStepObject::setFailedAt(const qint32 &failed_at) {
    this->failed_at = failed_at;
    this->m_failed_at_isSet = true;
}

bool OAIRunStepObject::is_failed_at_Set() const{
    return m_failed_at_isSet;
}

bool OAIRunStepObject::is_failed_at_Valid() const{
    return m_failed_at_isValid;
}

qint32 OAIRunStepObject::getCompletedAt() const {
    return completed_at;
}
void OAIRunStepObject::setCompletedAt(const qint32 &completed_at) {
    this->completed_at = completed_at;
    this->m_completed_at_isSet = true;
}

bool OAIRunStepObject::is_completed_at_Set() const{
    return m_completed_at_isSet;
}

bool OAIRunStepObject::is_completed_at_Valid() const{
    return m_completed_at_isValid;
}

OAIObject OAIRunStepObject::getMetadata() const {
    return metadata;
}
void OAIRunStepObject::setMetadata(const OAIObject &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAIRunStepObject::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAIRunStepObject::is_metadata_Valid() const{
    return m_metadata_isValid;
}

OAIRunStepCompletionUsage OAIRunStepObject::getUsage() const {
    return usage;
}
void OAIRunStepObject::setUsage(const OAIRunStepCompletionUsage &usage) {
    this->usage = usage;
    this->m_usage_isSet = true;
}

bool OAIRunStepObject::is_usage_Set() const{
    return m_usage_isSet;
}

bool OAIRunStepObject::is_usage_Valid() const{
    return m_usage_isValid;
}

bool OAIRunStepObject::isSet() const {
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

        if (m_assistant_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_thread_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_run_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (step_details.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (last_error.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_expired_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cancelled_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_failed_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_completed_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_metadata_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (usage.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_at_isValid && m_assistant_id_isValid && m_thread_id_isValid && m_run_id_isValid && m_type_isValid && m_status_isValid && m_step_details_isValid && m_last_error_isValid && m_expired_at_isValid && m_cancelled_at_isValid && m_failed_at_isValid && m_completed_at_isValid && m_metadata_isValid && m_usage_isValid && true;
}

} // namespace OpenAPI
