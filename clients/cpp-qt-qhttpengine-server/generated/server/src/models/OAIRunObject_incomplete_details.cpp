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

#include "OAIRunObject_incomplete_details.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunObject_incomplete_details::OAIRunObject_incomplete_details(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunObject_incomplete_details::OAIRunObject_incomplete_details() {
    this->initializeModel();
}

OAIRunObject_incomplete_details::~OAIRunObject_incomplete_details() {}

void OAIRunObject_incomplete_details::initializeModel() {

    m_reason_isSet = false;
    m_reason_isValid = false;
}

void OAIRunObject_incomplete_details::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunObject_incomplete_details::fromJsonObject(QJsonObject json) {

    m_reason_isValid = ::OpenAPI::fromJsonValue(reason, json[QString("reason")]);
    m_reason_isSet = !json[QString("reason")].isNull() && m_reason_isValid;
}

QString OAIRunObject_incomplete_details::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunObject_incomplete_details::asJsonObject() const {
    QJsonObject obj;
    if (m_reason_isSet) {
        obj.insert(QString("reason"), ::OpenAPI::toJsonValue(reason));
    }
    return obj;
}

QString OAIRunObject_incomplete_details::getReason() const {
    return reason;
}
void OAIRunObject_incomplete_details::setReason(const QString &reason) {
    this->reason = reason;
    this->m_reason_isSet = true;
}

bool OAIRunObject_incomplete_details::is_reason_Set() const{
    return m_reason_isSet;
}

bool OAIRunObject_incomplete_details::is_reason_Valid() const{
    return m_reason_isValid;
}

bool OAIRunObject_incomplete_details::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_reason_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunObject_incomplete_details::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
