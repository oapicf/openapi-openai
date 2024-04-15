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

#include "OAIAssistantObject.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAssistantObject::OAIAssistantObject(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAssistantObject::OAIAssistantObject() {
    this->initializeModel();
}

OAIAssistantObject::~OAIAssistantObject() {}

void OAIAssistantObject::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_instructions_isSet = false;
    m_instructions_isValid = false;

    m_tools_isSet = false;
    m_tools_isValid = false;

    m_file_ids_isSet = false;
    m_file_ids_isValid = false;

    m_metadata_isSet = false;
    m_metadata_isValid = false;
}

void OAIAssistantObject::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAssistantObject::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(m_created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(m_description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_instructions_isValid = ::OpenAPI::fromJsonValue(m_instructions, json[QString("instructions")]);
    m_instructions_isSet = !json[QString("instructions")].isNull() && m_instructions_isValid;

    m_tools_isValid = ::OpenAPI::fromJsonValue(m_tools, json[QString("tools")]);
    m_tools_isSet = !json[QString("tools")].isNull() && m_tools_isValid;

    m_file_ids_isValid = ::OpenAPI::fromJsonValue(m_file_ids, json[QString("file_ids")]);
    m_file_ids_isSet = !json[QString("file_ids")].isNull() && m_file_ids_isValid;

    m_metadata_isValid = ::OpenAPI::fromJsonValue(m_metadata, json[QString("metadata")]);
    m_metadata_isSet = !json[QString("metadata")].isNull() && m_metadata_isValid;
}

QString OAIAssistantObject::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAssistantObject::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_object_isSet) {
        obj.insert(QString("object"), ::OpenAPI::toJsonValue(m_object));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("created_at"), ::OpenAPI::toJsonValue(m_created_at));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(m_description));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_instructions_isSet) {
        obj.insert(QString("instructions"), ::OpenAPI::toJsonValue(m_instructions));
    }
    if (m_tools.size() > 0) {
        obj.insert(QString("tools"), ::OpenAPI::toJsonValue(m_tools));
    }
    if (m_file_ids.size() > 0) {
        obj.insert(QString("file_ids"), ::OpenAPI::toJsonValue(m_file_ids));
    }
    if (m_metadata_isSet) {
        obj.insert(QString("metadata"), ::OpenAPI::toJsonValue(m_metadata));
    }
    return obj;
}

QString OAIAssistantObject::getId() const {
    return m_id;
}
void OAIAssistantObject::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIAssistantObject::is_id_Set() const{
    return m_id_isSet;
}

bool OAIAssistantObject::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIAssistantObject::getObject() const {
    return m_object;
}
void OAIAssistantObject::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAIAssistantObject::is_object_Set() const{
    return m_object_isSet;
}

bool OAIAssistantObject::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIAssistantObject::getCreatedAt() const {
    return m_created_at;
}
void OAIAssistantObject::setCreatedAt(const qint32 &created_at) {
    m_created_at = created_at;
    m_created_at_isSet = true;
}

bool OAIAssistantObject::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIAssistantObject::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIAssistantObject::getName() const {
    return m_name;
}
void OAIAssistantObject::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAIAssistantObject::is_name_Set() const{
    return m_name_isSet;
}

bool OAIAssistantObject::is_name_Valid() const{
    return m_name_isValid;
}

QString OAIAssistantObject::getDescription() const {
    return m_description;
}
void OAIAssistantObject::setDescription(const QString &description) {
    m_description = description;
    m_description_isSet = true;
}

bool OAIAssistantObject::is_description_Set() const{
    return m_description_isSet;
}

bool OAIAssistantObject::is_description_Valid() const{
    return m_description_isValid;
}

QString OAIAssistantObject::getModel() const {
    return m_model;
}
void OAIAssistantObject::setModel(const QString &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAIAssistantObject::is_model_Set() const{
    return m_model_isSet;
}

bool OAIAssistantObject::is_model_Valid() const{
    return m_model_isValid;
}

QString OAIAssistantObject::getInstructions() const {
    return m_instructions;
}
void OAIAssistantObject::setInstructions(const QString &instructions) {
    m_instructions = instructions;
    m_instructions_isSet = true;
}

bool OAIAssistantObject::is_instructions_Set() const{
    return m_instructions_isSet;
}

bool OAIAssistantObject::is_instructions_Valid() const{
    return m_instructions_isValid;
}

QList<OAIAssistantObject_tools_inner> OAIAssistantObject::getTools() const {
    return m_tools;
}
void OAIAssistantObject::setTools(const QList<OAIAssistantObject_tools_inner> &tools) {
    m_tools = tools;
    m_tools_isSet = true;
}

bool OAIAssistantObject::is_tools_Set() const{
    return m_tools_isSet;
}

bool OAIAssistantObject::is_tools_Valid() const{
    return m_tools_isValid;
}

QList<QString> OAIAssistantObject::getFileIds() const {
    return m_file_ids;
}
void OAIAssistantObject::setFileIds(const QList<QString> &file_ids) {
    m_file_ids = file_ids;
    m_file_ids_isSet = true;
}

bool OAIAssistantObject::is_file_ids_Set() const{
    return m_file_ids_isSet;
}

bool OAIAssistantObject::is_file_ids_Valid() const{
    return m_file_ids_isValid;
}

OAIObject OAIAssistantObject::getMetadata() const {
    return m_metadata;
}
void OAIAssistantObject::setMetadata(const OAIObject &metadata) {
    m_metadata = metadata;
    m_metadata_isSet = true;
}

bool OAIAssistantObject::is_metadata_Set() const{
    return m_metadata_isSet;
}

bool OAIAssistantObject::is_metadata_Valid() const{
    return m_metadata_isValid;
}

bool OAIAssistantObject::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_object_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_at_isSet) {
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

        if (m_model_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_instructions_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_tools.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_file_ids.size() > 0) {
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

bool OAIAssistantObject::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_at_isValid && m_name_isValid && m_description_isValid && m_model_isValid && m_instructions_isValid && m_tools_isValid && m_file_ids_isValid && m_metadata_isValid && true;
}

} // namespace OpenAPI