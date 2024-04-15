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

#include "OAIChatCompletionToolChoiceOption.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIChatCompletionToolChoiceOption::OAIChatCompletionToolChoiceOption(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIChatCompletionToolChoiceOption::OAIChatCompletionToolChoiceOption() {
    this->initializeModel();
}

OAIChatCompletionToolChoiceOption::~OAIChatCompletionToolChoiceOption() {}

void OAIChatCompletionToolChoiceOption::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_function_isSet = false;
    m_function_isValid = false;
}

void OAIChatCompletionToolChoiceOption::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIChatCompletionToolChoiceOption::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_function_isValid = ::OpenAPI::fromJsonValue(m_function, json[QString("function")]);
    m_function_isSet = !json[QString("function")].isNull() && m_function_isValid;
}

QString OAIChatCompletionToolChoiceOption::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIChatCompletionToolChoiceOption::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_function.isSet()) {
        obj.insert(QString("function"), ::OpenAPI::toJsonValue(m_function));
    }
    return obj;
}

QString OAIChatCompletionToolChoiceOption::getType() const {
    return m_type;
}
void OAIChatCompletionToolChoiceOption::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIChatCompletionToolChoiceOption::is_type_Set() const{
    return m_type_isSet;
}

bool OAIChatCompletionToolChoiceOption::is_type_Valid() const{
    return m_type_isValid;
}

OAIChatCompletionNamedToolChoice_function OAIChatCompletionToolChoiceOption::getFunction() const {
    return m_function;
}
void OAIChatCompletionToolChoiceOption::setFunction(const OAIChatCompletionNamedToolChoice_function &function) {
    m_function = function;
    m_function_isSet = true;
}

bool OAIChatCompletionToolChoiceOption::is_function_Set() const{
    return m_function_isSet;
}

bool OAIChatCompletionToolChoiceOption::is_function_Valid() const{
    return m_function_isValid;
}

bool OAIChatCompletionToolChoiceOption::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_function.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIChatCompletionToolChoiceOption::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && m_function_isValid && true;
}

} // namespace OpenAPI