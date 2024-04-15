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

#include "OAIImage.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIImage::OAIImage(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIImage::OAIImage() {
    this->initializeModel();
}

OAIImage::~OAIImage() {}

void OAIImage::initializeModel() {

    m_b64_json_isSet = false;
    m_b64_json_isValid = false;

    m_url_isSet = false;
    m_url_isValid = false;

    m_revised_prompt_isSet = false;
    m_revised_prompt_isValid = false;
}

void OAIImage::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIImage::fromJsonObject(QJsonObject json) {

    m_b64_json_isValid = ::OpenAPI::fromJsonValue(b64_json, json[QString("b64_json")]);
    m_b64_json_isSet = !json[QString("b64_json")].isNull() && m_b64_json_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;

    m_revised_prompt_isValid = ::OpenAPI::fromJsonValue(revised_prompt, json[QString("revised_prompt")]);
    m_revised_prompt_isSet = !json[QString("revised_prompt")].isNull() && m_revised_prompt_isValid;
}

QString OAIImage::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIImage::asJsonObject() const {
    QJsonObject obj;
    if (m_b64_json_isSet) {
        obj.insert(QString("b64_json"), ::OpenAPI::toJsonValue(b64_json));
    }
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(url));
    }
    if (m_revised_prompt_isSet) {
        obj.insert(QString("revised_prompt"), ::OpenAPI::toJsonValue(revised_prompt));
    }
    return obj;
}

QString OAIImage::getB64Json() const {
    return b64_json;
}
void OAIImage::setB64Json(const QString &b64_json) {
    this->b64_json = b64_json;
    this->m_b64_json_isSet = true;
}

bool OAIImage::is_b64_json_Set() const{
    return m_b64_json_isSet;
}

bool OAIImage::is_b64_json_Valid() const{
    return m_b64_json_isValid;
}

QString OAIImage::getUrl() const {
    return url;
}
void OAIImage::setUrl(const QString &url) {
    this->url = url;
    this->m_url_isSet = true;
}

bool OAIImage::is_url_Set() const{
    return m_url_isSet;
}

bool OAIImage::is_url_Valid() const{
    return m_url_isValid;
}

QString OAIImage::getRevisedPrompt() const {
    return revised_prompt;
}
void OAIImage::setRevisedPrompt(const QString &revised_prompt) {
    this->revised_prompt = revised_prompt;
    this->m_revised_prompt_isSet = true;
}

bool OAIImage::is_revised_prompt_Set() const{
    return m_revised_prompt_isSet;
}

bool OAIImage::is_revised_prompt_Valid() const{
    return m_revised_prompt_isValid;
}

bool OAIImage::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_b64_json_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_revised_prompt_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIImage::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI