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

#include "OAIRunStepDetailsToolCallsFunctionObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDetailsToolCallsFunctionObject::OAIRunStepDetailsToolCallsFunctionObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDetailsToolCallsFunctionObject::OAIRunStepDetailsToolCallsFunctionObject() {
    this->initializeModel();
}

OAIRunStepDetailsToolCallsFunctionObject::~OAIRunStepDetailsToolCallsFunctionObject() {}

void OAIRunStepDetailsToolCallsFunctionObject::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_function_isSet = false;
    m_function_isValid = false;
}

void OAIRunStepDetailsToolCallsFunctionObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDetailsToolCallsFunctionObject::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_function_isValid = ::OpenAPI::fromJsonValue(function, json[QString("function")]);
    m_function_isSet = !json[QString("function")].isNull() && m_function_isValid;
}

QString OAIRunStepDetailsToolCallsFunctionObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDetailsToolCallsFunctionObject::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (function.isSet()) {
        obj.insert(QString("function"), ::OpenAPI::toJsonValue(function));
    }
    return obj;
}

QString OAIRunStepDetailsToolCallsFunctionObject::getId() const {
    return id;
}
void OAIRunStepDetailsToolCallsFunctionObject::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIRunStepDetailsToolCallsFunctionObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIRunStepDetailsToolCallsFunctionObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIRunStepDetailsToolCallsFunctionObject::getType() const {
    return type;
}
void OAIRunStepDetailsToolCallsFunctionObject::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIRunStepDetailsToolCallsFunctionObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepDetailsToolCallsFunctionObject::is_type_Valid() const{
    return m_type_isValid;
}

OAIRunStepDetailsToolCallsFunctionObject_function OAIRunStepDetailsToolCallsFunctionObject::getFunction() const {
    return function;
}
void OAIRunStepDetailsToolCallsFunctionObject::setFunction(const OAIRunStepDetailsToolCallsFunctionObject_function &function) {
    this->function = function;
    this->m_function_isSet = true;
}

bool OAIRunStepDetailsToolCallsFunctionObject::is_function_Set() const{
    return m_function_isSet;
}

bool OAIRunStepDetailsToolCallsFunctionObject::is_function_Valid() const{
    return m_function_isValid;
}

bool OAIRunStepDetailsToolCallsFunctionObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (function.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepDetailsToolCallsFunctionObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_type_isValid && m_function_isValid && true;
}

} // namespace OpenAPI