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

#include "OAIAssistantStreamEvent.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAssistantStreamEvent::OAIAssistantStreamEvent(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAssistantStreamEvent::OAIAssistantStreamEvent() {
    this->initializeModel();
}

OAIAssistantStreamEvent::~OAIAssistantStreamEvent() {}

void OAIAssistantStreamEvent::initializeModel() {

    m_event_isSet = false;
    m_event_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIAssistantStreamEvent::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAssistantStreamEvent::fromJsonObject(QJsonObject json) {

    m_event_isValid = ::OpenAPI::fromJsonValue(event, json[QString("event")]);
    m_event_isSet = !json[QString("event")].isNull() && m_event_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIAssistantStreamEvent::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAssistantStreamEvent::asJsonObject() const {
    QJsonObject obj;
    if (m_event_isSet) {
        obj.insert(QString("event"), ::OpenAPI::toJsonValue(event));
    }
    if (m_data_isSet) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    return obj;
}

QString OAIAssistantStreamEvent::getEvent() const {
    return event;
}
void OAIAssistantStreamEvent::setEvent(const QString &event) {
    this->event = event;
    this->m_event_isSet = true;
}

bool OAIAssistantStreamEvent::is_event_Set() const{
    return m_event_isSet;
}

bool OAIAssistantStreamEvent::is_event_Valid() const{
    return m_event_isValid;
}

QString OAIAssistantStreamEvent::getData() const {
    return data;
}
void OAIAssistantStreamEvent::setData(const QString &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIAssistantStreamEvent::is_data_Set() const{
    return m_data_isSet;
}

bool OAIAssistantStreamEvent::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIAssistantStreamEvent::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_event_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_data_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAssistantStreamEvent::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_event_isValid && m_data_isValid && true;
}

} // namespace OpenAPI
