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

#include "OAIChatCompletionFunctionCallOption.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIChatCompletionFunctionCallOption::OAIChatCompletionFunctionCallOption(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIChatCompletionFunctionCallOption::OAIChatCompletionFunctionCallOption() {
    this->initializeModel();
}

OAIChatCompletionFunctionCallOption::~OAIChatCompletionFunctionCallOption() {}

void OAIChatCompletionFunctionCallOption::initializeModel() {

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAIChatCompletionFunctionCallOption::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIChatCompletionFunctionCallOption::fromJsonObject(QJsonObject json) {

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAIChatCompletionFunctionCallOption::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIChatCompletionFunctionCallOption::asJsonObject() const {
    QJsonObject obj;
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    return obj;
}

QString OAIChatCompletionFunctionCallOption::getName() const {
    return name;
}
void OAIChatCompletionFunctionCallOption::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIChatCompletionFunctionCallOption::is_name_Set() const{
    return m_name_isSet;
}

bool OAIChatCompletionFunctionCallOption::is_name_Valid() const{
    return m_name_isValid;
}

bool OAIChatCompletionFunctionCallOption::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIChatCompletionFunctionCallOption::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_name_isValid && true;
}

} // namespace OpenAPI
