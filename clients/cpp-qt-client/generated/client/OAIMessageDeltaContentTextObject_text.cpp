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

#include "OAIMessageDeltaContentTextObject_text.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMessageDeltaContentTextObject_text::OAIMessageDeltaContentTextObject_text(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMessageDeltaContentTextObject_text::OAIMessageDeltaContentTextObject_text() {
    this->initializeModel();
}

OAIMessageDeltaContentTextObject_text::~OAIMessageDeltaContentTextObject_text() {}

void OAIMessageDeltaContentTextObject_text::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;

    m_annotations_isSet = false;
    m_annotations_isValid = false;
}

void OAIMessageDeltaContentTextObject_text::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMessageDeltaContentTextObject_text::fromJsonObject(QJsonObject json) {

    m_value_isValid = ::OpenAPI::fromJsonValue(m_value, json[QString("value")]);
    m_value_isSet = !json[QString("value")].isNull() && m_value_isValid;

    m_annotations_isValid = ::OpenAPI::fromJsonValue(m_annotations, json[QString("annotations")]);
    m_annotations_isSet = !json[QString("annotations")].isNull() && m_annotations_isValid;
}

QString OAIMessageDeltaContentTextObject_text::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMessageDeltaContentTextObject_text::asJsonObject() const {
    QJsonObject obj;
    if (m_value_isSet) {
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(m_value));
    }
    if (m_annotations.size() > 0) {
        obj.insert(QString("annotations"), ::OpenAPI::toJsonValue(m_annotations));
    }
    return obj;
}

QString OAIMessageDeltaContentTextObject_text::getValue() const {
    return m_value;
}
void OAIMessageDeltaContentTextObject_text::setValue(const QString &value) {
    m_value = value;
    m_value_isSet = true;
}

bool OAIMessageDeltaContentTextObject_text::is_value_Set() const{
    return m_value_isSet;
}

bool OAIMessageDeltaContentTextObject_text::is_value_Valid() const{
    return m_value_isValid;
}

QList<OAIMessageDeltaContentTextObject_text_annotations_inner> OAIMessageDeltaContentTextObject_text::getAnnotations() const {
    return m_annotations;
}
void OAIMessageDeltaContentTextObject_text::setAnnotations(const QList<OAIMessageDeltaContentTextObject_text_annotations_inner> &annotations) {
    m_annotations = annotations;
    m_annotations_isSet = true;
}

bool OAIMessageDeltaContentTextObject_text::is_annotations_Set() const{
    return m_annotations_isSet;
}

bool OAIMessageDeltaContentTextObject_text::is_annotations_Valid() const{
    return m_annotations_isValid;
}

bool OAIMessageDeltaContentTextObject_text::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_value_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_annotations.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMessageDeltaContentTextObject_text::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
