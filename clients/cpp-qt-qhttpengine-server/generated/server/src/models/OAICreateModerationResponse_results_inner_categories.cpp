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

#include "OAICreateModerationResponse_results_inner_categories.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateModerationResponse_results_inner_categories::OAICreateModerationResponse_results_inner_categories(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateModerationResponse_results_inner_categories::OAICreateModerationResponse_results_inner_categories() {
    this->initializeModel();
}

OAICreateModerationResponse_results_inner_categories::~OAICreateModerationResponse_results_inner_categories() {}

void OAICreateModerationResponse_results_inner_categories::initializeModel() {

    m_hate_isSet = false;
    m_hate_isValid = false;

    m_hate_threatening_isSet = false;
    m_hate_threatening_isValid = false;

    m_harassment_isSet = false;
    m_harassment_isValid = false;

    m_harassment_threatening_isSet = false;
    m_harassment_threatening_isValid = false;

    m_self_harm_isSet = false;
    m_self_harm_isValid = false;

    m_self_harm_intent_isSet = false;
    m_self_harm_intent_isValid = false;

    m_self_harm_instructions_isSet = false;
    m_self_harm_instructions_isValid = false;

    m_sexual_isSet = false;
    m_sexual_isValid = false;

    m_sexual_minors_isSet = false;
    m_sexual_minors_isValid = false;

    m_violence_isSet = false;
    m_violence_isValid = false;

    m_violence_graphic_isSet = false;
    m_violence_graphic_isValid = false;
}

void OAICreateModerationResponse_results_inner_categories::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateModerationResponse_results_inner_categories::fromJsonObject(QJsonObject json) {

    m_hate_isValid = ::OpenAPI::fromJsonValue(hate, json[QString("hate")]);
    m_hate_isSet = !json[QString("hate")].isNull() && m_hate_isValid;

    m_hate_threatening_isValid = ::OpenAPI::fromJsonValue(hate_threatening, json[QString("hate/threatening")]);
    m_hate_threatening_isSet = !json[QString("hate/threatening")].isNull() && m_hate_threatening_isValid;

    m_harassment_isValid = ::OpenAPI::fromJsonValue(harassment, json[QString("harassment")]);
    m_harassment_isSet = !json[QString("harassment")].isNull() && m_harassment_isValid;

    m_harassment_threatening_isValid = ::OpenAPI::fromJsonValue(harassment_threatening, json[QString("harassment/threatening")]);
    m_harassment_threatening_isSet = !json[QString("harassment/threatening")].isNull() && m_harassment_threatening_isValid;

    m_self_harm_isValid = ::OpenAPI::fromJsonValue(self_harm, json[QString("self-harm")]);
    m_self_harm_isSet = !json[QString("self-harm")].isNull() && m_self_harm_isValid;

    m_self_harm_intent_isValid = ::OpenAPI::fromJsonValue(self_harm_intent, json[QString("self-harm/intent")]);
    m_self_harm_intent_isSet = !json[QString("self-harm/intent")].isNull() && m_self_harm_intent_isValid;

    m_self_harm_instructions_isValid = ::OpenAPI::fromJsonValue(self_harm_instructions, json[QString("self-harm/instructions")]);
    m_self_harm_instructions_isSet = !json[QString("self-harm/instructions")].isNull() && m_self_harm_instructions_isValid;

    m_sexual_isValid = ::OpenAPI::fromJsonValue(sexual, json[QString("sexual")]);
    m_sexual_isSet = !json[QString("sexual")].isNull() && m_sexual_isValid;

    m_sexual_minors_isValid = ::OpenAPI::fromJsonValue(sexual_minors, json[QString("sexual/minors")]);
    m_sexual_minors_isSet = !json[QString("sexual/minors")].isNull() && m_sexual_minors_isValid;

    m_violence_isValid = ::OpenAPI::fromJsonValue(violence, json[QString("violence")]);
    m_violence_isSet = !json[QString("violence")].isNull() && m_violence_isValid;

    m_violence_graphic_isValid = ::OpenAPI::fromJsonValue(violence_graphic, json[QString("violence/graphic")]);
    m_violence_graphic_isSet = !json[QString("violence/graphic")].isNull() && m_violence_graphic_isValid;
}

QString OAICreateModerationResponse_results_inner_categories::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateModerationResponse_results_inner_categories::asJsonObject() const {
    QJsonObject obj;
    if (m_hate_isSet) {
        obj.insert(QString("hate"), ::OpenAPI::toJsonValue(hate));
    }
    if (m_hate_threatening_isSet) {
        obj.insert(QString("hate/threatening"), ::OpenAPI::toJsonValue(hate_threatening));
    }
    if (m_harassment_isSet) {
        obj.insert(QString("harassment"), ::OpenAPI::toJsonValue(harassment));
    }
    if (m_harassment_threatening_isSet) {
        obj.insert(QString("harassment/threatening"), ::OpenAPI::toJsonValue(harassment_threatening));
    }
    if (m_self_harm_isSet) {
        obj.insert(QString("self-harm"), ::OpenAPI::toJsonValue(self_harm));
    }
    if (m_self_harm_intent_isSet) {
        obj.insert(QString("self-harm/intent"), ::OpenAPI::toJsonValue(self_harm_intent));
    }
    if (m_self_harm_instructions_isSet) {
        obj.insert(QString("self-harm/instructions"), ::OpenAPI::toJsonValue(self_harm_instructions));
    }
    if (m_sexual_isSet) {
        obj.insert(QString("sexual"), ::OpenAPI::toJsonValue(sexual));
    }
    if (m_sexual_minors_isSet) {
        obj.insert(QString("sexual/minors"), ::OpenAPI::toJsonValue(sexual_minors));
    }
    if (m_violence_isSet) {
        obj.insert(QString("violence"), ::OpenAPI::toJsonValue(violence));
    }
    if (m_violence_graphic_isSet) {
        obj.insert(QString("violence/graphic"), ::OpenAPI::toJsonValue(violence_graphic));
    }
    return obj;
}

bool OAICreateModerationResponse_results_inner_categories::isHate() const {
    return hate;
}
void OAICreateModerationResponse_results_inner_categories::setHate(const bool &hate) {
    this->hate = hate;
    this->m_hate_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_hate_Set() const{
    return m_hate_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_hate_Valid() const{
    return m_hate_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isHateThreatening() const {
    return hate_threatening;
}
void OAICreateModerationResponse_results_inner_categories::setHateThreatening(const bool &hate_threatening) {
    this->hate_threatening = hate_threatening;
    this->m_hate_threatening_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_hate_threatening_Set() const{
    return m_hate_threatening_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_hate_threatening_Valid() const{
    return m_hate_threatening_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isHarassment() const {
    return harassment;
}
void OAICreateModerationResponse_results_inner_categories::setHarassment(const bool &harassment) {
    this->harassment = harassment;
    this->m_harassment_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_harassment_Set() const{
    return m_harassment_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_harassment_Valid() const{
    return m_harassment_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isHarassmentThreatening() const {
    return harassment_threatening;
}
void OAICreateModerationResponse_results_inner_categories::setHarassmentThreatening(const bool &harassment_threatening) {
    this->harassment_threatening = harassment_threatening;
    this->m_harassment_threatening_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_harassment_threatening_Set() const{
    return m_harassment_threatening_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_harassment_threatening_Valid() const{
    return m_harassment_threatening_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isSelfHarm() const {
    return self_harm;
}
void OAICreateModerationResponse_results_inner_categories::setSelfHarm(const bool &self_harm) {
    this->self_harm = self_harm;
    this->m_self_harm_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_self_harm_Set() const{
    return m_self_harm_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_self_harm_Valid() const{
    return m_self_harm_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isSelfHarmIntent() const {
    return self_harm_intent;
}
void OAICreateModerationResponse_results_inner_categories::setSelfHarmIntent(const bool &self_harm_intent) {
    this->self_harm_intent = self_harm_intent;
    this->m_self_harm_intent_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_self_harm_intent_Set() const{
    return m_self_harm_intent_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_self_harm_intent_Valid() const{
    return m_self_harm_intent_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isSelfHarmInstructions() const {
    return self_harm_instructions;
}
void OAICreateModerationResponse_results_inner_categories::setSelfHarmInstructions(const bool &self_harm_instructions) {
    this->self_harm_instructions = self_harm_instructions;
    this->m_self_harm_instructions_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_self_harm_instructions_Set() const{
    return m_self_harm_instructions_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_self_harm_instructions_Valid() const{
    return m_self_harm_instructions_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isSexual() const {
    return sexual;
}
void OAICreateModerationResponse_results_inner_categories::setSexual(const bool &sexual) {
    this->sexual = sexual;
    this->m_sexual_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_sexual_Set() const{
    return m_sexual_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_sexual_Valid() const{
    return m_sexual_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isSexualMinors() const {
    return sexual_minors;
}
void OAICreateModerationResponse_results_inner_categories::setSexualMinors(const bool &sexual_minors) {
    this->sexual_minors = sexual_minors;
    this->m_sexual_minors_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_sexual_minors_Set() const{
    return m_sexual_minors_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_sexual_minors_Valid() const{
    return m_sexual_minors_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isViolence() const {
    return violence;
}
void OAICreateModerationResponse_results_inner_categories::setViolence(const bool &violence) {
    this->violence = violence;
    this->m_violence_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_violence_Set() const{
    return m_violence_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_violence_Valid() const{
    return m_violence_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isViolenceGraphic() const {
    return violence_graphic;
}
void OAICreateModerationResponse_results_inner_categories::setViolenceGraphic(const bool &violence_graphic) {
    this->violence_graphic = violence_graphic;
    this->m_violence_graphic_isSet = true;
}

bool OAICreateModerationResponse_results_inner_categories::is_violence_graphic_Set() const{
    return m_violence_graphic_isSet;
}

bool OAICreateModerationResponse_results_inner_categories::is_violence_graphic_Valid() const{
    return m_violence_graphic_isValid;
}

bool OAICreateModerationResponse_results_inner_categories::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_hate_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_hate_threatening_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_harassment_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_harassment_threatening_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_self_harm_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_self_harm_intent_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_self_harm_instructions_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sexual_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sexual_minors_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_violence_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_violence_graphic_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateModerationResponse_results_inner_categories::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_hate_isValid && m_hate_threatening_isValid && m_harassment_isValid && m_harassment_threatening_isValid && m_self_harm_isValid && m_self_harm_intent_isValid && m_self_harm_instructions_isValid && m_sexual_isValid && m_sexual_minors_isValid && m_violence_isValid && m_violence_graphic_isValid && true;
}

} // namespace OpenAPI
