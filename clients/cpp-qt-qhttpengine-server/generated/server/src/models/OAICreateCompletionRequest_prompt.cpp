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

#include "OAICreateCompletionRequest_prompt.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateCompletionRequest_prompt::OAICreateCompletionRequest_prompt(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateCompletionRequest_prompt::OAICreateCompletionRequest_prompt() {
    this->initializeModel();
}

OAICreateCompletionRequest_prompt::~OAICreateCompletionRequest_prompt() {}

void OAICreateCompletionRequest_prompt::initializeModel() {

}

void OAICreateCompletionRequest_prompt::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateCompletionRequest_prompt::fromJsonObject(QJsonObject json) {

}

QString OAICreateCompletionRequest_prompt::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateCompletionRequest_prompt::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateCompletionRequest_prompt::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateCompletionRequest_prompt::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI