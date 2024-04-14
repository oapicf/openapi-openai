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

#include "OAIChatCompletionRequestMessageContentPartImage.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIChatCompletionRequestMessageContentPartImage::OAIChatCompletionRequestMessageContentPartImage(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIChatCompletionRequestMessageContentPartImage::OAIChatCompletionRequestMessageContentPartImage() {
    this->initializeModel();
}

OAIChatCompletionRequestMessageContentPartImage::~OAIChatCompletionRequestMessageContentPartImage() {}

void OAIChatCompletionRequestMessageContentPartImage::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_image_url_isSet = false;
    m_image_url_isValid = false;
}

void OAIChatCompletionRequestMessageContentPartImage::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIChatCompletionRequestMessageContentPartImage::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_image_url_isValid = ::OpenAPI::fromJsonValue(m_image_url, json[QString("image_url")]);
    m_image_url_isSet = !json[QString("image_url")].isNull() && m_image_url_isValid;
}

QString OAIChatCompletionRequestMessageContentPartImage::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIChatCompletionRequestMessageContentPartImage::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_image_url.isSet()) {
        obj.insert(QString("image_url"), ::OpenAPI::toJsonValue(m_image_url));
    }
    return obj;
}

QString OAIChatCompletionRequestMessageContentPartImage::getType() const {
    return m_type;
}
void OAIChatCompletionRequestMessageContentPartImage::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIChatCompletionRequestMessageContentPartImage::is_type_Set() const{
    return m_type_isSet;
}

bool OAIChatCompletionRequestMessageContentPartImage::is_type_Valid() const{
    return m_type_isValid;
}

OAIChatCompletionRequestMessageContentPartImage_image_url OAIChatCompletionRequestMessageContentPartImage::getImageUrl() const {
    return m_image_url;
}
void OAIChatCompletionRequestMessageContentPartImage::setImageUrl(const OAIChatCompletionRequestMessageContentPartImage_image_url &image_url) {
    m_image_url = image_url;
    m_image_url_isSet = true;
}

bool OAIChatCompletionRequestMessageContentPartImage::is_image_url_Set() const{
    return m_image_url_isSet;
}

bool OAIChatCompletionRequestMessageContentPartImage::is_image_url_Valid() const{
    return m_image_url_isValid;
}

bool OAIChatCompletionRequestMessageContentPartImage::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image_url.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIChatCompletionRequestMessageContentPartImage::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && m_image_url_isValid && true;
}

} // namespace OpenAPI
