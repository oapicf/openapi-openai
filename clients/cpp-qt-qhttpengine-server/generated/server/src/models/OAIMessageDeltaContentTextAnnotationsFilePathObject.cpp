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

#include "OAIMessageDeltaContentTextAnnotationsFilePathObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMessageDeltaContentTextAnnotationsFilePathObject::OAIMessageDeltaContentTextAnnotationsFilePathObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMessageDeltaContentTextAnnotationsFilePathObject::OAIMessageDeltaContentTextAnnotationsFilePathObject() {
    this->initializeModel();
}

OAIMessageDeltaContentTextAnnotationsFilePathObject::~OAIMessageDeltaContentTextAnnotationsFilePathObject() {}

void OAIMessageDeltaContentTextAnnotationsFilePathObject::initializeModel() {

    m_index_isSet = false;
    m_index_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_text_isSet = false;
    m_text_isValid = false;

    m_file_path_isSet = false;
    m_file_path_isValid = false;

    m_start_index_isSet = false;
    m_start_index_isValid = false;

    m_end_index_isSet = false;
    m_end_index_isValid = false;
}

void OAIMessageDeltaContentTextAnnotationsFilePathObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMessageDeltaContentTextAnnotationsFilePathObject::fromJsonObject(QJsonObject json) {

    m_index_isValid = ::OpenAPI::fromJsonValue(index, json[QString("index")]);
    m_index_isSet = !json[QString("index")].isNull() && m_index_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_text_isValid = ::OpenAPI::fromJsonValue(text, json[QString("text")]);
    m_text_isSet = !json[QString("text")].isNull() && m_text_isValid;

    m_file_path_isValid = ::OpenAPI::fromJsonValue(file_path, json[QString("file_path")]);
    m_file_path_isSet = !json[QString("file_path")].isNull() && m_file_path_isValid;

    m_start_index_isValid = ::OpenAPI::fromJsonValue(start_index, json[QString("start_index")]);
    m_start_index_isSet = !json[QString("start_index")].isNull() && m_start_index_isValid;

    m_end_index_isValid = ::OpenAPI::fromJsonValue(end_index, json[QString("end_index")]);
    m_end_index_isSet = !json[QString("end_index")].isNull() && m_end_index_isValid;
}

QString OAIMessageDeltaContentTextAnnotationsFilePathObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMessageDeltaContentTextAnnotationsFilePathObject::asJsonObject() const {
    QJsonObject obj;
    if (m_index_isSet) {
        obj.insert(QString("index"), ::OpenAPI::toJsonValue(index));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_text_isSet) {
        obj.insert(QString("text"), ::OpenAPI::toJsonValue(text));
    }
    if (file_path.isSet()) {
        obj.insert(QString("file_path"), ::OpenAPI::toJsonValue(file_path));
    }
    if (m_start_index_isSet) {
        obj.insert(QString("start_index"), ::OpenAPI::toJsonValue(start_index));
    }
    if (m_end_index_isSet) {
        obj.insert(QString("end_index"), ::OpenAPI::toJsonValue(end_index));
    }
    return obj;
}

qint32 OAIMessageDeltaContentTextAnnotationsFilePathObject::getIndex() const {
    return index;
}
void OAIMessageDeltaContentTextAnnotationsFilePathObject::setIndex(const qint32 &index) {
    this->index = index;
    this->m_index_isSet = true;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_index_Set() const{
    return m_index_isSet;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_index_Valid() const{
    return m_index_isValid;
}

QString OAIMessageDeltaContentTextAnnotationsFilePathObject::getType() const {
    return type;
}
void OAIMessageDeltaContentTextAnnotationsFilePathObject::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_type_Set() const{
    return m_type_isSet;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIMessageDeltaContentTextAnnotationsFilePathObject::getText() const {
    return text;
}
void OAIMessageDeltaContentTextAnnotationsFilePathObject::setText(const QString &text) {
    this->text = text;
    this->m_text_isSet = true;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_text_Set() const{
    return m_text_isSet;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_text_Valid() const{
    return m_text_isValid;
}

OAIMessageDeltaContentTextAnnotationsFilePathObject_file_path OAIMessageDeltaContentTextAnnotationsFilePathObject::getFilePath() const {
    return file_path;
}
void OAIMessageDeltaContentTextAnnotationsFilePathObject::setFilePath(const OAIMessageDeltaContentTextAnnotationsFilePathObject_file_path &file_path) {
    this->file_path = file_path;
    this->m_file_path_isSet = true;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_file_path_Set() const{
    return m_file_path_isSet;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_file_path_Valid() const{
    return m_file_path_isValid;
}

qint32 OAIMessageDeltaContentTextAnnotationsFilePathObject::getStartIndex() const {
    return start_index;
}
void OAIMessageDeltaContentTextAnnotationsFilePathObject::setStartIndex(const qint32 &start_index) {
    this->start_index = start_index;
    this->m_start_index_isSet = true;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_start_index_Set() const{
    return m_start_index_isSet;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_start_index_Valid() const{
    return m_start_index_isValid;
}

qint32 OAIMessageDeltaContentTextAnnotationsFilePathObject::getEndIndex() const {
    return end_index;
}
void OAIMessageDeltaContentTextAnnotationsFilePathObject::setEndIndex(const qint32 &end_index) {
    this->end_index = end_index;
    this->m_end_index_isSet = true;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_end_index_Set() const{
    return m_end_index_isSet;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::is_end_index_Valid() const{
    return m_end_index_isValid;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_index_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (file_path.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_start_index_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_end_index_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMessageDeltaContentTextAnnotationsFilePathObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_index_isValid && m_type_isValid && true;
}

} // namespace OpenAPI
