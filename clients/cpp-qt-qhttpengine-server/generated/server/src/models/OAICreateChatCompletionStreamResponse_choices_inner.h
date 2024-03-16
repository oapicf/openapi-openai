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

/*
 * OAICreateChatCompletionStreamResponse_choices_inner.h
 *
 * 
 */

#ifndef OAICreateChatCompletionStreamResponse_choices_inner_H
#define OAICreateChatCompletionStreamResponse_choices_inner_H

#include <QJsonObject>

#include "OAIChatCompletionStreamResponseDelta.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateChatCompletionStreamResponse_choices_inner : public OAIObject {
public:
    OAICreateChatCompletionStreamResponse_choices_inner();
    OAICreateChatCompletionStreamResponse_choices_inner(QString json);
    ~OAICreateChatCompletionStreamResponse_choices_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getIndex() const;
    void setIndex(const qint32 &index);
    bool is_index_Set() const;
    bool is_index_Valid() const;

    OAIChatCompletionStreamResponseDelta getDelta() const;
    void setDelta(const OAIChatCompletionStreamResponseDelta &delta);
    bool is_delta_Set() const;
    bool is_delta_Valid() const;

    QString getFinishReason() const;
    void setFinishReason(const QString &finish_reason);
    bool is_finish_reason_Set() const;
    bool is_finish_reason_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 index;
    bool m_index_isSet;
    bool m_index_isValid;

    OAIChatCompletionStreamResponseDelta delta;
    bool m_delta_isSet;
    bool m_delta_isValid;

    QString finish_reason;
    bool m_finish_reason_isSet;
    bool m_finish_reason_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateChatCompletionStreamResponse_choices_inner)

#endif // OAICreateChatCompletionStreamResponse_choices_inner_H
