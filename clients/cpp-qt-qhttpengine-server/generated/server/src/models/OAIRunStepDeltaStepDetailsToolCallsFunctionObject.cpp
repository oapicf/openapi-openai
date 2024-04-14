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

#include "OAIRunStepDeltaStepDetailsToolCallsFunctionObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDeltaStepDetailsToolCallsFunctionObject::OAIRunStepDeltaStepDetailsToolCallsFunctionObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDeltaStepDetailsToolCallsFunctionObject::OAIRunStepDeltaStepDetailsToolCallsFunctionObject() {
    this->initializeModel();
}

OAIRunStepDeltaStepDetailsToolCallsFunctionObject::~OAIRunStepDeltaStepDetailsToolCallsFunctionObject() {}

void OAIRunStepDeltaStepDetailsToolCallsFunctionObject::initializeModel() {

    m_index_isSet = false;
    m_index_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_function_isSet = false;
    m_function_isValid = false;
}

void OAIRunStepDeltaStepDetailsToolCallsFunctionObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDeltaStepDetailsToolCallsFunctionObject::fromJsonObject(QJsonObject json) {

    m_index_isValid = ::OpenAPI::fromJsonValue(index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_function_isValid = ::OpenAPI::fromJsonValue(function, json[QString("function")]);
    m_function_isSet = !json[QString("function")].isNull() && m_function_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsFunctionObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDeltaStepDetailsToolCallsFunctionObject::asJsonObject() const {
    QJsonObject obj;
    if (m_index_isSet) {
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(index));
    }
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

qint32 OAIRunStepDeltaStepDetailsToolCallsFunctionObject::getIndex() const {
    return index;
}
void OAIRunStepDeltaStepDetailsToolCallsFunctionObject::setIndex(const qint32 &index) {
    this->index = index;
    this->m_index_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_index_Set() const{
    return m_index_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_index_Valid() const{
    return m_index_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsFunctionObject::getId() const {
    return id;
}
void OAIRunStepDeltaStepDetailsToolCallsFunctionObject::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIRunStepDeltaStepDetailsToolCallsFunctionObject::getType() const {
    return type;
}
void OAIRunStepDeltaStepDetailsToolCallsFunctionObject::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_type_Valid() const{
    return m_type_isValid;
}

OAIRunStepDeltaStepDetailsToolCallsFunctionObject_function OAIRunStepDeltaStepDetailsToolCallsFunctionObject::getFunction() const {
    return function;
}
void OAIRunStepDeltaStepDetailsToolCallsFunctionObject::setFunction(const OAIRunStepDeltaStepDetailsToolCallsFunctionObject_function &function) {
    this->function = function;
    this->m_function_isSet = true;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_function_Set() const{
    return m_function_isSet;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::is_function_Valid() const{
    return m_function_isValid;
}

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_index_isSet) {
            isObjectUpdated = true;
            break;
        }

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

bool OAIRunStepDeltaStepDetailsToolCallsFunctionObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_index_isValid && m_type_isValid && true;
}

} // namespace OpenAPI
