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
 * OAICreateChatCompletionResponse_choices_inner.h
 *
 * 
 */

#ifndef OAICreateChatCompletionResponse_choices_inner_H
#define OAICreateChatCompletionResponse_choices_inner_H

#include <QJsonObject>

#include "OAIChatCompletionResponseMessage.h"
#include "OAICreateChatCompletionResponse_choices_inner_logprobs.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateChatCompletionResponse_choices_inner : public OAIObject {
public:
    OAICreateChatCompletionResponse_choices_inner();
    OAICreateChatCompletionResponse_choices_inner(QString json);
    ~OAICreateChatCompletionResponse_choices_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getFinishReason() const;
    void setFinishReason(const QString &finish_reason);
    bool is_finish_reason_Set() const;
    bool is_finish_reason_Valid() const;

    qint32 getIndex() const;
    void setIndex(const qint32 &index);
    bool is_index_Set() const;
    bool is_index_Valid() const;

    OAIChatCompletionResponseMessage getMessage() const;
    void setMessage(const OAIChatCompletionResponseMessage &message);
    bool is_message_Set() const;
    bool is_message_Valid() const;

    OAICreateChatCompletionResponse_choices_inner_logprobs getLogprobs() const;
    void setLogprobs(const OAICreateChatCompletionResponse_choices_inner_logprobs &logprobs);
    bool is_logprobs_Set() const;
    bool is_logprobs_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString finish_reason;
    bool m_finish_reason_isSet;
    bool m_finish_reason_isValid;

    qint32 index;
    bool m_index_isSet;
    bool m_index_isValid;

    OAIChatCompletionResponseMessage message;
    bool m_message_isSet;
    bool m_message_isValid;

    OAICreateChatCompletionResponse_choices_inner_logprobs logprobs;
    bool m_logprobs_isSet;
    bool m_logprobs_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateChatCompletionResponse_choices_inner)

#endif // OAICreateChatCompletionResponse_choices_inner_H
