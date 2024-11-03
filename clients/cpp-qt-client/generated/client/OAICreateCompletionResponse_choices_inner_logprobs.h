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
 * OAICreateCompletionResponse_choices_inner_logprobs.h
 *
 * 
 */

#ifndef OAICreateCompletionResponse_choices_inner_logprobs_H
#define OAICreateCompletionResponse_choices_inner_logprobs_H

#include <QJsonObject>

#include <QList>
#include <QMap>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateCompletionResponse_choices_inner_logprobs : public OAIObject {
public:
    OAICreateCompletionResponse_choices_inner_logprobs();
    OAICreateCompletionResponse_choices_inner_logprobs(QString json);
    ~OAICreateCompletionResponse_choices_inner_logprobs() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<qint32> getTextOffset() const;
    void setTextOffset(const QList<qint32> &text_offset);
    bool is_text_offset_Set() const;
    bool is_text_offset_Valid() const;

    QList<double> getTokenLogprobs() const;
    void setTokenLogprobs(const QList<double> &token_logprobs);
    bool is_token_logprobs_Set() const;
    bool is_token_logprobs_Valid() const;

    QList<QString> getTokens() const;
    void setTokens(const QList<QString> &tokens);
    bool is_tokens_Set() const;
    bool is_tokens_Valid() const;

    QList<QMap<QString, double>> getTopLogprobs() const;
    void setTopLogprobs(const QList<QMap<QString, double>> &top_logprobs);
    bool is_top_logprobs_Set() const;
    bool is_top_logprobs_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<qint32> m_text_offset;
    bool m_text_offset_isSet;
    bool m_text_offset_isValid;

    QList<double> m_token_logprobs;
    bool m_token_logprobs_isSet;
    bool m_token_logprobs_isValid;

    QList<QString> m_tokens;
    bool m_tokens_isSet;
    bool m_tokens_isValid;

    QList<QMap<QString, double>> m_top_logprobs;
    bool m_top_logprobs_isSet;
    bool m_top_logprobs_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateCompletionResponse_choices_inner_logprobs)

#endif // OAICreateCompletionResponse_choices_inner_logprobs_H
