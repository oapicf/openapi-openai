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

#include "OAIModifyAssistantRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIModifyAssistantRequest::OAIModifyAssistantRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIModifyAssistantRequest::OAIModifyAssistantRequest() {
    this->initializeModel();
}

OAIModifyAssistantRequest::~OAIModifyAssistantRequest() {}

void OAIModifyAssistantRequest::initializeModel() {

    m_model_isSet = false;
    m_model_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_instructions_isSet = false;
    m_instructions_isValid = false;

    m_tools_isSet = false;
    m_tools_isValid = false;

    m_file_ids_isSet = false;
    m_file_ids_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;
}

void OAIModifyAssistantRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIModifyAssistantRequest::fromJsonObject(QJsonObject json) {

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_instructions_isValid = ::OpenAPI::fromJsonValue(instructions, json[QString("instructions")]);
    m_instructions_isSet = !json[QString("instructions")].isNull() && m_instructions_isValid;

    m_tools_isValid = ::OpenAPI::fromJsonValue(tools, json[QString("tools")]);
    m_tools_isSet = !json[QString("tools")].isNull() && m_tools_isValid;

    m_file_ids_isValid = ::OpenAPI::fromJsonValue(file_ids, json[QString("file_ids")]);
    m_file_ids_isSet = !json[QString("file_ids")].isNull() && m_file_ids_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;
}

QString OAIModifyAssistantRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIModifyAssistantRequest::asJsonObject() const {
    QJsonObject obj;
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_instructions_isSet) {
        obj.insert(QString("instructions"), ::OpenAPI::toJsonValue(instructions));
    }
    if (tools.size() > 0) {
        obj.insert(QString("tools"), ::OpenAPI::toJsonValue(tools));
    }
    if (file_ids.size() > 0) {
        obj.insert(QString("file_ids"), ::OpenAPI::toJsonValue(file_ids));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(metadata));
    }
    return obj;
}

QString OAIModifyAssistantRequest::getModel() const {
    return model;
}
void OAIModifyAssistantRequest::setModel(const QString &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAIModifyAssistantRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAIModifyAssistantRequest::is_model_Valid() const{
    return m_model_isValid;
}

QString OAIModifyAssistantRequest::getName() const {
    return name;
}
void OAIModifyAssistantRequest::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIModifyAssistantRequest::is_name_Set() const{
    return m_name_isSet;
}

bool OAIModifyAssistantRequest::is_name_Valid() const{
    return m_name_isValid;
}

QString OAIModifyAssistantRequest::getDescription() const {
    return description;
}
void OAIModifyAssistantRequest::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAIModifyAssistantRequest::is_description_Set() const{
    return m_description_isSet;
}

bool OAIModifyAssistantRequest::is_description_Valid() const{
    return m_description_isValid;
}

QString OAIModifyAssistantRequest::getInstructions() const {
    return instructions;
}
void OAIModifyAssistantRequest::setInstructions(const QString &instructions) {
    this->instructions = instructions;
    this->m_instructions_isSet = true;
}

bool OAIModifyAssistantRequest::is_instructions_Set() const{
    return m_instructions_isSet;
}

bool OAIModifyAssistantRequest::is_instructions_Valid() const{
    return m_instructions_isValid;
}

QList<OAIAssistantObject_tools_inner> OAIModifyAssistantRequest::getTools() const {
    return tools;
}
void OAIModifyAssistantRequest::setTools(const QList<OAIAssistantObject_tools_inner> &tools) {
    this->tools = tools;
    this->m_tools_isSet = true;
}

bool OAIModifyAssistantRequest::is_tools_Set() const{
    return m_tools_isSet;
}

bool OAIModifyAssistantRequest::is_tools_Valid() const{
    return m_tools_isValid;
}

QList<QString> OAIModifyAssistantRequest::getFileIds() const {
    return file_ids;
}
void OAIModifyAssistantRequest::setFileIds(const QList<QString> &file_ids) {
    this->file_ids = file_ids;
    this->m_file_ids_isSet = true;
}

bool OAIModifyAssistantRequest::is_file_ids_Set() const{
    return m_file_ids_isSet;
}

bool OAIModifyAssistantRequest::is_file_ids_Valid() const{
    return m_file_ids_isValid;
}

OAIObject OAIModifyAssistantRequest::getMetadata() const {
    return metadata;
}
void OAIModifyAssistantRequest::setMetadata(const OAIObject &metadata) {
    this->metadata = metadata;
    this->m_metadata_isSet = true;
}

bool OAIModifyAssistantRequest::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAIModifyAssistantRequest::is_metadata_Valid() const{
    return m_metadata_isValid;
}

bool OAIModifyAssistantRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_model_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_instructions_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (tools.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (file_ids.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_metadata_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIModifyAssistantRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
