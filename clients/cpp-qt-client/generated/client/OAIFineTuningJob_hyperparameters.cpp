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

#include "OAIFineTuningJob_hyperparameters.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFineTuningJob_hyperparameters::OAIFineTuningJob_hyperparameters(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFineTuningJob_hyperparameters::OAIFineTuningJob_hyperparameters() {
    this->initializeModel();
}

OAIFineTuningJob_hyperparameters::~OAIFineTuningJob_hyperparameters() {}

void OAIFineTuningJob_hyperparameters::initializeModel() {

    m_n_epochs_isSet = false;
    m_n_epochs_isValid = false;
}

void OAIFineTuningJob_hyperparameters::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFineTuningJob_hyperparameters::fromJsonObject(QJsonObject json) {

    m_n_epochs_isValid = ::OpenAPI::fromJsonValue(m_n_epochs, json[QString("n_epochs")]);
    m_n_epochs_isSet = !json[QString("n_epochs")].isNull() && m_n_epochs_isValid;
}

QString OAIFineTuningJob_hyperparameters::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFineTuningJob_hyperparameters::asJsonObject() const {
    QJsonObject obj;
    if (m_n_epochs.isSet()) {
        obj.insert(QString("n_epochs"), ::OpenAPI::toJsonValue(m_n_epochs));
    }
    return obj;
}

OAIFineTuningJob_hyperparameters_n_epochs OAIFineTuningJob_hyperparameters::getNEpochs() const {
    return m_n_epochs;
}
void OAIFineTuningJob_hyperparameters::setNEpochs(const OAIFineTuningJob_hyperparameters_n_epochs &n_epochs) {
    m_n_epochs = n_epochs;
    m_n_epochs_isSet = true;
}

bool OAIFineTuningJob_hyperparameters::is_n_epochs_Set() const{
    return m_n_epochs_isSet;
}

bool OAIFineTuningJob_hyperparameters::is_n_epochs_Valid() const{
    return m_n_epochs_isValid;
}

bool OAIFineTuningJob_hyperparameters::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_n_epochs.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFineTuningJob_hyperparameters::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_n_epochs_isValid && true;
}

} // namespace OpenAPI
