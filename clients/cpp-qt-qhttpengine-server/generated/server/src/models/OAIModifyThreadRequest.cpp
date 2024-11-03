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

#include "OAIModifyThreadRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIModifyThreadRequest::OAIModifyThreadRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIModifyThreadRequest::OAIModifyThreadRequest() {
    this->initializeModel();
}

OAIModifyThreadRequest::~OAIModifyThreadRequest() {}

void OAIModifyThreadRequest::initializeModel() {

    m_metadata_isSet = false;
    m_metadata_isValid = false;
}

void OAIModifyThreadRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIModifyThreadRequest::fromJsonObject(QJsonObject json) {

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;
}

QString OAIModifyThreadRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIModifyThreadRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    return obj;
}

OAIObject OAIModifyThreadRequest::getMetadata() const {
    return metadata;
}
void OAIModifyThreadRequest::setMetadata(const OAIObject &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAIModifyThreadRequest::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAIModifyThreadRequest::is_metadata_Valid() const{
    return m_metadata_isValid;
}

bool OAIModifyThreadRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_metadata_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIModifyThreadRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
