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

#include "OAICreateTranscriptionRequest_model.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateTranscriptionRequest_model::OAICreateTranscriptionRequest_model(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateTranscriptionRequest_model::OAICreateTranscriptionRequest_model() {
    this->initializeModel();
}

OAICreateTranscriptionRequest_model::~OAICreateTranscriptionRequest_model() {}

void OAICreateTranscriptionRequest_model::initializeModel() {

}

void OAICreateTranscriptionRequest_model::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateTranscriptionRequest_model::fromJsonObject(QJsonObject json) {

}

QString OAICreateTranscriptionRequest_model::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateTranscriptionRequest_model::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateTranscriptionRequest_model::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateTranscriptionRequest_model::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
