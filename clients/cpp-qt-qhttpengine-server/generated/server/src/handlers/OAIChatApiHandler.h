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

#ifndef OAI_OAIChatApiHandler_H
#define OAI_OAIChatApiHandler_H

#include <QObject>

#include "OAICreateChatCompletionRequest.h"
#include "OAICreateChatCompletionResponse.h"
#include <QString>

namespace OpenAPI {

class OAIChatApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIChatApiHandler();
    virtual ~OAIChatApiHandler();


public Q_SLOTS:
    virtual void createChatCompletion(OAICreateChatCompletionRequest oai_create_chat_completion_request);
    

};

}

#endif // OAI_OAIChatApiHandler_H
