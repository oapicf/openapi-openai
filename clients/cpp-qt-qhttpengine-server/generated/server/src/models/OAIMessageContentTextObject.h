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
 * OAIMessageContentTextObject.h
 *
 * The text content that is part of a message.
 */

#ifndef OAIMessageContentTextObject_H
#define OAIMessageContentTextObject_H

#include <QJsonObject>

#include "OAIMessageContentTextObject_text.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMessageContentTextObject : public OAIObject {
public:
    OAIMessageContentTextObject();
    OAIMessageContentTextObject(QString json);
    ~OAIMessageContentTextObject() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAIMessageContentTextObject_text getText() const;
    void setText(const OAIMessageContentTextObject_text &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIMessageContentTextObject_text text;
    bool m_text_isSet;
    bool m_text_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMessageContentTextObject)

#endif // OAIMessageContentTextObject_H
