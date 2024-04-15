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

#include "OAICreateModerationResponse_results_inner_category_scores.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateModerationResponse_results_inner_category_scores::OAICreateModerationResponse_results_inner_category_scores(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateModerationResponse_results_inner_category_scores::OAICreateModerationResponse_results_inner_category_scores() {
    this->initializeModel();
}

OAICreateModerationResponse_results_inner_category_scores::~OAICreateModerationResponse_results_inner_category_scores() {}

void OAICreateModerationResponse_results_inner_category_scores::initializeModel() {

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

void OAICreateModerationResponse_results_inner_category_scores::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateModerationResponse_results_inner_category_scores::fromJsonObject(QJsonObject json) {

    m_hate_isValid = ::OpenAPI::fromJsonValue(m_hate, json[QString("hate")]);
    m_hate_isSet = !json[QString("hate")].isNull() && m_hate_isValid;

    m_hate_threatening_isValid = ::OpenAPI::fromJsonValue(m_hate_threatening, json[QString("hate/threatening")]);
    m_hate_threatening_isSet = !json[QString("hate/threatening")].isNull() && m_hate_threatening_isValid;

    m_harassment_isValid = ::OpenAPI::fromJsonValue(m_harassment, json[QString("harassment")]);
    m_harassment_isSet = !json[QString("harassment")].isNull() && m_harassment_isValid;

    m_harassment_threatening_isValid = ::OpenAPI::fromJsonValue(m_harassment_threatening, json[QString("harassment/threatening")]);
    m_harassment_threatening_isSet = !json[QString("harassment/threatening")].isNull() && m_harassment_threatening_isValid;

    m_self_harm_isValid = ::OpenAPI::fromJsonValue(m_self_harm, json[QString("self-harm")]);
    m_self_harm_isSet = !json[QString("self-harm")].isNull() && m_self_harm_isValid;

    m_self_harm_intent_isValid = ::OpenAPI::fromJsonValue(m_self_harm_intent, json[QString("self-harm/intent")]);
    m_self_harm_intent_isSet = !json[QString("self-harm/intent")].isNull() && m_self_harm_intent_isValid;

    m_self_harm_instructions_isValid = ::OpenAPI::fromJsonValue(m_self_harm_instructions, json[QString("self-harm/instructions")]);
    m_self_harm_instructions_isSet = !json[QString("self-harm/instructions")].isNull() && m_self_harm_instructions_isValid;

    m_sexual_isValid = ::OpenAPI::fromJsonValue(m_sexual, json[QString("sexual")]);
    m_sexual_isSet = !json[QString("sexual")].isNull() && m_sexual_isValid;

    m_sexual_minors_isValid = ::OpenAPI::fromJsonValue(m_sexual_minors, json[QString("sexual/minors")]);
    m_sexual_minors_isSet = !json[QString("sexual/minors")].isNull() && m_sexual_minors_isValid;

    m_violence_isValid = ::OpenAPI::fromJsonValue(m_violence, json[QString("violence")]);
    m_violence_isSet = !json[QString("violence")].isNull() && m_violence_isValid;

    m_violence_graphic_isValid = ::OpenAPI::fromJsonValue(m_violence_graphic, json[QString("violence/graphic")]);
    m_violence_graphic_isSet = !json[QString("violence/graphic")].isNull() && m_violence_graphic_isValid;
}

QString OAICreateModerationResponse_results_inner_category_scores::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateModerationResponse_results_inner_category_scores::asJsonObject() const {
    QJsonObject obj;
    if (m_hate_isSet) {
        obj.insert(QString("hate"), ::OpenAPI::toJsonValue(m_hate));
    }
    if (m_hate_threatening_isSet) {
        obj.insert(QString("hate/threatening"), ::OpenAPI::toJsonValue(m_hate_threatening));
    }
    if (m_harassment_isSet) {
        obj.insert(QString("harassment"), ::OpenAPI::toJsonValue(m_harassment));
    }
    if (m_harassment_threatening_isSet) {
        obj.insert(QString("harassment/threatening"), ::OpenAPI::toJsonValue(m_harassment_threatening));
    }
    if (m_self_harm_isSet) {
        obj.insert(QString("self-harm"), ::OpenAPI::toJsonValue(m_self_harm));
    }
    if (m_self_harm_intent_isSet) {
        obj.insert(QString("self-harm/intent"), ::OpenAPI::toJsonValue(m_self_harm_intent));
    }
    if (m_self_harm_instructions_isSet) {
        obj.insert(QString("self-harm/instructions"), ::OpenAPI::toJsonValue(m_self_harm_instructions));
    }
    if (m_sexual_isSet) {
        obj.insert(QString("sexual"), ::OpenAPI::toJsonValue(m_sexual));
    }
    if (m_sexual_minors_isSet) {
        obj.insert(QString("sexual/minors"), ::OpenAPI::toJsonValue(m_sexual_minors));
    }
    if (m_violence_isSet) {
        obj.insert(QString("violence"), ::OpenAPI::toJsonValue(m_violence));
    }
    if (m_violence_graphic_isSet) {
        obj.insert(QString("violence/graphic"), ::OpenAPI::toJsonValue(m_violence_graphic));
    }
    return obj;
}

double OAICreateModerationResponse_results_inner_category_scores::getHate() const {
    return m_hate;
}
void OAICreateModerationResponse_results_inner_category_scores::setHate(const double &hate) {
    m_hate = hate;
    m_hate_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_hate_Set() const{
    return m_hate_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_hate_Valid() const{
    return m_hate_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getHateThreatening() const {
    return m_hate_threatening;
}
void OAICreateModerationResponse_results_inner_category_scores::setHateThreatening(const double &hate_threatening) {
    m_hate_threatening = hate_threatening;
    m_hate_threatening_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_hate_threatening_Set() const{
    return m_hate_threatening_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_hate_threatening_Valid() const{
    return m_hate_threatening_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getHarassment() const {
    return m_harassment;
}
void OAICreateModerationResponse_results_inner_category_scores::setHarassment(const double &harassment) {
    m_harassment = harassment;
    m_harassment_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_harassment_Set() const{
    return m_harassment_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_harassment_Valid() const{
    return m_harassment_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getHarassmentThreatening() const {
    return m_harassment_threatening;
}
void OAICreateModerationResponse_results_inner_category_scores::setHarassmentThreatening(const double &harassment_threatening) {
    m_harassment_threatening = harassment_threatening;
    m_harassment_threatening_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_harassment_threatening_Set() const{
    return m_harassment_threatening_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_harassment_threatening_Valid() const{
    return m_harassment_threatening_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getSelfHarm() const {
    return m_self_harm;
}
void OAICreateModerationResponse_results_inner_category_scores::setSelfHarm(const double &self_harm) {
    m_self_harm = self_harm;
    m_self_harm_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_self_harm_Set() const{
    return m_self_harm_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_self_harm_Valid() const{
    return m_self_harm_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getSelfHarmIntent() const {
    return m_self_harm_intent;
}
void OAICreateModerationResponse_results_inner_category_scores::setSelfHarmIntent(const double &self_harm_intent) {
    m_self_harm_intent = self_harm_intent;
    m_self_harm_intent_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_self_harm_intent_Set() const{
    return m_self_harm_intent_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_self_harm_intent_Valid() const{
    return m_self_harm_intent_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getSelfHarmInstructions() const {
    return m_self_harm_instructions;
}
void OAICreateModerationResponse_results_inner_category_scores::setSelfHarmInstructions(const double &self_harm_instructions) {
    m_self_harm_instructions = self_harm_instructions;
    m_self_harm_instructions_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_self_harm_instructions_Set() const{
    return m_self_harm_instructions_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_self_harm_instructions_Valid() const{
    return m_self_harm_instructions_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getSexual() const {
    return m_sexual;
}
void OAICreateModerationResponse_results_inner_category_scores::setSexual(const double &sexual) {
    m_sexual = sexual;
    m_sexual_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_sexual_Set() const{
    return m_sexual_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_sexual_Valid() const{
    return m_sexual_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getSexualMinors() const {
    return m_sexual_minors;
}
void OAICreateModerationResponse_results_inner_category_scores::setSexualMinors(const double &sexual_minors) {
    m_sexual_minors = sexual_minors;
    m_sexual_minors_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_sexual_minors_Set() const{
    return m_sexual_minors_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_sexual_minors_Valid() const{
    return m_sexual_minors_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getViolence() const {
    return m_violence;
}
void OAICreateModerationResponse_results_inner_category_scores::setViolence(const double &violence) {
    m_violence = violence;
    m_violence_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_violence_Set() const{
    return m_violence_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_violence_Valid() const{
    return m_violence_isValid;
}

double OAICreateModerationResponse_results_inner_category_scores::getViolenceGraphic() const {
    return m_violence_graphic;
}
void OAICreateModerationResponse_results_inner_category_scores::setViolenceGraphic(const double &violence_graphic) {
    m_violence_graphic = violence_graphic;
    m_violence_graphic_isSet = true;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_violence_graphic_Set() const{
    return m_violence_graphic_isSet;
}

bool OAICreateModerationResponse_results_inner_category_scores::is_violence_graphic_Valid() const{
    return m_violence_graphic_isValid;
}

bool OAICreateModerationResponse_results_inner_category_scores::isSet() const {
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

bool OAICreateModerationResponse_results_inner_category_scores::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_hate_isValid && m_hate_threatening_isValid && m_harassment_isValid && m_harassment_threatening_isValid && m_self_harm_isValid && m_self_harm_intent_isValid && m_self_harm_instructions_isValid && m_sexual_isValid && m_sexual_minors_isValid && m_violence_isValid && m_violence_graphic_isValid && true;
}

} // namespace OpenAPI