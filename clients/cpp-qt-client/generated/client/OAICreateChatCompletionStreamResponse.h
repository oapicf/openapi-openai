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
 * OAICreateChatCompletionStreamResponse.h
 *
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */

#ifndef OAICreateChatCompletionStreamResponse_H
#define OAICreateChatCompletionStreamResponse_H

#include <QJsonObject>

#include "OAICreateChatCompletionStreamResponse_choices_inner.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICreateChatCompletionStreamResponse_choices_inner;

class OAICreateChatCompletionStreamResponse : public OAIObject {
public:
    OAICreateChatCompletionStreamResponse();
    OAICreateChatCompletionStreamResponse(QString json);
    ~OAICreateChatCompletionStreamResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QList<OAICreateChatCompletionStreamResponse_choices_inner> getChoices() const;
    void setChoices(const QList<OAICreateChatCompletionStreamResponse_choices_inner> &choices);
    bool is_choices_Set() const;
    bool is_choices_Valid() const;

    qint32 getCreated() const;
    void setCreated(const qint32 &created);
    bool is_created_Set() const;
    bool is_created_Valid() const;

    QString getModel() const;
    void setModel(const QString &model);
    bool is_model_Set() const;
    bool is_model_Valid() const;

    QString getSystemFingerprint() const;
    void setSystemFingerprint(const QString &system_fingerprint);
    bool is_system_fingerprint_Set() const;
    bool is_system_fingerprint_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QList<OAICreateChatCompletionStreamResponse_choices_inner> m_choices;
    bool m_choices_isSet;
    bool m_choices_isValid;

    qint32 m_created;
    bool m_created_isSet;
    bool m_created_isValid;

    QString m_model;
    bool m_model_isSet;
    bool m_model_isValid;

    QString m_system_fingerprint;
    bool m_system_fingerprint_isSet;
    bool m_system_fingerprint_isValid;

    QString m_object;
    bool m_object_isSet;
    bool m_object_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateChatCompletionStreamResponse)

#endif // OAICreateChatCompletionStreamResponse_H
