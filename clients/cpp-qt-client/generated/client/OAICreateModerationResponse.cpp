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

#include "OAICreateModerationResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateModerationResponse::OAICreateModerationResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateModerationResponse::OAICreateModerationResponse() {
    this->initializeModel();
}

OAICreateModerationResponse::~OAICreateModerationResponse() {}

void OAICreateModerationResponse::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_model_isSet = false;
    m_model_isValid = false;

    m_results_isSet = false;
    m_results_isValid = false;
}

void OAICreateModerationResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateModerationResponse::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_model_isValid = ::OpenAPI::fromJsonValue(m_model, json[QString("model")]);
    m_model_isSet = !json[QString("model")].isNull() && m_model_isValid;

    m_results_isValid = ::OpenAPI::fromJsonValue(m_results, json[QString("results")]);
    m_results_isSet = !json[QString("results")].isNull() && m_results_isValid;
}

QString OAICreateModerationResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateModerationResponse::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_model_isSet) {
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(m_model));
    }
    if (m_results.size() > 0) {
        obj.insert(QString("results"), ::OpenAPI::toJsonValue(m_results));
    }
    return obj;
}

QString OAICreateModerationResponse::getId() const {
    return m_id;
}
void OAICreateModerationResponse::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAICreateModerationResponse::is_id_Set() const{
    return m_id_isSet;
}

bool OAICreateModerationResponse::is_id_Valid() const{
    return m_id_isValid;
}

QString OAICreateModerationResponse::getModel() const {
    return m_model;
}
void OAICreateModerationResponse::setModel(const QString &model) {
    m_model = model;
    m_model_isSet = true;
}

bool OAICreateModerationResponse::is_model_Set() const{
    return m_model_isSet;
}

bool OAICreateModerationResponse::is_model_Valid() const{
    return m_model_isValid;
}

QList<OAICreateModerationResponse_results_inner> OAICreateModerationResponse::getResults() const {
    return m_results;
}
void OAICreateModerationResponse::setResults(const QList<OAICreateModerationResponse_results_inner> &results) {
    m_results = results;
    m_results_isSet = true;
}

bool OAICreateModerationResponse::is_results_Set() const{
    return m_results_isSet;
}

bool OAICreateModerationResponse::is_results_Valid() const{
    return m_results_isValid;
}

bool OAICreateModerationResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_model_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_results.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateModerationResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_model_isValid && m_results_isValid && true;
}

} // namespace OpenAPI