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

#include "OAICreateSpeechRequest_model.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateSpeechRequest_model::OAICreateSpeechRequest_model(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateSpeechRequest_model::OAICreateSpeechRequest_model() {
    this->initializeModel();
}

OAICreateSpeechRequest_model::~OAICreateSpeechRequest_model() {}

void OAICreateSpeechRequest_model::initializeModel() {

}

void OAICreateSpeechRequest_model::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateSpeechRequest_model::fromJsonObject(QJsonObject json) {

}

QString OAICreateSpeechRequest_model::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateSpeechRequest_model::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateSpeechRequest_model::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateSpeechRequest_model::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
