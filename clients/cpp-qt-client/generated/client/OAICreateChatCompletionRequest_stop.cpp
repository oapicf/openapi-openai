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

#include "OAICreateChatCompletionRequest_stop.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateChatCompletionRequest_stop::OAICreateChatCompletionRequest_stop(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateChatCompletionRequest_stop::OAICreateChatCompletionRequest_stop() {
    this->initializeModel();
}

OAICreateChatCompletionRequest_stop::~OAICreateChatCompletionRequest_stop() {}

void OAICreateChatCompletionRequest_stop::initializeModel() {

}

void OAICreateChatCompletionRequest_stop::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateChatCompletionRequest_stop::fromJsonObject(QJsonObject json) {

}

QString OAICreateChatCompletionRequest_stop::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateChatCompletionRequest_stop::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateChatCompletionRequest_stop::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateChatCompletionRequest_stop::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI