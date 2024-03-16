/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIFineTune.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFineTune::OAIFineTune(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFineTune::OAIFineTune() {
    this->initializeModel();
}

OAIFineTune::~OAIFineTune() {}

void OAIFineTune::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_object_isSet = false;
    m_object_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_updated_at_isSet = false;
    m_updated_at_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_fine_tuned_model_isSet = false;
    m_fine_tuned_model_isValid = false;

    m_organization_id_isSet = false;
    m_organization_id_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_hyperparams_isSet = false;
    m_hyperparams_isValid = false;

    m_training_files_isSet = false;
    m_training_files_isValid = false;

    m_validation_files_isSet = false;
    m_validation_files_isValid = false;

    m_result_files_isSet = false;
    m_result_files_isValid = false;

    m_events_isSet = false;
    m_events_isValid = false;
}

void OAIFineTune::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFineTune::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_object_isValid = ::OpenAPI::fromJsonValue(m_object, json[QString("object")]);
    m_object_isSet = !json[QString("object")].isNull() && m_object_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(m_created_at, json[QString("created_at")]);
    m_created_at_isSet = !json[QString("created_at")].isNull() && m_created_at_isValid;

    m_updated_at_isValid = ::OpenAPI::fromJsonValue(m_updated_at, json[QString("updated_at")]);
    m_updated_at_isSet = !json[QString("updated_at")].isNull() && m_updated_at_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_fine_tuned_model_isValid = ::OpenAPI::fromJsonValue(m_fine_tuned_model, json[QString("fine_tuned_model")]);
    m_fine_tuned_model_isSet = !json[QString("fine_tuned_model")].isNull() && m_fine_tuned_model_isValid;

    m_organization_id_isValid = ::OpenAPI::fromJsonValue(m_organization_id, json[QString("organization_id")]);
    m_organization_id_isSet = !json[QString("organization_id")].isNull() && m_organization_id_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(m_status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_hyperparams_isValid = ::OpenAPI::fromJsonValue(m_hyperparams, json[QString("hyperparams")]);
    m_hyperparams_isSet = !json[QString("hyperparams")].isNull() && m_hyperparams_isValid;

    m_training_files_isValid = ::OpenAPI::fromJsonValue(m_training_files, json[QString("training_files")]);
    m_training_files_isSet = !json[QString("training_files")].isNull() && m_training_files_isValid;

    m_validation_files_isValid = ::OpenAPI::fromJsonValue(m_validation_files, json[QString("validation_files")]);
    m_validation_files_isSet = !json[QString("validation_files")].isNull() && m_validation_files_isValid;

    m_result_files_isValid = ::OpenAPI::fromJsonValue(m_result_files, json[QString("result_files")]);
    m_result_files_isSet = !json[QString("result_files")].isNull() && m_result_files_isValid;

    m_events_isValid = ::OpenAPI::fromJsonValue(m_events, json[QString("events")]);
    m_events_isSet = !json[QString("events")].isNull() && m_events_isValid;
}

QString OAIFineTune::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFineTune::asJsonObject() const {
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
    if (m_updated_at_isSet) {
        obj.insert(QString("updated_at"), ::OpenAPI::toJsonValue(m_updated_at));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_fine_tuned_model_isSet) {
        obj.insert(QString("fine_tuned_model"), ::OpenAPI::toJsonValue(m_fine_tuned_model));
    }
    if (m_organization_id_isSet) {
        obj.insert(QString("organization_id"), ::OpenAPI::toJsonValue(m_organization_id));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(m_status));
    }
    if (m_hyperparams_isSet) {
        obj.insert(QString("hyperparams"), ::OpenAPI::toJsonValue(m_hyperparams));
    }
    if (m_training_files.size() > 0) {
        obj.insert(QString("training_files"), ::OpenAPI::toJsonValue(m_training_files));
    }
    if (m_validation_files.size() > 0) {
        obj.insert(QString("validation_files"), ::OpenAPI::toJsonValue(m_validation_files));
    }
    if (m_result_files.size() > 0) {
        obj.insert(QString("result_files"), ::OpenAPI::toJsonValue(m_result_files));
    }
    if (m_events.size() > 0) {
        obj.insert(QString("events"), ::OpenAPI::toJsonValue(m_events));
    }
    return obj;
}

QString OAIFineTune::getId() const {
    return m_id;
}
void OAIFineTune::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIFineTune::is_id_Set() const{
    return m_id_isSet;
}

bool OAIFineTune::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIFineTune::getObject() const {
    return m_object;
}
void OAIFineTune::setObject(const QString &object) {
    m_object = object;
    m_object_isSet = true;
}

bool OAIFineTune::is_object_Set() const{
    return m_object_isSet;
}

bool OAIFineTune::is_object_Valid() const{
    return m_object_isValid;
}

qint32 OAIFineTune::getCreatedAt() const {
    return m_created_at;
}
void OAIFineTune::setCreatedAt(const qint32 &created_at) {
    m_created_at = created_at;
    m_created_at_isSet = true;
}

bool OAIFineTune::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIFineTune::is_created_at_Valid() const{
    return m_created_at_isValid;
}

qint32 OAIFineTune::getUpdatedAt() const {
    return m_updated_at;
}
void OAIFineTune::setUpdatedAt(const qint32 &updated_at) {
    m_updated_at = updated_at;
    m_updated_at_isSet = true;
}

bool OAIFineTune::is_updated_at_Set() const{
    return m_updated_at_isSet;
}

bool OAIFineTune::is_updated_at_Valid() const{
    return m_updated_at_isValid;
}

QString OAIFineTune::getModel() const {
    return m_model;
}
void OAIFineTune::setModel(const QString &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAIFineTune::is_model_Set() const{
    return m_model_isSet;
}

bool OAIFineTune::is_model_Valid() const{
    return m_model_isValid;
}

QString OAIFineTune::getFineTunedModel() const {
    return m_fine_tuned_model;
}
void OAIFineTune::setFineTunedModel(const QString &fine_tuned_model) {
    m_fine_tuned_model = fine_tuned_model;
    m_fine_tuned_model_isSet = true;
}

bool OAIFineTune::is_fine_tuned_model_Set() const{
    return m_fine_tuned_model_isSet;
}

bool OAIFineTune::is_fine_tuned_model_Valid() const{
    return m_fine_tuned_model_isValid;
}

QString OAIFineTune::getOrganizationId() const {
    return m_organization_id;
}
void OAIFineTune::setOrganizationId(const QString &organization_id) {
    m_organization_id = organization_id;
    m_organization_id_isSet = true;
}

bool OAIFineTune::is_organization_id_Set() const{
    return m_organization_id_isSet;
}

bool OAIFineTune::is_organization_id_Valid() const{
    return m_organization_id_isValid;
}

QString OAIFineTune::getStatus() const {
    return m_status;
}
void OAIFineTune::setStatus(const QString &status) {
    m_status = status;
    m_status_isSet = true;
}

bool OAIFineTune::is_status_Set() const{
    return m_status_isSet;
}

bool OAIFineTune::is_status_Valid() const{
    return m_status_isValid;
}

OAIObject OAIFineTune::getHyperparams() const {
    return m_hyperparams;
}
void OAIFineTune::setHyperparams(const OAIObject &hyperparams) {
    m_hyperparams = hyperparams;
    m_hyperparams_isSet = true;
}

bool OAIFineTune::is_hyperparams_Set() const{
    return m_hyperparams_isSet;
}

bool OAIFineTune::is_hyperparams_Valid() const{
    return m_hyperparams_isValid;
}

QList<OAIOpenAIFile> OAIFineTune::getTrainingFiles() const {
    return m_training_files;
}
void OAIFineTune::setTrainingFiles(const QList<OAIOpenAIFile> &training_files) {
    m_training_files = training_files;
    m_training_files_isSet = true;
}

bool OAIFineTune::is_training_files_Set() const{
    return m_training_files_isSet;
}

bool OAIFineTune::is_training_files_Valid() const{
    return m_training_files_isValid;
}

QList<OAIOpenAIFile> OAIFineTune::getValidationFiles() const {
    return m_validation_files;
}
void OAIFineTune::setValidationFiles(const QList<OAIOpenAIFile> &validation_files) {
    m_validation_files = validation_files;
    m_validation_files_isSet = true;
}

bool OAIFineTune::is_validation_files_Set() const{
    return m_validation_files_isSet;
}

bool OAIFineTune::is_validation_files_Valid() const{
    return m_validation_files_isValid;
}

QList<OAIOpenAIFile> OAIFineTune::getResultFiles() const {
    return m_result_files;
}
void OAIFineTune::setResultFiles(const QList<OAIOpenAIFile> &result_files) {
    m_result_files = result_files;
    m_result_files_isSet = true;
}

bool OAIFineTune::is_result_files_Set() const{
    return m_result_files_isSet;
}

bool OAIFineTune::is_result_files_Valid() const{
    return m_result_files_isValid;
}

QList<OAIFineTuneEvent> OAIFineTune::getEvents() const {
    return m_events;
}
void OAIFineTune::setEvents(const QList<OAIFineTuneEvent> &events) {
    m_events = events;
    m_events_isSet = true;
}

bool OAIFineTune::is_events_Set() const{
    return m_events_isSet;
}

bool OAIFineTune::is_events_Valid() const{
    return m_events_isValid;
}

bool OAIFineTune::isSet() const {
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

        if (m_updated_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_model_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_fine_tuned_model_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_organization_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_hyperparams_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_training_files.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_validation_files.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_result_files.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_events.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFineTune::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_object_isValid && m_created_at_isValid && m_updated_at_isValid && m_model_isValid && m_fine_tuned_model_isValid && m_organization_id_isValid && m_status_isValid && m_hyperparams_isValid && m_training_files_isValid && m_validation_files_isValid && m_result_files_isValid && true;
}

} // namespace OpenAPI
