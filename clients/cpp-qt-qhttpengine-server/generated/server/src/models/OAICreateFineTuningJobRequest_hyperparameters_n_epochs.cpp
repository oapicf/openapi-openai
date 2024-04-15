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

#include "OAICreateFineTuningJobRequest_hyperparameters_n_epochs.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateFineTuningJobRequest_hyperparameters_n_epochs::OAICreateFineTuningJobRequest_hyperparameters_n_epochs(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateFineTuningJobRequest_hyperparameters_n_epochs::OAICreateFineTuningJobRequest_hyperparameters_n_epochs() {
    this->initializeModel();
}

OAICreateFineTuningJobRequest_hyperparameters_n_epochs::~OAICreateFineTuningJobRequest_hyperparameters_n_epochs() {}

void OAICreateFineTuningJobRequest_hyperparameters_n_epochs::initializeModel() {

}

void OAICreateFineTuningJobRequest_hyperparameters_n_epochs::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateFineTuningJobRequest_hyperparameters_n_epochs::fromJsonObject(QJsonObject json) {

}

QString OAICreateFineTuningJobRequest_hyperparameters_n_epochs::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateFineTuningJobRequest_hyperparameters_n_epochs::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateFineTuningJobRequest_hyperparameters_n_epochs::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateFineTuningJobRequest_hyperparameters_n_epochs::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI