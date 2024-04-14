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

#include "OAIRunStepCompletionUsage.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepCompletionUsage::OAIRunStepCompletionUsage(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepCompletionUsage::OAIRunStepCompletionUsage() {
    this->initializeModel();
}

OAIRunStepCompletionUsage::~OAIRunStepCompletionUsage() {}

void OAIRunStepCompletionUsage::initializeModel() {

    m_completion_tokens_isSet = false;
    m_completion_tokens_isValid = false;

    m_prompt_tokens_isSet = false;
    m_prompt_tokens_isValid = false;

    m_total_tokens_isSet = false;
    m_total_tokens_isValid = false;
}

void OAIRunStepCompletionUsage::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepCompletionUsage::fromJsonObject(QJsonObject json) {

    m_completion_tokens_isValid = ::OpenAPI::fromJsonValue(completion_tokens, json[QString("completion_tokens")]);
    m_completion_tokens_isSet = !json[QString("completion_tokens")].isNull() && m_completion_tokens_isValid;

    m_prompt_tokens_isValid = ::OpenAPI::fromJsonValue(prompt_tokens, json[QString("prompt_tokens")]);
    m_prompt_tokens_isSet = !json[QString("prompt_tokens")].isNull() && m_prompt_tokens_isValid;

    m_total_tokens_isValid = ::OpenAPI::fromJsonValue(total_tokens, json[QString("total_tokens")]);
    m_total_tokens_isSet = !json[QString("total_tokens")].isNull() && m_total_tokens_isValid;
}

QString OAIRunStepCompletionUsage::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepCompletionUsage::asJsonObject() const {
    QJsonObject obj;
    if (m_completion_tokens_isSet) {
        obj.insert(QString("completion_tokens"), ::OpenAPI::toJsonValue(completion_tokens));
    }
    if (m_prompt_tokens_isSet) {
        obj.insert(QString("prompt_tokens"), ::OpenAPI::toJsonValue(prompt_tokens));
    }
    if (m_total_tokens_isSet) {
        obj.insert(QString("total_tokens"), ::OpenAPI::toJsonValue(total_tokens));
    }
    return obj;
}

qint32 OAIRunStepCompletionUsage::getCompletionTokens() const {
    return completion_tokens;
}
void OAIRunStepCompletionUsage::setCompletionTokens(const qint32 &completion_tokens) {
    this->completion_tokens = completion_tokens;
    this->m_completion_tokens_isSet = true;
}

bool OAIRunStepCompletionUsage::is_completion_tokens_Set() const{
    return m_completion_tokens_isSet;
}

bool OAIRunStepCompletionUsage::is_completion_tokens_Valid() const{
    return m_completion_tokens_isValid;
}

qint32 OAIRunStepCompletionUsage::getPromptTokens() const {
    return prompt_tokens;
}
void OAIRunStepCompletionUsage::setPromptTokens(const qint32 &prompt_tokens) {
    this->prompt_tokens = prompt_tokens;
    this->m_prompt_tokens_isSet = true;
}

bool OAIRunStepCompletionUsage::is_prompt_tokens_Set() const{
    return m_prompt_tokens_isSet;
}

bool OAIRunStepCompletionUsage::is_prompt_tokens_Valid() const{
    return m_prompt_tokens_isValid;
}

qint32 OAIRunStepCompletionUsage::getTotalTokens() const {
    return total_tokens;
}
void OAIRunStepCompletionUsage::setTotalTokens(const qint32 &total_tokens) {
    this->total_tokens = total_tokens;
    this->m_total_tokens_isSet = true;
}

bool OAIRunStepCompletionUsage::is_total_tokens_Set() const{
    return m_total_tokens_isSet;
}

bool OAIRunStepCompletionUsage::is_total_tokens_Valid() const{
    return m_total_tokens_isValid;
}

bool OAIRunStepCompletionUsage::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_completion_tokens_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_prompt_tokens_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_total_tokens_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepCompletionUsage::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_completion_tokens_isValid && m_prompt_tokens_isValid && m_total_tokens_isValid && true;
}

} // namespace OpenAPI
