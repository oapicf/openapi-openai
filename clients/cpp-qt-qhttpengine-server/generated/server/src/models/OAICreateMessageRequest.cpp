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

#include "OAICreateMessageRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateMessageRequest::OAICreateMessageRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateMessageRequest::OAICreateMessageRequest() {
    this->initializeModel();
}

OAICreateMessageRequest::~OAICreateMessageRequest() {}

void OAICreateMessageRequest::initializeModel() {

    m_role_isSet = false;
    m_role_isValid = false;

    m_content_isSet = false;
    m_content_isValid = false;

    m_file_ids_isSet = false;
    m_file_ids_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;
}

void OAICreateMessageRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateMessageRequest::fromJsonObject(QJsonObject json) {

    m_role_isValid = ::OpenAPI::fromJsonValue(role, json[QString("role")]);
    m_role_isSet = !json[QString("role")].isNull() && m_role_isValid;

    m_content_isValid = ::OpenAPI::fromJsonValue(content, json[QString("content")]);
    m_content_isSet = !json[QString("content")].isNull() && m_content_isValid;

    m_file_ids_isValid = ::OpenAPI::fromJsonValue(file_ids, json[QString("file_ids")]);
    m_file_ids_isSet = !json[QString("file_ids")].isNull() && m_file_ids_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;
}

QString OAICreateMessageRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateMessageRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_role_isSet) {
        obj.insert(QString("role"), ::OpenAPI::toJsonValue(role));
    }
    if (m_content_isSet) {
        obj.insert(QString("content"), ::OpenAPI::toJsonValue(content));
    }
    if (file_ids.size() > 0) {
        obj.insert(QString("file_ids"), ::OpenAPI::toJsonValue(file_ids));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    return obj;
}

QString OAICreateMessageRequest::getRole() const {
    return role;
}
void OAICreateMessageRequest::setRole(const QString &role) {
    this->role = role;
    this->m_role_isSet = true;
}

bool OAICreateMessageRequest::is_role_Set() const{
    return m_role_isSet;
}

bool OAICreateMessageRequest::is_role_Valid() const{
    return m_role_isValid;
}

QString OAICreateMessageRequest::getContent() const {
    return content;
}
void OAICreateMessageRequest::setContent(const QString &content) {
    this->content = content;
    this->m_content_isSet = true;
}

bool OAICreateMessageRequest::is_content_Set() const{
    return m_content_isSet;
}

bool OAICreateMessageRequest::is_content_Valid() const{
    return m_content_isValid;
}

QList<QString> OAICreateMessageRequest::getFileIds() const {
    return file_ids;
}
void OAICreateMessageRequest::setFileIds(const QList<QString> &file_ids) {
    this->file_ids = file_ids;
    this->m_file_ids_isSet = true;
}

bool OAICreateMessageRequest::is_file_ids_Set() const{
    return m_file_ids_isSet;
}

bool OAICreateMessageRequest::is_file_ids_Valid() const{
    return m_file_ids_isValid;
}

OAIObject OAICreateMessageRequest::getMetadata() const {
    return metadata;
}
void OAICreateMessageRequest::setMetadata(const OAIObject &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAICreateMessageRequest::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAICreateMessageRequest::is_metadata_Valid() const{
    return m_metadata_isValid;
}

bool OAICreateMessageRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_role_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_content_isSet) {
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

bool OAICreateMessageRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_role_isValid && m_content_isValid && true;
}

} // namespace OpenAPI