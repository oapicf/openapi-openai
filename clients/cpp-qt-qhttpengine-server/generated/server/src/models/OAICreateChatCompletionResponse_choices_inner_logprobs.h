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

/*
 * OAICreateChatCompletionResponse_choices_inner_logprobs.h
 *
 * Log probability information for the choice.
 */

#ifndef OAICreateChatCompletionResponse_choices_inner_logprobs_H
#define OAICreateChatCompletionResponse_choices_inner_logprobs_H

#include <QJsonObject>

#include "OAIChatCompletionTokenLogprob.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateChatCompletionResponse_choices_inner_logprobs : public OAIObject {
public:
    OAICreateChatCompletionResponse_choices_inner_logprobs();
    OAICreateChatCompletionResponse_choices_inner_logprobs(QString json);
    ~OAICreateChatCompletionResponse_choices_inner_logprobs() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIChatCompletionTokenLogprob> getContent() const;
    void setContent(const QList<OAIChatCompletionTokenLogprob> &content);
    bool is_content_Set() const;
    bool is_content_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIChatCompletionTokenLogprob> content;
    bool m_content_isSet;
    bool m_content_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateChatCompletionResponse_choices_inner_logprobs)

#endif // OAICreateChatCompletionResponse_choices_inner_logprobs_H
