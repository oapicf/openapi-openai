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

#include "OAIMessageContentTextAnnotationsFilePathObject_file_path.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMessageContentTextAnnotationsFilePathObject_file_path::OAIMessageContentTextAnnotationsFilePathObject_file_path(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMessageContentTextAnnotationsFilePathObject_file_path::OAIMessageContentTextAnnotationsFilePathObject_file_path() {
    this->initializeModel();
}

OAIMessageContentTextAnnotationsFilePathObject_file_path::~OAIMessageContentTextAnnotationsFilePathObject_file_path() {}

void OAIMessageContentTextAnnotationsFilePathObject_file_path::initializeModel() {

    m_file_id_isSet = false;
    m_file_id_isValid = false;
}

void OAIMessageContentTextAnnotationsFilePathObject_file_path::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMessageContentTextAnnotationsFilePathObject_file_path::fromJsonObject(QJsonObject json) {

    m_file_id_isValid = ::OpenAPI::fromJsonValue(file_id, json[QString("file_id")]);
    m_file_id_isSet = !json[QString("file_id")].isNull() && m_file_id_isValid;
}

QString OAIMessageContentTextAnnotationsFilePathObject_file_path::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMessageContentTextAnnotationsFilePathObject_file_path::asJsonObject() const {
    QJsonObject obj;
    if (m_file_id_isSet) {
        obj.insert(QString("file_id"), ::OpenAPI::toJsonValue(file_id));
    }
    return obj;
}

QString OAIMessageContentTextAnnotationsFilePathObject_file_path::getFileId() const {
    return file_id;
}
void OAIMessageContentTextAnnotationsFilePathObject_file_path::setFileId(const QString &file_id) {
    this->file_id = file_id;
    this->m_file_id_isSet = true;
}

bool OAIMessageContentTextAnnotationsFilePathObject_file_path::is_file_id_Set() const{
    return m_file_id_isSet;
}

bool OAIMessageContentTextAnnotationsFilePathObject_file_path::is_file_id_Valid() const{
    return m_file_id_isValid;
}

bool OAIMessageContentTextAnnotationsFilePathObject_file_path::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_file_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMessageContentTextAnnotationsFilePathObject_file_path::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_file_id_isValid && true;
}

} // namespace OpenAPI
