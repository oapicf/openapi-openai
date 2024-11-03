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

#include "OAISubmitToolOutputsRunRequest.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISubmitToolOutputsRunRequest::OAISubmitToolOutputsRunRequest(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISubmitToolOutputsRunRequest::OAISubmitToolOutputsRunRequest() {
    this->initializeModel();
}

OAISubmitToolOutputsRunRequest::~OAISubmitToolOutputsRunRequest() {}

void OAISubmitToolOutputsRunRequest::initializeModel() {

    m_tool_outputs_isSet = false;
    m_tool_outputs_isValid = false;

    m_stream_isSet = false;
    m_stream_isValid = false;
}

void OAISubmitToolOutputsRunRequest::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISubmitToolOutputsRunRequest::fromJsonObject(QJsonObject json) {

    m_tool_outputs_isValid = ::OpenAPI::fromJsonValue(tool_outputs, json[QString("tool_outputs")]);
    m_tool_outputs_isSet = !json[QString("tool_outputs")].isNull() && m_tool_outputs_isValid;

    m_stream_isValid = ::OpenAPI::fromJsonValue(stream, json[QString("stream")]);
    m_stream_isSet = !json[QString("stream")].isNull() && m_stream_isValid;
}

QString OAISubmitToolOutputsRunRequest::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISubmitToolOutputsRunRequest::asJsonObject() const {
    QJsonObject obj;
    if (tool_outputs.size() > 0) {
        obj.insert(QString("tool_outputs"), ::OpenAPI::toJsonValue(tool_outputs));
    }
    if (m_stream_isSet) {
        obj.insert(QString("stream"), ::OpenAPI::toJsonValue(stream));
    }
    return obj;
}

QList<OAISubmitToolOutputsRunRequest_tool_outputs_inner> OAISubmitToolOutputsRunRequest::getToolOutputs() const {
    return tool_outputs;
}
void OAISubmitToolOutputsRunRequest::setToolOutputs(const QList<OAISubmitToolOutputsRunRequest_tool_outputs_inner> &tool_outputs) {
    this->tool_outputs = tool_outputs;
    this->m_tool_outputs_isSet = true;
}

bool OAISubmitToolOutputsRunRequest::is_tool_outputs_Set() const{
    return m_tool_outputs_isSet;
}

bool OAISubmitToolOutputsRunRequest::is_tool_outputs_Valid() const{
    return m_tool_outputs_isValid;
}

bool OAISubmitToolOutputsRunRequest::isStream() const {
    return stream;
}
void OAISubmitToolOutputsRunRequest::setStream(const bool &stream) {
    this->stream = stream;
    this->m_stream_isSet = true;
}

bool OAISubmitToolOutputsRunRequest::is_stream_Set() const{
    return m_stream_isSet;
}

bool OAISubmitToolOutputsRunRequest::is_stream_Valid() const{
    return m_stream_isValid;
}

bool OAISubmitToolOutputsRunRequest::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (tool_outputs.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_stream_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISubmitToolOutputsRunRequest::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_tool_outputs_isValid && true;
}

} // namespace OpenAPI
