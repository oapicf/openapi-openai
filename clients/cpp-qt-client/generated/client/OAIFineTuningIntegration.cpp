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

#include "OAIFineTuningIntegration.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFineTuningIntegration::OAIFineTuningIntegration(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFineTuningIntegration::OAIFineTuningIntegration() {
    this->initializeModel();
}

OAIFineTuningIntegration::~OAIFineTuningIntegration() {}

void OAIFineTuningIntegration::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_wandb_isSet = false;
    m_wandb_isValid = false;
}

void OAIFineTuningIntegration::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFineTuningIntegration::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_wandb_isValid = ::OpenAPI::fromJsonValue(m_wandb, json[QString("wandb")]);
    m_wandb_isSet = !json[QString("wandb")].isNull() && m_wandb_isValid;
}

QString OAIFineTuningIntegration::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFineTuningIntegration::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_wandb.isSet()) {
        obj.insert(QString("wandb"), ::OpenAPI::toJsonValue(m_wandb));
    }
    return obj;
}

QString OAIFineTuningIntegration::getType() const {
    return m_type;
}
void OAIFineTuningIntegration::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIFineTuningIntegration::is_type_Set() const{
    return m_type_isSet;
}

bool OAIFineTuningIntegration::is_type_Valid() const{
    return m_type_isValid;
}

OAICreateFineTuningJobRequest_integrations_inner_wandb OAIFineTuningIntegration::getWandb() const {
    return m_wandb;
}
void OAIFineTuningIntegration::setWandb(const OAICreateFineTuningJobRequest_integrations_inner_wandb &wandb) {
    m_wandb = wandb;
    m_wandb_isSet = true;
}

bool OAIFineTuningIntegration::is_wandb_Set() const{
    return m_wandb_isSet;
}

bool OAIFineTuningIntegration::is_wandb_Valid() const{
    return m_wandb_isValid;
}

bool OAIFineTuningIntegration::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_wandb.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFineTuningIntegration::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_type_isValid && m_wandb_isValid && true;
}

} // namespace OpenAPI
