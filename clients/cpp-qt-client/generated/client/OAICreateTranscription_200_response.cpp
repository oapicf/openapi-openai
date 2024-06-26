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

#include "OAICreateTranscription_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateTranscription_200_response::OAICreateTranscription_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateTranscription_200_response::OAICreateTranscription_200_response() {
    this->initializeModel();
}

OAICreateTranscription_200_response::~OAICreateTranscription_200_response() {}

void OAICreateTranscription_200_response::initializeModel() {

    m_text_isSet = false;
    m_text_isValid = false;

    m_language_isSet = false;
    m_language_isValid = false;

    m_duration_isSet = false;
    m_duration_isValid = false;

    m_words_isSet = false;
    m_words_isValid = false;

    m_segments_isSet = false;
    m_segments_isValid = false;
}

void OAICreateTranscription_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateTranscription_200_response::fromJsonObject(QJsonObject json) {

    m_text_isValid = ::OpenAPI::fromJsonValue(m_text, json[QString("text")]);
    m_text_isSet = !json[QString("text")].isNull() && m_text_isValid;

    m_language_isValid = ::OpenAPI::fromJsonValue(m_language, json[QString("language")]);
    m_language_isSet = !json[QString("language")].isNull() && m_language_isValid;

    m_duration_isValid = ::OpenAPI::fromJsonValue(m_duration, json[QString("duration")]);
    m_duration_isSet = !json[QString("duration")].isNull() && m_duration_isValid;

    m_words_isValid = ::OpenAPI::fromJsonValue(m_words, json[QString("words")]);
    m_words_isSet = !json[QString("words")].isNull() && m_words_isValid;

    m_segments_isValid = ::OpenAPI::fromJsonValue(m_segments, json[QString("segments")]);
    m_segments_isSet = !json[QString("segments")].isNull() && m_segments_isValid;
}

QString OAICreateTranscription_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateTranscription_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_text_isSet) {
        obj.insert(QString("text"), ::OpenAPI::toJsonValue(m_text));
    }
    if (m_language_isSet) {
        obj.insert(QString("language"), ::OpenAPI::toJsonValue(m_language));
    }
    if (m_duration_isSet) {
        obj.insert(QString("duration"), ::OpenAPI::toJsonValue(m_duration));
    }
    if (m_words.size() > 0) {
        obj.insert(QString("words"), ::OpenAPI::toJsonValue(m_words));
    }
    if (m_segments.size() > 0) {
        obj.insert(QString("segments"), ::OpenAPI::toJsonValue(m_segments));
    }
    return obj;
}

QString OAICreateTranscription_200_response::getText() const {
    return m_text;
}
void OAICreateTranscription_200_response::setText(const QString &text) {
    m_text = text;
    m_text_isSet = true;
}

bool OAICreateTranscription_200_response::is_text_Set() const{
    return m_text_isSet;
}

bool OAICreateTranscription_200_response::is_text_Valid() const{
    return m_text_isValid;
}

QString OAICreateTranscription_200_response::getLanguage() const {
    return m_language;
}
void OAICreateTranscription_200_response::setLanguage(const QString &language) {
    m_language = language;
    m_language_isSet = true;
}

bool OAICreateTranscription_200_response::is_language_Set() const{
    return m_language_isSet;
}

bool OAICreateTranscription_200_response::is_language_Valid() const{
    return m_language_isValid;
}

QString OAICreateTranscription_200_response::getDuration() const {
    return m_duration;
}
void OAICreateTranscription_200_response::setDuration(const QString &duration) {
    m_duration = duration;
    m_duration_isSet = true;
}

bool OAICreateTranscription_200_response::is_duration_Set() const{
    return m_duration_isSet;
}

bool OAICreateTranscription_200_response::is_duration_Valid() const{
    return m_duration_isValid;
}

QList<OAITranscriptionWord> OAICreateTranscription_200_response::getWords() const {
    return m_words;
}
void OAICreateTranscription_200_response::setWords(const QList<OAITranscriptionWord> &words) {
    m_words = words;
    m_words_isSet = true;
}

bool OAICreateTranscription_200_response::is_words_Set() const{
    return m_words_isSet;
}

bool OAICreateTranscription_200_response::is_words_Valid() const{
    return m_words_isValid;
}

QList<OAITranscriptionSegment> OAICreateTranscription_200_response::getSegments() const {
    return m_segments;
}
void OAICreateTranscription_200_response::setSegments(const QList<OAITranscriptionSegment> &segments) {
    m_segments = segments;
    m_segments_isSet = true;
}

bool OAICreateTranscription_200_response::is_segments_Set() const{
    return m_segments_isSet;
}

bool OAICreateTranscription_200_response::is_segments_Valid() const{
    return m_segments_isValid;
}

bool OAICreateTranscription_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_language_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_duration_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_words.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_segments.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateTranscription_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_text_isValid && m_language_isValid && m_duration_isValid && true;
}

} // namespace OpenAPI
