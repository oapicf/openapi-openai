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

#include "OAIMessageContentTextObject_text.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMessageContentTextObject_text::OAIMessageContentTextObject_text(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMessageContentTextObject_text::OAIMessageContentTextObject_text() {
    this->initializeModel();
}

OAIMessageContentTextObject_text::~OAIMessageContentTextObject_text() {}

void OAIMessageContentTextObject_text::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;

    m_annotations_isSet = false;
    m_annotations_isValid = false;
}

void OAIMessageContentTextObject_text::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMessageContentTextObject_text::fromJsonObject(QJsonObject json) {

    m_value_isValid = ::OpenAPI::fromJsonValue(value, json[QString("value")]);
    m_value_isSet = !json[QString("value")].isNull() && m_value_isValid;

    m_annotations_isValid = ::OpenAPI::fromJsonValue(annotations, json[QString("annotations")]);
    m_annotations_isSet = !json[QString("annotations")].isNull() && m_annotations_isValid;
}

QString OAIMessageContentTextObject_text::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMessageContentTextObject_text::asJsonObject() const {
    QJsonObject obj;
    if (m_value_isSet) {
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(value));
    }
    if (annotations.size() > 0) {
        obj.insert(QString("annotations"), ::OpenAPI::toJsonValue(annotations));
    }
    return obj;
}

QString OAIMessageContentTextObject_text::getValue() const {
    return value;
}
void OAIMessageContentTextObject_text::setValue(const QString &value) {
    this->value = value;
    this->m_value_isSet = true;
}

bool OAIMessageContentTextObject_text::is_value_Set() const{
    return m_value_isSet;
}

bool OAIMessageContentTextObject_text::is_value_Valid() const{
    return m_value_isValid;
}

QList<OAIMessageContentTextObject_text_annotations_inner> OAIMessageContentTextObject_text::getAnnotations() const {
    return annotations;
}
void OAIMessageContentTextObject_text::setAnnotations(const QList<OAIMessageContentTextObject_text_annotations_inner> &annotations) {
    this->annotations = annotations;
    this->m_annotations_isSet = true;
}

bool OAIMessageContentTextObject_text::is_annotations_Set() const{
    return m_annotations_isSet;
}

bool OAIMessageContentTextObject_text::is_annotations_Valid() const{
    return m_annotations_isValid;
}

bool OAIMessageContentTextObject_text::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_value_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (annotations.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMessageContentTextObject_text::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid && m_annotations_isValid && true;
}

} // namespace OpenAPI
