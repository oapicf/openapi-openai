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

#include "OAICreateFineTuningJobRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateFineTuningJobRequest::OAICreateFineTuningJobRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateFineTuningJobRequest::OAICreateFineTuningJobRequest() {
    this->initializeModel();
}

OAICreateFineTuningJobRequest::~OAICreateFineTuningJobRequest() {}

void OAICreateFineTuningJobRequest::initializeModel() {

    m_model_isSet = false;
    m_model_isValid = false;

    m_training_file_isSet = false;
    m_training_file_isValid = false;

    m_hyperparameters_isSet = false;
    m_hyperparameters_isValid = false;

    m_suffix_isSet = false;
    m_suffix_isValid = false;

    m_validation_file_isSet = false;
    m_validation_file_isValid = false;

    m_integrations_isSet = false;
    m_integrations_isValid = false;

    m_seed_isSet = false;
    m_seed_isValid = false;
}

void OAICreateFineTuningJobRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateFineTuningJobRequest::fromJsonObject(QJsonObject json) {

    m_model_isValid = ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_training_file_isValid = ::OpenAPI::fromJsonValue(training_file, json[QString("training_file")]);
    m_training_file_isSet = !json[QString("training_file")].isNull() && m_training_file_isValid;

    m_hyperparameters_isValid = ::OpenAPI::fromJsonValue(hyperparameters, json[QString("hyperparameters")]);
    m_hyperparameters_isSet = !json[QString("hyperparameters")].isNull() && m_hyperparameters_isValid;

    m_suffix_isValid = ::OpenAPI::fromJsonValue(suffix, json[QString("suffix")]);
    m_suffix_isSet = !json[QString("suffix")].isNull() && m_suffix_isValid;

    m_validation_file_isValid = ::OpenAPI::fromJsonValue(validation_file, json[QString("validation_file")]);
    m_validation_file_isSet = !json[QString("validation_file")].isNull() && m_validation_file_isValid;

    m_integrations_isValid = ::OpenAPI::fromJsonValue(integrations, json[QString("integrations")]);
    m_integrations_isSet = !json[QString("integrations")].isNull() && m_integrations_isValid;

    m_seed_isValid = ::OpenAPI::fromJsonValue(seed, json[QString("seed")]);
    m_seed_isSet = !json[QString("seed")].isNull() && m_seed_isValid;
}

QString OAICreateFineTuningJobRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateFineTuningJobRequest::asJsonObject() const {
    QJsonObject obj;
    if (model.isSet()) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
    if (m_training_file_isSet) {
        obj.insert(QString("training_file"), ::OpenAPI::toJsonValue(training_file));
    }
    if (hyperparameters.isSet()) {
        obj.insert(QString("hyperparameters"), ::OpenAPI::toJsonValue(hyperparameters));
    }
    if (m_suffix_isSet) {
        obj.insert(QString("suffix"), ::OpenAPI::toJsonValue(suffix));
    }
    if (m_validation_file_isSet) {
        obj.insert(QString("validation_file"), ::OpenAPI::toJsonValue(validation_file));
    }
    if (integrations.size() > 0) {
        obj.insert(QString("integrations"), ::OpenAPI::toJsonValue(integrations));
    }
    if (m_seed_isSet) {
        obj.insert(QString("seed"), ::OpenAPI::toJsonValue(seed));
    }
    return obj;
}

OAICreateFineTuningJobRequest_model OAICreateFineTuningJobRequest::getModel() const {
    return model;
}
void OAICreateFineTuningJobRequest::setModel(const OAICreateFineTuningJobRequest_model &model) {
    this->model = model;
    this->m_model_isSet = true;
}

bool OAICreateFineTuningJobRequest::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateFineTuningJobRequest::is_model_Valid() const{
    return m_model_isValid;
}

QString OAICreateFineTuningJobRequest::getTrainingFile() const {
    return training_file;
}
void OAICreateFineTuningJobRequest::setTrainingFile(const QString &training_file) {
    this->training_file = training_file;
    this->m_training_file_isSet = true;
}

bool OAICreateFineTuningJobRequest::is_training_file_Set() const{
    return m_training_file_isSet;
}

bool OAICreateFineTuningJobRequest::is_training_file_Valid() const{
    return m_training_file_isValid;
}

OAICreateFineTuningJobRequest_hyperparameters OAICreateFineTuningJobRequest::getHyperparameters() const {
    return hyperparameters;
}
void OAICreateFineTuningJobRequest::setHyperparameters(const OAICreateFineTuningJobRequest_hyperparameters &hyperparameters) {
    this->hyperparameters = hyperparameters;
    this->m_hyperparameters_isSet = true;
}

bool OAICreateFineTuningJobRequest::is_hyperparameters_Set() const{
    return m_hyperparameters_isSet;
}

bool OAICreateFineTuningJobRequest::is_hyperparameters_Valid() const{
    return m_hyperparameters_isValid;
}

QString OAICreateFineTuningJobRequest::getSuffix() const {
    return suffix;
}
void OAICreateFineTuningJobRequest::setSuffix(const QString &suffix) {
    this->suffix = suffix;
    this->m_suffix_isSet = true;
}

bool OAICreateFineTuningJobRequest::is_suffix_Set() const{
    return m_suffix_isSet;
}

bool OAICreateFineTuningJobRequest::is_suffix_Valid() const{
    return m_suffix_isValid;
}

QString OAICreateFineTuningJobRequest::getValidationFile() const {
    return validation_file;
}
void OAICreateFineTuningJobRequest::setValidationFile(const QString &validation_file) {
    this->validation_file = validation_file;
    this->m_validation_file_isSet = true;
}

bool OAICreateFineTuningJobRequest::is_validation_file_Set() const{
    return m_validation_file_isSet;
}

bool OAICreateFineTuningJobRequest::is_validation_file_Valid() const{
    return m_validation_file_isValid;
}

QList<OAICreateFineTuningJobRequest_integrations_inner> OAICreateFineTuningJobRequest::getIntegrations() const {
    return integrations;
}
void OAICreateFineTuningJobRequest::setIntegrations(const QList<OAICreateFineTuningJobRequest_integrations_inner> &integrations) {
    this->integrations = integrations;
    this->m_integrations_isSet = true;
}

bool OAICreateFineTuningJobRequest::is_integrations_Set() const{
    return m_integrations_isSet;
}

bool OAICreateFineTuningJobRequest::is_integrations_Valid() const{
    return m_integrations_isValid;
}

qint32 OAICreateFineTuningJobRequest::getSeed() const {
    return seed;
}
void OAICreateFineTuningJobRequest::setSeed(const qint32 &seed) {
    this->seed = seed;
    this->m_seed_isSet = true;
}

bool OAICreateFineTuningJobRequest::is_seed_Set() const{
    return m_seed_isSet;
}

bool OAICreateFineTuningJobRequest::is_seed_Valid() const{
    return m_seed_isValid;
}

bool OAICreateFineTuningJobRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (model.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_training_file_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (hyperparameters.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_suffix_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_validation_file_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (integrations.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_seed_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateFineTuningJobRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_model_isValid && m_training_file_isValid && true;
}

} // namespace OpenAPI
