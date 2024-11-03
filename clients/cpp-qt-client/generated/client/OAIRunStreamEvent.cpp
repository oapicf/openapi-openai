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

#include "OAIRunStreamEvent.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStreamEvent::OAIRunStreamEvent(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStreamEvent::OAIRunStreamEvent() {
    this->initializeModel();
}

OAIRunStreamEvent::~OAIRunStreamEvent() {}

void OAIRunStreamEvent::initializeModel() {

    m_event_isSet = false;
    m_event_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIRunStreamEvent::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStreamEvent::fromJsonObject(QJsonObject json) {

    m_event_isValid = ::OpenAPI::fromJsonValue(m_event, json[QString("event")]);
    m_event_isSet = !json[QString("event")].isNull() && m_event_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(m_data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIRunStreamEvent::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStreamEvent::asJsonObject() const {
    QJsonObject obj;
    if (m_event_isSet) {
        obj.insert(QString("event"), ::OpenAPI::toJsonValue(m_event));
    }
    if (m_data.isSet()) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(m_data));
    }
    return obj;
}

QString OAIRunStreamEvent::getEvent() const {
    return m_event;
}
void OAIRunStreamEvent::setEvent(const QString &event) {
    m_event = event;
    m_event_isSet = true;
}

bool OAIRunStreamEvent::is_event_Set() const{
    return m_event_isSet;
}

bool OAIRunStreamEvent::is_event_Valid() const{
    return m_event_isValid;
}

OAIRunObject OAIRunStreamEvent::getData() const {
    return m_data;
}
void OAIRunStreamEvent::setData(const OAIRunObject &data) {
    m_data = data;
    m_data_isSet = true;
}

bool OAIRunStreamEvent::is_data_Set() const{
    return m_data_isSet;
}

bool OAIRunStreamEvent::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIRunStreamEvent::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_event_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_data.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStreamEvent::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_event_isValid && m_data_isValid && true;
}

} // namespace OpenAPI
