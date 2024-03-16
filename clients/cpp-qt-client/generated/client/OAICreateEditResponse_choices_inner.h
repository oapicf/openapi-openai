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
 * OAICreateEditResponse_choices_inner.h
 *
 * 
 */

#ifndef OAICreateEditResponse_choices_inner_H
#define OAICreateEditResponse_choices_inner_H

#include <QJsonObject>

#include "OAICreateCompletionResponse_choices_inner_logprobs.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICreateCompletionResponse_choices_inner_logprobs;

class OAICreateEditResponse_choices_inner : public OAIObject {
public:
    OAICreateEditResponse_choices_inner();
    OAICreateEditResponse_choices_inner(QString json);
    ~OAICreateEditResponse_choices_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getText() const;
    void setText(const QString &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    qint32 getIndex() const;
    void setIndex(const qint32 &index);
    bool is_index_Set() const;
    bool is_index_Valid() const;

    OAICreateCompletionResponse_choices_inner_logprobs getLogprobs() const;
    void setLogprobs(const OAICreateCompletionResponse_choices_inner_logprobs &logprobs);
    bool is_logprobs_Set() const;
    bool is_logprobs_Valid() const;

    QString getFinishReason() const;
    void setFinishReason(const QString &finish_reason);
    bool is_finish_reason_Set() const;
    bool is_finish_reason_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_text;
    bool m_text_isSet;
    bool m_text_isValid;

    qint32 m_index;
    bool m_index_isSet;
    bool m_index_isValid;

    OAICreateCompletionResponse_choices_inner_logprobs m_logprobs;
    bool m_logprobs_isSet;
    bool m_logprobs_isValid;

    QString m_finish_reason;
    bool m_finish_reason_isSet;
    bool m_finish_reason_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateEditResponse_choices_inner)

#endif // OAICreateEditResponse_choices_inner_H