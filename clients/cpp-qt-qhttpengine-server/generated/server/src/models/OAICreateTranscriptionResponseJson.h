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
 * OAICreateTranscriptionResponseJson.h
 *
 * Represents a transcription response returned by model, based on the provided input.
 */

#ifndef OAICreateTranscriptionResponseJson_H
#define OAICreateTranscriptionResponseJson_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateTranscriptionResponseJson : public OAIObject {
public:
    OAICreateTranscriptionResponseJson();
    OAICreateTranscriptionResponseJson(QString json);
    ~OAICreateTranscriptionResponseJson() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getText() const;
    void setText(const QString &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString text;
    bool m_text_isSet;
    bool m_text_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateTranscriptionResponseJson)

#endif // OAICreateTranscriptionResponseJson_H