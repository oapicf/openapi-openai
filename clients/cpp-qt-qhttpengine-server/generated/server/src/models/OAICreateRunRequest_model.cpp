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

#include "OAICreateRunRequest_model.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateRunRequest_model::OAICreateRunRequest_model(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateRunRequest_model::OAICreateRunRequest_model() {
    this->initializeModel();
}

OAICreateRunRequest_model::~OAICreateRunRequest_model() {}

void OAICreateRunRequest_model::initializeModel() {

}

void OAICreateRunRequest_model::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateRunRequest_model::fromJsonObject(QJsonObject json) {

}

QString OAICreateRunRequest_model::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateRunRequest_model::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateRunRequest_model::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateRunRequest_model::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
