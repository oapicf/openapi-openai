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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIAudioApiHandler.h"
#include "OAIAudioApiRequest.h"

namespace OpenAPI {

OAIAudioApiHandler::OAIAudioApiHandler(){

}

OAIAudioApiHandler::~OAIAudioApiHandler(){

}

void OAIAudioApiHandler::createSpeech(OAICreateSpeechRequest oai_create_speech_request) {
    Q_UNUSED(oai_create_speech_request);
    auto reqObj = qobject_cast<OAIAudioApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIHttpFileElement res;
        reqObj->createSpeechResponse(res);
    }
}
void OAIAudioApiHandler::createTranscription(OAIHttpFileElement file, OAICreateTranscriptionRequest_model model, QString language, QString prompt, QString response_format, double temperature, QList<QString> timestamp_granularities) {
    Q_UNUSED(file);
    Q_UNUSED(model);
    Q_UNUSED(language);
    Q_UNUSED(prompt);
    Q_UNUSED(response_format);
    Q_UNUSED(temperature);
    Q_UNUSED(timestamp_granularities);
    auto reqObj = qobject_cast<OAIAudioApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAICreateTranscription_200_response res;
        reqObj->createTranscriptionResponse(res);
    }
}
void OAIAudioApiHandler::createTranslation(OAIHttpFileElement file, OAICreateTranscriptionRequest_model model, QString prompt, QString response_format, double temperature) {
    Q_UNUSED(file);
    Q_UNUSED(model);
    Q_UNUSED(prompt);
    Q_UNUSED(response_format);
    Q_UNUSED(temperature);
    auto reqObj = qobject_cast<OAIAudioApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAICreateTranslation_200_response res;
        reqObj->createTranslationResponse(res);
    }
}


}
