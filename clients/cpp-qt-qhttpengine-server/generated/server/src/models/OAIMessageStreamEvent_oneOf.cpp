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

#include "OAIMessageStreamEvent_oneOf.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMessageStreamEvent_oneOf::OAIMessageStreamEvent_oneOf(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMessageStreamEvent_oneOf::OAIMessageStreamEvent_oneOf() {
    this->initializeModel();
}

OAIMessageStreamEvent_oneOf::~OAIMessageStreamEvent_oneOf() {}

void OAIMessageStreamEvent_oneOf::initializeModel() {

    m_event_isSet = false;
    m_event_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIMessageStreamEvent_oneOf::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMessageStreamEvent_oneOf::fromJsonObject(QJsonObject json) {

    m_event_isValid = ::OpenAPI::fromJsonValue(event, json[QString("event")]);
    m_event_isSet = !json[QString("event")].isNull() && m_event_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIMessageStreamEvent_oneOf::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMessageStreamEvent_oneOf::asJsonObject() const {
    QJsonObject obj;
    if (m_event_isSet) {
        obj.insert(QString("event"), ::OpenAPI::toJsonValue(event));
    }
    if (data.isSet()) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    return obj;
}

QString OAIMessageStreamEvent_oneOf::getEvent() const {
    return event;
}
void OAIMessageStreamEvent_oneOf::setEvent(const QString &event) {
    this->event = event;
    this->m_event_isSet = true;
}

bool OAIMessageStreamEvent_oneOf::is_event_Set() const{
    return m_event_isSet;
}

bool OAIMessageStreamEvent_oneOf::is_event_Valid() const{
    return m_event_isValid;
}

OAIMessageObject OAIMessageStreamEvent_oneOf::getData() const {
    return data;
}
void OAIMessageStreamEvent_oneOf::setData(const OAIMessageObject &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIMessageStreamEvent_oneOf::is_data_Set() const{
    return m_data_isSet;
}

bool OAIMessageStreamEvent_oneOf::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIMessageStreamEvent_oneOf::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_event_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (data.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMessageStreamEvent_oneOf::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_event_isValid && m_data_isValid && true;
}

} // namespace OpenAPI
