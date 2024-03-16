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

#include "OAICreateFineTuneRequest_model.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateFineTuneRequest_model::OAICreateFineTuneRequest_model(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateFineTuneRequest_model::OAICreateFineTuneRequest_model() {
    this->initializeModel();
}

OAICreateFineTuneRequest_model::~OAICreateFineTuneRequest_model() {}

void OAICreateFineTuneRequest_model::initializeModel() {

}

void OAICreateFineTuneRequest_model::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateFineTuneRequest_model::fromJsonObject(QJsonObject json) {

}

QString OAICreateFineTuneRequest_model::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateFineTuneRequest_model::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICreateFineTuneRequest_model::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICreateFineTuneRequest_model::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
