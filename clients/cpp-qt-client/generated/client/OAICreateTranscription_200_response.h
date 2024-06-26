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
 * OAICreateTranscription_200_response.h
 *
 * 
 */

#ifndef OAICreateTranscription_200_response_H
#define OAICreateTranscription_200_response_H

#include <QJsonObject>

#include "OAICreateTranscriptionResponseJson.h"
#include "OAICreateTranscriptionResponseVerboseJson.h"
#include "OAITranscriptionSegment.h"
#include "OAITranscriptionWord.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAITranscriptionWord;
class OAITranscriptionSegment;

class OAICreateTranscription_200_response : public OAIObject {
public:
    OAICreateTranscription_200_response();
    OAICreateTranscription_200_response(QString json);
    ~OAICreateTranscription_200_response() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getText() const;
    void setText(const QString &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    QString getLanguage() const;
    void setLanguage(const QString &language);
    bool is_language_Set() const;
    bool is_language_Valid() const;

    QString getDuration() const;
    void setDuration(const QString &duration);
    bool is_duration_Set() const;
    bool is_duration_Valid() const;

    QList<OAITranscriptionWord> getWords() const;
    void setWords(const QList<OAITranscriptionWord> &words);
    bool is_words_Set() const;
    bool is_words_Valid() const;

    QList<OAITranscriptionSegment> getSegments() const;
    void setSegments(const QList<OAITranscriptionSegment> &segments);
    bool is_segments_Set() const;
    bool is_segments_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_text;
    bool m_text_isSet;
    bool m_text_isValid;

    QString m_language;
    bool m_language_isSet;
    bool m_language_isValid;

    QString m_duration;
    bool m_duration_isSet;
    bool m_duration_isValid;

    QList<OAITranscriptionWord> m_words;
    bool m_words_isSet;
    bool m_words_isValid;

    QList<OAITranscriptionSegment> m_segments;
    bool m_segments_isSet;
    bool m_segments_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateTranscription_200_response)

#endif // OAICreateTranscription_200_response_H
