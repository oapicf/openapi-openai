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

#include "OAIRunStepDetailsToolCallsCodeOutputImageObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRunStepDetailsToolCallsCodeOutputImageObject::OAIRunStepDetailsToolCallsCodeOutputImageObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRunStepDetailsToolCallsCodeOutputImageObject::OAIRunStepDetailsToolCallsCodeOutputImageObject() {
    this->initializeModel();
}

OAIRunStepDetailsToolCallsCodeOutputImageObject::~OAIRunStepDetailsToolCallsCodeOutputImageObject() {}

void OAIRunStepDetailsToolCallsCodeOutputImageObject::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_image_isSet = false;
    m_image_isValid = false;
}

void OAIRunStepDetailsToolCallsCodeOutputImageObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRunStepDetailsToolCallsCodeOutputImageObject::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_image_isValid = ::OpenAPI::fromJsonValue(m_image, json[QString("image")]);
    m_image_isSet = !json[QString("image")].isNull() && m_image_isValid;
}

QString OAIRunStepDetailsToolCallsCodeOutputImageObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRunStepDetailsToolCallsCodeOutputImageObject::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_image.isSet()) {
        obj.insert(QString("image"), ::OpenAPI::toJsonValue(m_image));
    }
    return obj;
}

QString OAIRunStepDetailsToolCallsCodeOutputImageObject::getType() const {
    return m_type;
}
void OAIRunStepDetailsToolCallsCodeOutputImageObject::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIRunStepDetailsToolCallsCodeOutputImageObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAIRunStepDetailsToolCallsCodeOutputImageObject::is_type_Valid() const{
    return m_type_isValid;
}

OAIRunStepDetailsToolCallsCodeOutputImageObject_image OAIRunStepDetailsToolCallsCodeOutputImageObject::getImage() const {
    return m_image;
}
void OAIRunStepDetailsToolCallsCodeOutputImageObject::setImage(const OAIRunStepDetailsToolCallsCodeOutputImageObject_image &image) {
    m_image = image;
    m_image_isSet = true;
}

bool OAIRunStepDetailsToolCallsCodeOutputImageObject::is_image_Set() const{
    return m_image_isSet;
}

bool OAIRunStepDetailsToolCallsCodeOutputImageObject::is_image_Valid() const{
    return m_image_isValid;
}

bool OAIRunStepDetailsToolCallsCodeOutputImageObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRunStepDetailsToolCallsCodeOutputImageObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && m_image_isValid && true;
}

} // namespace OpenAPI
