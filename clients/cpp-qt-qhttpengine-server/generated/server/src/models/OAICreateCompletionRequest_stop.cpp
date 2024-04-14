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

#include "OAICreateCompletionRequest_stop.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateCompletionRequest_stop::OAICreateCompletionRequest_stop(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateCompletionRequest_stop::OAICreateCompletionRequest_stop() {
    this->initializeModel();
}

OAICreateCompletionRequest_stop::~OAICreateCompletionRequest_stop() {}

void OAICreateCompletionRequest_stop::initializeModel() {

}

void OAICreateCompletionRequest_stop::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateCompletionRequest_stop::fromJsonObject(QJsonObject json) {

}

QString OAICreateCompletionRequest_stop::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateCompletionRequest_stop::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateCompletionRequest_stop::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateCompletionRequest_stop::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI